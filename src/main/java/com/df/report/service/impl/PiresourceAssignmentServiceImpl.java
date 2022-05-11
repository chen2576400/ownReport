package com.df.report.service.impl;

import com.df.report.model.Piresource;
import com.df.report.model.PiresourceAssignment;
import com.df.report.service.PiresourceAssignmentService;
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
 * @description 针对表【piresource_assignment】的数据库操作Service实现
 * @createDate 2022-05-11 16:52:35
 */
@Service
public class PiresourceAssignmentServiceImpl implements PiresourceAssignmentService {
    @Autowired
    private EntityManager em;

    @Override
    public List<Long> assignmentRsrcIds(List<Long> reoourceIds) {
        if (CollectionUtils.isEmpty(reoourceIds)) return null;

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = cb.createQuery();
        Root root = criteriaQuery.from(PiresourceAssignment.class);
        Path rsrcRefId = root.get("rsrcRefId");
        Path plannableRefId = root.get("plannableRefId");

        List<Predicate> predicates=new ArrayList<>();
        List<List<Long>> partition = Lists.partition(reoourceIds, 900);
        for (List<Long> integers : partition) {
            predicates.add(cb.in(rsrcRefId).value(integers));
        }
        Predicate or = cb.or(predicates.toArray(new Predicate[0]));
        criteriaQuery.select(plannableRefId).where(cb.and(or));

        TypedQuery<Long> query = em.createQuery(criteriaQuery);
        List<Long> ids= query.getResultList();
        return ids;
    }
}




