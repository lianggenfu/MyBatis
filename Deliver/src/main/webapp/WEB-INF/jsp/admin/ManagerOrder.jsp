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
												<th>用户名称</th>
												<th>接收者名称</th>
												<th>订单金额</th>
												<th>寄出地址</th>
												<th>目的地址</th>
												<th>订单状态</th>
												<th>修改</th>
												
											</tr>
										</thead>
										<tbody>
											<c:if test="${not empty list }">
												<c:forEach items="${list }" var="orderinfo">
													<tr>
														<td>${orderinfo.deliveryid}</td>
														<td>${orderinfo.sendname}</td>
														<td>${orderinfo.acceptname}</td>
														<td>${orderinfo.money}</td>
													    <td>${orderinfo.sendadd}</td>
														<td>${orderinfo.acceptadd}</td>
														<c:if test="${orderinfo.status eq 1 }">
														<td>待付款</td>
														</c:if>
															<c:if test="${orderinfo.status eq 2 }">
														<td>待揽件</td>
														</c:if>
															<c:if test="${orderinfo.status eq 3 }">
														<td>运输中</td>
														</c:if> 
															<c:if test="${orderinfo.status eq 4 }">
										     			<td>派件中</td> 
														</c:if>
															<c:if test="${orderinfo.status eq 5 }">
														<td>已取件</td>
														</c:if>
														<td>
															<a href="#" data-toggle="modal" data-target="#myModal" onclick="editInfo(this,1)">
																<span class="glyphicon glyphicon-edit"></span>
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
															<th>订单信息：<input type="hidden" id="deliveryid" name="deliveryid"></th>
															<th></th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td><b>寄件人姓名:</b></td>
															<td><input type="text" id="sendname" name="sendname" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>收件人姓名:</b></td>
															<td><input type="text" id="acceptname" name="acceptname" class="form-control"/></td>
														</tr>												
														<tr>
															<td><b>目的地址:</b></td>
															<td><input type="text" id="acceptadd" name="acceptadd" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>订单状态:</b></td>
															<td>
																<select name="status">																
																<option value=1>待付款</option>
																<option value=2>待揽件</option>
																<option value=3>运输中</option>
																<option value=4>派件中</option>
																<option value=5>已取件</option>
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
	<script type="text/javascript">
		function editInfo(obj,type){			
			if(type==0){
				alert("厉害了，怎么按到的");
			}else{		
				$("#editForm").attr("action","<%=basePath%>changeorder.html");
				var customInfo = obj.parentNode.parentNode.childNodes;
				$("#deliveryid").val(customInfo[1].innerText);
				$("#sendname").val(customInfo[3].innerText);
				$("#acceptname").val(customInfo[5].innerText);	
				$("#acceptadd").val(customInfo[11].innerText);
				$("#status").val(customInfo[13].innerText);
			}
		}
		
		<%-- function doDelete(cuId){
			if(confirm("您确定要删除编号为："+cuId+" 的订单吗？")){
				location.href="<%=basePath%>removeorder.html?deliveryid="+cuId;
			}
		} --%>
		
		
	</script>
</body>
</html>