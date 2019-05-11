<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>bipul-welcome</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
	integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
	crossorigin="anonymous">
<link href="/css/style.css" rel="stylesheet">
</head>
<body class="hotel">
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="${'/'}" class="navbar-brand"> <i class="fas fa-home"></i></a>
		</div>
	</div>
	<div class="container" id="homediv">
		<div class="jumbotron text-center hotelTitle">
			<h1>Welcome To Hotel SARA</h1>
		</div>
	</div>
	<div class="container">
		<div class="card hotelBooked">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Room No:</th>
						<th scope="col">Dates</th>
						<th scope="col">Booking Status</th>
						<th scope="col">Click For Booking</th>
					</tr>
					<c:forEach items="${list}" var="element">
						<form method="post" action="roomsListUpdate">
							<input type="hidden" value=${element.room.roomNo } name="roomVal" />
							<input type="hidden" value=${element.RB_DATE } name="date" />
							<tr>
								<td>${element.room.roomNo}</td>
								<td>${element.RB_DATE}</td>
								<td>${element.RB_BOOKED}</td>
								<td><input type="submit" class="btn btn-primary"
									value="Book Now" name="book" /></td>
							</tr>
						</form>
					</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>