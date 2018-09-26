<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<title>订单管理</title>
<jsp:include page="/part/manager.css.jsp"></jsp:include>
</head>
<body>
	<div id="wrapper">
		<!--头部：页面标题栏-->
		<jsp:include page="/part/manager.header.jsp"></jsp:include>
		<!--导航栏：页面菜单栏-->
		<jsp:include page="/part/manager.menu.jsp"></jsp:include>
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
								<font size="4">订单管理</font> 
								<a href="<%=basePath%>showorder.html"> 
									<span class="glyphicon glyphicon-repeat"></span>
								</a>
							</div>
							<!-- 面板体放：表格内容，按照dataTable格式来构造-->
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example">
										<thead>
											<tr>
												<th>订单编号</th>
												<th>订单总价</th>
												<th>订单状态</th>
												<th>收货人</th>
												<th>手机号</th>
												<th>流水号</th>
												<th>订单详情</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
											<c:if test="${not empty list }">
												<c:forEach items="${list }" var="od">
													<tr>
														<td>${od.oid}</td>
														<td>${od.total}</td>
														<td>${od.status}</td>
														<td>${od.cname}</td>
														<td>${od.mobile}</td>
														<td>${od.orderNO}</td>
														<td>
															<a href="#" data-toggle="modal" data-target="#myModal" onclick="detail(${od.oid})">
																<span class="glyphicon glyphicon-list-alt"></span>
															</a>
														</td>
														<td>
															<a href="#" onclick="doDelete(${od.oid})" style="color:rgb(212,106,64)">
																<span class="glyphicon glyphicon-remove"></span>
															</a>
														</td>
													</tr>
												</c:forEach>
											</c:if>
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
										<table class="table" style="font:黑体">
											<thead>
												<tr>
													<th>详单信息：</th>
												</tr>
											</thead>
											<tbody id="detail">
												<tr>
													<td>详单编号</td>
													<td>客户名称</td>
													<td>商品名称</td>
													<td>购买数量</td>
													<td>购买单价</td>
													<td>单笔总额</td>
												</tr>
											</tbody>
										</table>
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
	<script type="text/javascript">
		function detail(oid){
			$.getJSON("<%=basePath%>showdetail.html?oid="+oid,function(data){
				$(".detail").empty();
				$.each(data,function(){
					$("#detail").append("<tr class='detail'><td>"+this.did+"</td><td>"+this.cname+"</td><td>"+this.gname+"</td><td>"+this.count+"</td><td>"+this.price+"</td><td>"+this.amount+"</td></tr>")
				})
			})
		}
		
		function doDelete(oid){
			if(confirm("您确定要删除编号为："+oid+" 的订单吗？")){
				location.href="<%=basePath%>removeorder.html?oid="+oid;
			}
		}
	
	</script>
</body>
</html>