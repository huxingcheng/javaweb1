package com.hxc.dao;

import com.hxc.entity.GoodsInfo;
import com.hxc.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public boolean login(String name,String pwd);//登录
    public boolean register(User user);//注册
//    public boolean add(GoodsInfo goodsInfo);//添加
//    public List<User> getUserAll();//返回用户信息集合
    public List<GoodsInfo> getGoodsInfoAll();///返回商品信息集合
    public boolean delete(int id);//根据id删除用户
    public boolean deleteGoods(int goodsid);//根据id删除商品信息
//    public boolean update(int id,String name,String pwd,String sex,String hobbys,
//                          String phone,String email,String address);//更新用户信息
    public boolean addGoods(GoodsInfo goodsInfo);//添加商品信息
    public GoodsInfo selectGoods(String id) throws SQLException;//查询商品信息
    public boolean modifyGoods(GoodsInfo goodsInfo);//编辑商品信息

}
