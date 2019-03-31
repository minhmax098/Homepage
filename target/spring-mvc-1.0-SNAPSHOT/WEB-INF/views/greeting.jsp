<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
    <c:set var="description" value="${products.descrition}" >
    {description}
    <c:forEach items="${product}" var="${product}">
        ${product}
        <br>
    </c:forEach>
ơ
</body>
</html>
