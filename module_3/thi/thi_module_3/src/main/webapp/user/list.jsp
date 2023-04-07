<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 05-Apr-23
  Time: 7:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Management</title>
</head>
<body>
<div style="float: left">
    <a href="/product?action=create">
        <button>Add new product</button>
    </a>
    <a href="/product">
        <button>Reload</button>
    </a>
</div>
<br>
<form style="float: right" action="/product?action=search" method="get">
    <input type="text" name="searchName" placeholder="Search">
    <input type="submit" value="search" name="action"/>
</form>
<div align="center">
    <table border="1" cellpadding="5">
        <caption>
            <h3>Product List</h3>
        </caption>
        <tr>
            <th>STT</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Color</th>
            <th>Category</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${listProduct}" var="product">
            <tr>
                <td><c:out value="${product.id}"/></td>
                <td><c:out value="${product.name}"/></td>
                <td><c:out value="${product.price}"/></td>
                <td><c:out value="${product.quantity}"/></td>
                <td><c:out value="${product.color}"/></td>
                <td><c:out value="${product.category.name}"/></td>
                <td>
                    <a href="/product?action=edit&id=${product.id}">
                        <button>Edit</button>
                    </a>
                    <a href="/product?action=delete&id=${product.id}">
                        <button>Delete</button>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
