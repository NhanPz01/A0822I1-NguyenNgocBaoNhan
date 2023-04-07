<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 27-Mar-23
  Time: 6:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quản lý nhân viên</title>
</head>
<body>
<center>
    <h1>Quản lý nhân viên</h1>
    <h2>
        <a href="/nhan-vien?action=create">Thêm mới nhân viên</a>
        <br>
        <a href="/nhan-vien">Tải lại</a>
    </h2>
    <div class="search">
        <form action="/nhan-vien" method="post">
            <h2>Tìm kiếm nhân viên</h2>
            <input type="text" name="search_country" placeholder="Tìm theo tên công việc...">
            <input type="submit" value="search" name="action">
        </form>
        <div align="center">
            <table border="1" cellpadding="5">
                <tr>
                    <th>Mã nhân viên</th>
                    <th>Họ tên</th>
                    <th>Ngày sinh</th>
                    <th>Địa chỉ</th>
                    <th>Ngày bắt đầu làm việc</th>
                    <th>Ngày kết thúc làm việc</th>
                    <th>Lương</th>
                    <th>Tên công việc</th>
                </tr>
                <c:forEach var="s" items="${search_country}">
                    <tr>

                        <th>${s.id}</th>
                        <th>${s.name}</th>
                        <th>${s.email}</th>
                        <th>${s.country}</th>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>Mã nhân viên</th>
            <th>Họ tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ngày bắt đầu làm việc</th>
            <th>Ngày kết thúc làm việc</th>
            <th>Lương</th>
            <th>Tên công việc</th>
            <th>Mã công việc</th>
        </tr>
        <c:forEach items="${listNhanVien}" var="nhanVien">
            <tr>
                <th><c:out value="${nhanVien.maNhanVien}"/></th>
                <th><c:out value="${nhanVien.hoTen}"/></th>
                <th><c:out value="${nhanVien.ngaySinh}"/></th>
                <th><c:out value="${nhanVien.diaChi}"/></th>
                <th><c:out value="${nhanVien.ngayBatDauLam}"/></th>
                <th><c:out value="${nhanVien.ngayKetThucLam}"/></th>
                <th><c:out value="${nhanVien.luong}"/></th>
                <th><c:out value="${nhanVien.tenCongViec}"/></th>
                <th><c:out value="${nhanVien.maCongViec}"/></th>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a>
                    <a href="/users?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
