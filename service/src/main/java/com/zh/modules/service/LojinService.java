package com.zh.modules.service;

import java.util.List;
import java.util.Map;

public interface LojinService {
    String checkLojin(Map<String,Object> username,String password);
    List<Map<String,Object>> selectUserList ();
    void delUser(String name);
}
