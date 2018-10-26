<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function add()
{
	
	document.fm.action="reg";
	document.fm.submit();
	
	
	}
function edit()
{
	
	document.fm.action="edit";
	document.fm.submit();
	
	
	}
function del()
{
	
	document.fm.action="del";
	document.fm.submit();
	
	
	}



</script>
</head>
<body bgcolor="powderblue">
<form name="fm">
<center>
<pre>
<h3>Success Page</h3>
<table border="3">
<tr><th>Id</th><th>Name</th><th>Mobile</th><th>City</th><th>Address</th><th>Username</th><th>Password</th></tr>
<c:forEach items="${data}" var="s">

<tr>
<td><input type="radio" name="id" value="${s.id}"></td>
<td>${s.name}</td>
<td>${s.mob}</td>
<td>${s.city}</td>
<td>${s.address}</td>
<td>${s.login.username}</td>
<td>${s.login.password}</td>


</tr>
</c:forEach>
<tr><td colspan="7"><input type="button" value="add" onclick="add()" ><input type="button" value="edit" onclick="edit()" ><input type="button" value="delete" onclick="del()" ></td></tr>


</table>

</pre>


</center>


</form>

</body>
</html>