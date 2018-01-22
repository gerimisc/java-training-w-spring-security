<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<div class="table-responsive">	
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col" class="col-sm-2">Vulnerability</th>
	      <th scope="col" class="col-sm-2">Spring Security Fix</th>
	    </tr>
	  </thead>
	  <tbody>
		<c:forEach items="${indexes}" var="index">
			<tr>
				<td>${index.vuln}</td>
				<td>${index.soln}</td>
			</tr>
		</c:forEach>
		</tbody>
</table>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	
</body>
</html>