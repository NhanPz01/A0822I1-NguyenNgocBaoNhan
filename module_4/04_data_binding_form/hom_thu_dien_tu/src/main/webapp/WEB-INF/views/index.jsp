<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 21-Apr-23
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Setting</title>
</head>
<body>
<p style="color: blue">${msg}</p>

<form:form method="post" action="/">
    <label>Languages: </label>
    <form:select path="language">
        <form:options items="${language}"></form:options>
    </form:select><br>
    <label>Page Size: </label>
    <form:select path="pageSize">
        <form:options items="${pageSize}"></form:options>
    </form:select><br>
    <label>Spams Filter: </label>
    <%--             <form:input type="checkbox" path="spamFilter" value="true"/> <a>Enable spams filter</a><br>--%>
    <form:checkbox path="spamFilter" value="true"/><a>Enable spams filter</a><br>
    <label>Signature: </label>
    <%--            <form:input type="text" path="signature"/><br>--%>
    <form:textarea path="signature"></form:textarea><br>
    <label> Submit: </label>
    <input type="submit" value="submit">
    <a href="">Cancel</a>

</form:form>

</body>
</html>
