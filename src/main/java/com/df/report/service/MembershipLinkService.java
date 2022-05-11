package com.df.report.service;

import com.df.report.model.MembershipLink;

import java.util.List;

/**
* @author chenning
* @description 针对表【membership_link】的数据库操作Service
* @createDate 2022-05-11 14:34:27
*/
public interface MembershipLinkService {


    //membership_link A 和 pigroup B 查询    A.rolebobject_id
    List<Long> rolebobjectIds(List<Integer> groupIds);
}
