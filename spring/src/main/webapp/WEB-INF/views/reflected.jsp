<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/xss/reflected" method="get">
Please enter your name: <input name="name" type="text"/>
<input type="submit">
</form>
Welcome, ${reflected} <br>
Enter your name so you can be properly greeted! :) 
</body>
</html>