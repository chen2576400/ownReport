package com.df.report.test;

import com.df.report.mapper.LcStateMapper;
import com.df.report.model.LcState;
import com.df.report.model.MembershipLink;
import com.df.report.model.Pigroup;
import com.df.report.model.Piresource;
import com.df.report.service.PiplanActivityService;
import com.df.report.util.DateUtils;
import com.df.report.util.EntityUtils;
import com.google.common.collect.Lists;
import lombok.Data;
import org.hibernate.transform.Transformers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-05-11 13:59
 **/
@SpringBootTest
public class RunTest {
    @Autowired
    LcStateMapper lcStateMapper;
    @Autowired
    private EntityManager em;
    @Autowired
    private PiplanActivityService piplanActivityService;


    @Test

    public void test1() throws ParseException {
        piplanActivityService.WorkDelayTable(null,null,null,null);
//        List<LcState> all = lcStateMapper.findAll();
//        System.out.println(all);
//        System.out.println("====");

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = cb.createQuery();
        Root root = criteriaQuery.from(LcState.class);
        Path createStamp = root.get("createStamp");

        //date不支持时分秒
        criteriaQuery.select(root);
//                .where(cb.between(createStamp, new Date(DateUtils.parseDate("2021-12-18 08:49")), new Date(DateUtils.parseDate("2021-12-20 08:49"))));

        TypedQuery query = em.createQuery(criteriaQuery);
        List<LcState> resultList = query.getResultList();
        System.out.println(resultList.size());
    }


    @Test
    public void test2() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = cb.createQuery();
        Root root = criteriaQuery.from(LcState.class);
        Path id = root.get("id");

        criteriaQuery.select(cb.count(id));
        TypedQuery<Long> query = em.createQuery(criteriaQuery);
        Integer singleResult = query.getSingleResult().intValue();
        System.out.println(singleResult);

    }


    @Test
    public void test3() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = cb.createQuery();
        Root root = criteriaQuery.from(LcState.class);
        Path id = root.get("id");
        Path createStamp = root.get("createStamp");

        criteriaQuery.multiselect(id, createStamp);
        TypedQuery query = em.createQuery(criteriaQuery);

        List<Object[]> resultList = query.getResultList();

        List<DemonVO> demonVOS = EntityUtils.objectArrayToBean(resultList, DemonVO.class);
        System.out.println(resultList);

    }


    @Test
    public void test4() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = cb.createQuery();
        Root root = criteriaQuery.from(MembershipLink.class);
        Path roleAid = root.get("roleaobjectId");
        Path roleBid = root.get("rolebobjectId");

        //子查询部分
        Subquery<Pigroup> subquery = criteriaQuery.subquery(Pigroup.class);
        Root childRoot = subquery.from(Pigroup.class);
        Path childId = childRoot.get("id");
        subquery.select(childId);

        //条件
        Predicate predicate1 = cb.in(roleAid).value(subquery);


        criteriaQuery.select(roleBid).where(predicate1).groupBy(roleBid);
        TypedQuery<Long> query = em.createQuery(criteriaQuery);
        List<Long> singleResult = query.getResultList();
        System.out.println(singleResult);


    }


    @Test
    public void test5() {
        List<Long> singleResult = null;
        {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery criteriaQuery = cb.createQuery();
            Root root = criteriaQuery.from(MembershipLink.class);
            Path roleAid = root.get("roleaobjectId");
            Path roleBid = root.get("rolebobjectId");
            //子查询部分
            Subquery<Pigroup> subquery = criteriaQuery.subquery(Pigroup.class);
            Root childRoot = subquery.from(Pigroup.class);
            Path childId = childRoot.get("id");
            subquery.select(childId);
            //条件
            Predicate predicate1 = cb.in(roleAid).value(subquery);
            criteriaQuery.select(roleBid).where(predicate1).groupBy(roleBid);
            TypedQuery<Long> query = em.createQuery(criteriaQuery);
            singleResult = query.getResultList();
        }


        List<Long> rolebobjectIds = singleResult;
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = cb.createQuery();
        Root root = criteriaQuery.from(Piresource.class);
        Path id = root.get("id");
        Path userRefId = root.get("userRefId");

        List<Predicate> predicates = new ArrayList<>();
        List<List<Long>> partition = Lists.partition(rolebobjectIds, 900);
        for (List<Long> integers : partition) {
            predicates.add(cb.in(userRefId).value(integers));
        }
        Predicate or = cb.or(predicates.toArray(new Predicate[0]));
        criteriaQuery.select(id).where(cb.and(or));

        TypedQuery<Long> query = em.createQuery(criteriaQuery);
        List<Long> ids = query.getResultList();

    }
}


