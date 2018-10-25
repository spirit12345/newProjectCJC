<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="powderblue">
<h1></h1>
<center>
<pre>
<h3>Success Page</h3>
<table border="3">
<tr><th>Id</th><th>Name</th><th>Mobile</th><th>City</th><th>Address</th><th>Username</th><th>Password</th></tr>
<c:forEach items="${data}" var="s">

<tr>
<td>${s.id}</td>
<td>${s.name}</td>
<td>${s.mob}</td>
<td>${s.city}</td>
<td>${s.address}</td>
<td>${s.login.username}</td>
<td>${s.login.password}</td>


</tr>
</c:forEach>
</table>

</pre>


</center>




</body>
</html>