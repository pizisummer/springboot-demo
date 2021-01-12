package com.feiw.bean;

import lombok.Data;

/**
 * @author pizisummer
 * 数据接收类
 * *@Data 自动生产所有属性的get方法、set方法，toString方法，hashCode方法
 */
@Data
public class Vegetables {
    private String potato;
    private String eggplant;
    private String greenpeper;

//    public String getPotato() {
//        return potato;
//    }
//
//    public void setPotato(String potato) {
//        this.potato = potato;
//    }
//
//    public String getEggplant() {
//        return eggplant;
//    }
//
//    public void setEggplant(String eggplant) {
//        this.eggplant = eggplant;
//    }
//
//    public String getGreenpeper() {
//        return greenpeper;
//    }
//
//    public void setGreenpeper(String greenpeper) {
//        this.greenpeper = greenpeper;
//    }
}
