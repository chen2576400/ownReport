package com.df.report.service;


import com.df.report.model.ProjectLeveVo;

import java.util.List;
import java.util.Map;

/**
* @author chenning
* @description 针对表【piproject】的数据库操作Service
* @createDate 2022-05-11 16:52:08
*/
public interface PiprojectService {

    Map<String,Object> projectType();

    List<ProjectLeveVo> projectLevel();

}
