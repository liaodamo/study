<%--
  Created by IntelliJ IDEA.
  User: 不知墨笔
  Date: 2021/8/19
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/acount/update" method="post">
    账户名称<input type="text" name="name"><br>
    修改金额<input type="text" name="balance"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
