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
	<title>根据起终点名称驾车导航</title>
</head>
<body>
	<div id="allmap"></div>
	<input type="button" id="dianji" value="点击"/><br>	
	<lable id="timeandlong"></lable><br>
	<a href="userorders1.html">用户订单</a> 
</body>
</html>
<script type="text/javascript">
	// 百度地图API功能
	var array1 = new Array();
	var citylist1 = '${citylist}';
	var citylist = citylist1.substring(1,citylist1.length-1);
	array1 = citylist.split(","); 
	array2 = $.extend(true, [], array1);
	array2.pop();//删除最后一个元素
	array2.shift();//删除首个元素
	var output = "";

	var map = new BMap.Map("allmap");
	var end = array1[array1.length-1];
	var i = 0;
	var startIcon = new BMap.Icon("<%=basePath %>img/kuaidi2.png",new BMap.Size(100,125));
	map.centerAndZoom(new BMap.Point(116.404, 39.915), 11);
	//三种驾车策略：最少时间，最短距离，避开高速
	var routePolicy = [BMAP_DRIVING_POLICY_LEAST_TIME,BMAP_DRIVING_POLICY_LEAST_DISTANCE,BMAP_DRIVING_POLICY_AVOID_HIGHWAYS];
	$(function(){
		
		map.clearOverlays(); 
		search(array1[0],end,routePolicy[i],array2);
		$('#dianji').click(function(){
			i++;
			if(i==1)
				{
				$.getJSON("<%=basePath%>changemap.html",function(data){
				});	
				}
			if(i < array1.length-1){
				array2.shift();
			map.clearOverlays(); 
			search(array1[i],end,0,array2);	
			if(i==array1.length-2){
		
				alert("已到达站点，正在等待骑手揽件");
			}
			}
			else{
				alert("已到达站点，正在等待骑手揽件");
			}
		});
		
	});
	
	var searchComplete = function (results){
		if (driving.getStatus() != BMAP_STATUS_SUCCESS){
			return ;
		}
		var plan = results.getPlan(0);
		output = "还需大约：";
		output += plan.getDuration(true) + "\n";                //获取时间
		output += ",距离大约：" ;
		output += plan.getDistance(true) + "\n";             //获取距离
		alert(output);
	}
	
	 var driving = new BMap.DrivingRoute(map, {renderOptions:{map: map, autoViewport: true},
		    onSearchComplete: searchComplete, 
			onPolylinesSet: function(){   
				if(i>array1.length-3)
					{
					$("#timeandlong").html("正在等待快递员揽件,如揽件成功"+output);
					}
				else{
				$("#timeandlong").html(output);}
			}
	    });
	
	 function search(start,end,route,arrayccity){ 
	
	 driving.search(start, end,{waypoints:arrayccity});
	 driving.setMarkersSetCallback(function(result){
	 	result[0].marker.setIcon(startIcon);    	
	 });
		    
}
</script>
