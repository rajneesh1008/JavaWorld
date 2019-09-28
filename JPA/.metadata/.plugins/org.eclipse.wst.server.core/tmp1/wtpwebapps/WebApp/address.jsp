<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Add New Address</title>
</head>
<body>
	<form action="AddressServlet" method="post">
	<div>
		<label>City</label> <input type="text" name="city" />
	</div>
	<div>
		<label>State</label><input type="text" name="state" />
	</div>
	<div>
	<button>Add Address</button>
	</div>
	</form>
	</body>
	</html>
	