<%@ page language="java" import="java.util.*,com.trumanliu.domain.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>中国海洋大学数学竞赛报名系统</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="css/common.css" type="text/css"></link>
<script type="text/javascript">
	function checkLogin(){
		var form = document.getElementById("loginFrom");
		var role = form.role;
		var roleValue = null;
		for(var i = 0 ;i < role.length; i++ ){
			if(role[i].checked){
				roleValue = role[i].value;
			}
		}
		
		if(roleValue == "1"){
			form.action="main!checkLogin";
			form.submit();
		}
		if(roleValue == "0"){
			form.action="admin!checkLogin";
			form.submit();
		}
		
	}
</script>
</head>
<body>
	
	<%@include file="/common/head.jsp" %>
	<% 
	Student stu =(Student) session.getAttribute("stu");
	if(stu!=null){
		out.print("<div>Welcome"+stu.getRealname()+"</div>");
	}
	%>
	<div class="loginpan">
		<form id = "loginFrom"  method="post">
			<fieldset>
				<legend>用户登录</legend>
				<label for="userName">学 号:</label> 
				<input type="text" name="stuid" placeholder="学号" tabindex="1" required="true" /> <br/>
				<label for="password">Password:</label>
				<input type="password" id="password" name="password" placeholder="password" tabindex="2" required="true" /> 
				<!-- <label for="staySigned"> Stay signed in </label>
				<input type="checkbox" id="staySigned" name="staySigned" tabindex="3" />  -->
				<br/>
				<label>参赛学生</label> <input type="radio" name="role"  value="1" tabindex="3" required="true" checked="checked" />
				<label>管理员</label> <input type="radio" name="role"  value="0" tabindex="4" required="true" />
			</fieldset>
			<input type="button" value="Login" onclick="checkLogin()" tabindex="5" />
		</form>
		<div>
			<a href="main!export">导出试试</a>
		</div>
	</div>
	<div class="article"></div>
	<%@include file="/common/foot.jsp" %>
</body>
</html>
