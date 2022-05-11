package com.df.report.test;

import lombok.Data;

import java.io.Serializable;

@Data
public class DemonVO implements Serializable {
    public DemonVO(){

    }

//    public DemonVO(String id,String createStamp){
//        this.id=id;
//        this.createStamp=createStamp;
//    }

    private String id;
    private  String createStamp;

}