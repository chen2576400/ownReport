package com.df.report.test;

import com.df.report.mapper.LcStateMapper;
import com.df.report.model.LcState;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-05-11 13:59
 **/
@SpringBootTest
public class RunTest {
    @Autowired
    LcStateMapper lcStateMapper;


    @Test
    public void test1() {
        List<LcState> all = lcStateMapper.findAll();
        System.out.println(all);
        System.out.println("====");
    }


}
