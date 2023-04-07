<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 31-Mar-23
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
</head>
<body>

<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>Customer ID</th>
            <th>Full Name</th>
            <th>Date Of Birth</th>
            <th>Gender</th>
            <th>CMND/CCCD</th>
            <th>Phone Number</th>
            <th>Email</th>
            <th>Loai Khach</th>
            <th></th>
        </tr>
        <c:forEach items="${listCustomer}" var="customer">
            <tr>
                <td><c:out value="${customer.id}"/></td>
                <td><c:out value="${customer.name}"/></td>
                <td><fmt:formatDate value="${customer.dateOfBirth}" pattern="dd/MM/yyyy"/></td>
                <c:if test="${customer.gender > 0}">
                    <p>Nam</p>
                </c:if>
                <c:if test="${customer.gender = 0}">
                    <p>Nữ</p>
                </c:if>
                <td><c:out value="${customer.privateId}"/></td>
                <td><c:out value="${customer.phoneNumber}"/></td>
                <td><c:out value="${customer.email}"/></td>
                <td><c:out value="${customer.address}"/></td>
                <td><c:out value="${customer.customerType.name}"/></td>
                <td>
                    <a href="/customer?action=edit&id=${customer.id}">Edit</a>
                    <a href="/customer?action=delete&id=${customer.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
