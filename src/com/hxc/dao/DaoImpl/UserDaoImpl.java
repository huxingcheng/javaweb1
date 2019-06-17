package com.hxc.dao.DaoImpl;

import com.hxc.dao.UserDao;

import com.hxc.entity.GoodsInfo;
import com.hxc.entity.User;
import com.hxc.util.DBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    public boolean register(User user) {
        boolean flag = false;
        DBUtils.init();
        int i = DBUtils.addUpdDel("insert into user(name,pwd,sex,Hobbys,phone,Email,Address) " +
                "values('" + user.getName() + "','" + user.getPwd() + "','" + user.getSex() + "','" + user.getHobbys() + "','" + user.getPhone() + "','" + user.getEmail() + "','" + user.getAddress() + "')");
        if (i > 0) {
            flag = true;
        }
        DBUtils.colseConn();
        return flag;
    }

//    @Override
//    public boolean add(GoodsInfo goodsInfo) {
//        return false;
//    }

   /* public boolean register(GoodsInfo goodsInfo) {
        boolean flag = false;
        DBUtils.init();
        int i = DBUtils.addUpdDel("insert into goodsinfo(goodsInfo_name,goodsInfo_pic,goodsInfo_price,goodsInfo_description，goodsInfo_stock)" +
                "values('"+ goodsInfo.getGoodsInfo_name() +"','" + goodsInfo.getGoodsInfo_pic() +"','"+ goodsInfo.getGoodsInfo_price() +"'," + "" +
                "'"+ goodsInfo.getGoodsInfo_description() +"','" + goodsInfo.getGoods_stock() +"')");
        if (i > 0) {
            flag = true;
        }
        DBUtils.colseConn();
        return flag;
    }*/

    public boolean login(String name, String pwd) {
        boolean flag = false;
        try {
            DBUtils.init();
            ResultSet rs = DBUtils.selectSql("select * from user where name='" + name + "' and pwd='" + pwd + "'");
            while (rs.next()) {
                if (rs.getString("name").equals(name) && rs.getString("pwd").equals(pwd)) {
                    flag = true;
                }
            }
            DBUtils.colseConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

   /* public List<User> getUserAll() {
        List<User> list = new ArrayList<User>();
        try {
            DBUtils.init();
            ResultSet rs = DBUtils.selectSql("select * from user");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPwd(rs.getString("pwd"));
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
*/

    public List<GoodsInfo> getGoodsInfoAll() {
            List<GoodsInfo> list = new ArrayList<GoodsInfo>();
            try {
                DBUtils.init();
                ResultSet rs = DBUtils.selectSql("select * from goodsInfo");
                while (rs.next()) {
                    GoodsInfo goodsInfo = new GoodsInfo();
                    goodsInfo.setId(rs.getInt("id"));
                    goodsInfo.setGoodsInfo_name(rs.getString("goodsInfo_name"));
                    goodsInfo.setGoodsInfo_pic(rs.getString("goodsInfo_pic"));
                    goodsInfo.setGoodsInfo_price(rs.getString("goodsInfo_price"));
                    goodsInfo.setGoodsInfo_description(rs.getString("goodsInfo_description"));
                    goodsInfo.setGoods_stock(rs.getString("goods_stock"));
                    list.add(goodsInfo);
                }
                DBUtils.colseConn();
                return list;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }



  /*  public boolean update(int id, String name, String pwd, String sex, String hobbys, String phone, String email, String adress) {
        boolean flag = false;
        DBUtils.init();
        String sql = "update user set name ='" + name
                + "' , pwd ='" + pwd
                + "' , sex ='" + sex
                + "' , home ='" + hobbys
                + "' , phone ='" + phone
                + "' , email ='" + email
                + "' , adress ='" + adress
                + "' where id = " + id;
        int i = DBUtils.addUpdDel(sql);
        if (i > 0) {
            flag = true;
        }
        DBUtils.colseConn();
        return flag;
    }*/

    public boolean delete(int id) {
        boolean flag = false;
        DBUtils.init();
        String sql = "delete  from user where id=" + id;
        int i = DBUtils.addUpdDel(sql);
        if (i > 0) {
            flag = true;
        }
        DBUtils.colseConn();
        return flag;
    }
    @Override
    public boolean deleteGoods(int goodsId) {
        boolean flag = false;
        DBUtils.init();
        String sql = "delete from goodsinfo where id="+ goodsId;
        int i = DBUtils.addUpdDel(sql);
        if (i > 0) {
            flag = true;
        }
        DBUtils.colseConn();
        return flag;
    }

    @Override
    public boolean addGoods(GoodsInfo goodsInfo) {
        boolean flag = false;
        DBUtils.init();
        String sql = "insert into goodsinfo(goodsInfo_name,goodsInfo_pic,goodsInfo_price,goodsInfo_description,goods_stock) " +
                "value('"+goodsInfo.getGoodsInfo_name()+"','"+goodsInfo.getGoodsInfo_pic()+"','"+goodsInfo.getGoodsInfo_price()+"','"+goodsInfo.getGoodsInfo_description()+"','"+goodsInfo.getGoods_stock()+"')";
        int i = DBUtils.addUpdDel(sql);
        if (i > 0) {
            flag = true;
        }
        return flag;
    }

    @Override
    public GoodsInfo selectGoods(String id) throws SQLException {
        DBUtils.init();
        String sql = "select * from goodsinfo where id = " +id;
        ResultSet resultSet = DBUtils.selectSql(sql);
        GoodsInfo goodsInfo = null;
        while (resultSet.next()) {
            goodsInfo = new GoodsInfo();
            goodsInfo.setId(resultSet.getInt("id"));
            goodsInfo.setGoodsInfo_name(resultSet.getString("goodsInfo_name"));
            goodsInfo.setGoodsInfo_pic(resultSet.getString("goodsInfo_pic"));
            goodsInfo.setGoodsInfo_price(resultSet.getString("goodsInfo_price"));
            goodsInfo.setGoodsInfo_description(resultSet.getString("goodsInfo_description"));
            goodsInfo.setGoods_stock(resultSet.getString("goods_stock"));
        }
        if (goodsInfo != null) {
            return goodsInfo;
        }
        return null;
    }

    @Override
    public boolean modifyGoods(GoodsInfo goodsInfo) {
        boolean flag = false;
        DBUtils.init();
        String sql = "update goodsinfo set goodsInfo_name ='" + goodsInfo.getGoodsInfo_name()
                + "' , goodsInfo_pic ='" + goodsInfo.getGoodsInfo_pic()
                + "' , goodsInfo_price ='" + goodsInfo.getGoodsInfo_price()
                + "' , goodsInfo_description ='" + goodsInfo.getGoodsInfo_description()
                + "' , goods_stock ='" + goodsInfo.getGoods_stock()
                + "' where id = " + goodsInfo.getId();
        int i = DBUtils.addUpdDel(sql);
        if (i > 0) {
            flag = true;
        }
        DBUtils.colseConn();
        return flag;
    }



}

