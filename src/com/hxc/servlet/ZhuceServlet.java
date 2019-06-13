package com.hxc.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hxc.dao.UserDao;
import com.hxc.dao.DaoImpl.UserDaoImpl;
import com.hxc.entity.User;

public class ZhuceServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username"); //获取jsp页面传过来的参数
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String hobbys = request.getParameter("hobbys");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        User user = new User(); //实例化一个对象，组装属性
        user.setUsername(username);
        user.setPassword(password);
        user.setSex(sex);
        user.setHobbys(hobbys);
        user.setPhone(phone);
        user.setEmail(email);
        user.setAddress(address);

        UserDao ud = new UserDaoImpl();

        if(ud.register(user)){
            request.setAttribute("username", username);  //向request域中放置参数
            //request.setAttribute("xiaoxi", "注册成功");
            request.getRequestDispatcher("/denglu.jsp").forward(request, response);  //转发到登录页面
        }else{

            response.sendRedirect("index.jsp");//重定向到首页
        }
    }
}