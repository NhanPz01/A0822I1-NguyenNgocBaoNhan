<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10-Apr-23
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<h2>
    Your Sandwich Condiments
</h2>
<table border="1">
    <tr>
        <th>Choice</th>
    </tr>
    <c:forEach items="${condiment}" var="s">
        <tr>
            <td>
                <c:out value="${s}"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
