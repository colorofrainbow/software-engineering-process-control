package com.zh.modules.controller;

import com.zh.modules.JsonUtil;
import com.zh.modules.service.UserCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/add")
public class AddUserController {

    @Autowired
    UserCacheService userCacheService;

    @RequestMapping(value="/addUser",method =RequestMethod.POST)
    public String addUser(@RequestBody String param) {
        Map username=  JsonUtil.coverJson2Map(param);
        return userCacheService.addUser2cache(username);
    }
}