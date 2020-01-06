package com.zh.modules.serviceImpl;

import com.zh.modules.dao.UserDao;
import com.zh.modules.po.User;
import com.zh.modules.service.DemoService;
import com.zh.modules.service.UserCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DemoServiceImpl implements DemoService,UserCacheService {
    @Autowired
    public UserDao userDao;
    @Override
    public String Test(){
        return "success";
    }

    @Override
    @Cacheable(value = "user",key = "'users_'+#username")
    public String getUserByName(Map username) {
        return  userDao.selectByUsername(username);
    }



    @Override
    @CachePut(value="user",key = "'users_'+#username")
    public String addUser2cache(Map username) {
        return userDao.selectByUsername(username);
    }


//    @Override
//    @CachePut(value = "user",key = "'users_'+#username")
//    public String getUserByName(Map username) {
//        return  userDao.selectByUsername(username);
//    }

}
