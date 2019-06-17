package com.hxc.servlet;

import com.hxc.dao.DaoImpl.UserDaoImpl;
import com.hxc.dao.UserDao;
import com.hxc.entity.GoodsInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class ModifyInfoServlet  extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);  //将信息使用doPost方法执行   对应jsp页面中的form表单中的method
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        UserDao userDao = new UserDaoImpl();

        try {
            GoodsInfo goodsInfo = userDao.selectGoods(id);
            request.setAttribute("goods", goodsInfo);
            request.getRequestDispatcher("/modify.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
