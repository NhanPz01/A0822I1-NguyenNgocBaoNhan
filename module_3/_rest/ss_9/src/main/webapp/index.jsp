<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<style type="text/css">
    .login {
        height:180px; width:230px;
        margin:0;
        padding:10px;
        border:1px #CCC solid;
    }
    .login input {
        padding:5px; margin:5px
    }
</style>
<body>
<form method="post" action="/display-discount ">
    <div class="product_detail">
        <h2>Product Description</h2>
        <input type="text" name="product_description" size="30"  placeholder="product description" />
        <h2>List Price</h2>
        <input type="text" name="list_price" size="30"  placeholder="list price" />
        <h2>Discount Percent</h2>
        <input type="text" name="discount_percent" size="30"  placeholder="discount percent" />

        <input type="submit" value="Calculate Discount"/>
    </div>
</form>
<div class="result">
    <h2>Discount price</h2>
    <p><%=request.getAttribute("discount_price")%></p>
</div>
</body>
</html>