<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">

function add() {
	alert ("Adding Record");
	document.myform.action="reg";
	document.myform.submit();
}


function edit() {
	alert ("Editing Record");
	document.myform.action="edit";
	document.myform.submit();
}

function del() {
	alert ("Deleting Record");
	document.myform.action="del";
	document.myform.submit();
}

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
<<<<<<< HEAD
<form name="myform">

<center>
<h1>${msg}</h1>
<table border="2">
<tr><th>id</th><th>name</th><th>mobile</th><th>address</th><th>city</th><th>username</th><th>password</th></tr>
<c:forEach items="${data}" var="d">
<tr><td><input type="radio" name="id" value="${d.id}"></td>
<td>${d.name}</td>
<td>${d.mob}</td>
<td>${d.address}</td>
<td>${d.city}</td>
<td>${d.login.username}</td>
<td>${d.login.password}</td>
</tr>
</c:forEach>
</table>
<pre>
<input type="button" value="Add Record" onclick="add()">		<input type="button" value="Edit Record" onclick="edit()">  		<input type="button" value="Delete Record" onclick="del()">
</pre>
</center>
=======
<form name="fm">
<center>
<pre>
<h1>Successs data show</h1>
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