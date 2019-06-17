<%--
  Created by IntelliJ IDEA.
  User: 胡兴成
  Date: 2019/6/13
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body background="img/1.jpg">
${hxc} <br>
<a href="Searchall">查看所有商品信息</a><br>
</body>
</html>




