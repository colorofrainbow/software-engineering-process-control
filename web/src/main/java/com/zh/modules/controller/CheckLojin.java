package com.zh.modules.controller;

import com.zh.modules.service.LojinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckLojin {
    @Autowired
    private LojinService lojinService;
//    @RequestMapping(value = "/checkLojin", method = RequestMethod.POST)
//    public String Check(@RequestParam("name") String name, @RequestParam("password") String password) {
//        return lojinService.checkLojin(name, password);
//    }
}
