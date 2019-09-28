<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="InsertEmployeeServlet"  method="post">
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