<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/10
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="account/findAll">测试</a>

    <form action="account/save" method="post">
        id:<input type="text" name="id"><br>
        姓名：<input type="text" name="username"><br>
        金额：<input type="text" name="money"><br>
        <input type="submit" value="保存">
    </form>

</body>
</html>
