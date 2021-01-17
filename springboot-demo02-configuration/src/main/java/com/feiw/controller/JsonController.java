package com.feiw.controller;

import com.feiw.bean.Food;
import com.feiw.bean.Vegetables;
import com.feiw.config.FoodConfig;
import com.feiw.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pizisummer
 */
@RestController
public class JsonController {
//    @RequestMapping("/json")
//    public String json(){
//        return "Hello Json!!";
//    }


    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;
    @RequestMapping("/jasypt")
    public String jasypt(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(username);
        stringBuffer.append("\t");
        stringBuffer.append(password);
        return stringBuffer.toString();
    }



    @Autowired
    private VegetablesConfig vegetablesConfig;
    @RequestMapping("/vegetables")
    private Vegetables jsonVegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
        vegetables.setPotato(vegetablesConfig.getPotato());
        return vegetables;
    }
    /**
     * 方法三
     *  = @Autowired 声明此属性为配置文件类FoodConfig对象，直接向springboot要，在项目启动的时候已经创建该对象
     * FoodConfig对象已经从配置文件获取相应属性的值
     * 在方法中直接使用对象的属性值
     */
    @Autowired
    private FoodConfig foodConfig;
    @RequestMapping("/jsonfood")
    public Food jsonFood(){
        Food food = new Food();
        food.setRice(foodConfig.getRice());
        food.setMeat(foodConfig.getMeat());
        food.setSauce(foodConfig.getSauce());
        return food;
    }



    /**
     * 方法二
     *food.rice = 拌饭
     *food.meat = 烤肉
     * @Value 通过${}结构获得配置文件中属性值
     * 通过@Value读取application.properties文件中的属性值，
     * 赋给方法中的对象，然后返回json对象
     * */
//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;
//    @RequestMapping("/jsonfood")
//    public Food jsonFood(){
//        Food food = new Food();
//        food.setRice(rice);
//        food.setMeat(meat);
//        return food;
//    }

    /**
     * 方法一
     * 在方法里面直接创建对象并赋值返回json对象
     */
//    @RequestMapping("/jsonfood")
//    public Food jsonFood(){
//        Food food = new Food();
//        food.setMeat("烤肉");
//        food.setRice("拌饭");
//        return food;
//    }
}
