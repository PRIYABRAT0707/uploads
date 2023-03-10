<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	
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
<form action="form" method="post">
<div class="boom">

<div class="alert alert-light" role="alert">
  <form:errors path="urr.*"></form:errors>
</div>


<div class="form-group">
    <label for="exampleInputEmail1">username</label>
    <input name="username" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter username">
    <small id="username" class="form-text text-muted">We'll never share your username with anyone else.</small>
  </div>
  

 <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input name="password" type="text" class="form-control" id="Password" placeholder="Password">
  </div>



 <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input name="email" type="text" class="form-control" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="email" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword1">dob</label>
    <input name="dob" type="text" class="form-control" id="dob" placeholder="dd/mm/yyyy">
  </div>
  
  
  
 
  
  
  <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  
  
  <button type="submit" class="btn btn-primary">Submit</button>


</div>  

  
  
  
  


</form>
</body>
</html>