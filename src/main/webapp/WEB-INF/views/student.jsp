<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student</title>
</head>
<body>
<form:form method="post" modelAttribute="student" action="/student">
    <form:label path="name">Name: </form:label>
    <form:input path="name"/>
    <br>
    <form:label path="name">Score: </form:label>
    <form:input path="score"/>
    <br>
    <form:label path="majors">Major: </form:label>
    <form:select path="majors" items="${majors}"/>
    <input type="submit" value="submit">
</form:form>
</body>
</html>