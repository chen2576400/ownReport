package com.df.report.service.impl;

import com.df.report.model.Piresource;
import com.df.report.service.PiresourceService;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenning
 * @description 针对表【piresource】的数据库操作Service实现
 * @createDate 2022-05-11 16:52:20
 */
@Service
public class PiresourceServiceImpl implements PiresourceService {
    @Autowired
    private EntityManager em;

    @Override
    public List<Long> resourceIds(List<Long> rolebobjectIds) {
        if (CollectionUtils.isEmpty(rolebobjectIds)) return null;

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

        return ids;
    }
}




