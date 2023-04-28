<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 21-Apr-23
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Setting</title>
</head>
<body>
<a href="/email/update">Create Student</a>
<table>
    <tr>
        <th>Languages</th>
        <th>PageSize</th>
        <th>SpamFilter</th>
        <th>Signature</th>
    </tr>

    <c:forEach var="s" items="${listEmail}">
        <tr>
            <td>${s.languages}</td>
            <td>${s.pageSize}</td>
            <td>
                <c:if test="${s.spamFilter == true}">
                    yes
                </c:if>
                <c:if test="${s.spamFilter == false}">
                    no
                </c:if>
            </td>
            <td>${s.signature}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
