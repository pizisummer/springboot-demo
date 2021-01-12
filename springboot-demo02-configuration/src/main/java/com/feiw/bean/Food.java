package com.feiw.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * *@Getter  自动生产get方法
 * *@Setter  自动生产set方法
 *
 */
@Getter@Setter
public class Food {
    private String rice;
    private String meat;
    private String[] sauce;

//    public String getRice() {
//        return rice;
//    }
//
//    public void setRice(String rice) {
//        this.rice = rice;
//    }
//
//    public String getMeat() {
//        return meat;
//    }
//
//    public void setMeat(String meat) {
//        this.meat = meat;
//    }
}
