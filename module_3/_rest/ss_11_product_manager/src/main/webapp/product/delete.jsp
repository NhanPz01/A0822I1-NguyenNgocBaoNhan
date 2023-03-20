<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 19-Mar-23
  Time: 11:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
<h1>Delete a product</h1>
<p>
    <c:if test="${messageDelete != null}">
        <span class="messageDelete"> ${messageDelete}</span>
    </c:if>
</p>
<p>
    <a href="/product"> Back List Product </a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>ID:</td>
                <td>${product.getId()}</td>
            </tr>
            <tr>
                <td>Name:</td>
                <td>${product.getName()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete"></td>
                <td><a href="/product">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
