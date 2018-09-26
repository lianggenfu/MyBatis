<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8">
<title>登录界面</title>
<link rel="stylesheet" href="css/reset.css" />
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/font-awesome.min.css" />
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/colorfulTab.min.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/style3.css" rel="stylesheet" type="text/css" media="all" />
<!-- /css files -->
<!-- font files -->
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700italic,700,800,800italic'
	rel='stylesheet' type='text/css'>
<link
	href="http://fonts.googleapis.com/css?family=Exo+2:100,200,300,400,500,600,700,800,900"
	rel="stylesheet">
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
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html">
				<h1>
					<span class="fa fa-diamond" aria-hidden="true"></span>用户登录
				</h1>
			</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="index.html">首页</a></li>

			</ul>
		</div>

	</div>
	</nav>

	<div class="wrap login_wrap">
		<div class="content">
			<div class="logo"></div>
			<div class="login_box">

				<div class="login_form">
					<div class="login_title">登录</div>
					<form action="userlogin.html" method="post"
						onsubmit="return check()">

						<div class="form_text_ipt">
							<input name="userPhone" type="text" placeholder="手机号/邮箱">
						</div>
						<div class="ececk_warning">
							<span>手机号/邮箱不能为空</span>
						</div>
						<div class="form_text_ipt">
							<input name="userPwd" type="password" placeholder="密码">
						</div>
						<div class="ececk_warning">
							<span>密码不能为空</span>
						</div>

						<!-- 用户类型  ： 个人，商家 -->
						<div class="form_text_ipt">
							<select name="type">
								<option value=0>个人用户</option>
								<option value=1>商家</option>
								<option value=2>骑手</option>
								<select>
						</div>

						<div class="ececk_warning">
							<span>请选择用户类型</span>
						</div>
						<div class="form_check_ipt">
							<div class="left check_left">
								<label><input name="" type="checkbox"> 下次自动登录</label>
							</div>
							<div class="right check_right">
								<a href="#">忘记密码</a>
							</div>
						</div>
						<div class="form_btn">
							<!-- <button type="button" onclick="javascript:window.location.href='#'">登录</button> -->
							<button type="submit">登录</button>
						</div>
						<div class="form_reg_btn">
							<span>还没有帐号？</span><a id="register">马上注册</a>
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
		var msg = '${msg}';
		if (msg != "" && msg != undefined) {
			alert(msg);
		}
		function check() {
			var type = $(" select[ name='type'] ").val();
			var phone = $(" input[ name='userPhone'] ").val();
			var password = $(" input[ name='userPwd'] ").val();
			if (phone == null || phone == "") {
				alert("请输入手机号！");
				return false;
			}
			if (password == null || password == "") {
				alert("请输入密码！");
				return false;
			}
			if (type == 0 || type == 1) {
				return true;
			} else {
				window.location.href = "crlogin.html?phone=" + phone + '&pwd='
						+ password;
				return false;
			}
		}
		$("#register").click(function() {
			var selectType = $(" select[ name='type'] ").val();
			if (selectType == 0 || selectType == 1) {
				window.location.href = "register.html";
			} else {
				window.location.href = "courierregister.html"
			}
		});
	</script>
</body>
</html>
