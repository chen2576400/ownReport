package com.df.report.mapper;

import com.df.report.model.MembershipLink;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* @author chenning
* @description 针对表【membership_link】的数据库操作Mapper
* @createDate 2022-05-11 14:34:27
* @Entity com.df.report.model.MembershipLink
*/
public interface MembershipLinkMapper extends JpaRepository<MembershipLink,Long> {

}




