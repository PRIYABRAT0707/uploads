<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import=" org.thepunisher.model.Bird" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
  <%@ page isELIgnored = "false" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>about page</title>
</head>
<body>
<%
Bird gg=(Bird)request.getAttribute("bird");
out.print("<h1>"+gg+"</h1>");
//request.setAttribute("mod", gg);
%>
<c:out value="${bird}"></c:out>


</body>
</html>