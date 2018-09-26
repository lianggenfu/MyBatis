<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<jsp:include page="/part/manager.js.jsp"></jsp:include>
</head>


<body>


	<div id="wrapper" style="float: left; width: 880px; margin-top: 60px;">
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
					<div class="panel panel-default">
						<div class="panel-heading">
							<font size="4">我的订单</font> <a href="<%=basePath%>showorder.html">
								<span class="glyphicon glyphicon-repeat"></span>
							</a>
						</div>
						<div class="panel-body">
							<div class="table-responsive">
								<table class="table table-striped table-bordered table-hover"
									id="dataTables-example">
									<thead>
										<tr>
											<th>单号</th>
											<th>寄件人</th>
											<th>收件人</th>
											<th>始发地</th>
											<th>到达地</th>
											<th>是否保价</th>
											<th>申请理赔</th>

										</tr>
									</thead>
									<tbody>
										<c:if test="${not empty list}">
											<c:forEach items="${list}" var="item">
												<tr>
													<td height="65"><a href="#"
														onclick="showOrderdetail(${item.deliveryid})">${item.deliveryid }</a></td>
													<td>${item.sendname }</td>
													<td>${item.acceptname }</td>
													<td>${item.sendadd }</td>
													<td>${item.acceptadd }</td>
													<c:if test="${item.isinsurance ==1}">
														<td>已保价</td>
														<td><a
															href="<%=basePath%>user/writeinsurance.jsp?deliveryid=${item.deliveryid}"
															data-toggle="modal" data-target="#myModal"> <span
																class="glyphicon glyphicon-edit"></span>
														</a></td>
													</c:if>
													<c:if test="${item.isinsurance ==2}">
														<td>未保价</td>
													</c:if>

												</tr>
											</c:forEach>
										</c:if>
										<c:if test="${empty list}">
											<p>您现在还没有下过单哟</p>

										</c:if>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" 
										aria-hidden="true">×</button>
									<!-- 表单嵌套表格：规范表单格式 -->

									<form class="form-horizontal"  enctype="multipart/form-data">
										<fieldset>
											<div class="control-group">

												<!-- Text input-->
												<label class="control-label" for="input01">联系方式</label>
												<div class="controls">
													<input type="text" placeholder="请输入" class="input-xlarge">
													<p class="help-block"></p>
												</div>
											</div>

											<div class="control-group">

												<!-- Textarea -->
												<label class="control-label">申请理由</label>
												<div class="controls">
													<div class="textarea">
														<textarea type="" class=""> </textarea>
													</div>
												</div>
											</div>

											<div class="control-group">
												<label class="control-label">图片</label>
												<!-- File Upload -->
												<div class="controls">
													<input class="input-file" id="fileInput" type="file">
												</div>
											</div>

											<div class="control-group">
												<label class="control-label"></label>

												<!-- Button -->
												<div class="controls">
													<button class="btn btn-success">提交申请</button>
												</div>
											</div>

										</fieldset>
									</form>
								</div>
							</div>
						</div>
						<!-- /.modal-dialog -->
					</div>


				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
    function showOrderdetail(a){
    	alert(a);
    	location.href="showorderdetail.html?deliveryid="+a;
    }

</script>
</body>
</html>