<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.css"
	rel="stylesheet" />
<%	
	@SuppressWarnings("unchecked")
	String path = request.getContextPath();
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");
	
%>
<%@page import="app.Model.CustomerModel"%>


<?xml version="1.0" encoding="UTF-8"?>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Kanit:ital,wght@1,200&family=Pattaya&family=Prompt&display=swap')
	;

a {
	text-align: center;
	font-family: 'Kanit', sans-serif;
	font-family: 'Pattaya', sans-serif;
	font-family: 'Prompt', sans-serif;
	color:white;
}
</style>
<div class="container-fluid" >
<div class="col-12" align="center">
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      				<li class="nav-item active">
				<a style="color:white;" class="nav-item nav-link active" href="<%=path%>/Home.do">หน้าแรก <span class="sr-only">(current)</span></a>
				</li>
				 <li class="nav-item">
				<a style="color:white;" class="nav-item nav-link active" href="<%=path%>/Sell.do">ร้านค้า</a>
				</li>
				<%
				
				CustomerModel cusModel = (CustomerModel) request.getAttribute("cusModel");

				if (session.getAttribute("username") == null) {
				%>
				<li class="nav-item">
				<a style="color:white;" class="nav-item nav-link active" href="<%=path%>/Register.do">สมัครสมาชิก</a>
				</li>
				<li class="nav-item">
				<a style="color:white;" class="nav-item nav-link active" href="<%=path%>/Login.do">ลงชื่อเข้าใช้</a>
				</li>
				<%
					} else {
				%>
				<!--  <li class="nav-item">
				<a style="color:white;" class="nav-item nav-link active" href="<%=path%>/Report.do">รายงาน 1.2.1 </a> 
				</li>-->
				<li class="nav-item">
				<a style="color:white;" class="nav-item nav-link active" href="<%=path%>/Report_2.do">รายงาน 1.2.2 </a> 
				</li>
				<li class="nav-item">
				<a style="color:white;" class="nav-item nav-link active" href="<%=path%>/Report_3.do">รายงาน 1.2.3</a> 
				</li>
				<li class="nav-item">
				<a style="color:white;"  class="nav-item nav-link active" href="<%=path%>/Report_4.do">รายงาน 1.2.4</a> 
				</li>
				<li class="nav-item">
				<a style="color:white;"  class="nav-item nav-link active">ยินดีต้อนรับคุณ : <%=cusModel.getName()%></a>
				</li>
				<li class="nav-item">
				<a style="color:white;"  class="nav-item nav-link active" href="<%=path%>/User.do">บัญชีผู้ใข้</a>
				</li>
				<li class="nav-item">
				<a style="color: red"  class="nav-item nav-link active"  href="<%=path%>/Logout.do">ออกจากระบบ</a>
				</li>
				<%
					}
				%>
			
		 </li>
		
    </ul>
  </div>
</nav>
</div> 
</div>	

