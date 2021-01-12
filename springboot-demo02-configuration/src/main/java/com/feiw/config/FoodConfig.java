package com.feiw.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * food.rice=拌饭
 * food.meat=烤肉
 *此类为配置文件类，类属性对应配置文件中food的2个属性值
 *  = @ConfigurationProperties 声明这是一个配置文件对应的类
 * prefix前缀指向配置文件中的一级目录
 *
 *必须在主程序入口类（Demo2Application类）用@EnableConfigurationProperties将此类注册为配置文件类
 * * @Configuration 声明这是一个配置类 功能和在主程序入口类用@EnableConfigurationProperties功能一样
 * 然后项目启动的时候会创建该类的对象，并从配置文件中读取food为前缀的属性值，赋给该类的对象属性
 * @author pizisummer
 *
 * *@Data lombok.Data自动生产所有属性的get方法、set方法，toString方法，hashCode方法
 */
//@Configuration
@ConfigurationProperties(prefix = "food")
@Data
public class FoodConfig {
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
