<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Process</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- css files -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/colorfulTab.min.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style3.css" rel="stylesheet" type="text/css" media="all" />
<!-- /css files -->
<!-- font files -->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700italic,700,800,800italic' rel='stylesheet' type='text/css'>
<link href="http://fonts.googleapis.com/css?family=Exo+2:100,200,300,400,500,600,700,800,900" rel="stylesheet">
<!-- /font files -->
<!-- js files -->

<!-- /js files -->
</head>
<body>
<!-- navigation -->
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.jsp"><h1><span class="fa fa-diamond" aria-hidden="true">Star Team</span></h1></a>
        </div> 
        <div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="index.html">首页</a></li>
				<li class="active"><a href="process.html">业务详情</a></li>
				<li><a href="form.html">在线寄件</a></li>
				<li><a href="search.html">物流追踪</a></li>
				<li class="dropdown"><a style="color: red; float: right" href="ulogin.html"> 
				<c:if test="${not empty user }">
				${user.nickname }
				</c:if> 
				<c:if test="${empty user }">
			          用户登录 
				</c:if> 				
				</a>
				<ul>
				<!-- <li><a href="userInfo.html">用户信息</a></li>
				<li>订单管理</li>
				<li>安全退出</li> -->
				</ul>
				
				</li>	
			</ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
<!-- navigation -->
<!-- banner section -->
<section class="inner-w3ls">
	<div class="container">
		<h2 class="text-center w3layouts w3 w3l agileits agileinfo">Track Your Product</h2>
		<p class="text-center w3layouts w3 w3l agileits agileinfo">Lorem Ipsum has been the industry's standard dummy text.</p>
	</div>
</section>
<!-- /banner section -->
<!-- tracking section -->
<section class="shipment-w3ls">
	<div class="container">
		<i class="fa fa-braille" aria-hidden="true"></i>
		<h3 class="text-center wthree w3-agileits agileits-w3layouts agile w3-agile">Shipment Track</h3>
		<p class="text-center wthree w3-agileits agileits-w3layouts agile w3-agile">Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
	</div>
	<div class="container">
		<div class="content-w3ls">	
			<div class="content1-w3ls">
				<h2>Order Tracking: Order No</h2>
			</div>
			<div class="content2-w3ls">
				<div class="content2-header1">
					<p>Shipped Via : <span>Ipsum Dolor</span></p>
				</div>
				<div class="content2-header1">
					<p>Status : <span>Checking Quality</span></p>	
				</div>
				<div class="content2-header1">
					<p>Expected Date : <span>7-NOV-2016</span></p>
				</div>
				<div class="clear"></div>
			</div>
			<div class="content3-w3ls">
				<div class="shipment">
					<div class="confirm">
						<div class="imgcircle">
							<img src="images/confirm.png" alt="confirm order">
						</div>
						<span class="line"></span>
						<p>Confirmed Order</p>
					</div>
					<div class="process">
						<div class="imgcircle">
							<img src="images/process.png" alt="process order">
						</div>
						<span class="line"></span>
						<p>Processing Order</p>
					</div>
					<div class="quality">
						<div class="imgcircle">
							<img src="images/quality.png" alt="quality check">
						</div>
						<span class="line"></span>
						<p>Quality Check</p>
					</div>
					<div class="dispatch">
						<div class="imgcircle">
							<img src="images/dispatch.png" alt="dispatch product">
						</div>
						<span class="line"></span>
						<p>Dispatched Item</p>
					</div>
					<div class="delivery">
						<div class="imgcircle">
							<img src="images/delivery.png" alt="delivery">
						</div>
						<p>Product Delivered</p>
					</div>
					<div class="clear"></div>
				</div>
			</div>
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
				<li><a href="about.html"><i class="fa fa-hand-o-right" aria-hidden="true"></i> About Us</a></li>
				<li><a href="contact.html"><i class="fa fa-hand-o-right" aria-hidden="true"></i> Contact Us</a></li>
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
					<p class="p5"><a href="mailto:myemail1@example.com">myemail1@example.com</a></p> 
				</div>
			</div>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6">
			<h3>Subscribe Us</h3>
			<div class="subscribe">
				<form action="#" method="post">
					<div class="form-group">
						<input type="email" name="email2" class="form-control" id="inputEmail1" placeholder="Email">
					</div>
					<div class="form-group">
						<input type="text" name="user" class="form-control" id="text1" placeholder="Your Name">
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
<!-- js files -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/SmoothScroll.min.js"></script>
<script src="js/index.js"></script>
<script src="js/top.js"></script>
<script type="text/javascript" src="js/colorfulTab.min.js"></script>
  <script type="text/javascript">
    $(document).ready(function(){
        
        $("#colorful").colorfulTab();    
        
        $("#colorful-elliptic").colorfulTab({
            theme: "elliptic"
        }); 
       
       $("#colorful-flatline").colorfulTab({
            theme: "flatline"
        });    
        
        $("#colorful-background-image").colorfulTab({
            theme: "flatline",
            backgroundImage: "true",
            overlayColor: "#2d3305",
            overlayOpacity: "0.8"
        });   
    
    });
  </script>
<!-- /js files -->
</body>
</html>