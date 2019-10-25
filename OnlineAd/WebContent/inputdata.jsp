<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="viewer.jsp">Go back</a>
<form action="inputservlet.do" method="post">
	<table>
	<tr>
		<td>Email:<input type="email" name="email" required/><br /> <br /></td><td>
		Phone number:<input type="number" name="phone" required /><br /> <br /></td>
		 <td>Name<input type="text" name="name" required /><br /> <br /> </td>
		 <input type="submit" value="add" />
			</table>
	</form>
	<!-- <form action="inputservlet.do" method="get">
Posting title<input type="text" name="title">
City or neighbourhood<input type="text" name="city">
Postal code:<input type="number" name="code"><br><br>
Description<textarea class="form-control" rows="10" type="text" name="description"></textarea>
		
	
	
	<form class="form group" style="border:1px solid lightgrey;padding-top:10px;padding-bottom:10px;margin-top:10px;margin-bottom:10px;">
	<h5>Contact info</h5>
	<div class="row">
	<div class="col-md-4">
	<label for="email" class="mr-sm-2">Email id:</label>
  <input type="email" class="form-control mb-2 mr-sm-2" id="email">
  Email privacy options:
  <div class="radio">
  <label><input type="radio" name="cl mail rely" checked>cl mail rely</label>
</div>
<div class="radio">
  <label><input type="radio" name="no replies">no replies</label>
</div>
	</div>
	<div class="col-md-4">
	<form class="form-inline">
  <label for="phone number">phone number</label>
  <input type="number" class="form-control" >
  <label for="extensions">extensions</label>
  <input type="number" class="form-control">
  <label for="contactname">contact name</label>
  <input type="text" class="form-control">
  
    
  </div>
  
</form>
	</div>
	</div>
	<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	
	
	</form> -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>