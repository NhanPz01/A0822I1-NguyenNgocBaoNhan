<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 05-Apr-23
  Time: 7:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Management</title>
</head>
<body>
<center>
    <h1>Xóa thông tin nhân viên</h1>
    <h2>
        <a href="/nhan-vien">Nhân viên</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h3>
                    Delete Product
                </h3>
            </caption>
            <tr>
                <th>Are you sure???</th>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Confirm"/>
                </td>
            </tr>
        </table>
    </form>
    <a href="/product"><button>Back</button></a>
</div>
</body>
</html>
