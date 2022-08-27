<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file= "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lead</title>
</head>
<body>
<h2>Update Lead</h2>

<form action="updateLead" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
first_name<input type="text" name= "first_name" value="${lead.first_name}"/>
last_name<input type="text" name= "last_name" value="${lead.last_name }"/>
city<input type= "text" name= "city" value="${lead.city }"/>
email<input type= "email" name="email" value="${lead.email}"/>
mobile_number<input type="number" name="mobile_number" value="${lead.mobile_number}"/>
<input type="submit" value= "update"/>
</form>
${msg }

</body>
</html>