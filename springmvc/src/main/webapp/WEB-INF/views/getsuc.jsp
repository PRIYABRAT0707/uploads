<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="100%" border="3" style="richness: inherit">
<tr>
<td>${ fd. getFirstname()}</td>
<td>${ fd.getSurname()}</td>
<td>${ fd.getUsername() }</td>
<td>${ fd.getPassword()}</td>
<td>${ fd.getBirthcity()}</td>
<td>${ fd.getMobilenumber()}</td>
</tr>


</table>



</body>
</html>