<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>添加新文章</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- <script type="text/javascript" src="/jsbm/js/tiny_mce/tiny_mce_gzip.js"></script> -->
<script type="text/javascript" src="/jsbm/js/tiny_mce/tiny_mce.js"></script>
<script type="text/javascript">
	tinyMCE.init({
		theme : "advanced",
        mode : "textareas",
        plugins : "fullpage",
        theme_advanced_buttons3_add : "fullpage"

	});
</script>

</head>

<body  >
<div align="center">
<form method="post" action="article!add">
        <p>     
        		<label for="title">文章标题（用于首页展示）</label>
        		<input type="text" name="title"/> 
                <textarea name="content" cols="50" rows="15">This is some content that will be editable with TinyMCE.</textarea>
                <input type="submit" value="发布文章" />
        </p>
</form>
</div>
</body>
</html>
