
<%@page import="app.Model.CustomerModel"%>
<%
	String path = request.getContextPath();
%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.css"
	rel="stylesheet" />
<style>
h1 {
	text-align: center;
}

p {
	text-align: center;
}

a {
	text-align: center;
}

label {
	text-align: center;
}

body {
	text-align: center;
}
</style>
</head>
<body>

	<jsp:include page="/app/menu/menu.jsp" />
	<hr>
	<%
		CustomerModel cusModel = (CustomerModel) request.getAttribute("cusModel");
	%>
	<form action="<%=path%>/Confirmedituser.do" method="post">
	
			<div class="table-responsive">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Customer Id</th>
							<th scope="col">Customer Name</th>
							<th scope="col">Customer Surname</th>
							<th scope="col">Customer Username</th>
							<th scope="col">Customer Password</th>
							<th scope="col">Customer Address</th>
							<th scope="col">Customer Postcode</th>
							<th scope="col">Customer Bank_acct</th>
							<th scope="col">Customer Balance</th>
							<th scope="col">Customer Verified</th>
							<th scope="col">Customer Edit</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th><input type="text" name="customerId"
								value="<%=cusModel.getId()%>" readonly="readonly"></th>
							<th><input type="text" name="customerName"
								value="<%=cusModel.getName()%>"></th>
							<th><input type="text" name="customerSurname"
								value="<%=cusModel.getSurname()%>"></th>
							<th><input type="text" name="customerUsername"
								value="<%=cusModel.getUsername()%>"></th>
							<th><input type="text" name="customerPassword"
								value="<%=cusModel.getPassword()%>"></th>
							<th><input type="text" name="customerAddress"
								value="<%=cusModel.getAddress()%>"></th>
							<th><input type="text" name="customerPostcode"
								value="<%=cusModel.getPostcode()%>"></th>
							<th><input type="text" name="customerBank_acct"
								value="<%=cusModel.getBalance()%>"></th>
							<th><input type="text" name="customerBalance"
								value="<%=cusModel.getBank_acct()%>"></th>
							<th><input type="text" name="customerVerified"
								value="<%=cusModel.getVerified()%>"></th>
								
							<th><input type="submit" class="btn btn-warning"
								value="Edit"><input type="hidden" name="customerId"
								class="btn btn-warning" value="<%=cusModel.getId()%>"></th>
						</tr>

					</tbody>
				</table>

			</div>
	</form>

</body>
</html>