<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h3>Login Here</h3>
<form name="loginForm" action="login" method="post">
<table>
<tr><td>Id: </td><td><input name="id" type="text"/></td></tr>
<tr><td>Password: </td><td><input name="password" type="password"/></td></tr>
<tr><td>Name: </td><td><input name="name" type="text"/></td></tr>
<tr><td>Address: </td><td><input name="address" type="text"/></td></tr>
<tr><td/><td><input name="Submit" type="submit"></td></tr>
</table>
</form>
</body>
</html>