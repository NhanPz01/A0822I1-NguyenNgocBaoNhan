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
<form method="post">
    <h2>
        Sandwich Condiments
    </h2>
    <table>
        <tr>
            <td>
                <input type="checkbox" name="lettuce" id="lettuce" value="Lettuce">
                <span>Lettuce</span>
            </td>
            <td>
                <input type="checkbox" name="tomato" id="tomato" value="Tomato">
                <span>Tomato</span>
            </td>
            <td>
                <input type="checkbox" name="mustard" id="mustard" value="Mustard">
                <span>Mustard</span>
            </td>
            <td>
                <input type="checkbox" name="sprouts" id="sprouts" value="Sprouts">
                <span>Sprouts</span>
            </td>
        </tr>
    </table>
    <br>
    <input type="submit" value="Save">
</form>
</body>
</html>
