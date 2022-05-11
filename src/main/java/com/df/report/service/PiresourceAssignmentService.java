package com.df.report.service;


import java.util.List;

/**
* @author chenning
* @description 针对表【piresource_assignment】的数据库操作Service
* @createDate 2022-05-11 16:52:35
*/
public interface PiresourceAssignmentService  {

    List<Long> assignmentRsrcIds(List<Long> reoourceIds);

}
