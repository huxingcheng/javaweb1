/*package com.hxc.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxc.dao.UserDao;
import com.hxc.dao.DaoImpl.UserDaoImpl;
import com.hxc.entity.User;
import com.hxc.entity.GoodsInfo;

public class UpdateServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        int userId = Integer.parseInt(id);

        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        String sex = request.getParameter("sex");
        String hobbys = request.getParameter("hobbys");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        System.out.println("------------------------------------"  + userId);

        UserDao ud = new UserDaoImpl();

        if (ud.update(userId, name, pwd, sex, hobbys, phone, email, address)) {
            request.setAttribute("hxc", "更新成功");
            request.getRequestDispatcher("/Searchall").forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}*/
