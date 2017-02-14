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
    <title>用户信息页面</title>
</head>
<body>
<form action="/rest/userlist" >
    查询条件：
    <table width="100%" border="1">
        <tr>
            <td><input type="submit" value="查询"></td>
        </tr>
    </table>
    用户列表：
    <table width="100%" border="1">
        <tr>
            <td>用户名称</td>
            <td>用户电话</td>
            <td>email</td>
            <td>创建时间</td>
            <td>更新时间</td>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.username }</td>
                <td>${user.phone }</td>
                <td>${user.email }</td>
                <td>${user.created }</td>
                <td>${user.updated }</td>
                <td><a href="/rest/editUserPage/${user.id}">修改页面</a></td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>
