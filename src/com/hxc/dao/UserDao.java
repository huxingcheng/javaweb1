package com.hxc.dao;

import com.hxc.entity.User;

import java.util.List;

public interface UserDao {
    public boolean login(String username,String password);//登录
    public boolean register(User user);//注册
    public List<User> getUserAll();//返回用户信息集合
    public boolean delete(int id);//根据id删除用户
    public boolean update(int id,String username,String password,String sex,String hobbys,String phone,String email,String address);
}
