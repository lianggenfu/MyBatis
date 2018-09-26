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
<title>中转站信息管理</title>
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
								<font size="4">中转站信息管理</font> 
								<a href="<%=basePath%>showalltransfer.html"> 
									<span class="glyphicon glyphicon-repeat"></span>
								</a>
								<span style="float: right">
									<button type="button" class="btn btn-default btn-sm" data-toggle="modal" data-target="#myModal" onclick="editInfo(this,0)">
										<span class="glyphicon glyphicon-plane"></span> 中转站添加
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
												<th>中转站编号</th>
												<th>省份</th>
												<th>城市</th>
												<th>修改</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
											<c:if test="${not empty transferlist }">
												<c:forEach items="${transferlist }" var="transfer">
													<tr>														
														<td>${transfer.tid}</td>
														<td>${transfer.tprovince}</td>
														<td>${transfer.tcity}</td>
														<td>
															<a href="#" data-toggle="modal" data-target="#myModal" onclick="editInfo(this,1)">
																<span class="glyphicon glyphicon-edit"></span>
															</a>
														</td>
														
														<td>
															<a href="#" onclick="doDelete(${transfer.tid})" style="color:rgb(212,106,64)">
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
															<th>中转站信息：<input type="hidden" id="tid" name="tid"></th>
															<th></th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td><b>省份:</b></td>
															<td><input type="text" id="tprovince" name="tprovince" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>城市:</b></td>
															<td><input type="text" id="tcity" name="tcity" class="form-control"/></td>
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
				$("#editForm").attr("action","<%=basePath%>addtransfer.html");
			}else{	
				
				$("#editForm").attr("action","<%=basePath%>changetransfer.html");
				var customInfo = obj.parentNode.parentNode.childNodes;
				$("#tid").val(customInfo[1].innerText);
				$("#tprovince").val(customInfo[3].innerText);
				$("#tcity").val(customInfo[5].innerText);
			}
		}
	
		
		function doDelete(cuid){
			if(confirm("您确定要删除编号为："+cuid+" 的中转站吗？")){
				location.href="<%=basePath%>deletetransfer.html?tid="+cuid;
			}
		}
		
		
	</script>
</body>
</html>