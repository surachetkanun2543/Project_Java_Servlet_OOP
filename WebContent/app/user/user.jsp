<%@page import="app.Model.StockModel"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="app.Model.GoodModel"%>
<%@ page import="app.DAO.GoodDAO"%>
<%@page import="java.util.Iterator"%>
<%@ page import="java.util.ArrayList"%>
<%@page import="app.Model.Cart"%>
<%@page import="app.Model.CustomerModel"%>

<%
	String path = request.getContextPath();
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<?xml version="1.0" encoding="UTF-8"?>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
<title>ร้านค้า / Ruay</title>
<link rel="icon"
	href="https://www.flaticon.com/svg/static/icons/svg/353/353343.svg" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
	integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA=="
	crossorigin="anonymous" />
<style>
h1 {
	
	text-align: center;
	font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
}
h2 {
	
	text-align: center;
	font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
}
h3 {
	
	text-align: center;
	font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
}
h5 {
	
	text-align: center;
	font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
}

p {
	text-align: center;
		font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
}

a {
	text-align: center;
	font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
}

label {
	text-align: center;
		font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
}

body {
	text-align: center;
	font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
}

th {
	text-align: center;
	font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
}

td {
	text-align: center;
	font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
}

tr {
	text-align: center;
	font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
}

form {
	text-align: center;
	font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
}




</style>
</head>
<body>

	
	
	<jsp:include page="/app/menu/menu.jsp" />
	<hr>
	<h2 class="font-weight-bolder" >บัญชีผู้ใช้</h2>
	<hr>

	<%
		CustomerModel cusModel = (CustomerModel) request.getAttribute("cusModel");
	%>
	<form action="<%=path%>/Edituser.do" method="post">
		<div class="col-12">
			<table class="table table-hover">
				<thead class="thead-dark">
					<tr>
						<th scope="col">ไอดี</th>
						<th scope="col">ชื่อ</th>
						<th scope="col">นามสกุล</th>
						<th scope="col">บัญชีผู้ใช้</th>
						<th scope="col">รหัสผ่าน</th>
						<th scope="col">ที่อยู่</th>
						<th scope="col">รหัสไปรษณี</th>
						<th scope="col">ธนาคาร</th>
						<th scope="col">จำนวนเงิน</th>
						<th scope="col">ยืนยัน</th>
						<th scope="col">แก้ไข</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th><%=cusModel.getId()%></th>
						<th><%=cusModel.getName()%></th>
						<th><%=cusModel.getSurname()%></th>
						<th><%=cusModel.getUsername()%></th>
						<th><%=cusModel.getPassword()%></th>
						<th><%=cusModel.getAddress()%></th>
						<th><%=cusModel.getPostcode()%></th>
						<th><%=cusModel.getBalance()%></th>
						<th><%=cusModel.getBank_acct()%></th>
						<th><%=cusModel.getVerified()%></th>
						<th><input type="submit" class="btn btn-warning" value="แก้ไช"><input
							type="hidden" name="customerId" class="btn btn-warning"
							value="<%=cusModel.getId()%>"></th>
					</tr>

				</tbody>
			</table>
		</div>
	</form>

</body>
</html>