<%@ taglib prefix="c" uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10-Apr-23
  Time: 8:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
            crossorigin="anonymous"></script>
</head>
<body>
<form method="post">
    <table class="table">
        <thead>
        <h3>
            Calculator
        </h3>
        </thead>
        <tbody>
        <tr>
            <td colspan="4">
                <div class="input-group">
                    <input type="text" aria-label="Number 1" class="form-control" placeholder="Number 1" name="num1"
                           value="${num1}">
                    <input type="text" aria-label="Number 2" class="form-control" placeholder="Number 2" name="num2"
                           value="${num2}">
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <input class="btn btn-primary" type="submit" name="way" value="Addition (+)">
            </td>
            <td>
                <input class="btn btn-primary" type="submit" name="way" value="Subtraction (-)">
            </td>
            <td>
                <input class="btn btn-primary" type="submit" name="way" value="Multiplication (X)">
            </td>
            <td>
                <input class="btn btn-primary" type="submit" name="way" value="Division (/)">
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <span>Result </span>
                <span c:if="${way != null}">of ${way}</span>
                <span c:if="${result != null}">is ${result}</span>
<%--                <span>of ${way}</span>--%>
<%--                <span>is ${result}</span>--%>
            </td>
        </tr>
        </tbody>
    </table>
</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</html>
