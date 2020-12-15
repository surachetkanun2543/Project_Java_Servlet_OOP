<%@page import="app.Model.StockModel"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="app.Model.GoodModel"%>
<%@ page import="app.DAO.GoodDAO"%>
<%@page import="java.util.Iterator"%>
<%@ page import="java.util.ArrayList"%>
<%@page import="app.Model.Cart"%>

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
	<hr />
	
	<div class="row ">
		&nbsp;
		<div class="container col-6">
			<table class="table table-hover">
				<thead class="thead-dark">
					<tr>
						<h3>สินค้าทั้งหมด</h3>
						<hr />
						<th scope="col">ไอดี</th>
						<th scope="col">ชื่อสินค้า</th>
						<th scope="col">คงเหลือ/ชิ้น</th>
						<th scope="col">ราคา/ชิ้น</th>
						<th scope="col">จำนวน</th>
						<th scope="col">หยิบใส่ตระกร้า</th>

					</tr>
				</thead>
				<tbody>
					<%	
					
						
					ArrayList<GoodModel> GoodList = (ArrayList<GoodModel>) request.getAttribute("goodList");

					for (Iterator<GoodModel> iterator = GoodList.iterator(); iterator.hasNext();) {

						GoodModel next = iterator.next();
						int goodId = next.getID();
						String goodName = next.getNAME();
						double goodqty = next.getQUANTITY();
						double goodprice = next.getUNITPRICE();
						
					%>
					
					

					<form action="<%=path%>/Addcart.do" method="post">

						<tr>
							<td><%=goodId%></td>
							<td><%=goodName%></td>
							<td><%=goodqty%> ชิ้น</td>
							<td><%=goodprice%> บาท </td>
							<td><select name="qty">
									<option value="0" selected="selected">เลือก</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
							</select></td>


							<td><button type="submit"
									style="width: 130px; font-family: 'Prompt', sans-serif; height: 40px;"
									class="btn btn-success" value="Add to Cart">หยิบใส่ตระกร้า</button></td>
						</tr>
						<input type="hidden" value="<%=goodId%>" name="goodId" /> <input
							type="hidden" value="<%=goodprice%>" name="goodPrice" /> <input
							type="hidden" value="<%=goodName%>" name="goodName" />





					</form>

					<%
						}
					%>
				</tbody>

			</table>

		</div>
		<hr />
	<div class="col md-4">
			<table class="table table-hover ">
				 <thead class="thead-dark">
					<tr>
						<h3>ตระกร้าสินค้า</h3>
						<hr />
						<th scope="col">ไอดี</th>
						<th scope="col">ไอดีสินค้า</th>
						<th scope="col">ชื่อสินค้า</th>
						<th scope="col">ราคา/ชิ้น</th>
						<th scope="col">จำนวน</th>
						<th scope="col">รวม</th>
						<th scope="col">ลบ</th>
					</tr>
				</thead>
				<tbody>
					<%
						if (session.getAttribute("cartList") != null) {

						ArrayList<Cart> Cart_Model = (ArrayList<Cart>) session.getAttribute("cartList");
						int index = 0;
						for (Iterator<Cart> iterator = Cart_Model.iterator(); iterator.hasNext(); index++) {
							Cart next = iterator.next();

							int id = next.getId();
							double price = next.getPrice();
							int qty = next.getQty();
							double amount = qty * price;
							String GoodName = next.getGoodName();
							int cartID = index + 1;
					%>
					<form action="<%=path%>/DelCart.do" method="post">

					<tr>
						<td><%=cartID%></td>
						<td><%=id%></td>
						<td><%=GoodName%></td>
						<td><%=price%>บาท</td>
						<td><%=qty%> ชิ้น</td>
						<td><%=amount%> บาท </td>
						<td><button type="submit" style="width: 90px; font-family: 'Prompt', sans-serif; height: 35px;" class="btn btn-danger" value="Add to Cart">ลบสินค้า</button></td>

					</tr>

					<input type="hidden" value="<%=index%>" name="index" />

				</form>
			<%
				}
			%>
					<form action="<%=path%>/ConfirmCart.do" method="post">
					<tr>

					<td>
					<button type="submit"style="width: 140px; font-family: 'Prompt', sans-serif; height: 50px;"class="btn btn-warning" value="Confirmcart">ดำเนินการสั่งซื้อ</button>
					</td>
					</tr>
				</form>
			
			<%
				}
			%>




				</tbody>
			</table>
		</div>
		</div>
	

</body>
</html>