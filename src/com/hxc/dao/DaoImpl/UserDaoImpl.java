package com.hxc.dao.DaoImpl;

import com.hxc.dao.UserDao;

import com.hxc.entity.User;
import com.hxc.util.DBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{

    public boolean register(User user) {
        boolean flag = false;
        DBUtils.init();
        int i =DBUtils.addUpdDel("insert into user(name,pwd,sex,) " +
                "values('"+user.getPhone()+"','" +user.getAddress()+"','"+user.getUsername()+"','"+user.getPassword()+"','"+user.getSex()+"','"+user.getHobbys()+"','"+user.getEmail()+"')");
        if(i>0){
            flag = true;
        }
        DBUtils.colseConn();
        return flag;
    }
    public boolean login(String name, String pwd) {
        boolean flag = false;
        try {
            DBUtils.init();
            ResultSet rs = DBUtils.selectSql("select * from user where username='"+name+"' and password='"+pwd+"'");
            while(rs.next()){
                if(rs.getString("username").equals(name) && rs.getString("password").equals(pwd)){
                    flag = true;
                }
            }
            DBUtils.colseConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
    public List<User> getUserAll() {
        List<User> list = new ArrayList<User>();
        try {
            DBUtils.init();
            ResultSet rs = DBUtils.selectSql("select * from user");
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setSex(rs.getString("sex"));
                user.setHobbys(rs.getString("hobbys"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                list.add(user);
            }
            DBUtils.colseConn();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean update(int id,String username, String password,String sex, String hobbys, String phone,String email ,String adress) {
        boolean flag = false;
        DBUtils.init();
        String sql ="update user set username ='"+username
                +"' , password ='"+password
                +"' , sex ='"+sex
                +"' , home ='"+hobbys
                +"' , phone ='"+ phone
                +"' , email ='"+ email
                +"' , adress ='"+ adress
                + "' where id = "+id;
        int i =DBUtils.addUpdDel(sql);
        if(i>0){
            flag = true;
        }
        DBUtils.colseConn();
        return flag;
    }
    public boolean delete(int id) {
        boolean flag = false;
        DBUtils.init();
        String sql = "delete  from user where id="+id;
        int i =DBUtils.addUpdDel(sql);
        if(i>0){
            flag = true;
        }
        DBUtils.colseConn();
        return flag;
    }

}

