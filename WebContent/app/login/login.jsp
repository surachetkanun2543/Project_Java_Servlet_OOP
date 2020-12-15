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
<title>เข้าสู่ระบบ</title>
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
	<h2 class="font-weight-bolder" >เข้าสู่ระบบ</h2>
	<hr>
	<form action="<%=path%>/ChkLogin.do" method="post">
		
			<div class="container col-8">
				<div class="form-group col-12" >
					<label >Username : </label> 
		     		<input class="form-control" type="text" name="username">
		    		</div>
				
				<div class="form-group col-12" >
					<label >Password : </label> 
				<input class="form-control" type="password" name="password" placeholder="ตัวเลขเท่านั้น">
				</div>
				<button type="submit" name="submit" value="Login" class="btn btn-success">เข้าสู่ระบบ</button>
				<button type="reset" name="reset" value="reset" class="btn btn-warning">รีเช็ต</button>
			</div>
		
	</form>
</body>
</html>