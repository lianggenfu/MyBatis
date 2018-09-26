<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/style3.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/deliver.css" />
<link rel="stylesheet" type="text/css" href="css/common.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.citys.js"></script>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=GgrFAKlOiE1ExyIRXPSfdV2N87xyGQCv"></script>
<style>
.deliverSearch {
	display: block;
}

.deliverSearch textarea {
	height: 150px;
}

.deliverNum {
	font-family: "微软雅黑";
	font-size: 20px;
	font-weight: bold;
}

.time, .deliverInfo, .deliverStatus {
	height: 50px;
	line-height: 50px;
	background-color: #E4B9B9;
}

.form_btn {
	width: 140px;
	height: 40px;
	background: grey;
	color: white;
	float: left;
	font-size: 20px;
	margin-left: 200px;
}

.form_btn:hover {
	background: #219167;
	color: white;
}

.weight {
	margin-top: 20px;
	padding-left: 0px;
}
</style>
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
			<a class="navbar-brand" href="index.html"><h1>
					<span class="fa fa-diamond" aria-hidden="true">Star Team</span>
				</h1></a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="index.html">首页</a></li>
				<li><a href="process.html">业务详情</a></li>
				<li><a href="form.html">在线寄件</a></li>
				<li class="active"><a href="search.html">物流服务</a></li>
				<li class="dropdown"><a style="color: red" href="ulogin.html">
						<c:if test="${not empty user }">
				${user.nickname }
				</c:if> <c:if test="${empty user &&empty courier}">
				用户登录    
				</c:if>
				</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<!-- navigation -->
	<section class="content-search"> <img
		src="img/express_banner.jpg" />
	<div class="container">

		<div class="row upContent">
			<div class="col-md-2 left_nav">
				<ul class="search_nav">
					<li class="seaNav"><span><img src="img/nav.png" /></span>查询快递</li>
					<li class="seaNav"><span><img src="img/nav.png" /></span>查询网点</li>
					<li class="seaNav"><span><img src="img/nav.png" /></span>查询中转站</li>
					<li class="seaNav"><span><img src="img/nav.png" /></span>查询价格</li>
				</ul>
			</div>

			<!--查询快递的部分-->
			<div class="col-md-9 right_about deliverSearch">
				<div class="right_search" style="width: 100%; height: 150px;">
					<form role="form" action="logistics.html" method="post"
						onsubmit="return check()">
						<div class="right_top">
							<span class="search_about"><img src="img/nav.png" />查询快递</span>
						</div>
						<div class="area">
							<textarea name="deliveryid"
								onkeyup="this.value=this.value.replace(/[^\d]/g,'') "></textarea>
						</div>
						<button type="submit" class="sea_butt">查询</button>
					</form>
				</div>
				<div class="deliverResult col-md-10">

					<c:if test="${empty logistics}">
						<div class="deliverNum">该订单目前暂无物流信息</div>
					</c:if>
					<c:if test="${not empty logistics}">
						<div class="deliverDetailInfo">
							<div class="time col-md-6">
								<div class="deliverNum">快递单号 ${deliverystatus.deliveryid}</div>
							</div>
							<div class="deliverInfo col-md-6">
								<div id="deliverystatus" class="deliverNum"></div>
							</div>
						</div>

						<!--循环部分-->
						<div class="deliverDetailInfo">
							<div class="time col-md-6">时间</div>
							<div class="deliverInfo col-md-6">位置</div>
						</div>
						<c:if test="${not empty logistics}">
							<c:forEach items="${logistics}" var="item">
								<div class="deliverDetailInfo">
									<div class="time col-md-6">
										<fmt:formatDate value="${item.dltime }"
											pattern="yyyy-MM-dd HH:mm:ss" />
									</div>
									<div class="deliverInfo col-md-6">${item.dladdress }</div>
								</div>
							</c:forEach>
						</c:if>
					</c:if>
				</div>
			</div>
			<!--结束查询快递的部分-->

			<!--查询网点的部分-->
			<div class="col-md-9 right_about branchSearch">
				<div class="right_search" style="width: 100%; height: 200px;">
					<div class="right_top">
						<span class="search_about"><img src="img/nav.png" />查询网点</span>
					</div>
					<div class="area">
						<textarea>存放地图</textarea>
					</div>
				</div>
			</div>
			<!--结束查询网点的部分-->

			<!--查询中转站的部分-->
			<div class="col-md-9 right_about dotStation">
				<div class="right_search" style="width: 100%; height: 500px;">
					<div class="right_top">
						<span class="search_about"><img src="img/nav.png" />查询中转站</span>
					</div>
					<div class="area" style="width: 100%; height: 500px;">
						<!-- <textarea>存放地图 </textarea>  -->
						<%-- <jsp:include page="wangdianmap.jsp"></jsp:include> --%>
					</div>
				</div>
			</div>
			<!--结束查询中转站的部分-->

			<!--查询价格的部分-->
			<!--查询价格的部分-->
			<div class="col-md-9 right_about priceSearch">
				<div class="right_search" style="width: 100%; height: 500px;">
					<div class="right_top">
						<span class="search_about"><img src="img/nav.png" />查询价格</span>
					</div>
					<div class="countPrice">
						<form class="form-horizontal" action="#" method="post">
							<div class="inputGroup col-md-12">
								<!-- Select Basic -->
								<label class="label_price col-md-4">始发地:</label>
								<div class="controls">
									<div id="demo" class="citys">
										<select class="col-md-8 area_select" name="province">
										</select> <input id="startadd" name="startadd" style="display: none">
									</div>
								</div>
							</div>
							<div class="inputGroup col-md-12">
								<label class="col-md-4 label_price">目的地:</label>
								<div class="controls">
									<div id="demo1" class="citys">
										<select class="col-md-8 area_select" name="province">
									</div>
									<input id="endadd" name="endadd" style="display: none">
								</div>
							</div>
							<div class="inputGroup col-md-12 weight">
								<label class="col-md-4 label_price" for="input01">重量:</label>
								<div class="controls">
									<input class="col-md-8 winput" type=number
										onkeyup="value=value.replace(/[^\d]/g,'')" placeholder="请输入"
										class="input-xlarge" name="weight" id="weight">
								</div>
							</div>
							<button type="button" class="btn btn-primary btn-lg bt_search"
								onclick="aa()">查询</button>
							<div class="inputGroup col-md-12">

								<label class="col-md-4 label_price" for="input01">快递费用</label>
								<div class="controls">
									<input type="text" class="col-md-4 winput" id="deliveryprice">
								</div>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	</section>
	<script src="js/jquery.min.js"></script>
	<script src="js/jquery.citys.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/index.js"></script>
	<script src="js/top.js"></script>
	<script src="js/bgfader.js"></script>
	<script>
		$('#demo').citys({
			required : false,
			nodata : 'disabled',
			onChange : function(data) {
				var text = data['direct'] ? '(直辖市)' : '';
				$('#startadd').val(data['province']);
			}
		});

		$('#demo1').citys({
			required : false,
			nodata : 'disabled',
			onChange : function(data) {
				var text = data['direct'] ? '(直辖市)' : '';
				$('#endadd').val(data['province']);
			}
		});

		var myBgFader = $('.header').bgfader(
				[ 'images/banner1-1.jpg', 'images/banner1-2.jpg',
						'images/banner1-3.jpg', 'images/banner1-4.jpg', ], {
					'timeout' : 100,
					'speed' : 2000,
					'opacity' : 0.4
				});

		myBgFader.start();

		$(function() {
			$('.seaNav').click(
					function() {
						console.log($(this).index());     						
						$('.right_about').eq($(this).index()).css("display","block").siblings('.right_about').css("display", "none");
						
						switch($(this).index()){
						case 1:window.location.href="maptransfer.html";break;
						case 2:window.location.href="showbranch.html";break;
						
						
						}
						/*$('.right_about').eq($(this).index()).toggle(function() {
							alert($(this).index());
						    window.location.href="maphello.html";
						    alert("成功了");
						}); 
						$('.right_about').eq(2).toggle(function() {
							alert($(this).index());
						    window.location.href="maptransfer.html";
						}); 
						$('.right_about').eq(1).toggle(function() {
							alert($(this).index());
						    window.location.href="showbranch34.html";
						});*/
						
					}); 
		});
		
		
		judgeStatus();
		function judgeStatus() {
			var s = '${deliverystatus.status}';
			/* alert(s); */
			switch (s) {
			case "1":
				$("#deliverystatus").text("快递状态 :待取件");
				break;
			case "2":
				$("#deliverystatus").text("快递状态 :已揽件");
				break;
			case "3":
				$("#deliverystatus").text("快递状态 :运输中");
				break;
			case "4":
				$("#deliverystatus").text("快递状态 :已到站");
				break;
			case "5":
				$("#deliverystatus").text("快递状态 :派件中");
				break;
			case "6":
				$("#deliverystatus").text("快递状态 :已签收");
				break;
			case "7":
				$("#deliverystatus").text("快递状态 :拒收");
				break;
			case "8":
				$("#deliverystatus").text("快递状态 :理赔中");
				break;
			case "9":
				$("#deliverystatus").text("快递状态 :已理赔");
				break;
			}
		}

		function check() {
			var did = $(" textarea[ name='deliveryid'] ").val();
			if (did == null || did == "") {
				alert("订单号不能为空！");
				return false;
			}
		}

		function aa() {
			var startadd = $("#startadd").val();
			var endadd = $("#endadd").val();
			var weight = $("#weight").val();
			$.get("searchprice.html?startadd=" + startadd + "&endadd=" + endadd
					+ "&weight=" + weight, function(data) {
				$('#deliveryprice').val(data + "元");
			});
		}
	</script>
	<!-- /js files -->
</body>
</html>