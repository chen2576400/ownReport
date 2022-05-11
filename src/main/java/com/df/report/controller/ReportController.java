//package com.df.report.controller;
//
//import com.df.report.service.PiplanActivityService;
//import com.df.util.Result;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiOperation;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;
//
//
//@RestController
//@RequestMapping("/HeavyDutyTable")
//@Slf4j
//@Api(tags = "新重汽报表")
//@Validated
//public class ReportController {
//
//    @Autowired
//    PiplanActivityService piplanActivityService;
//
//    @GetMapping(value = "/pertTable")
//    @ApiOperation(value = "pert表")
//    @ApiImplicitParam(name = "activeId", value = "活动Id", dataType = "String",dataTypeClass=String.class)
//    public Result pert(
//            @Pattern(regexp = "(^[0-9]*[1-9][0-9]*$)", message = "只能输入正整数")
//            @NotNull(message = "参数不能为空")
//                    String activeId) {
//        return Result.ok(piplanActivityService.pertTable(activeId));
//    }
//
//
//}
