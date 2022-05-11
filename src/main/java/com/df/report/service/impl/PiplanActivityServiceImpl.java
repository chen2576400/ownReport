package com.df.report.service.impl;


import com.df.report.model.*;
import com.df.report.service.*;
import com.df.report.util.DateUtils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author chenning
 * @description 针对表【piplan_activity】的数据库操作Service实现
 * @createDate 2022-05-11 16:51:14
 */
@Service
public class PiplanActivityServiceImpl implements PiplanActivityService {
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


    @Override
    public List<PiplanActivityVo> WorkDelayTable(String[] time, List<Integer> groupIds, String projectId, String planId) throws ParseException {

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


        List<Predicate>  predicates=new ArrayList<>();
//        predicates.add(cb.in(projectRefId).value(subquery1));
//        predicates.add(cb.in(id).value(subquery2));
        predicates.add(cb.or(cb.in(projectRefId).value(subquery1),cb.in(id).value(subquery2)));

        predicates.add(cb.between(targetStartDate,new Timestamp(DateUtils.parseDate(startTime)),new Timestamp(DateUtils.parseDate(endTime))));


        List<Long> planActIds = functionApply.getPlanActIds(membershipLinkService::rolebobjectIds, piresourceService::resourceIds, piresourceAssignmentService::assignmentRsrcIds, groupIds);
        if (CollectionUtils.isNotEmpty(planActIds)){
            List<Predicate> or=new ArrayList<>();
            List<List<Long>> partition = Lists.partition(planActIds, 900);
            for (List<Long> integers : partition) {
                or.add(cb.in(id).value(integers));
            }
            predicates.add(cb.or(or.toArray(new Predicate[0])));
        }

        criteriaQuery.select(root).where(predicates.toArray(new Predicate[0]));
        TypedQuery query = em.createQuery(criteriaQuery);
        List<PiplanActivityVo> ids = query.getResultList();

        return null;
    }



//    private void t(){
//
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery criteriaQuery = cb.createQuery();
//        Root root = criteriaQuery.from(PiplanActivity.class);
//        Path id = root.get("id");
//        Path projectRefId = root.get("projectRefId");
//        Path targetStartDate = root.get("targetStartDate");
//
//        //子查询部分-Piproject
//        Subquery<Piproject> subquery1 = criteriaQuery.subquery(Piproject.class);
//        Root childRoot1 = subquery1.from(Piproject.class);
//        Path childId1 = childRoot1.get("id");
//        subquery1.select(childId1);
//
//
//        //子查询部分-StexpectedFinishTime
//        Subquery<StexpectedFinishTime> subquery2 = criteriaQuery.subquery(StexpectedFinishTime.class);
//        Root childRoot2 = subquery2.from(StexpectedFinishTime.class);
//        Path childId2 = childRoot1.get("planActivityRefId");
//        subquery2.select(childId1);
//
//
//        List<Predicate>  predicates=new ArrayList<>();
//        predicates.add(cb.in(projectRefId).value(subquery1));
//        predicates.add(cb.in(id).value(subquery2));
//        predicates.add(cb.between(targetStartDate,new Timestamp()))
//
//    }
}




