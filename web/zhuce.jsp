<%--
  Created by IntelliJ IDEA.
  User: 胡兴成
  Date: 2019/6/12
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="ZhuceServlet"method="post" style="padding-left: 40%">
    输入用户名:<input name="name" type="text"><br><br>
    输入密码:<input name="pwd" type="password"><br><br>
    选择性别:<input type="radio"name="sex"value="男"checked>男
    <input type="radio"name="sex"value="女">女<br><br>
</form>

</body>
</html>
