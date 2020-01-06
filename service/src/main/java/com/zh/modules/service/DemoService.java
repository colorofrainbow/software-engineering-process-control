package com.zh.modules.service;

import com.zh.modules.po.User;

import java.util.Map;

public interface DemoService {
    String Test();
    String getUserByName(Map username);
    String addUser2cache(Map username);
}
