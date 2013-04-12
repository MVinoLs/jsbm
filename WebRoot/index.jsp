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
</head>
<body>
	
	<%@include file="/common/head.jsp" %>
	<% 
	Student stu =(Student) session.getAttribute("stu");
	if(stu!=null){
		out.print("<div>Welcome"+stu.getRealname()+"</div>");
	}
	%>
	<div>
		
	</div>
	<div class="loginpan">
		<form action="main!checkLogin" method="post">
			<fieldset>
				<legend>Sign in to begin.</legend>
				<label for="userName">User Name:</label> 
				<input type="text" name="stuid" tabindex="1" required="true" /> <br/>
				<label for="password">Password:</label>
				<input type="password" id="password" name="password" placeholder="password" tabindex="2" required="true" /> 
				<!-- <label for="staySigned"> Stay signed in </label>
				<input type="checkbox" id="staySigned" name="staySigned" tabindex="3" />  -->
			</fieldset>
			<input type="submit" value="Login" tabindex="4" />
		</form>
	</div>
	<%@include file="/common/foot.jsp" %>
</body>
</html>
