package com.df.report.service.impl;


import com.df.report.mapper.PiplanActivityMapper;
import com.df.report.mapper.PiprojectMapper;
import com.df.report.mapper.StexpectedFinishTimeMapper;
import com.df.report.model.*;
import com.df.report.service.*;
import com.df.report.util.DateUtils;
import com.df.report.util.PageResult;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author chenning
 * @description 针对表【piplan_activity】的数据库操作Service实现
 * @createDate 2022-05-11 16:51:14
 */
@Service
public class PiplanActivityServiceImpl implements PiplanActivityService {

    private final double weight = 0.7;

    @Autowired
    private EntityManager em;
    @Autowired
    FunctionApply functionApply;

    @Autowired
    private MembershipLinkService membershipLinkService;
    @Autowired
    private PigroupService pigroupService;
    @Autowired
    private PiresourceService piresourceService;
    @Autowired
    private PiresourceAssignmentService piresourceAssignmentService;

    @Autowired
    PiprojectMapper piprojectMapper;


    @Autowired
    StexpectedFinishTimeMapper stexpectedFinishTimeMapper;

    @Autowired
    PiplanActivityMapper activityMapper;

    @Override
    public List<PiplanActivityVo> WorkDelayTable(String[] time, List<Integer> groupIds, String projectId, String planId, PageResult pageResult) throws ParseException {

        String startTime = null;
        String endTime = null;
        if (Objects.isNull(time)) {
            Date startDate = DateUtils.getEndTime(DateUtils.getDate(System.currentTimeMillis(), 0, -3, 0, 0, 0, 0));
            Date endDate = DateUtils.getStartTime(System.currentTimeMillis());
            startTime = DateUtils.format(startDate, "yyyy-MM-dd HH:mm:ss");
            endTime = DateUtils.format(endDate, "yyyy-MM-dd HH:mm:ss");
        } else {
            Date startDate = DateUtils.getStartTime(DateUtils.parseDate(time[0]));
            Date endDate = DateUtils.getEndTime(DateUtils.parseDate(time[1]));
            startTime = DateUtils.format(startDate, "yyyy-MM-dd HH:mm:ss");
            endTime = DateUtils.format(endDate, "yyyy-MM-dd HH:mm:ss");
        }


        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = cb.createQuery();
        Root root = criteriaQuery.from(PiplanActivity.class);
        Path id = root.get("id");
        Path projectRefId = root.get("projectRefId");
        Path rootRefId = root.get("rootRefId");
        Path targetStartDate = root.get("targetStartDate");

        //子查询部分-Piproject
        Subquery<Piproject> subquery1 = criteriaQuery.subquery(Piproject.class);
        Root childRoot1 = subquery1.from(Piproject.class);
        Path childId1 = childRoot1.get("id");
        subquery1.select(childId1);


        //子查询部分-StexpectedFinishTime
        Subquery<StexpectedFinishTime> subquery2 = criteriaQuery.subquery(StexpectedFinishTime.class);
        Root childRoot2 = subquery2.from(StexpectedFinishTime.class);
        Path childId2 = childRoot2.get("planActivityRefId");
        subquery2.select(childId2);


        List<Predicate> predicates = new ArrayList<>();
//        predicates.add(cb.in(projectRefId).value(subquery1));
//        predicates.add(cb.in(id).value(subquery2));
        predicates.add(cb.or(cb.in(projectRefId).value(subquery1), cb.in(id).value(subquery2)));

        predicates.add(cb.between(targetStartDate, new Timestamp(DateUtils.parseDate(startTime)), new Timestamp(DateUtils.parseDate(endTime))));


        List<Long> planActIds = functionApply.getPlanActIds(membershipLinkService::rolebobjectIds, piresourceService::resourceIds, piresourceAssignmentService::assignmentRsrcIds, groupIds);
        if (CollectionUtils.isNotEmpty(planActIds)) {
            List<Predicate> or = new ArrayList<>();
            List<List<Long>> partition = Lists.partition(planActIds, 900);
            for (List<Long> integers : partition) {
                or.add(cb.in(id).value(integers));
            }
            predicates.add(cb.or(or.toArray(new Predicate[0])));
        }

        if (projectId != null) {
            predicates.add(cb.equal(projectRefId, projectId));
        }
        if (planId != null) {
            predicates.add(cb.equal(rootRefId, planId));
        }

        criteriaQuery.select(root)
                .where(predicates.toArray(new Predicate[0]));
        TypedQuery query = em.createQuery(criteriaQuery);
        if (pageResult.getEnble()) {
            query.setFirstResult(pageResult.getPageRecord());
            query.setMaxResults(pageResult.getPageSize());
        }
        List<PiplanActivity> piplanActivities = query.getResultList();

        List<PiplanActivityVo> activityVos = changeActivityVos(piplanActivities, startTime, endTime);
        return activityVos;
    }


    @Override
    public Integer WorkDelayTable(String[] time, List<Integer> groupIds, String projectId, String planId) throws ParseException {

        String startTime = null;
        String endTime = null;
        if (Objects.isNull(time)) {
            Date startDate = DateUtils.getEndTime(DateUtils.getDate(System.currentTimeMillis(), 0, -3, 0, 0, 0, 0));
            Date endDate = DateUtils.getStartTime(System.currentTimeMillis());
            startTime = DateUtils.format(startDate, "yyyy-MM-dd HH:mm:ss");
            endTime = DateUtils.format(endDate, "yyyy-MM-dd HH:mm:ss");
        } else {
            Date startDate = DateUtils.getStartTime(DateUtils.parseDate(time[0]));
            Date endDate = DateUtils.getEndTime(DateUtils.parseDate(time[1]));
        }


        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = cb.createQuery();
        Root root = criteriaQuery.from(PiplanActivity.class);
        Path id = root.get("id");
        Path projectRefId = root.get("projectRefId");
        Path rootRefId = root.get("rootRefId");
        Path targetStartDate = root.get("targetStartDate");

        //子查询部分-Piproject
        Subquery<Piproject> subquery1 = criteriaQuery.subquery(Piproject.class);
        Root childRoot1 = subquery1.from(Piproject.class);
        Path childId1 = childRoot1.get("id");
        subquery1.select(childId1);


        //子查询部分-StexpectedFinishTime
        Subquery<StexpectedFinishTime> subquery2 = criteriaQuery.subquery(StexpectedFinishTime.class);
        Root childRoot2 = subquery2.from(StexpectedFinishTime.class);
        Path childId2 = childRoot2.get("planActivityRefId");
        subquery2.select(childId2);


        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.or(cb.in(projectRefId).value(subquery1), cb.in(id).value(subquery2)));

        predicates.add(cb.between(targetStartDate, new Timestamp(DateUtils.parseDate(startTime)), new Timestamp(DateUtils.parseDate(endTime))));


        List<Long> planActIds = functionApply.getPlanActIds(membershipLinkService::rolebobjectIds, piresourceService::resourceIds, piresourceAssignmentService::assignmentRsrcIds, groupIds);
        if (CollectionUtils.isNotEmpty(planActIds)) {
            List<Predicate> or = new ArrayList<>();
            List<List<Long>> partition = Lists.partition(planActIds, 900);
            for (List<Long> integers : partition) {
                or.add(cb.in(id).value(integers));
            }
            predicates.add(cb.or(or.toArray(new Predicate[0])));
        }

        if (projectId != null) {
            predicates.add(cb.equal(projectRefId, projectId));
        }
        if (planId != null) {
            predicates.add(cb.equal(rootRefId, planId));
        }

        criteriaQuery.select(cb.count(root)).where(predicates.toArray(new Predicate[0]));
        TypedQuery<Long> query = em.createQuery(criteriaQuery);
        Integer singleResult = query.getSingleResult().intValue();
        return singleResult;
    }


    private List<PiplanActivityVo> changeActivityVos(List<PiplanActivity> piplanActivities, String startTime, String endTime) throws ParseException {
        List<PiplanActivityVo> activityVos = new ArrayList<>();
        for (PiplanActivity act : piplanActivities) {
            PiplanActivityVo activityVo = new PiplanActivityVo();
            activityVo.setActivityId(act.getId().toString());
            activityVo.setActivityName(act.getName());
            activityVo.setTargetStartTime(act.getTargetStartDate() == null ? "" : DateUtils.getDateToString(act.getTargetStartDate().getTime(), "yyyy-MM-dd HH:mm:ss"));
            activityVo.setByTime(act.getTargetEndDate() == null ? "" : DateUtils.getDateToString(act.getTargetEndDate().getTime(), "yyyy-MM-dd HH:mm:ss"));
            activityVo.setExpectedFinishTime(act.getExpectEndDate() == null ? "" : DateUtils.getDateToString(act.getExpectEndDate().getTime(), "yyyy-MM-dd HH:mm:ss"));
            activityVo.setActualEndTime(act.getActualEndDate() == null ? "" : DateUtils.getDateToString(act.getActualEndDate().getTime(), "yyyy-MM-dd HH:mm:ss"));
            activityVo.setActualStartTime(act.getActualStartDate() == null ? "" : DateUtils.getDateToString(act.getActualStartDate().getTime(), "yyyy-MM-dd HH:mm:ss"));
            Optional<Piproject> optionalPiproject = piprojectMapper.findById(act.getProjectRefId());
            if (optionalPiproject.isPresent()) {
                activityVo.setProjectName(optionalPiproject.get().getProjectName());
            }
            activityVos.add(activityVo);
        }

        // 计算时间周数
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        long start = startTime == null ? 0 : formatter.parse(startTime).getTime();
        long end = endTime == null ? 0 : formatter.parse(endTime).getTime();
        double weeks = (end - start) / (1000 * 60 * 60 * 24 * 7.0);
        long week = (long) Math.ceil(weeks);
        DecimalFormat df = new DecimalFormat("0.00");// 设置保留两位位数
        //返回数据
        List<PiplanActivityVo> resultList = new ArrayList();
        for (long i = 1; i <= week; i++) {
            // 每周开始时间
            long startLong = start + (i - 1) * 1000 * 60 * 60 * 24 * 7;
            // 每周结束时间
            long endLong = start + i * 1000 * 60 * 60 * 24 * 7;

            for (PiplanActivityVo act : activityVos) {
                String taskStr = act.getTargetStartTime();
//                String taskStr = act.getByTime();
                long taskLong = StringUtils.isBlank(taskStr) ? 0 : formatter.parse(taskStr).getTime();
                if (taskLong >= startLong && taskLong < endLong) {
                    long currentStr = new Date().getTime();//当前时间
                    String byTimeStr = act.getByTime();//计划完成时间
                    long btTImeLong = StringUtils.isBlank(byTimeStr) ? 0 : formatter.parse(byTimeStr).getTime();
                    String actualEnd = act.getActualEndTime();//实际完成时间
                    long actualEndLong = StringUtils.isBlank(actualEnd) ? 0 : formatter.parse(actualEnd).getTime();
                    String expectedFinishStr = act.getExpectedFinishTime();//预估完成时间
                    long expectedFinishLong = StringUtils.isBlank(expectedFinishStr) ? 0 : formatter.parse(expectedFinishStr).getTime();
                    String targetStartTimeStr = act.getTargetStartTime();//预估完成时间
                    long targetStartTimeStrLong = StringUtils.isBlank(targetStartTimeStr) ? 0 : formatter.parse(targetStartTimeStr).getTime();
                    String taskTypa = null;
                    //任务状态1，正常执行
                    if (actualEndLong == 0 && btTImeLong > expectedFinishLong && btTImeLong >= currentStr) {
                        taskTypa = "normal";
                    }
                    //任务状态2，可能逾期
                    if (actualEndLong == 0 && btTImeLong <= expectedFinishLong) {
                        taskTypa = "isoverdue";
                    }
                    //任务状态3，已完成
                    if (actualEndLong != 0 && btTImeLong >= actualEndLong) {
                        taskTypa = "finished";
                    }
                    //任务状态4，逾期未完成
                    if (actualEndLong == 0 && btTImeLong < currentStr) {
                        taskTypa = "overdue";
                    }
                    //任务状态5，逾期已完成
                    if (actualEndLong != 0 && btTImeLong < actualEndLong) {
                        taskTypa = "red";
                    }
                    act.setTaskType(taskTypa);
                    //横坐标
//                    long X = (taskLong - startLong)%(1000 * 60 * 60 * 24 * 7)+1;

//                    double x = (taskLong - start) / (1000 * 60 * 60 * 24 * 7.0) + 1 + Math.random() * 0.3;
                    double x = (currentStr - taskLong) / (1000 * 60 * 60 * 24 * 7.0) + 1 + Math.random() * 0.3;
                    String Xaxis = df.format(x);
                    act.setXaxis(Double.parseDouble(Xaxis));
                    //偏差值
                    String deviation = "0";
                    if (actualEndLong != 0) {
                        deviation = df.format((btTImeLong - actualEndLong) / (1000 * 60 * 60 * 24));
                    } else if (actualEndLong == 0 && targetStartTimeStrLong < currentStr) {
                        deviation = df.format((btTImeLong - currentStr) / (1000 * 60 * 60 * 24));
                    } else {
                        deviation = "0";
                    }
                    act.setDeviation(Double.parseDouble(deviation));
                    resultList.add(act);
                }
            }
        }
        return activityVos;
    }


    @Override
    public List<PertVo> pertTable(String activeId) {
        List<StexpectedFinishTime> stexpectedFinishTimes = stexpectedFinishTimeMapper.findByPlanActivityRefIdIs(Long.valueOf(activeId));
        List<PertVo> pertVos = new ArrayList<>();
        for (StexpectedFinishTime stexpectedFinishTime : stexpectedFinishTimes) {
            Optional<PiplanActivity> opAct = activityMapper.findById(stexpectedFinishTime.getPlanActivityRefId());
            if (opAct.isPresent()) {
                PiplanActivity piplanActivity = opAct.get();
                PertVo pertVo = new PertVo();
                pertVo.setTaskStart(piplanActivity.getTargetStartDate() == null ? "" : DateUtils.getDateToString(piplanActivity.getTargetStartDate().getTime(), "yyyy-MM-dd HH:mm:ss"));
                pertVo.setTaskComplete(piplanActivity.getTargetEndDate() == null ? "" : DateUtils.getDateToString(piplanActivity.getTargetEndDate().getTime(), "yyyy-MM-dd HH:mm:ss"));
                pertVo.setEstimatedCompletion(stexpectedFinishTime.getExpectedFinishTime() == null ? "" : DateUtils.getDateToString(stexpectedFinishTime.getExpectedFinishTime().getTime(), "yyyy-MM-dd HH:mm:ss"));
                pertVo.setActualStart(piplanActivity.getActualStartDate() == null ? "" : DateUtils.getDateToString(piplanActivity.getActualStartDate().getTime(), "yyyy-MM-dd HH:mm:ss"));
                Long aLong1 = Optional.ofNullable(DateUtils.parseDate(StringUtils.defaultIfBlank(pertVo.getTaskComplete(), ""))).orElse(0L);
                Long aLong2 = Optional.ofNullable(DateUtils.parseDate(StringUtils.defaultIfBlank(pertVo.getTaskStart(), ""))).orElse(0L);
                Long aLong3 = Optional.ofNullable(DateUtils.parseDate(StringUtils.defaultIfBlank(pertVo.getEstimatedCompletion(), ""))).orElse(0L);
                long complete = (long) ((aLong1 - aLong2) * weight) + aLong2;
                long pertLong = complete +
                        aLong1 -
                        (aLong2 * 2)
                        + 4 * ((aLong3)
                        - (aLong2));
                DecimalFormat df = new DecimalFormat("0.00");// 设置保留两位位数
                String pert = df.format(pertLong / (1000 * 60 * 60 * 24 * 6));
                pertVo.setPert(pert);
                pertVos.add(pertVo);
            }
        }

        return pertVos;
    }
}




