<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<body>
    ${student.name}
    <br>
    ${student.core}
    <br>
    ${student.majors}
    <br>
    <c:choose>
        <c:when test ="${student.mark <5.0}"> Yeu/Kem </c:when>
        <c:when test ="${student.mark >9.0 && student.mark<10.0}"> Gioi </c:when>
        <c:when test ="${student.mark <6.5 && student.mark <9.0}"> Kha</c:when>
        <c:otherwise> Trung binh </c:otherwise>
    </c:choose>
</body>
</html>
