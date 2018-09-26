<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta content="" name="description" />
<meta content="webthemez" name="author" />	
<title>用户订单信息</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="css/deliver.css"/>
<link rel="stylesheet" type="text/css" href="css/style3.css"/>
<jsp:include page="/part/manager.css.jsp"></jsp:include>
<jsp:include page="/part/manager.js.jsp"></jsp:include>
</head>
<style>
body{
	background-color:white;
}
.tableCourier{
	background-color:#eee;
	border:1px solid tan;
	padding-bottom:60px;
}
.contentTable{
	margin:20px
}
#page-wrapper{
	margin:0;
}
#page-inner{
	margin:0;
}
.navbar-default .navbar-nav > .active > a{
background-color:#33accc;

}
.tableCourier{
	margin-top:20px;
}
</style>
<body>
<nav class="navbar navbar-default navbar-static-top">
    <div class="container">
        <div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html"><h1><span class="fa fa-diamond" aria-hidden="true"></span>Courier Store</h1></a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="index.html">首页</a></li>			
				<li class="userloginnav">  
				<a href="ulogin.html" style="color: red">
				<c:if test="${not empty user }">${user.nickname }</c:if> 				
				<c:if test="${empty user}">
				用户登录    
				</c:if></a> 
				</li>
			</ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
	<div class="tableCourier">
	
	  <div class="contentTable">
		<table class="table" >
	    <thead>
		    <tr>
		        <th>快递单号</th>
		        <th>寄件人姓名</th>
		        <th>寄件人地址</th>
		        <th>寄件人电话</th>
		        <th>收件人姓名</th>
		        <th>收件人地址</th>
		        <th>收件人电话</th>
		        <th>投保</th>
		        <th>快递价格</th>
		        <th>订单状态</th>
		        <th>物流详情</th>
		 
		    </tr>
		    </thead>
		    <tbody id="deliveryInfoList">
		   
		    </tbody>
		</table>
		
		</div>
	</div>
	
	
		
	
	
	<script>
	
    function editDelivOrders(obj){
		$("#editForm").attr("action","<%=basePath%>changecourier.html");
		var customInfo = obj.parentNode.parentNode.childNodes;
		$("#cuid").val(customInfo[1].innerText);
		$("#cuname").val(customInfo[3].innerText);
		$("#cupwd").val(customInfo[5].innerText);
		$("#cutel").val(customInfo[7].innerText);
	}
	
	$(function(){
		initUserDigital();
		
	}); 
	//这里还没有修改好--------------
	function initUserDigital(){
		$.getJSON("userorders.html",function(data){
			console.log(data);  
			$.each(data,function(){			  
				$("#deliveryInfoList").append("<tr class='detailList'><td>"+this.deliveryId+"</td><td>"+this.sendName+"</td><td>"+this.sendAdd+"</td><td>"+this.sendPhone+"</td><td>"+this.acceptName+
					"</td><td>"+this.acceptAdd+"</td><td>"+this.acceptPhone+"</td><td>"+this.isInsurance+"</td><td>"+this.money+"</td><td>"+
					judgeStatus(this.status)+"</td><td><button onclick='map("+this.status+","+this.deliveryId+")'>查看</button></td></tr>")											
			})
		})   	/* <form action='maphello.html?deliveryId="+this.deliveryId+"' method='post'><input class='confirmOrder' type='submit' value='查看'/></form> */
	} 
	
	function map(did,statu){
		if(did < 3)
		 {
			alert("您好，您的快递还在等待揽件");
		} 				
		if(did > 5)
		{alert("快递已经签收");}
	
		if(did > 2 && did < 6)
		{
			alert("您好，快递已经在路上了");			
			window.location.href="maphello.html?deliveryId=" + statu;
		}
	
	} 
	
	function judgeStatus(status) {
		var s = status;
	  
		switch (s) {
		case 1:
			return "待取件";
			break;
		case 2:
			return "已揽件";
			break;
		case 3:
			return "运输中";
			break;
		case 4:
			return "已到站";
			break;
		case 5:
			return "派件中";
			break;
		case 6:
			return "已签收";
			break;
		case 7:
			return "拒收";
			break;
		case 8:
			return "理赔中";
			break;
		case 9:
			return "已理赔";
			break;
		}
	}
	   
    
</script>
</body>
</html>