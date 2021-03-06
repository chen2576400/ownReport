package com.df.report.service.impl;

import com.df.report.service.FunctionApply;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-04-22 13:41
 **/
@Service
public class FunctionApplyImpl implements FunctionApply {


    @Override
    public List<Long> getPlanActIds(Function<List<Integer>, List<Long>> function1, Function<List<Long>, List<Long>> function2, Function<List<Long>, List<Long>> function3, List<Integer> ids) {
        return function1.andThen(function2).andThen(function3).apply(ids);
    }

//    @Override
//    public List<Long> getPlanActIdsOnCache(Function<List<Integer>, List<Long>> function1, Function<List<Long>, List<Long>> function2, Function<List<Long>, List<Long>> function3, List<Integer> ids) {
//        List<Long> planActIds = null;
//        String key = RedisConstant.REDIS_CACHENAME_ACT;
//        if (redisService.exists(key)) {
//            planActIds = redisService.get(key);
//            if (CollectionUtils.isEmpty(planActIds)) {
//                planActIds = function1.andThen(function2).andThen(function3).apply(ids);
//                redisService.set(key, planActIds, 24 * 60 * 60);
//            }
//        } else {
//            planActIds = function1.andThen(function2).andThen(function3).apply(ids);
//            redisService.set(key, planActIds, 24 * 60 * 60);
//        }
//
//
//        return function1.andThen(function2).andThen(function3).apply(ids);
//    }
}
