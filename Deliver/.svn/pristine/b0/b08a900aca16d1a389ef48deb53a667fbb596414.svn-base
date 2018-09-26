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
<title>价格信息管理</title>
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
								<font size="4">价格信息管理</font> 
								<a href="<%=basePath%>showprice.html"> 
									<span class="glyphicon glyphicon-repeat"></span>
								</a>
								<span style="float: right">
									<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target="#myModal" onclick="editInfo(this,0)">
										<span class="glyphicon glyphicon-plane"></span> 添加价格单
									</button>
								</span>
							</div>
							<!-- 面板体放：表格内容，按照dataTable格式来构造-->
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example">
										<thead>
											<tr>
												<th>价格id</th>
												<th>起始位置</th>
												<th>目的位置</th>
												<th>第一千克价格</th>
												<th>每千克价格</th>
												<th>修改</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
											<c:if test="${not empty list }">
												<c:forEach items="${list }" var="price">
													<tr>
														<td>${price.priceid}</td>
														<td>${price.startadd}</td>
														<td>${price.endadd}</td>
														<td>${price.firstkgprice}</td>
														<td>${price.perkgprice}</td>
														<td>
															<a href="#" data-toggle="modal" data-target="#myModal" onclick="editInfo(this,1)">
																<span class="glyphicon glyphicon-edit"></span>
															</a>
														</td>
														
														<td>
															<a href="#" onclick="doDelete(${price.priceid})" style="color:rgb(212,106,64)">
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
															<th>价格信息：<input type="hidden" id="priceid" name="priceid"></th>
															<th></th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td><b>起始位置:</b></td>
															<td><input type="text" id="startadd" name="startadd" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>目的位置:</b></td>
															<td><input type="text" id="endadd" name="endadd" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>第一千克价格:</b></td>
															<td><input type="text" id="firstkgprice" name="firstkgprice" class="form-control">													
															</td>
														</tr>
														<tr>
															<td><b>每千克价格:</b></td>
															<td><input type="text" id="perkgprice" name="perkgprice" class="form-control">												
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
		function editInfo(obj,type){
			if(type==0){
			
				$("#editForm").get(0).reset();
				$("#editForm").attr("action","<%=basePath%>addprice.html");
			}else{
				
				$("#editForm").attr("action","<%=basePath%>changeprice.html");
				var customInfo = obj.parentNode.parentNode.childNodes;
				$("#priceid").val(customInfo[1].innerText);
				$("#startadd").val(customInfo[3].innerText);
				$("#endadd").val(customInfo[5].innerText);
				$("#firstkgprice").val(customInfo[7].innerText);
				$("#perkgprice").val(customInfo[9].innerText);
			}
		}
		
			<%-- location.href="<%=basePath%>DongJiecustomer.html?cid="+cid+"&status="+status; --%>
		
		
		function doDelete(cuId){
			if(confirm("您确定要删除编号为："+cuId+" 的价单吗？")){
				location.href="<%=basePath%>removeprice.html?priceid="+cuId;
			}
		}
		
		
	</script>
</body>
</html>