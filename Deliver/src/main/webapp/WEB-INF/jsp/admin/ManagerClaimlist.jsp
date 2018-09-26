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
<title>理赔管理</title>
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
								<font size="4">理赔管理</font> 
								<a href="<%=basePath%>showclaimlist.html"> 
									<span class="glyphicon glyphicon-repeat"></span>
								</a>
								<span style="float: right">
								</span>
							</div>
							<!-- 面板体放：表格内容，按照dataTable格式来构造-->
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example">
										<thead>
											<tr>
												<th>订单编号</th>
												<th>申请理由</th>
												<th>理由详情</th>
												<th>状态</th>
												<th>是否同意</th>
												<th>处理反馈</th>
												<th>图片</th>
												<th>修改</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
											<c:if test="${not empty claimlist }">
												<c:forEach items="${claimlist }" var="claim">
													<tr>														
														<td>${claim.deliveryid}</td>
														<td>${claim.reason}</td>
														<td>${claim.reasondetail}</td>
														<c:if test="${claim.status eq 0}">
														<td>未处理</td>
														</c:if>
														<c:if test="${claim.status eq 1}">
														<td>已处理</td>
														</c:if>
														<c:if test="${claim.success eq 0}">
														<td>申请不合理，不同意</td>
														</c:if>
														<c:if test="${claim.success eq 1}">
														<td>申请合理，同意</td>
														</c:if>
														<td>${claim.response}</td>
														<c:if test="${not empty claim.picture}">
														<td><img style="width:100px; height:100px" src="<%=basePath%>images/${claim.picture}"></td>
														</c:if>	
														<c:if test="${empty claim.picture}">
														<td>暂无图片</td>
														</c:if>
														<td>
															<a href="#" data-toggle="modal" data-target="#myModal" onclick="editInfo(this)">
																<span class="glyphicon glyphicon-edit"></span>
															</a>
														</td>
														
														<td>
															<a href="#" onclick="doDelete(${claim.deliveryid})" style="color:rgb(212,106,64)">
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
										<!-- 表单嵌套表格：规范表单格式 -->
										<form action="" method="post" role="form" id="editForm">
											<div class="form-group">
												<table class="table" style="font: '黑体';">
													<thead>
														<tr>
															<th>理赔信息：<input type="hidden" id="deliveryid" name="deliveryid"></th>
															<th><input type="hidden" id="status" name="status" value="1"></th>
														</tr>
													</thead>
													<tbody>												
														<tr>
															<td><b>是否同意:</b></td>
															<td>										
															<select id="brandselectp" name="success">
																<option value = 1>同意</option>
																<option value = 0>不同意</option>
															</select>								
															</td>
														</tr>																
														<tr>
															<td><b>理由:</b></td>
															<td><input type="text" id="response" name="response" class="form-control">													
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
	<script type="text/javascript">
		function editInfo(obj){			
			$("#editForm").attr("action","<%=basePath%>changeclaim.html");
			var customInfo = obj.parentNode.parentNode.childNodes;
			$("#deliveryid").val(customInfo[1].innerText);			
		}
	
		function doDelete(cuid){
			if(confirm("您确定要删除编号为："+cuid+" 的理赔记录吗？")){
				location.href="<%=basePath%>deleteclaim.html?deliveryid="+cuid;
			}
		}
		
		
	</script>
</body>
</html>