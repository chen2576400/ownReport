package com.df.report.model;

import lombok.Data;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-04-25 17:19
 **/
@Data
public class ProjectLeveVo {
    //名称
    private String name;

    //总数
    private Double count;

    //百分比
    private String percentage;
}
