<%--
  Created by IntelliJ IDEA.
  User: liuhb
  Date: 2017/2/13
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改用户信息</title>
</head>
<body>
<form action="/rest/editUser" method="post">
    <input type="hidden"  name="id" value="${user.id}">
    修改用户信息:
    <table width="100%" border="1">
        <tr>
            <td>用户名称</td>
            <td>
                <input type="text" name = "username" value="${user.username}">
            </td>
        </tr>

        <tr>
            <td>用户密码</td>
            <td>
                <input type="text" name = "password" value="${user.password}">
            </td>
        </tr>

        <tr>
            <td>手机</td>
            <td>
                <input type="text" name="phone" value="${user.phone}">
            </td>
        </tr>

        <tr>
            <td>创建日期</td>
            <td>
                <input type="text" name="created" value="${user.created}">
            </td>
        </tr>
        <tr>
            <td>更新日期</td>
            <td>
                <input type="text" name="updated" value="${user.updated}">
            </td>
        </tr>


        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>

    </table>

</form>

</body>
</html>
