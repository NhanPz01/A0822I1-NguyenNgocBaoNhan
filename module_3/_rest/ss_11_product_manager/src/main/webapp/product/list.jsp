<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 15-Mar-23
  Time: 8:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<a href="/product?action=create">Create new Product</a>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Edit</th>
        <th>Detail</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${products}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td><a href="/product?action=edit&id=${p.id}">Edit</a></td>
            <td><a href="/product?action=detail&id=${p.id}">Detail</a></td>
            <td><a href="/product?action=delete&id=${p.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
