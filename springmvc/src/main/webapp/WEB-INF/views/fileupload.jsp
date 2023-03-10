<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
 integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	

</head>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
<div class="mb-3">
  <label for="formFile" class="form-label">Default file input example</label>
  <input  name="file1" class="form-control" type="file" id="formFile">
  <button class="btn btn-outline-success">submit</button>
</div>
</form>
</body>
</html>