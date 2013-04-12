<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>用户注册</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="description" content="注册数学竞赛报名系统成员">


<link rel="stylesheet" href="/jsbm/css/common.css" type="text/css"></link>
<link rel="stylesheet" href="/jsbm/css/head.css" type="text/css"></link>
<script type="text/javascript" src="/jsbm/js/common.js"></script></head>

<body>
	<%@include file="/common/head.jsp"%>
	<form action="register!register" id="stuForm" method="post">
		<table>
			<tr>
				<td><label for="stuid">学 号:</label></td> <td><input type="text" name="stuid"  placeholder="请填写您的学号" tabindex="1" required="true" /></td>
			</tr>
			<tr>
				<td><label for="password">密码:</label></td> <td><input type="password" name="password"  placeholder="请认真填写您的密码" tabindex="2" required="true" /></td>
			</tr>
			<tr>
				<td><label for="gender">性别:</label></td>
				<td>
				<label>男</label> <input type="radio" name="gender"  value="1" tabindex="3" required="true" checked="checked" />
				<label>女</label> <input type="radio" name="gender"  value="0" tabindex="4" required="true" />
				</td>
			</tr>
			<tr>
				<td><label for="realname">真实姓名:</label></td> <td><input type="text" name="realname"  placeholder="请务必填写真实姓名" tabindex="5" required="true" /></td>
			</tr>
			<tr>
				<td><label for="eamil">邮箱:</label></td> <td><input type="email" name="email"  placeholder="user@foo.com" tabindex="6" required="true" /></td>
			</tr>
			<tr>
				<td><label for="tele">手机号:</label></td> <td><input type="text" name="tele"  placeholder="请填写常用手机号" tabindex="7" required="true" /></td>
			</tr>
			<tr>
				<td><label for="isPro">是否专业组:</label></td>
				<td>
				<label>专业组</label> <input type="radio" name="isPro"  value="1" tabindex="8" required="true" />
				<label>非专业组</label> <input type="radio" name="isPro"  value="0" tabindex="9" required="true" checked="checked" />
				</td>
			</tr>
			
			<tr>
				<td><label for="majorId"></label></td> <td><input type="hidden" name="majorId" value="1"/></td>
			</tr>
			<tr>
				<td><input type="button" value="Ya!" tabindex="10" onclick="checkFromStudent()"/></td>
			</tr>
			
		</table>
	</form>
</body>
</html>
