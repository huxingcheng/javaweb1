<%--
  Created by IntelliJ IDEA.
  User: 胡兴成
  Date: 2019/6/12
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>注册</title>
</head>
<body background="img/1.jpg">
<form action="ZhuceServlet" method="post" style="padding-left:40%;">
    输入用户名:<input name="name" type="text"><br><br>
    输入密码:<input name="pwd" type="password"><br><br>
    选择性别:<input type="radio" name="sex" value="男" checked>男
    <input type="radio" name="sex" value="女">女<br><br>
    选择爱好：<input type="checkbox" name="hobbys" value="sing">唱
             <input type="checkbox" name="hobbys" value="jump">跳
             <input type="checkbox" name="hobbys" value="rap">rap<br>
    电话：<input type="text" name="phone"><br>
    邮箱：<input type="text" name="email"><br>
    地址：<input type="text" name="address"><br>
    <input type="reset" value="重置"><input type="submit" value="注册">
</form>

</body>
</html>





