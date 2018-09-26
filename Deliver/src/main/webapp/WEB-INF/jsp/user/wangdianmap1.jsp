<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>根据地址查询经纬度</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=GgrFAKlOiE1ExyIRXPSfdV2N87xyGQCv"></script>
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<style>
		#container {width: 100%;height:700px;}
		#aid{
			position:absolute;
			top:20%;
			left:30%;
		}
	</style> 
</head>
<body style="background:#CBE1FF">
		<div style="width:200px;heighy:200px;">
		<a id="aid" href="userorders1.html">返回上一层</a>
		</div>
        <div id="container" >
        	 
        </div>
        <a href="search.html">用户订单</a> 
</body>
<script type="text/javascript">
 	
	var arraycity = new Array(); 
	$.getJSON("<%=basePath%>getbranch.html",function(data){
		$.each(data,function(){
			arraycity.push(this.tprovince + this.tcity);
		});	
		main();
	});
	 var arraypoint = new Array();
	 var map = new BMap.Map("container");
	 map.centerAndZoom("南昌", 8);
	 var localSearch = new BMap.LocalSearch(map);
	 localSearch.enableAutoViewport(); //允许自动调节窗体大小
 	
	
	function addMarker(point){
		  var marker = new BMap.Marker(point);
		  map.addOverlay(marker);
		}
	
  
function searchByStationName(city) {
    localSearch.setSearchCompleteCallback(function (searchResult) {
        var poi = searchResult.getPoi(0);
       	point = new BMap.Point(poi.point.lng,poi.point.lat);
       	arraypoint.push(point);
       	addMarker(point);
    });
    
    localSearch.search(city);
} 
 	function main(){
		for(var i = 0 ; i < arraycity.length; i++){	
		searchByStationName(arraycity[i]);
	}}
</script>
</html>
