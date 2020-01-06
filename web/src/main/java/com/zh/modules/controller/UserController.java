package com.zh.modules.controller;

import com.zh.modules.JsonUtil;
import com.zh.modules.po.User;
import com.zh.modules.service.LojinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zh.modules.service.DemoService;

import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private DemoService demoService;
    @Autowired
    private LojinService lojinService;

    @RequestMapping(value = "/getUserByName",method =RequestMethod.POST)
    public String getUpByName(@RequestBody String param){
        Map username=  JsonUtil.coverJson2Map(param);
        demoService.addUser2cache(username);
        return demoService.getUserByName(username);
    }

//    @Cacheable(value = "user",key = "'users'+#name")
//    @RequestMapping(value="/getUser",method =RequestMethod.POST)
//    public String getUser(String name){
//        String password=demoService.getUserByName(name);
//        return password;
//    }

    @CacheEvict(value = "user",key = "'users_'+#name")
    @RequestMapping(value="/delUserByName",method =RequestMethod.POST)
    public void delUser(String name){
        lojinService.delUser(name);
    }
}
