<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate</title>
</head>
<body>
<h1>Result</h1>
<p><%=request.getAttribute("first_operand")%> <%=request.getAttribute("operators")%> <%=request.getAttribute("second_operand")%>
    = <%=request.getAttribute("result")%>
</p>
</body>
</html>
