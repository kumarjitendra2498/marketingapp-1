<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Create Lead</h2>

<form action="saveLead" method= "post">

<pre>
first_name <input type= "text" name= "first_name"/>
last_name <input type= "text" name= "last_name"/>
email<input type= "email" name= "email"/>
mobile_number<input type="number" name="mobile_number"/>
city<input type="text" name= "city"/>
<input type= "submit" value= "save"/>
</pre>

</form>

${msg }
</body>
</html>