package com.hxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxc.dao.UserDao;
import com.hxc.dao.DaoImpl.UserDaoImpl;
import com.hxc.entity.GoodsInfo;
import com.hxc.entity.User;


public class Searchall extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        UserDao ud = new UserDaoImpl();
//        List<User> userAll = ud.getUserAll();
//        request.setAttribute("userAll", userAll);
//        System.out.println(userAll);
//        request.getRequestDispatcher("/showall.jsp").forward(request, response);


        UserDao ud = new UserDaoImpl();
         List<GoodsInfo> goodsInfoAll = ud.getGoodsInfoAll();
         request.setAttribute("goodsInfoAll",goodsInfoAll);
        request.getRequestDispatcher("/showall.jsp").forward(request,response);
    }
}