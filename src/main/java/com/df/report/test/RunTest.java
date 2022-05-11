package com.df.report.test;

import com.df.report.mapper.LcStateMapper;
import com.df.report.model.LcState;
import com.df.report.util.DateUtils;
import com.df.report.util.EntityUtils;
import lombok.Data;
import org.hibernate.transform.Transformers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;
import java.io.Serializable;
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


    @Test
    public void test1() {
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

        criteriaQuery.multiselect(id,createStamp);
        TypedQuery query = em.createQuery(criteriaQuery);

        List<Object[]> resultList = query.getResultList();

        List<DemonVO> demonVOS = EntityUtils.objectArrayToBean(resultList, DemonVO.class);
        System.out.println(resultList);

    }


}


