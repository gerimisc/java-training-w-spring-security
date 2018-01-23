<html>
<head>
<title>Your Info</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>
<body>

	<div class="container">
		<form action="/xss/stored/add" method="post">
			<fieldset class="form-group">
				<label>Name</label>
				<input name="name" type="text" class="form-control" required="required"/>
				<label>Job Description</label>
				<input name="desc" type="text" class="form-control" required="required"/>
			</fieldset>
			<button type="submit" class="btn btn-success">Add</button>
		</form>
	</div>

	<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</body>
</html>