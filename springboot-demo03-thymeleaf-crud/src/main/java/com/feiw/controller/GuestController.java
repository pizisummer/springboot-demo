package com.feiw.controller;

import com.feiw.bean.Guest;
import com.feiw.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 业务控制类  返回视图
 */
@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;
    @RequestMapping("/guest/list")
    public String list(Model model){
        List<Guest> list = guestService.list();
        model.addAttribute("guestList",list);
        return "list";
    }

    @RequestMapping("/pageControllerAdd/{page}")
    public String pageController(@PathVariable String page){
        System.out.println("进入pageController页" +page);
        return page;
    }

    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        System.out.println("进入toAdd页");
        return "add";
    }

    @RequestMapping("/guest/add")
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest/list";
    }


    @RequestMapping("/pageControllerUpdate/{page}")
    public String pageControllerUpdate(@PathVariable String page,Model model,String name){
        System.out.println("进入pageController页" +page);
        System.out.println(name);
        Guest guest = guestService.get(name);
        model.addAttribute("guest", guest);
        return page;
    }


    @RequestMapping("/guest/toUpdate")
    public String toUpdate(Model model,String name){
        System.out.println(name);
        Guest guest = guestService.get(name);
        model.addAttribute("guest", guest);
        return "update";
    }


    @RequestMapping("/guest/update")
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/delete")
    public String delete(String name){
        guestService.delete(name);
        return "redirect:/guest/list";
    }
}
