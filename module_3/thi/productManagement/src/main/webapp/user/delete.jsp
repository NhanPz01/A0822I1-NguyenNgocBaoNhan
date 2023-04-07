<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 03-Apr-23
  Time: 7:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
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
        <h2>
          Delete Product
        </h2>
      </caption>
      <tr>
        <th>Are you sure???</th>
        <td colspan="2" align="center">
          <input type="submit" value="Confirm"/>
          <a href="/product">Back</a>
        </td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>
