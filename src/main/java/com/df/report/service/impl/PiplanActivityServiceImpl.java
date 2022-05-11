package com.df.report.service.impl;


import com.df.report.model.PiplanActivityVo;
import com.df.report.service.PiplanActivityService;
import com.df.report.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.text.ParseException;
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


        return null;
    }
}




