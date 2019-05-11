<!DOCTYPE html >
<%--  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
	<div class="container text-center">
		<h3>New Room Booking</h3>
		<hr>
		<form class="form-horizontal" method="POST" action="unbookedList">
			<%-- <input type="hidden" name="id" value="${room.roomNo }" /> --%>
			<div class="form-group" align="center">
				<label class="control-label col-md-3">Room No</label>
				<div class="col-md-7">
					<input type="text" class="form-control" name="roomNo" />
				</div>
			</div>
			<div class="form-group ">
				<input type="submit" class="btn btn-primary" value="Details" />
			</div>
		</form>
		<div>
			<form class="form-horizontal" method="GET" action="bookedList">
				<input type="submit" class="btn btn-primary" value="BOOKED LIST" />
			</form>
		</div>
	</div>
</body>
</html>