<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <a href="/customer"></a>
    <h1 style="display: block;position: center">Danh sach khach hang</h1>
    <table>
        <tr>
            <th>Ten</th>
            <th>Ngay sinh</th>
            <th>Dia chi</th>
            <th>Hinh anh</th>
        </tr>
        <c:forEach items="${customers}" var="cust">
            <tr>
                <td>${cust.name}</td>
                <td>${cust.dateOfBirth}</td>
                <td>${cust.address}</td>
                <td><img src="${cust.image}"></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>