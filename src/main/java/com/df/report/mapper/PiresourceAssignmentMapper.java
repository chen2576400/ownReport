package com.df.report.mapper;

import com.df.report.model.PiresourceAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* @author chenning
* @description 针对表【piresource_assignment】的数据库操作Mapper
* @createDate 2022-05-11 16:52:35
* @Entity com.df.report.model.PiresourceAssignment
*/
public interface PiresourceAssignmentMapper extends JpaRepository<PiresourceAssignment,Long> {

}




