<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:htmlEscape defaultHtmlEscape="true">
<h2>Reflected XSS (GET) - Solution (Spring taglib)</h2>
<form:form method="POST" action="/xss/reflected-soln-2" modelAttribute="reflected">
Please enter your name: <form:input path="name" type="text" htmlEscape="true"/>
<input type="submit">
</form:form>
Welcome, ${name} <br>
Enter your name so you can be properly greeted! :)
</spring:htmlEscape>
</body>
</html>