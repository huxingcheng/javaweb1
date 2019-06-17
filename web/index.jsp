<%--
  Created by IntelliJ IDEA.
  User: 胡兴成
  Date: 2019/6/12
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body background="img/1.jpg">
  <h1>登录失败，请输入用户名和密码！</h1>
  <a href="denglu.jsp">返回</a>
  </body>
</html>

