package com.zh.modules.dao;
import com.zh.modules.po.User;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Repository
public interface UserDao {
    String selectByUsername(Map<String ,Object> username);
    List<Map<String,Object>> selectUserList();
    void deleteUserByName(String username);
}
