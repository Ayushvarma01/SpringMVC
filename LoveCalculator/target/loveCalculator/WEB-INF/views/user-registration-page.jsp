<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">User Register</h1>
	<div align="center">
		<form:form action="" method="post" >
			<form:input path="name" name="name"></form:input>
			<form:input type="name" name="name"></form:input>
			<form:input type="password" name="password"></form:input>
			<form:select type="name" name="name">
				<form:option value="India">India</form:option>
				<form:option value="america">america</form:option>
				<form:option value="landown">landown</form:option>
				<form:option value="uk">uk</form:option>
			</form:select>
			<form:input type="checkbox" name="cricket">cricket</form:input>
			<form:input type="checkbox" name="reading">reading</form:input>
			<form:input type="checkbox" name="firshing">firshing</form:input>
			<form:input type="radio" name="male">male</form:input>
			<form:input type="radio" name="female">female</form:input>
		</form:form>
	</div>
</body>
</html>