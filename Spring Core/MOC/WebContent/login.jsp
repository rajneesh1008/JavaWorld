<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ResourceBundle" %>
    <%  ResourceBundle resourceBundle=ResourceBundle.getBundle("login",request.getLocale()); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<div>
<label><%=resourceBundle.getString("login.title") %></label><input type="text">
</div>
<div>
<label><%=resourceBundle.getString("login.username") %></label><input type="text">
</div>
<div>
<label><%=resourceBundle.getString("login.password") %></label><input type="text">
</div>
<div>
<button><%=resourceBundle.getString("login.button") %></button>
</div>

</form>

</body>
</html>