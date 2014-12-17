<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>회원 목록</title>
</head>
<body>
    <ul>
    <c:forEach var="m" items="${members}">
        <li>${m.name}</li>
    </c:forEach>
    </ul>
</body>
</html>
