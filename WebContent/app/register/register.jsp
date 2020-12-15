
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html;charset=UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>หน้าแรก</title>
<link rel="icon" href="https://www.flaticon.com/svg/static/icons/svg/353/353343.svg" />
<?xml version="1.0" encoding="UTF-8"?>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Kanit:ital,wght@1,200&family=Pattaya&family=Prompt&display=swap')
	;

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
</style>
</head>
<body>

	
	<jsp:include page="/app/menu/menu.jsp" />
	<hr>
	<h2 class="font-weight-bolder" >สมัครสมาชิก</h2>
	<hr>
	<div class="container col-9">
		<form action="<%=path%>/Addregister.do" method="post" >
		
		    <div class="form-group col-12" >
		      <label>ID :</label><br> 
		      <input class="form-control" type="text" name="cus_id" value="" >
		    </div>
		    
		      <div class="form-group col-12" >
		      <label>NAME :</label><br> 
		      <input class="form-control" type="text" name="cus_name" value="">
		    </div>
		  
		      <div class="form-group col-12" >
		   <label>SURNAME :</label>
		    <input  class="form-control" type="password" name="cus_password" value=""><br>
		  </div>
		   
		     <div class="form-group col-12" >
		   <label>ADDRESS:</label>
		   <input  class="form-control" type="text" name="cus_postcode" value=""><br>
		  </div>
		       <div class="form-group col-12" >
		     <label>BANK_ACCT:</label>
		     <input class="form-control" type="text" name="cus_bank" value="">
		    </div>
		        <div class="form-group col-12" >
		    <label>BALANCE:</label>
		     <input class="form-control" type="text" name="cus_balance" value="">
		    </div>
		        <div class="form-group col-12" >
		    <label>VERIFIED:</label>
		     <input class="form-control" type="text" name="cus_ver"value="">
		    </div>
		  
		  <button type="submit" name="submit" value="submit" class="btn btn-success">เข้าสู๋ระบบ</button>
		  <button type="reset" name="reset" value="reset" class="btn btn-warning">รีเช็ต</button>
		  
		</form>
		</div>

</body>
</html>