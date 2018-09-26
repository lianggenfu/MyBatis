<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="css/deliver.css"/>

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
			<a class="navbar-brand" href="index.html"><h1><span class="fa fa-diamond" aria-hidden="true"></span>Information</h1></a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="index.html">首页</a></li>
				<li ><a href="process.html">业务详情</a></li>
				<li><a href="form.html">在线寄件</a></li>
				<li><a href="search.html">物流追踪</a></li>
				<li class="dropdown active">
					<a href="login.html">登录</a>
				</li>
				<li class="dropdown">
					<a href="register.html">注册</a>
				</li>
			</ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<!-- navigation -->
<!-- 个人中心 -->
<section class="content-search">
	<div class="container">
		
		 <div class="row personSet">
		 	<!--左侧导航-->
		 	<div class="col-md-2 info_nav">
			  	<ul class="info_leftnav">
			  		<li class="seaNav">账户信息</li>
			  		<li class="seaNav">下单信息</li>
			  		<li class="seaNav">地址管理</li>
			  	</ul>
		  </div>
		 	<!--右侧信息-->
		 	<div class="col-md-8 information">
			  	<section class="shipment-w3ls">
				<div class="col-lg-3 col-md-3 col-sm-6">
					<div class="subscribe">
						<div class="titleInfo">
							<span><img src="img/person.svg"/>修改信息</span>
						</div>
						<form action="#" method="post">
							<div class="form-group">
								<label>email</label><input type="email" name="email2" class="form-control" id="inputEmail1" placeholder="Email" disabled>
							</div>
							<div class="form-group">
								<label>联系方式</label><input type="text" name="user" class="form-control" id="text1" placeholder="Your phone" disabled>
							</div>
							<div class="form-group">
								<label>昵称</label><input type="text" name="user" class="form-control" id="text1" placeholder="Your nickName">
							</div>
							<div class="form-group">
								<label>密码</label><input type="text" name="user" class="form-control" id="text1" placeholder="Your password">
							</div>
							<div class="form-group">
								<label>确认密码</label><input type="text" name="user" class="form-control" id="text1" placeholder="Your password">
							</div>
							<div class="form-group">
								<button type="submit" class="btn-outline">Submit</button>
							</div>
						</form>
					</div>
				</div>
				
			
		</section>
		  </div>
		 </div>
	</div>
</section>
<!-- js files -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
  <script type="text/javascript">
    $(document).ready(function(){
   
    });
  </script>
<!-- /js files -->
</body>
</html>