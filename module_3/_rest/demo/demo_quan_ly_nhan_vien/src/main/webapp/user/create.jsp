<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 27-Mar-23
  Time: 7:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quản lý nhân viên</title>
</head>
<body>
<center>
    <h1>Thêm mới nhân viên</h1>
    <h2>
        <a href="nhan-vien?action=nhan-vien">Danh sách nhân viên</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Chỉnh sửa thông tin nhân viên
                </h2>
            </caption>
            <c:if test="${nhanVien != null}">
                <input type="hidden" name="id" value="<c:out value='${nhanVien.maNhanVien}' />"/>
            </c:if>
            <tr>
                <th>Họ tên:</th>
                <td>
                    <input type="text" name="hoTen" size="45"
                           value="<c:out value='${nhanVien.hoTen}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Ngày sinh:</th>
                <td>
                    <input type="text" name="ngaySinh" size="45"
                           value="<c:out value='${nhanVien.ngaySinh}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Địa chỉ:</th>
                <td>
                    <input type="text" name="diaChi" size="15"
                           value="<c:out value='${nhanVien.diaChi}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Ngày bắt đầu làm:</th>
                <td>
                    <input type="text" name="ngayBatDauLam" size="15"
                           value="<c:out value='${nhanVien.ngayBatDauLam}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Ngày kết thúc làm:</th>
                <td>
                    <input type="text" name="ngayKetThucLam" size="15"
                           value="<c:out value='${nhanVien.ngayKetThucLam}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Lương:</th>
                <td>
                    <input type="text" name="luong" size="15"
                           value="<c:out value='${nhanVien.luong}'/>"
                    />
                </td>
            </tr>
            <tr>
                <th>Mã công việc:</th>
                <td>
                    <select name="maCongViec">
                        <option value="CV1">CV1</option>
                        <option value="CV2">CV2</option>
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
</div>
</body>
</html>
