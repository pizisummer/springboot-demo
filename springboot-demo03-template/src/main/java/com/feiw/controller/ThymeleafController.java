package com.feiw.controller;

import com.feiw.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pizisummer
 */
@Controller
public class ThymeleafController {
    @RequestMapping("/thym")
    public String index(Model model){
        model.addAttribute("name","<h1>thymeleaf</h1>");
        model.addAttribute("restaurant", new Restaurant("黄晓明", "林大厨"));
        model.addAttribute("welcome","welcomeB");
        return "thymeleaf/index";
    }

    @RequestMapping("/{dir}/{page}")
    public String pageController(@PathVariable String dir, @PathVariable String page){
        System.out.println("进入"+ dir+"/"+ page +"页");
        return dir+"/"+page;
    }

    @RequestMapping("/welcome")
    public String welcomeA(){
        System.out.println("进入welcome A！");
        return "thymeleaf/welcome";
    }

    @RequestMapping("/welcomeB")
    public String welcomeB(){
        System.out.println("进入welcome B！");
        return "thymeleaf/welcomeB";
    }

    @RequestMapping("/getParam")
    public String getParam(Restaurant restaurant){
        System.out.println(restaurant.toString());
        return "thymeleaf/welcome";
    }


}
