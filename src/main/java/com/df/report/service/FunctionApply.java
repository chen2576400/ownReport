package com.df.report.service;

import java.util.List;
import java.util.function.Function;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-04-22 13:40
 **/
public interface FunctionApply {
    /**
     * @param function1 step1：membership_link  和 pigroup  查询    得到ship_link 的  rolebobject_id集合
     * @param function2 step2: 通过 membership_link 的 user_ref_id in（step1）为条件查询 piresource
     * @param function3 step3: 查询 piresource_assignment表 rsrc_ref_id in(step2) 得到 plannable_ref_id
     * @param ids       groupIds  任务延期所选部门
     * @return
     */
    List<Long> getPlanActIds(Function<List<Integer>, List<Long>> function1,
                                Function<List<Long>, List<Long>> function2,
                                Function<List<Long>, List<Long>> function3,
                                List<Integer> ids);


}
