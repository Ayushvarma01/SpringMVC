<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>${MyName}</p>
	<form action="order">
		<label for="item_order">Order :</label> 
		<input type="text" placeholder="Order your food" id="item_order"  name="food">
		<button type="submit">Place</button>
	</form>

</body>
</html>