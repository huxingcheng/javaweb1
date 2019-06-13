<%--
  Created by IntelliJ IDEA.
  User: 胡兴成
  Date: 2019/6/12
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录注册页面</title>
</head>
<body background="img/1.jpg">
<form action="DengluServlet" method="post" style="padding-left:40%">
    用户名：<input type="text" name="name" value="" style="background-color: aliceblue"><br>
    &nbsp;&nbsp;密码： <input type="password" name="pwd" value="" style="background-color: aliceblue"><br>
    &nbsp;&nbsp;<input type="submit" value="登录" name="denglu" style="background-color: #1fff55">
    &nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置" style="background-color: #1fff55">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form action="zhuce.jsp"><input type="submit" value="新用户注册" style="background-color: #1fff55"></form>
</form>
</body>
</html>
