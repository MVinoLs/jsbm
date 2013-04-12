<%@ page language="java" import="java.util.*,com.trumanliu.domain.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<script type="text/javascript">
		function changeBG1(o){
			 o.style.backgroundColor = "#5c75aa"; 
		}
		function restoreBG(o){
			o.style.backgroundColor = "";
		}
	</script> 
	
  <link rel="stylesheet" href="/jsbm/css/common.css" type="text/css"></link>
  <link rel="stylesheet" href="/jsbm/css/head.css" type="text/css"></link>
  </head>
  
  <body>
  <div class="head1">
	<a href="/jsbm"><img class="img1" src="/jsbm/images/top1.gif"></img></a>
	<img class="img2" src="/jsbm/images/top2.jpg"/>
	<img src="/jsbm/images/xnw3.jpg"style="float : left" />
	<ul class="navi1">
	<%Student stuh =(Student) session.getAttribute("stu");
	if(stuh!=null){
		out.print("<li onmouseover='changeBG1(this)' onmouseout='restoreBG(this)'> <a class='anavi' href='main!myhome'>个人中心</a></li>");
		out.print("<li onmouseover='changeBG1(this)' onmouseout='restoreBG(this)'> <a class='anavi' href='main!logout'>退出登录</a></li>");
	}else{
		out.print("<li onmouseover='changeBG1(this)' onmouseout='restoreBG(this)'> <a class='anavi' href='main!register'>注册</a></li>");
	}
	%>
	<!-- <li onmouseover="changeBG1(this)" onmouseout="restoreBG(this)"> <a class="anavi" href="main!myhome">个人中心</a></li>
	<li onmouseover="changeBG1(this)" onmouseout="restoreBG(this)"> <a class="anavi" href="main!register">注册</a></li> -->
	<li onmouseover="changeBG1(this)" onmouseout="restoreBG(this)"> <a class="anavi" href="#">设为首页</a></li>
	<li onmouseover="changeBG1(this)" onmouseout="restoreBG(this)"> <a class="anavi" href="#">加入收藏</a></li>
	<li onmouseover="changeBG1(this)" onmouseout="restoreBG(this)"> <a class="anavi" href="#">帮助</a></li>

	</ul>
  </div>
  
  </body>
</html>
