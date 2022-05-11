package com.df.report.service;


import java.util.List;

/**
* @author chenning
* @description 针对表【piresource】的数据库操作Service
* @createDate 2022-05-11 16:52:20
*/
public interface PiresourceService  {
    //通过 membership_link 的 rolebobject_id == user_ref_id为条件查询 piresource
    List<Long> resourceIds(List<Long> rolebobjectIds);
}