<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10-Apr-23
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flavor choice</title>
</head>
<body>
<form action="/save" method="get">
    <h2>
        Sandwich Condiments
    </h2>
    <table>
        <tr>
            <td>
                <input type="checkbox" name="condiment" value="Lettuce"/>
                <span>Lettuce</span>
            </td>
            <td>
                <input type="checkbox" name="condiment" value="Tomato">
                <span>Tomato</span>
            </td>
            <td>
                <input type="checkbox" name="condiment" value="Mustard">
                <span>Mustard</span>
            </td>
            <td>
                <input type="checkbox" name="condiment" value="Sprouts">
                <span>Sprouts</span>
            </td>
        </tr>
    </table>
    <br>
    <input type="submit" value="Save">
</form>
</body>
</html>
