package com.df.report.mapper;


import com.df.report.model.Pigroup;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* @author chenning
* @description 针对表【pigroup】的数据库操作Mapper
* @createDate 2022-05-11 16:49:53
* @Entity com.df.report.model.Pigroup
*/
public interface PigroupMapper extends JpaRepository<Pigroup,Long> {

}




