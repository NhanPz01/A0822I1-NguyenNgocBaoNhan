<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 08-Apr-23
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EN-VN Dictionary</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<div class="mb-3">
    <label for="exampleEn" class="form-label">English</label>
    <input type="text" class="form-control" id="exampleEn" name="en"
           value="${en}"
    >
</div>
<div class="mb-3">
    <label for="exampleVn" class="form-label">Vietnamese</label>
    <input type="text" class="form-control" id="exampleVn" name="vn"
           value="${vn}"
    >
</div>
<a href="/dictionary"><button type="button" class="btn btn-primary">Return</button></a>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</html>
