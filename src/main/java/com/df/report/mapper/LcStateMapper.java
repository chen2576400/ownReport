package com.df.report.mapper;

import com.df.report.model.LcState;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* @author chenning
* @description 针对表【lc_state】的数据库操作Mapper
* @createDate 2022-05-11 13:51:19
* @Entity com.df.report.model.LcState
*/
public interface LcStateMapper extends JpaRepository<LcState,Long> {


}




