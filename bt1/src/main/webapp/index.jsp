<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form method="post" action="/display-discount">
    <label>Product Description</label></br>
    <input type="text" name="description"/></br>
    <label>List Price</label></br>
    <input type="number" name="price"/></br>
    <label>Discount Percent</label></br>
    <input type="number" name="percent"/></br>
    <input type="submit" id="submit" value="Caculator"/>
</form>
</body>
</html>