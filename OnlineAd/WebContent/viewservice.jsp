<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>Name</td>
<td>Description</td>
<td>Service</td>
<td>Location</td>
<td>Phone</td>
</tr>
		<c:forEach var="ad" items="${jobAds}">
			<tr>
				<td>${ad.name}</td>
				<td>${ad.desc}</td>
				<td>${ad.service}</td>
				<td>${ad.location}</td>
				<td>${ad.contact}</td>
			</tr>
			
		</c:forEach>
	
</table>
</body>
</html>