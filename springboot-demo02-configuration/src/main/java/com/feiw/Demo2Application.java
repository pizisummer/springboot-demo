package com.feiw;

import com.feiw.config.FoodConfig;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 *  = @SpringBootApplication
 * 声明我们的入口类  并且声明是springboot项目的
 *
 * 通过@EnableConfigurationProperties这个注解将该类注册为属性配置的类
 * * @EnableConfigurationProperties({FoodConfig.class})
 *  * 告诉主程序入口类  要自动引入配置文件
 *  * 配置文件对应的类作为它的参数
 *  功能和在配置类使用@Configuration 一样
 * @author pizisummer
 */
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class Demo2Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Demo2Application.class);
        //Banner.Mode.OFF 关闭
//        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}
