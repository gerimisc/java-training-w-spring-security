<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>
<body>
<h2>Unrestricted File Upload</h2>

<form method="POST" action="/file/upload" enctype="multipart/form-data">
  <div class="form-group">
    <label for="instruction">Full Name</label>
    <input type="text" class="form-control" placeholder="Enter CV name" name="name">
    <small id="emailHelp" class="form-text text-muted">Indicate your Full Name</small>
  </div>
  <div class="form-group">
    <label for="resume">CV/Resume</label>
	<input type="file" class="form-control-file" name="file">
	<small id="uploadHelp" class="form-text text-muted">.txt, .doc, .docx files are accepted</small>
</div>
  <button type="submit" class="btn btn-primary">Upload</button>
</form>
${path}
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>