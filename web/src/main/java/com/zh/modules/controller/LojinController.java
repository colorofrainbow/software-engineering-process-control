package com.zh.modules.controller;

import com.zh.modules.service.DemoService;
import com.zh.modules.service.LojinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LojinController {
    @RequestMapping("/getLojin")
    public String Lojin(){
        return "lojin.html";
    }

}
