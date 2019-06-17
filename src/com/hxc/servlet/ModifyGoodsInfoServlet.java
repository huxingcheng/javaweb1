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

public class ModifyGoodsInfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);  //将信息使用doPost方法执行   对应jsp页面中的form表单中的method
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String goodsInfo_name = request.getParameter("goodsInfo_name"); //获取jsp页面传过来的参数
        String id = request.getParameter("id"); //获取jsp页面传过来的参数
        String goodsInfo_pic = request.getParameter("goodsInfoPic");
        String goodsInfo_price = request.getParameter("goodsInfo_price");
        String goodsInfo_description = request.getParameter("goodsInfo_description");
        String goodsInfo_stock = request.getParameter("goodsInfo_stock");

        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setId(Integer.parseInt(id));
        goodsInfo.setGoodsInfo_name(goodsInfo_name);
        goodsInfo.setGoodsInfo_pic(goodsInfo_pic);
        goodsInfo.setGoodsInfo_price(goodsInfo_price);
        goodsInfo.setGoodsInfo_description(goodsInfo_description);
        goodsInfo.setGoods_stock(goodsInfo_stock);

        UserDao userDao = new UserDaoImpl();
        boolean b = userDao.modifyGoods(goodsInfo);
        if (b) {
            request.setAttribute("hxc", "修改成功");
            request.getRequestDispatcher("/Searchall").forward(request, response);
        }else {
            request.setAttribute("hxc", "修改失败");
            request.getRequestDispatcher("/Searchall").forward(request, response);
        }

    }
}
