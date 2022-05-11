package com.df.report.mapper;


import com.df.report.model.Piproject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* @author chenning
* @description 针对表【piproject】的数据库操作Mapper
* @createDate 2022-05-11 16:52:08
* @Entity com.df.report.model.Piproject
*/
public interface PiprojectMapper extends JpaRepository<Piproject,Long> {

}




