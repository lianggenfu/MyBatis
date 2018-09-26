<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>注册界面</title>
<link rel="stylesheet" href="css/reset.css" />
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/font-awesome.min.css" />
<style type="text/css">
.form_text_ipt select {
	width: 290px;
	height: 30px;
	margin: 5px;
	border: none;
	font-family: "微软雅黑";
	font-size: 15px;
	color: #000000;
}

.form_btn {
	width: 300px;
	height: 40px;
	margin: 50px auto;
}
</style>
</head>
<body>
	<div class="wrap login_wrap">
		<div class="content">

			<div class="logo"></div>

			<div class="login_box">

				<div class="login_form">
					<div class="login_title">注册</div>
					<form action="userregister.html" method="post"
						onsubmit="return check()">

						<div class="form_text_ipt">
							<input name="userphone" type="number" min="7"
								placeholder="手机号">
						</div>
						<div class="ececk_warning">
							<span id="pp1">手机号不能为空</span>
						</div>
						<div class="form_text_ipt">
							<input name="password" type="password" placeholder="密码">
						</div>
						<div class="ececk_warning">
							<span>密码不能为空</span>
						</div>
						<div class="form_text_ipt">
							<input name="repassword" type="password" placeholder="重复密码">
						</div>
						<div class="ececk_warning">
							<span>密码不能为空</span>
						</div>
						<div class="form_text_ipt">
							<input name="email" type="email" placeholder="邮箱">
						</div>
						<div class="ececk_warning"></div>

						<div class="form_text_ipt">
							<select name="type">
								<option value=0>个人用户</option>
								<option value=1>商家</option>								
								<select>
						</div>
						<div class="form_btn">
							<button type="submit">注册</button>
						</div>
						<div class="form_reg_btn">
							<span>已有帐号？</span><a href="ulogin.html">马上登录</a>
						</div>
					</form>
					<div class="other_login">
						<div class="left other_left">
							<span>其它登录方式</span>
						</div>
						<div class="right other_right">
							<a href="#"><i class="fa fa-qq fa-2x"></i></a> <a href="#"><i
								class="fa fa-weixin fa-2x"></i></a> <a href="#"><i
								class="fa fa-weibo fa-2x"></i></a>
						</div>
					</div>
				</div>
			</div> 
		</div>
	</div>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/common.js"></script>
	<script type="text/javascript">
		function check() { 
			var phone=$(" input[ name='userphone' ] ").val();
			var password = $(" input[ name='password' ] ").val();
			var repassword = $(" input[ name='repassword' ] ").val();
			var type = $(" select[ name='type'] ").val();
			var email = $(" input[ name='email'] ").val();
			 /* alert(phone+" "+password+" "+type +" "+email); */
			if(phone==null||phone==""){
				alert("请输入手机号！");
				return false;	
			}
			if(password==null||password==""){
				alert("请输入密码！");
				return false;
			}
			if(repassword==null||repassword==""){
				alert("请确认密码！");
				return false;
			}			
			if (password != repassword) {
				alert("密码输入不一致！");
				return false;				
			}
			if(email==null||email==""){			
				alert("邮箱不能为空！");
				return false;
			}						
		}

		 /*  $(document).ready(function() {
			$(" input[ name='userphone' ] ").blur(function() {
				var userphone = $(" input[ name='userphone' ] ").val();
				if(userphone.length<7){					
					alert("请输入正确的手机号");    					
				} 
				
			});
			$(" input[ name='repassword' ] ").blur(function() {
				var password = $(" input[ name='password' ] ").val();			
				var repassword = $(" input[ name='repassword' ] ").val();						
				if (password != repassword) {
					alert("两次密码不一致！");
					$("this").val("");
				} 			
			});
		});   */

		var msg = '${msg}';
		if (msg != "" && msg != undefined) {
			alert(msg);
		}
	</script>
</body>
</html>
