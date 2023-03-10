<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import=" org.thepunisher.model.Bird" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%  Bird jj=(Bird)request.getAttribute("bod");
out.println("<h1>"+jj+"</h1>");

%> --%>
<%-- <c:out value="${bod}"></c:out> --%>


<table width="100%" border="5px" >

<tr>
<td>BIRD_ID</td><td>BIRD_NAME</td><td>BIRD_COLOR</td><td>MIGRATORY</td><td>COUNTRY_OF_ORIGIN</td><td>WEIGHT_IN_KG</td>
</tr>
<c:forEach items="${bird}" var="brd">
<tr>
<td>${brd.getBid()}</td>
<td>${brd.getBirdName()}</td>
<td>${brd.getColor()}</td>
<td>${brd.isMigratory()}</td>
<td>${brd.getCountryWhereMostSeen()}</td>
<td>${brd.getWeight()}</td>
</tr>
</c:forEach>

</table>





</body>
</html>