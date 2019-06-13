package com.hxc.util;

import java.sql.*;

public class DBUtils {
    private static String url = "jdbc:mysql://localhost:3306/huahua";
    private static String username = "root";
    private static String password = "123456";
    static Connection conn = null;
    static ResultSet rs = null;
    static PreparedStatement ps = null;
    public static void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("init[SQL驱动程序失败！]");
            e.printStackTrace();
        }

    }
    public static int addUpdDel(String sql) {
        int i = 0;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            i = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("sql数据库增删改异常");
            e.printStackTrace();
        }
        return i;
    }
    public static ResultSet selectSql(String sql) {
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("sql数据库查询异常");
            e.printStackTrace();
        }
        return rs;

    }
    public static void colseConn() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("sql数据库关闭异常");
            e.printStackTrace();
        }
    }



}