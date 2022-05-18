package com.df.report.util.truePaging;

import lombok.Data;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-05-12 11:23
 **/
@Data
public class PageVO {

    private Integer current; //当前页
    private Integer size;   //条目数
    private Boolean enable;  //默认不给  false关闭分页


}
