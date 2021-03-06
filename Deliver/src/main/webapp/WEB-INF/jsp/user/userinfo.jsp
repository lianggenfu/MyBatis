<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>Process</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript">
	
			addEventListener("load", function() {
				setTimeout(hideURLbar, 0);
			}, false);

			function hideURLbar() {
				window.scrollTo(0, 1);
			}
		
</script>
<!-- css files -->
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
<!-- /font files -->
<!-- js files -->
<style type="text/css">
.right {
	width: 800px;
	height: 400px;
	float: right;
	background: lightcyan;
}

.right img {
	width: 800px;
	height: 400px;
}
</style>
<!-- /js files -->
</head>

<body>
	<!-- navigation -->
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
					<span class="fa fa-diamond" aria-hidden="true"></span>用户信息
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

	<section class="shipment-w3ls">
	<div class="container">
		<!--<i class="fa fa-braille" aria-hidden="true"></i>-->
		<h3
			class="text-center wthree w3-agileits agileits-w3layouts agile w3-agile">User
			Message</h3>
	</div>
	<div class="container">
		<div class="col-lg-3 col-md-3 col-sm-6">
			<div class="subscribe">

				<form action="userupdate.html" method="post"
					onsubmit="return check()">
					<div class="form-group">
						<label>email</label><input type="email" name="email"
							class="form-control" placeholder="Email" disabled>
					</div>
					<div class="form-group">
						<label>联系方式</label><input type="number" name="userphone"
							class="form-control" placeholder="Your phone" disabled>
					</div>
					<div class="form-group">
						<label>昵称</label><input type="text" name="nickname"
							class="form-control" placeholder="Your nickName">
					</div>
					<div class="form-group">
						<label>密码</label><input type="password" name="password"
							class="form-control" placeholder="Your password">
					</div>
					<div class="form-group">
						<label>确认密码</label><input type="password" name="repassword"
							class="form-control" placeholder="Your password">
					</div>
					<div class="form-group">
						<button type="submit" class="btn-outline">Submit</button>
					</div>
				</form>
			</div>
		</div>
		<div class="right">

			<img src="images/banner1-2.jpg" />

		</div>
	</div>
	</section>
	<!-- /tracking section -->

	<!-- footer section -->
	<section class="footer-agileits">
	<div class="container">
		<div class="col-lg-3 col-md-3 col-sm-6">
			<h3>More Info</h3>
			<ul class="info-links">
				<li><a href="about.html"><i class="fa fa-hand-o-right"
						aria-hidden="true"></i> About Us</a></li>
				<li><a href="contact.html"><i class="fa fa-hand-o-right"
						aria-hidden="true"></i> Contact Us</a></li>
			</ul>
		</div>

		<div class="col-lg-3 col-md-3 col-sm-6">
			<h3>Contact Info</h3>
			<div class="contact-info">
				<div class="phone">
					<i class="glyphicon glyphicon-phone-alt"></i>
					<p class="p3">+1 515 151515</p>
					<p class="p4">+00 1010101010</p>
				</div>
				<div class="email-info">
					<i class="glyphicon glyphicon-envelope"></i>
					<p class="p5">
						<a href="mailto:myemail1@example.com">myemail1@example.com</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6">
			<h3>Subscribe Us</h3>
			<div class="subscribe"></div>
		</div>
	</div>
	</section>
	<!-- /footer section -->
	<a href="#0" class="cd-top">Top</a>
	<!-- js files -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/SmoothScroll.min.js"></script>
	<script src="js/index.js"></script>
	<script src="js/top.js"></script>
	<script type="text/javascript" src="js/colorfulTab.min.js"></script>
	<script type="text/javascript">
		var nickname = '${user.nickname}';
		$(" input[ name='nickname' ] ").val(nickname);

		var userphone = '${user.userphone}';
		$(" input[ name='userphone' ] ").val(userphone);

		var useremail = '${user.useremail}';
		$(" input[ name='email' ] ").val(useremail);

		var userpwd = '${user.userpwd}';
		$(" input[ name='password' ] ").val(userpwd);
		$(" input[ name='repassword' ] ").val(userpwd);

		function check() {
			var password = $(" input[ name='password' ] ").val();
			var repassword = $(" input[ name='repassword' ] ").val();
			if (password == null || password == "") {
				alert("密码不能为空！");
				return false;
			} else if (password == repassword) {
				return true;
			} else {
				alert("密码输入不一致！");
				return false;
			}
		}
	</script>
	<!-- /js files -->
</body>

</html>