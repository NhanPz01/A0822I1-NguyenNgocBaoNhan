<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 05-Apr-23
  Time: 7:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Management</title>
</head>
<body>
<div align="left">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Add new Produdct
                </h2>
            </caption>
            <tr>
                <th>Name</th>
                <td>
                    <input type="text" name="name" size="205px"
                           value="<c:out value='${product.name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Price</th>
                <td>
                    <input type="number" name="price" size="205px"
                           value="<c:out value='${product.price}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Quantity</th>
                <td>
                    <input type="number" name="quantity" size="205px"
                           value="<c:out value='${product.quantity}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Color</th>
                <td>
                    <input type="text" name="color" size="205px"
                           value="<c:out value='${product.color}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Description</th>
                <td>
                    <input type="text" name="description" size="205px"
                           value="<c:out value='${product.description}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Category</th>
                <td>
                    <select name="category_id">
                        <c:forEach items="${listCategory}" var="category">
                            <option value="${category.id}">
                                <c:out value="${category.name}"></c:out>
                            </option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
    <a href="/product"><button>Back</button></a>
</div>
</body>
</html>
