<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Detail</title>
</head>
<body>
<form action="EmployeeControllerServlet" method="post">
<div>
<label>Eno</label>
<input type="text" name="eno"/>
</div>
<div>
<label>Name</label>
<input type="text" name="name"/>
</div>
<div>
<label>Salary</label>
<input type="text" name="salary"/>
</div>
<div>
<label>Gender</label>
<INPUT TYPE="radio" name="gender" value="Male"/>Male
<INPUT TYPE="radio" name="gender" value="Female"/>Female
<INPUT TYPE="radio" name="gender" value="Others"/>Others<br>
</div>
<div>
<label>Address</label>
<textarea rows="5" cols="20" name="address"></textarea>
</div>
<div>
<button>Save Employee</button>
</div>
</form>

</body>
</html>