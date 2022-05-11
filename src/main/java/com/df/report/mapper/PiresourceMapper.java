package com.df.report.mapper;

import com.df.report.model.Piresource;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* @author chenning
* @description 针对表【piresource】的数据库操作Mapper
* @createDate 2022-05-11 16:52:20
* @Entity com.df.report.model.Piresource
*/
public interface PiresourceMapper extends JpaRepository<Piresource,Long> {

}




