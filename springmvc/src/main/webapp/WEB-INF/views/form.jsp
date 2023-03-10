<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background-color:lavender;
}
.mydiv{
border:10px;
margin:5px;
padding:6px;
border-radius:10px;
margin-left:450px;
height:550px;
width:300px;
background-color:mediumslateblue;
}
.po{
margin-left:100px;
}

</style>

</head>


<body>
<div class="mydiv">
<form action="formsub" method="post">
<h3 class="po">FIRSTNAME</h3>
<input class="po" type="text" name="firstname" placeholder="firstname" />
<br>
<h3>SURNAME</h3>
<input type="text" name="surname" placeholder="surname" />
<br>
<h3 class="po">USERNAME</h3>
<input class="po" type="text" name="username" placeholder="username" />
<br>
<h3>PASSWORD</h3>
<input  type="text" name="password" placeholder="password" />
<br>
<h3 class="po">BIRTH_CITY</h3>
<input class="po" type="text" name="birthcity" placeholder="birthcity" />
<br>
<h3>MOBILE_NUMBER</h3>
<input type="text" name="mobilenumber" placeholder="mobilenumber" />
<br>
<br>

<button class="po">submit</button>

</form>




</div>



</body>
</html>