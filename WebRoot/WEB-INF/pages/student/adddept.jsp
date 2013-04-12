<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>添加Dept</title>
    

  </head>
  
  <body>
    添加Dept <br>
    <form name="f1" action="adddept" method="post">
    	deptno:<input type="text" value="" name="deptno"/><br/>
    	dname:<input type="text" value="" name="dname"/><br/>
    	loc:<input type="text" value="" name="loc"/><br/>
    	<input type="submit" value="submit"/>
    </form>
    <s:actionerror/>
    <s:fielderror></s:fielderror>
  </body>
</html>
