function checkFromStudent(){
	var form = document.getElementById("stuForm");
	var stuid = form.stuid;
	if( !/\d{12}/g.test(stuid.value)){
		alert("请输入12位学号");
		stuid.focus();
		return false;
	}
	var password = form.password;
	if( !/.{6,}/g.test(password.value)){
		alert("请设置长度大于6位的密码~建议尽量复杂");
		password.focus();
		return false;
	}
	var tele = form.tele;
	if(!/1[3,5,8,4]\d{9}/g.test(tele.value)){
		alert("请填写正确的手机号~建议使用常用号码");
		tele.focus();
		return false;
	}
	form.submit();
}