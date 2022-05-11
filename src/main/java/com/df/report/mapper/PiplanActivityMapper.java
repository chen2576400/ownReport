package com.df.report.mapper;


import com.df.report.model.PiplanActivity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* @author chenning
* @description 针对表【piplan_activity】的数据库操作Mapper
* @createDate 2022-05-11 16:51:14
* @Entity com.df.report.model.PiplanActivity
*/
public interface PiplanActivityMapper extends JpaRepository<PiplanActivity,Long> {

}




