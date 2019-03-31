<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<table border="1" style="width: 100%">
<tr>
    <th> Họ và tên </th>
    <th> Điểm </th>
    <th> Chuyên ngành </th>
    <th> Xếp loại </th>
</tr>
<c:forEach var="student"items="${student}">
<tr>
    <td> ${student.name}</td>
    <td> ${student.mark}</td>
    <td>${student.majors}</td>
    <td>
       <c:choose>
           <c:when test="${student.mark < 5}"> Yếu </c:when>
           <c:when test="${student.mark >= 5} && ${student.mark <7}"> Trung bình </c:when>
           <c:when test="${student.mark >=7} && ${student.mark <8}"> Khá </c:when>
           <c:when test="${student.mark >=8} && ${student.mark <= 10}">Gioi </c:when>
           <c:when test="${student.mark < 0} && ${student.mark >10}">Không hợp lệ </c:when>

       </c:choose>
    </td>
</tr>
</c:forEach>
</table>
