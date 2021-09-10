<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/acount/transfer" method="post">
账户名称<input type="text" name="name"><br>
修改金额<input type="text" name="balance"><br>
账户名称1<input type="text" name="name1"><br>
修改金额1<input type="text" name="balance1"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>