<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>People</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<table class="table table-striped">
			<caption>List of Employees:</caption>

			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Job Description</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${people}" var="person">
					<tr>
						<td>${person.id}</td>
						<td>${person.name}</td>
						<td>${person.desc}</td>
						<td><a type="button" class="btn btn-danger" 
		href="/xss/stored/delete?id=${person.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="btn btn-success" href="/xss/stored/add">Add</a>
		</div>
	</div>

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>