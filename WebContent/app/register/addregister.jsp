<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Register</title>
</head>
<body>

<%
	boolean ret_status = (boolean) request.getAttribute("ret_status");

	if (ret_status == true) {
	%>
	<p>Register successsfully! You can login</p>
	<a href="<%=path%>/Home.do">Back</a>
	<%
		} else {
	%>
	<p>Register successsfully</p>
	<a href="<%=path%>/Home.do">Back</a>
	<%
		}
%>
</body>
</html>