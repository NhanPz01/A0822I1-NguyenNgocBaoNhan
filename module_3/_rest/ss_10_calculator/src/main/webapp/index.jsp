<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<fieldset>
    <legend>Simple Calculator</legend>
    <form method="post" action="/calculator">
        <h4>Calculator</h4>
        <h4>First operand</h4>
        <input type="text" name="first_operand" placeholder="first">
        <h4>First operand</h4>
        <label>Operator:</label>
        <select name="operators">
            <option value="+">Addition</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiple</option>
            <option value="/">Division</option>
        </select>
        <br>
        <h4>Second operand</h4>
        <input type="text" name="second_operand" placeholder="second">
        <input type="submit" value="Calculate">
    </form>

</fieldset>

</body>
</html>