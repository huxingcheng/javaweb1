/*
package com.hxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hxc.dao.UserDao;
import com.hxc.dao.DaoImpl.UserDaoImpl;

public class DeleteServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("这是删除用户的servlet==========================");
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        int userId = Integer.parseInt(id);

        UserDao ud = new UserDaoImpl();

        if (ud.delete(userId)) {
            request.setAttribute("hxc", "删除成功");
            request.getRequestDispatcher("/Searchall").forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    }

}
*/
