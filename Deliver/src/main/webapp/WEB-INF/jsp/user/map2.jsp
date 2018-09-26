<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	
%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<style type="text/css">
		body, html {width: 100%;height: 100%; margin:0;font-family:"微软雅黑";}
		#allmap{height:700px;width:100%;}
		#r-result,#r-result table{width:100%;}
	</style>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=GgrFAKlOiE1ExyIRXPSfdV2N87xyGQCv"></script>
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<title>骑手配送中</title>
</head>
<body>
	<div id="allmap"></div>
	<input type="button" id="dianji" value="点击"/><br>
	<lable id="timeandlong"></lable></br>
	<a href="userorders1.html">用户订单</a> 
</body>
</html>
<script type="text/javascript">
	// 百度地图API功能
	var array1 = new Array();
	var citylist1 = '${citylist}';
	var citylist = citylist1.substring(1,citylist1.length-1);
	array1 = citylist.split(","); 
	var start = array1[array1.length-2];
	var end = array1[array1.length-1];


	var map = new BMap.Map("allmap");
	var end = array1[array1.length-1];
	var i = 0;
	var startIcon = new BMap.Icon("<%=basePath %>img/kuaidi2.png",new BMap.Size(100,125));
	map.centerAndZoom(new BMap.Point(116.404, 39.915), 11);

	$(function(){
		//alert("骑手已经揽件，主人，我们马上要见面了，好开心");
		map.clearOverlays(); 
		search(start,end,0);
		$('#dianji').click(function(){
			map.clearOverlays(); 
			search(end,end,0);		
			alert("主人，我到了,快递员会联系你的");
			$.getJSON("<%=basePath%>mapemail.html",function(data){
			});	
			$.getJSON("<%=basePath%>changemap.html",function(data){
			});	
			$(this).css("display","none");
		});
		
	});
	 var driving = new BMap.DrivingRoute(map, {renderOptions:{map: map, autoViewport: true}
	    });
    function search(start,end,route){ 
   
    driving.search(start, end);
    driving.setMarkersSetCallback(function(result){
    	result[0].marker.setIcon(startIcon);    	
    });

    
}
</script>
