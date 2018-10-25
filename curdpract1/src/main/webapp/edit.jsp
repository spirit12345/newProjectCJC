<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aabbcc">
<form action="update">
<h1>Edit Page</h1>
<h1>${msg}</h1>
<table>
<tr><td>Name :</td><td><input type="text" name="name" value="${data.name}"></td></tr>
<tr><td>Mobile :</td><td><input type="text" value="${data.mob}"></td></tr>
<tr><td>Address :</td><td><input type="text" value="${data.address}"></td></tr>
<tr><td>City :</td><td><input type="text" value="${data.city}"></td></tr>
<tr><td>Username :</td><td><input type="text" value="${data.username}"></td></tr>
<tr><td>Password  :</td><td><input type="text" value="${data.password}"></td></tr>
</table>
<input type="text" name="Update">
</form>
</body>
</html>