<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<body>
	<!--导航栏class="active-menu-->
	<nav class="navbar-default navbar-side" role="navigation">
	<div class="sidebar-collapse">
	<ul class="nav" id="main-menu">
		<li><a href="<%=basePath %>showprice.html">
		<i class="fa fa-signal"></i>价格管理</a></li>
		
		<li><a href="<%=basePath %>showuser.html">
		<i class="fa fa-align-justify"></i>客户管理 </a></li>
		
		<li><a href="<%=basePath %>orderlist.html">
		<i class="fa fa-desktop"></i>订单管理</a></li>
		
		<li><a href="<%=basePath %>showcourier.html">
		<i class="fa fa-signal"></i>骑手管理</a></li>
		
		<li><a href="<%=basePath %>showclaimlist.html">
		<i class="fa fa-signal"></i>理赔管理</a></li>
		
		<li><a href="<%=basePath %>showalltransfer.html">
		<i class="fa fa-signal"></i>中转站管理</a></li>
	</ul>
	</div>
	</nav>
	</body>
</html>
