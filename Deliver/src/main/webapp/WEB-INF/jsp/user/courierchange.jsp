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
<title>更改快递状态</title>
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
				<c:if test="${not empty courier }">${courier.cuname }</c:if> 				
				<c:if test="${empty courier}">
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
		        <th>确认接单</th>
		    </tr>
		    </thead>
		    <tbody id="deliveryInfoList">
		   
		    </tbody>
		</table>
		
		</div>
	</div>

	<div id="wrapper">
		<!--表格-->
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<!-- start dataTables -->
						<!-- 表格格式：面板中嵌套表格 -->
						<div class="panel panel-default">
							<!-- 面板头放：页面标题，刷新按钮，添加按钮 -->
							<div class="panel-heading">
								<font size="4">骑手信息管理</font> 
								<a href="<%=basePath%>showcourier.html"> 
									<span class="glyphicon glyphicon-repeat"></span>
								</a>
								<!-- <span style="float: right">
									<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target="#myModal" onclick="editInfo(this,0)">
										<span class="glyphicon glyphicon-plane"></span> 骑手添加
									</button>
								</span> -->
							</div>
							<!-- 面板体放：表格内容，按照dataTable格式来构造-->
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example">
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
										        <th>修改</th>
												<th>撤销</th>
										    </tr>
										</thead>
										<tbody>
										<tbody id="courierList">
		   								</tbody>
									</table>
								</div>
							</div>
						</div>
						<!--End dataTables -->
						<!-- 按钮触发模态框 -->
						<!-- 模态框（Modal） myModal-->
						<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
							aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">×</button>
										<!-- 表单嵌套表格：规范表单格式 -->
										<form action="" method="post" role="form" id="edit">
											<div class="form-group">
												<table class="table" style="font: '黑体';">
													<thead>
														<tr>
															<th>修改物流状态：<input type="hidden" id="deliveryid" name="deliveryid"></th>
															<th></th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td><b>快递单号:</b></td>
															<td><label id="deliveryid" name="deliveryid" class="form-control"></label></td>
														</tr>
														<tr>
															<td><b>寄件人</b></td>
															<td><input type="text" id="sendname" name="sendname" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>收件人</b></td>
															<td><input type="text" id="acceptname" name="acceptname" class="form-control"></td>
														</tr>
														<tr>
															<td><b>修改物流状态</b></td>
															<td>
															<select id="status" name="status">
																<option value="5">派件中</option>
																<option value="6">已签收</option>
																<option value="7">拒收</option>
															</select>												
															</td>
														</tr>
													</tbody>
												</table>
												<div class="modal-footer">
													<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
													<input type="submit" value="提交" class="btn btn-primary">
												</div>
											</div>
										</form>
									</div>
								</div>
							</div>
							<!-- /.modal-dialog -->
						</div>
						<!-- /.modal -->
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/part/manager.js.jsp"></jsp:include>
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
		initCourierDigital();
	});
	//这里还没有修改好--------------
	function initUserDigital(){
		$.getJSON("orderShowDelivery.html",function(data){
			$.each(data,function(){	
				console.log(this.deliveryId);				
				$("#deliveryInfoList").append("<tr class='detailList'><td>"+this.deliveryId+"</td><td>"+this.sendName+"</td><td>"+this.sendAdd+"</td><td>"+this.sendPhone+"</td><td>"+this.acceptName+
					"</td><td>"+this.acceptAdd+"</td><td>"+this.acceptPhone+"</td><td>"+this.isInsurance+"</td><td>"+this.money+"</td><td>"+
					judgeStatus(this.status)+"</td><td><form action='cuAddDelivery.html?deliveryId="+this.deliveryId+"&cuId=${cuId}' method='post'><input class='confirmOrder' type='submit' value='接单'/></form></td></tr>");
			})
		})
	}
	function initCourierDigital(){
		$.getJSON("cuShowOrders.html?cuId=${cuId}" ,function(data){
			$.each(data,function(){
				var obj = this;
				$("#courierList").append("<tr class='detailList'><td>"+this.deliveryId+"</td><td>"+this.sendName+"</td><td>"+this.sendAdd+"</td><td>"+this.sendPhone+"</td><td>"+this.acceptName+
				"</td><td>"+this.acceptAdd+"</td><td>"+this.acceptPhone+"</td><td>"+this.isInsurance+"</td><td>"+this.money+"</td><td>"+judgeStatus(this.status)+"</td>"+
				"<td><a href='#' data-toggle='modal' data-target='#myModal' onclick='editDelivOrders(obj)'>"+
				"<span class='glyphicon glyphicon-edit'></span></a> </td>"+"<td><a href='#' style='color:rgb(212,106,64)' onclick='resetDelivOrders(\""+obj+"\")'>"+
				"<span class='glyphicon glyphicon-remove'></span></a></td>"+"</tr>");
			});
			 datatable.fnDestroy(); 
		});   	
	}
	
	$("#deliveryInfoList").on("click",".confirmOrder",function(){
        alert("确认接单");
    })  
     
    function editDelivOrders(obj){
		alert(obj);
		<%-- $("#editForm").attr("action","<%=basePath%>cuChangeDeliver.html");
		var customInfo = obj.parentNode.parentNode.childNodes;
		$("#deliveryid").val(obj.deliveryid);
		$("#cuname").val(obj.sendname);	
		$("#cupwd").val(obj.acceptname);
		$("#cutel").val(obj.status);
		alert(obj.sendname); --%>
	} 
	   
	function resetDelivOrders(obj){ 
		alert("123"); 
	    alert(obj.deliveryId); 
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