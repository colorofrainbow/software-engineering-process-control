package com.zh.modules.serviceImpl;

import com.zh.modules.dao.UserDao;
import com.zh.modules.po.User;
import com.zh.modules.service.LojinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LojinServiceImpl implements LojinService {
    @Autowired
    public UserDao userDao;
    @Override
    public String checkLojin(Map<String,Object> username, String password) {
        String passwordDb=userDao.selectByUsername(username);
        if (passwordDb == null) {
            System.out.println("对象为空");
            return "false";
        } else if (passwordDb.equals(password)) {
            System.out.println("登陆成功");
            return "success";
        } else {
            return null;
        }
    }

    @Override
    public List<Map<String, Object>> selectUserList() {
        List<Map<String, Object>> list=userDao.selectUserList();
        return list;
    }

    @Override
    public void delUser(String name) {
        userDao.deleteUserByName(name);
    }
}
