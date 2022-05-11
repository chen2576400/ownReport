package com.df.report.controller;

import com.df.report.model.PiplanActivityVo;
import com.df.report.service.PiplanActivityService;
import com.df.report.service.PiprojectService;
import com.df.report.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-04-20 16:39
 **/
@RestController
@RequestMapping("/HomeTable")
@Slf4j
@Api(tags = "首页报表展示")
public class HomeTableController {
    @Autowired
    PiplanActivityService piplanActivityService;
    @Autowired
    PiprojectService piprojectService;

    /**
     * 大屏展示工作任务延期
     * page.size传递为-1 查全部
     */
    @GetMapping(value = "/WorkDelayTable")
    @ApiOperation(value = "工作任务延期报表")
    public Result WorkDelayTable(String[] time,
                                 @RequestParam(value = "groupIds", required = false) List<Integer> groupIds,
                                 String projectId,
                                 String planId) throws ParseException {
        List<PiplanActivityVo> piplanActivityVos = piplanActivityService.WorkDelayTable(time, groupIds, projectId, planId);
        return Result.ok(piplanActivityVos);
    }


//    @GetMapping(value = "/projectType")
//    @ApiOperation(value = "项目类别展示报表")
//    public Result projectType() {
//        Map<String, Object> map = piprojectService.projectType();
//        return Result.ok(map);
//    }
//
//
//    @GetMapping(value = "/projectLevel")
//    @ApiOperation(value = "项目级别展示报表")
//    public Result projectLevel() {
//        List<ProjectLeveVo> list = piprojectService.projectLevel();
//        return Result.ok(list);
//    }
//
//
//    @GetMapping(value = "/getAllProject")
//    @ApiOperation(value = "获取所有项目清单")
//    public Result projectList() {
//        Map<Long, String> projectList = piprojectService.projectList();
//        return Result.ok(projectList);
//    }


}
