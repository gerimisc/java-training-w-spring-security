<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DOM-based XSS</title>
</head>
<body>
<h2>DOM XSS</h2>
You are here: <span id="location"></span>
<script>
    var loc = document.location.href;
    document.getElementById("location").innerHTML = loc;
</script>
</body>
</html>