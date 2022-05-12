package com.df.report.mapper;


import com.df.report.model.StexpectedFinishTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
* @author chenning
* @description 针对表【stexpected_finish_time】的数据库操作Mapper
* @createDate 2022-05-11 16:52:47
* @Entity com.df.report.model.StexpectedFinishTime
*/
public interface StexpectedFinishTimeMapper extends JpaRepository<StexpectedFinishTime,Long>  {


    List<StexpectedFinishTime> findByPlanActivityRefIdIs(Long id);
}




