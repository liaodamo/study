<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2px" cellspacing="2px">
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>余额</th>
    </tr>
    <c:forEach items="${acounts}" var="alist">
        <tr>
            <td>${alist.id}</td>
            <td>${alist.name}</td>
            <td>${alist.balance}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
