<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr><th>EMPID</th><th>Emp Name</th><th>Action</th></tr>
<c:forEach items="${list}" var="emp" >
<tr>
<td><c:out value="${emp.empId}"></c:out></td>
<td><c:out value="${emp.name}"></c:out></td>
<td><a href="deleteEmployee/${emp.empId}">delete</a> &nbsp; &nbsp;<a href="show/empId=${emp.empId}">edit</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>