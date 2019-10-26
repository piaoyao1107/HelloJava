package com.itheima.springboot.service;

import com.itheima.springboot.po.User;

import java.util.List;

public interface UserService {

    //查询所有
    List<User> getAllUsers();

    //删除数据
    void deleteUser(Integer id);
}
