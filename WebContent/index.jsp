<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%
	String path = request.getContextPath();
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<%
		response.sendRedirect(request.getContextPath()+ "/Home.do");
	%>

</body>
</html>