<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- css files -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"media="all" />
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"media="all" />
<link rel="stylesheet" href="css/deliver.css" />
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/form-elements.css">
<link rel="stylesheet" href="assets/css/style.css">
<link href="css/style3.css" rel="stylesheet" type="text/css" media="all" />
<style type="text/css">
	.courierSet{
	display:none;
	}
	.courierSet{
		position: absolute;
	}
	.courierSet li{
		list-style:none;
		text-align:center;
		width: 92px;
		background-color: #33ACCC;
		height: 40px;
	}
	.courierSet li a{
		text-decoration: none;
		color: #FFFFFF;
		height: 40px;
		line-height: 40px;
	}
	.userSet {
	     display: none;
		 position: absolute; 
	     top:52px;   	 
	} 
	
	.userSet li {
		list-style: none;
		text-align: center;
		width: 93px; 
		background-color: #33ACCC; 
		height: 40px;	
	} 
	
	.userSet li a {
		text-decoration: none;
		color: #FFFFFF;
		height: 40px;
		line-height: 40px;
		font-size:12px; 
	}
</style>
<script src="assets/js/jquery.min.js"></script>
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
			<a class="navbar-brand" href="index.jsp"><h1>
					<span class="fa fa-diamond" aria-hidden="true">Courier</span>
				</h1></a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="index.html">首页</a></li>
				<li><a href="process.html">业务详情</a></li>
				<li><a href="form.html">在线寄件</a></li>
				<li><a href="search.html">物流服务</a></li>								 
				<li class="userloginnav">  
				<a href="ulogin.html" style="color: red">
				<c:if test="${not empty user }">${user.nickname }</c:if> 
				<c:if test="${not empty courier }">${courier.cuname }</c:if>
				<c:if test="${empty user &&empty courier}">
				用户登录    
				</c:if></a> 
				 	<ul class="userSet">
						<li><a href="userInfo.html">个人中心</a></li>
						<li><a href="userorders1.html">用户订单</a></li>
						<li><a href="courierchange.html">骑手接单</a></li>				
						<li><a href="userlogout.html">安全退出</a></li>
					</ul>
				</li>
				 				
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>
	<!-- navigation -->
	<!-- banner section -->
	<section class="banner-w3ls">
	<div class='header'>
		<div class="banner-w3layouts">
			<div class="container">
				<div class="col-sm-6 col-sm-offset-3 form-box" style="margin-top: 280px;">
					<div class="form-top">
						<div class="form-top-left">
							<h3>快递查询</h3>
							<p>随时随地知晓您的快件信息</p>
						</div>	

					</div>
					<div class="form-bottom">
						<form role="form" action="logistics.html" method="post"
							class="login-form" onsubmit="return check()">
							<div class="form-group">    
								<input type="text" onkeyup="this.value=this.value.replace(/[^\d]/g,'') " name="deliveryid" placeholder="快递单号..."
									class="form-username form-control" id="form-username">
							</div> 
							<button type="submit" class="btn">提交</button>
						</form>
					</div>
				</div>
			</div>


		</div>
	</div>
	</section>
	<!-- /banner sec tion -->
	<!-- specialization section -->
	<section class="special-w3layouts">
	<div class="container">
		<h3 class="text-center wthree w3-agileits">我们的优势</h3>
		<p class="text-center wthree w3-agileits">用我们优质的服务让客人满意.</p>
		<div class="col-lg-3 col-md-3 col-sm-6">
			<img src="images/eye.png" alt="" class="img-responsive">
			<h4 class="text-center">物流追踪</h4>
			<p class="special-p1">用户可以根据快递单号来跟踪快递，显示物流的路线信息</p>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6">
			<img src="images/monitor.png" alt="" class="img-responsive">
			<h4 class="text-center">在线寄件</h4>
			<p class="special-p1">用户登录网站，在线下单，更方便快捷</p>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6">
			<img src="images/truck.png" alt="" class="img-responsive">
			<h4 class="text-center">查询服务</h4>
			<p class="special-p1">查询服务包括查询运费价格，查询网点，查询快递</p>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6">
			<img src="images/shop.png" alt="" class="img-responsive">
			<h4 class="text-center">报价服务</h4>
			<p class="special-p1">用户根据最高保额选择不同价格保价业务，如发生快递运输过程中的遗失或损毁，中通快递公司给予保价赔偿。</p>
		</div>
		<div class="clearfix"></div>
	</div>
</section>
	<!-- /specialization section -->


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
			<div class="subscribe">
				<form action="#" method="post">
					<div class="form-group">
						<input type="email" name="email2" class="form-control"
							id="inputEmail1" placeholder="Email">
					</div>
					<div class="form-group">
						<input type="text" name="user" class="form-control" id="text1"
							placeholder="Your Name">
					</div>
					<div class="form-group">
						<button type="submit" class="btn-outline">Subscribe</button>
					</div>
				</form>
			</div>
		</div> 
	</div>
	</section>
	<!-- /footer section -->
	<a href="#0" class="cd-top">Top</a>	 
	
	 <script src="js/jquery.min.js"></script> 
	
	<script src="js/bootstrap.min.js"></script>
	<script src="js/SmoothScroll.min.js"></script>
	<script src="js/index.js"></script>
	<script src="js/top.js"></script>
	<script src="js/bgfader.js"></script>
	<script>
		var myBgFader = $('.header').bgfader(
				[ 'images/banner1-1.jpg', 'images/banner1-2.jpg',
						'images/banner1-3.jpg', 'images/banner1-4.jpg', ], {
					'timeout' : 100,
					'speed' : 2000,
					'opacity' : 0.4
				}) 
  
		myBgFader.start();
		$(function() {
			$(".userloginnav").mouseenter(function() {
				$(this).children("ul").stop().show(300);
			}).mouseleave(function() { 
				$(this).children("ul").stop().hide(300);
			});
		}); 
		
		function check(){
			var did = $(" input[ name='deliveryid'] ").val();
			if(did==null||did==""){
				alert("请输入快递单号！");
				return false;
			}
		}
	</script>
	<!-- /js files -->
</body>
</html>