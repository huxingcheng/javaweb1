<%--
  Created by IntelliJ IDEA.
  User: 胡兴成
  Date: 2019/6/13
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>所有用户页面</title>
</head>

<body background="img/1.jpg">
<h1>${hxc}</h1>
<%--<table width="600" border="1" cellpadding="0">
    <tbody>
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>性别</th>
        <th>密码</th>
        <th>爱好</th>
        <th>手机号</th>
        <th>邮箱</th>
        <th>地址</th>
        <th>操作</th>
    </tr>

    <c:forEach var="U" items="${userAll}">
        <form action="UpdateServlet" method="post">
            <tr>
                <td><input type="text" value="${U.id}" name="id"></td>
                <td><input type="text" value="${U.name}" name="name"></td>
                <td><input type="text" value="${U.sex}" name="sex"></td>
                <td><input type="text" value="${U.pwd}" name="pwd"></td>
                <td><input type="text" value="${U.hobbys}" name="hobbys"></td>
                <td><input type="text" value="${U.phone}" name="phone"></td>
                <td><input type="text" value="${U.email}" name="email"></td>
                <td><input type="text" value="${U.address}" name="address"></td>
                <td><a href="DeleteServlet?id=${U.id}">删除</a> <input type="submit" value="添加"/></td>
            </tr>
        </form>
    </c:forEach>
    </tbody>

</table>--%>





<table width="600" border="1" cellpadding="0">
    <tbody>
    <tr>
        <th>ID</th>
        <th>商品名称</th>
        <th>商品图片</th>
        <th>商品价格</th>
        <th>商品描述</th>
        <th>商品库存</th>
        <th>操作</th>
    </tr>
    <c:forEach var="U" items="${goodsInfoAll}">
        <form action="UpdateServlet" method="post">
            <tr>
                <td><input type="text" value="${U.id}" name="id"></td>
                <td><input type="text" value="${U.goodsInfo_name}" name="goodsInfo_name"></td>
                <td><input type="text" value="${U.goodsInfo_pic}" name="goodsInfo_pic"></td>
                <td><input type="text" value="${U.goodsInfo_price}" name="goodsInfo_price"></td>
                <td><input type="text" value="${U.goodsInfo_description}" name="goodsInfo_description"></td>
                <td><input type="text" value="${U.goods_stock}" name="goods_stock"></td>
                <td>
                    <a href="ModifyInfoServlet?id=${U.id}">编辑</a>
                    <a href="DeleteInfoServlet?id=${U.id}">删除</a>
                    <a href="add.jsp">添加</a>

                </td>
            </tr>
        </form>
    </c:forEach>
    </tbody>
</table>

</body>
</html>

