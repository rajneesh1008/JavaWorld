<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details Added Successfully</title>
</head>
<body>
Data Stored in Database<br>
Eno:<c:out value="${eno}"></c:out>}<br>
Name:<c:out value="${name}"></c:out>}<br>
Salary:<c:out value="${salary}"></c:out>}<br>
Gender:<c:out value="${gender}"></c:out>}<br>
Address:<c:out value="${address}"></c:out>}<br>
<a href="emp.jsp">Add New Employee</a>
</body>
</html>