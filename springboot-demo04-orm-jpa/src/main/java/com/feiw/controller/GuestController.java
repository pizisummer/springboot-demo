package com.feiw.controller;


import com.feiw.model.Guest;
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

}
