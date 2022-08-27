<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of leads</title>
</head>
<body>
<h2>List Of Leads</h2>
<table>

	<tr>
	
	<th>first_name</th>
	<th>last_name</th>
	<th>city</th>
	<th>email</th>
	<th>mobile_number</th>
	<th>delete</th>
	<th>update</th>
	
	</tr>
	
<c:forEach var="lead" items="${leads}">  
<tr>
<th>${ lead.first_name}</th>
	<td>${lead.last_name }</td>
	<td>${lead.city }</td>
	<td>${lead.email }</td>
	<td>${lead.mobile_number }</td>
	<td><a href="delete?id=${lead.id}">delete</a></td>
	<td><a href="update?id=${lead.id}">update</a></td>
	</tr>
</c:forEach> 
	
</table>
</body>
</html>