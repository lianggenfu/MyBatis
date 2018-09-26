<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
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
					<div class="login_title">骑手申请</div>
					<form action="crregister.html" method="post"
						onsubmit="return check()">
						<div class="form_text_ipt">
							<input name="cutel" type="text" placeholder="手机号">
						</div>
						<div class="ececk_warning">
							<span>手机号不能为空</span>
						</div>

						<div class="form_text_ipt">
							<input name="cuname" type="text" placeholder="昵称">
						</div>
						<div class="ececk_warning">
							<span>昵称不能为空</span>
						</div>

						<div class="form_text_ipt">
							<input name="cupwd" type="password" placeholder="密码">
						</div>
						<div class="ececk_warning">
							<span>密码不能为空</span>
						</div>
						<div class="form_text_ipt">
							<input name="reCuPwd" type="password" placeholder="重复密码">
						</div>
						<div class="ececk_warning">
							<span>确认密码不能为空</span>
						</div>

						<!--选择所属网点  -->
						<div class="form_text_ipt">
							<select id="brandselectp" name="brandid"></select>
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
		
	 $(document).ready(function(){
		$.getJSON("<%=basePath%>changecourier.html", function(data){		
			$('#brandselectp').empty();
			$.each(data, function() {
				$('#brandselectp').append(
						"<option value="+this.beachid+">"
						+ this.province + this.city
						+ this.region + this.street
						+ "</option>");
			});
		});
		});		  

		function check() {
			var phone = $(" input[ name='cutel' ] ").val();
			var password = $(" input[ name='cupwd' ] ").val();
			var repassword = $(" input[ name='reCuPwd' ] ").val();
			var cuname = $(" input[ name='cuname'] ").val();
			var brandid = $(" select[ name='brandid' ] ").val();
			/* alert(phone+" "+password+" "+nickname +" "+email); */
			
			if (phone == null || phone == "") {
				alert("请输入手机号！");
				return false;
			}
			if (cuname == null || cuname == "") {
				alert("请输入您的姓名！");
				return false;
			}
			if (password == null || password == "") {
				alert("请输入密码！");
				return false;
			}
			if (repassword == null || repassword == "") {
				alert("请确认密码！");
				return false;
			}
			if (password != repassword) {
				alert("密码输入不一致！");
				return false;
			}
			else{
				return true;
			}
		}
	</script>
</body>
</html>
