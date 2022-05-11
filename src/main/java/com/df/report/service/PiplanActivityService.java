package com.df.report.service;


import com.df.report.model.PiplanActivityVo;

import java.text.ParseException;
import java.util.List;

/**
* @author chenning
* @description 针对表【piplan_activity】的数据库操作Service
* @createDate 2022-05-11 16:51:14
*/
public interface PiplanActivityService{


    List<PiplanActivityVo> WorkDelayTable(String[] time, List<Integer> groupIds, String projectId, String planId)throws ParseException;

}
