<%@ page import="com.example.ss_11_product_manager.bean.Product" %>
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
    <title>Detail</title>
</head>
<body>
<h1>Detail product</h1>
<% Product product = (Product) request.getAttribute("product");%>
<table>
    <tr>
        <td>ID</td>
        <td><%=product.getId()%></td>
    </tr>
    <tr>
        <td>Name</td>
        <td><%=product.getName()%></td>
    </tr>
</table>
</body>
</html>
