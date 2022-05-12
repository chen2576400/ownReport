package com.df.report.model;

import lombok.Data;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-04-24 13:48
 **/
@Data
public class PertVo {
    private String taskStart;
    private String taskComplete;
    private String estimatedCompletion;
    private String actualStart;
    private String pert;
}
