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
    <script type="text/javascript">
        function userCheck() {
            var flag = true;
            var username = document.getElementById("name").value;
            var password = document.getElementById("pwd").value;
            if ("" == username) {
                alert("请输入账号");
                flag = false;
                return false;

            }else  if ("" == pwd) {
                alert("请输入密码")
                flag = false;
                return false;
            }if (flag == true)  {
                return true;
            }
        }
    </script>

    <%--<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
    <script type="text/javascript" src="images/login.js"></script>
    <link href="css/login2.css" rel="stylesheet" type="text/css" />--%>
</head>
<body>
<%--<h1>登录注册页面</h1>

<div class="login" style="margin-top:50px;">

    <div class="header">
        <div class="switch" id="switch"><a class="switch_btn_focus" id="switch_qlogin" href="javascript:void(0);"
                                           tabindex="7">快速登录</a>
            <a class="switch_btn" id="switch_login" href="javascript:void(0);" tabindex="8" >快速注册</a>
            <div class="switch_bottom" id="switch_bottom" style="position: absolute; width: 64px; left: 0px;"></div>
        </div>
    </div>


    <div class="web_qr_login" id="web_qr_login" style="display: block; height: 235px;">

        <!--登录-->
        <div class="web_login" id="web_login">


            <div class="login-box">


                <div class="login_form">
                    <form action="DengluServlet" name="loginform" accept-charset="utf-8" id="login_form" class="loginForm"
                          method="post"><input type="hidden" name="did" value="0"/>
                        <input type="hidden" name="to" value="log"/>
                        <div class="uinArea" id="uinArea">
                            <label class="input-tips" for="u">帐号：</label>
                            <div class="inputOuter" id="uArea">

                                <input type="text" id="u" name="username" class="inputstyle"/>
                            </div>
                        </div>
                        <div class="pwdArea" id="pwdArea">
                            <label class="input-tips" for="p">密码：</label>
                            <div class="inputOuter" id="pArea">

                                <input type="password" id="p" name="p" class="inputstyle"/>
                            </div>
                        </div>

                        <div style="padding-left:50px;margin-top:20px;"><input type="submit" value="登 录"
                                                                            style="width:150px;"
                                                                               class="button_blue"/></div>
                    </form>
                </div>

            </div>

        </div>
        <!--登录end-->
    </div>

    <!--注册-->
    <div class="qlogin" id="qlogin" style="display: none; ">

        <div class="web_login">
            <form name="form2" id="regUser" accept-charset="utf-8" action="zhuce.jsp" method="post">
                <input type="hidden" name="to" value="reg"/>
                <input type="hidden" name="did" value="0"/>
                <ul class="reg_form" id="reg-ul">
                    <div id="userCue" class="cue">快速注册请注意格式</div>
                    <li>

                        <label for="user" class="input-tips2">用户名：</label>
                        <div class="inputOuter2">
                            <input type="text" id="user" name="user" maxlength="16" class="inputstyle2"/>
                        </div>

                    </li>

                    <li>
                        <label for="passwd" class="input-tips2">密码：</label>
                        <div class="inputOuter2">
                            <input type="password" id="passwd" name="passwd" maxlength="16" class="inputstyle2"/>
                        </div>

                    </li>
                    <li>
                        <label for="passwd2" class="input-tips2">确认密码：</label>
                        <div class="inputOuter2">
                            <input type="password" id="passwd2" name="" maxlength="16" class="inputstyle2"/>
                        </div>

                    </li>

                    <li>
                        <label for="qq" class="input-tips2">QQ：</label>
                        <div class="inputOuter2">

                            <input type="text" id="qq" name="qq" maxlength="10" class="inputstyle2"/>
                        </div>

                    </li>

                    <li>
                        <div class="inputArea">
                            <input type="button" id="reg" style="margin-top:10px;margin-left:85px;" class="button_blue"
                             form action="zhuce.jsp"      value="同意协议并注册"/> <a href="#" class="zcxy" target="_blank">注册协议</a>
                        </div>

                    </li>
                    <div class="cl"></div>
                </ul>
            </form>


        </div>


    </div>--%>
    <!--注册end-->
<form action="DengluServlet" method="post" style="padding-left:40%">
    用户名:<input type="text" name="name" value=""><br>
    密码:<input type="password" name="pwd" value="" style="padding-left: 15px"  ><br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="登录" name="denglu" >
</form>
    <form action="zhuce.jsp" style="padding-left:45%">
        <input type="submit" value="新用户注册" >
    </form>
</body>
</html>
