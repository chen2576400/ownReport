package com.df.report.service.impl;

import com.df.report.model.LcState;
import com.df.report.model.MembershipLink;
import com.df.report.model.Pigroup;
import com.df.report.service.MembershipLinkService;
import com.df.report.mapper.MembershipLinkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;

/**
 * @author chenning
 * @description 针对表【membership_link】的数据库操作Service实现
 * @createDate 2022-05-11 14:34:27
 */
@Service
public class MembershipLinkServiceImpl
        implements MembershipLinkService {

    @Autowired
    private EntityManager em;

    @Override
    public List<Long> rolebobjectIds(List<Integer> groupIds) {
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

        return singleResult;
    }
}




