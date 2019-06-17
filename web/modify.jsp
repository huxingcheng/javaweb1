<%--
  Created by IntelliJ IDEA.
  User: 胡兴成
  Date: 2019/6/16
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品添加页面</title>
</head>
<body>
<h1>${hxc}</h1>
    <form action="/ModifyGoodsInfoServlet" method="post">
        <input hidden type="text" name="id" value="${goods.id}">
        商品名称：<input type="text" name="goodsInfo_name" value="${goods.goodsInfo_name}"><br>
        商品图片：<input type="file" name="goodsInfoPic"  value="${goods.goodsInfo_pic}"><br>
        商品价格：<input type="text" name="goodsInfo_price" value="${goods.goodsInfo_price}"><br>
        商品描述：<input type="text" name="goodsInfo_description" value="${goods.goodsInfo_description}"><br>
        商品库存：<input type="text" name="goodsInfo_stock" value="${goods.goods_stock}"><br>
        <button type="submit">修改</button>
</form>

</body>
</html>
