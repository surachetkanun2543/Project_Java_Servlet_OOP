<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%
	String path = request.getContextPath();
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");
%>

<%@page import="app.Model.InvoiceModel"%>
<%@page import="app.Model.Supplier_goodModel"%>
<%@page import="app.Model.CustomerModel"%>
<%@page import="app.Model.Invoice_detModel"%>
<%@page import="app.Model.StockModel"%>
<%@page import="app.Model.GoodModel"%>
<%@page import="app.Model.ReportModel"%>
<%@page import="app.DAO.StockDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
<title>Report 1.2.ภ / Ruay</title>
<link rel="icon"
	href="https://www.flaticon.com/svg/static/icons/svg/353/353343.svg" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
	integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA=="
	crossorigin="anonymous" />
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Kanit:ital,wght@1,200&family=Pattaya&family=Prompt&display=swap')
	;

h2 {
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
font{
	font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;

}
th{
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
	font-family: 'Prompt', sans-serif;

}

</style>
</head>
<body>

	<jsp:include page="/app/menu/menu.jsp" />
	<hr>
	<h2 class="font-weight-bolder"> 1 . 2 . 4   รายงานเพื่อดูยอดการขายสินค้าเรียงลำดับตามสมาชิก  </h2>
	<hr>

	<div class="col-12">
		<table class="table table-hover">
			<thead class="thead-dark">
				<tr>
					<th scope="col">ไอดี สมาชิก</th>
					<th scope="col">ไอดี ใบเสร็จ</th>
					<th scope="col">ชื่อ ลูกค้า</th>
					<th scope="col">วันที่ ใบสร็จ</th>
					<th scope="col">ไอดี สินค้า</th>
					<th scope="col">ชื่อ สินค้า</th>
					<th scope="col">ราคา สินค้า</th>
					<th scope="col">จำนวน สินค้าที่ซื้อ</th>


				</tr>
			</thead>
			<tbody>
				<%

				ArrayList<ReportModel> reportList = (ArrayList<ReportModel>) request.getAttribute("reportList");

				if (reportList != null) {

					for (int i = 0; i < reportList.size(); i++) {
						ReportModel reportModel = reportList.get(i);
				%>

				<tr>
					<td><font><%=reportModel.getCustomerid()%></font></td>

					<td><font><%=reportModel.getInvoiceid()%></font></td>

					<td><font><%=reportModel.getCustomername()%></font></td>

					<td><font><%=reportModel.getInvoicedate()%></font></td>
					
					<td><font><%=reportModel.getGoodid()%></font></td>
					
					<td><font><%=reportModel.getGoodname()%></font></td>
					
					<td><font><%=reportModel.getUnitprice()%></font></td>
					
					<td><font><%=reportModel.getQuantity()%></font></td>

				</tr>

				<%
					}

				}
				%>



			</tbody>
		</table>
	</div>

</body>
</html>