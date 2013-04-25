<%@ page language="java" import="java.util.*,com.trumanliu.domain.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>中国海洋大学数学建模竞赛报名系统后台</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  <%@include file="../../../common/head.jsp" %>
    <% 
		Admin admin =(Admin) session.getAttribute("admin");
		if(admin!=null){
			out.print("<div>Welcome ------"+admin.getStuid()+"</div>");
		}
	%>
	<a href = admin!edit>wow</a>
  </body>
</html>
