package com.feiw.controller;

import com.feiw.bean.Guest;
import com.feiw.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 业务控制类  返回视图
 */
@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;
    @GetMapping()
    public String list(Model model){
        List<Guest> list = guestService.list();
        model.addAttribute("guestList",list);
        return "list";
    }

    @GetMapping("/pageControllerAdd/{page}")
    public String pageController(@PathVariable String page){
        return page;
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @PostMapping()
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest";
    }


    @GetMapping("/pageControllerUpdate/{page}/{name}")
    public String pageControllerUpdate(@PathVariable("page") String page,Model model, @PathVariable("name") String name){
        Guest guest = guestService.get(name);
        model.addAttribute("guest", guest);
        return page;
    }

    /**
     * 将/guest/toUpdate/{name}格式的url映射到此方法
     * 其中的name属性值  通过注解 @PathVariable("name")映射到方法的属性中
     * 其中的“name” 代表去url中查找的属性值
     * 直译的意思就是  从路径中获取name的值
     *
     * @param model
     * @param name
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model, @PathVariable("name") String name){
        Guest guest = guestService.get(name);
        model.addAttribute("guest", guest);
        return "update";
    }


    @PutMapping()
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestService.delete(name);
        return "redirect:/guest";
    }
}
