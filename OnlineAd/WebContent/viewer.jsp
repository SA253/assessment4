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
<a href="index.jsp">back</a>
<form action="jobs.jsp" method="get">
		<input type="submit" value="JOBS" />
	</form>

	<form action="services.jsp">
		<input type="submit" value="SERVICES" />
	</form>

	<form action="houses.jsp">
		<input type="submit" value="hOUSES" />
	</form>

	<form action="events.jsp">
		<input type="submit" value="EVENTS" />
	</form>
</body>
</html>