<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html> 
<head>
<title>Insert title here</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<jsp:include page="/part/table.js.css.jsp"></jsp:include>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />

<link rel="stylesheet" type="text/css" href="css/deliver.css"/>
<link rel="stylesheet" type="text/css" href="css/style3.css"/>
	


<style type="text/css">
.citys {
	margin-bottom: 10px;
}

.citys p {
	line-height: 28px;
}

.warning {
	color: #c00;
}

.main a {
	margin-right: 8px;
	color: #369;
}

.form_box {
	border-top: 2px solid grey;
	padding-top: 20px;
	margin-bottom: 50px;
	margin-left: 10px;
	max-width: 1000px;
}

.send_person {
	color: slategrey;
	font-size: 24px;
	margin-left: 10px;;
}

.form_btn {
	width: 140px;
	height: 40px;
	background: grey;
	color: white;
	float: left;
	font-size: 20px;
	margin-left: 200px;
}

.form_btn:hover {
	background: #219167;
	color: white;
}
.formStyle{
	max-width: 1000px;
	margin: 80px auto;
}
.formStyle form input{
	height: 35px;
}
.changeStyle .icon_head{
margin-top:10px;
}
</style>

</head> 
<body>
	<nav class="navbar navbar-default navbar-fixed-top changeStyle">
    <div class="container">
        <div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html"><h1><span class="fa fa-diamond icon_head" aria-hidden="true">Courier Store</span></h1></a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="index.html">首页</a></li>
				<li><a href="process.html">物业业务</a></li>
				<li class="active"><a href="form.html">在线寄件</a></li>
				<li><a href="search.html">物流追踪</a></li>
				<li class="dropdown">
					<a href="#" ></i> 登录</a>
				</li>
			</ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
	
	<div class="formStyle">
	<a href="#" onclick="editInfo"></a>
	<form class="form-horizontal" action="form.html" method="post" role="form"
	
		name="form" id="editForm" onsubmit="return myCheck(this)">
		<span class="send_person">寄件人信息</span>
		<div class="form_box">
			<fieldset>
				<div class="control-group">
					<label class="control-label" for="input01">寄件人姓名</label>
					<div class="controls">
						<input type="text" placeholder="请输入" id="sendname" name="sendname"
							class="input-xlarge">
						<p class="help-block"></p>
					</div> 
				</div>
				<div class="control-group">
					<label class="control-label" for="input01">寄件人联系方式</label>
					<div class="controls">
						<input type="text" placeholder="请输入"
							onkeyup="value=value.replace(/[^\d]/g,'')" id="sendphone"
							name="sendphone" class="input-xlarge">
						<p class="help-block"></p>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="input01">邮箱</label>
					<div class="controls">
						<input type="email" placeholder="请输入"
							id="sendpostcode" 
							name="sendpostcode" class="input-xlarge">
						<p class="help-block"></p>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="input01">地址</label>
					<div class="controls" id="demo2" class="citys">
						<div id="demo2" class="citys">
							<p>
								<select name="province"></select>
							    <select name="city"></select>
								<select name="area"></select>
							</p>							
							<input id="sendadd" name="sendadd" style="display: none;">
							<input id="startadd" name="startadd" style="display: none;">
						</div>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">详细地址</label>
					<div class="controls">
						<textarea style="width: 600px; height: 80px;" type=" " class=" "
							id="senddetailadd" name="senddetailadd"> </textarea>

					</div>
			</fieldset>
		</div>
		<span class="send_person"> 收件人信息</span>
		<div class="form_box">
			<fieldset>
				<div class="control-group">
					<label class="control-label" for="input01">收件人姓名</label>
					<div class="controls">
						<input type="text" placeholder="请输入" id="acceptname"
							name="acceptname" class="input-xlarge">
						<p class="help-block"></p>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="input01">收件人联系方式</label>
					<div class="controls">
						<input type="text" placeholder="请输入" onkeyup="value=value.replace(/[^\d]/g,'')"
							onkeyup="value=value.replace(/[^\d]/g,'')" id="acceptphone"
							name="acceptphone" class="input-xlarge">
						<p class="help-block"></p>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="input01">邮箱</label>
					<div class="controls">
						<input type="email" placeholder="请输入"  id="acceptpostcode"
							name="acceptpostcode" class="input-xlarge">
						<p class="help-block"></p>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="input01">地址</label>
					<div class="controls">
						<div id="demo3" class="citys">
							<p>
								<select name="province"></select> 
								<select name="city"></select>
								<select name="area"></select>
							</p>
							<input id="acceptadd" name="acceptadd" style="display: none">
							<input id="endadd" name="endadd" style="display: none">
						</div>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">详细地址</label>
					<div class="controls">
						<textarea style="width: 600px; height: 80px;" id="acceptdetailadd"
							name="acceptdetailadd" > </textarea>
					</div>
			</fieldset>
		</div>
		<span class="send_person"> 其他信息</span>
		<div class="form_box">
			<fieldset>
				<div class="control-group">
					<label class="control-label" for="input01">物品种类</label>
					<div class="controls">
						<select id="type" name="type" class="form-control">
							<option>日用品</option>
							<option>服装</option>
							<option>家电</option>
							<option>数码产品</option>
							<option>食品</option>
						</select>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="input01">物品重量</label>
					<div class="controls">
						<input type="text" placeholder="请输入"
							onkeyup="value=value.replace(/[^\d]/g,'')" id="weight"
							name="weight" class="input-xlarge">
						<p class="help-block"></p>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="input01">是否保价</label>
					<div class="controls">
						<select id="select1" class="form-control" >
							<option value="1">保价</option>
							<option value="2">不保价</option>
						</select>
						<input  id="isinsurance" name="isinsurance" style="display: none" >
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="input01">保价金额</label>
					<div class="controls">
						<input type="number" placeholder="请输入数字"
							onkeyup="value=value.replace(/[^\d]/g,'')" id="insuranceprice"
							name="insuranceprice" class="input-xlarge">
						<p class="help-block"></p>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="input01">支付方式</label>
					<div class="controls">
						<select class="form-control" id="select2">
							<option value="1">在线付款</option>
							<option value="2">现结</option>
						</select>
						<input id="payment" name="payment" style="display: none" >
					</div>
				</div>
			</fieldset>
		</div>
		<button type="submit" id="mage_form_submit" class="form_btn">提交</button>
	</form>
	</div>
	</div></div>
	<script type="text/javascript">
	
	   var nickname = '${user.nickname}';
	   $(" input[ name='sendname' ] ").val(nickname);

	   var userphone = '${user.userphone}';
	   $(" input[ name='sendphone' ] ").val(userphone);
	   
	   var postcode = 350000;
	   $(" input[ name='sendpostcode' ] ").val(postcode);
	   
	   
	   var senddetailadd = '集美软件园三期';
	   $(" textarea[ name='senddetailadd' ] ").val(senddetailadd);
	  
		$('#demo2').citys({
			required: false, 
			nodata: 'disabled',
			onChange: function(data) {
				var text = data['direct'] ? '(直辖市)' : '';
				  $('#sendadd').val(data['province']+text+' '+data['city']+' '+data['area']);
		          $('#startadd').val(data['province']);
			}
		});
		$('#demo3').citys({
			required: false,
			nodata: 'disabled',
			onChange: function(data) {
				var text = data['direct'] ? '(直辖市)' : '';
				$('#acceptadd').val(data['province']+text+' '+data['city']+' '+data['area']);
				$('#endadd').val(data['province']);
			}
		});
		 $("#mage_form_submit").click(function(){
		    	/* alert("跳转了哈！"); */
				$("#editForm").attr("action","<%=basePath%>addorders.html");
		});
		 function myCheck(form)
	      {
			 var option1=$("#select1 option:selected");
			 var s1=option1.val();
			 $('#isinsurance').val(s1);
			 var option2=$("#select2 option:selected");
			 var s2=option2.val();
			 $('#payment').val(s2);
			 
			 if(form.sendname.value==''||form.sendname.value==null){
				 alert('寄件人姓名不能为空！');
				 form.sendname.focus();
				 return false;
				 }
			 if(form.sendphone.value==''||form.sendphone.value==null){
				 alert('寄件人联系方式不能为空！');
				 form.sendphone.focus();
				 return false;
				 }
			 if(form.sendpostcode.value==''||form.sendpostcode.value==null){
				 alert('寄件人邮编不能为空！');
				 form.sendpostcode.focus();
				 return false;
				 }
			 if(form.sendadd.value==''||form.sendadd.value==null){
				 alert('寄件人地址不能为空！');
				 return false;
				 } 
			 if(form.senddetailadd.value==''||form.senddetailadd.value==null){
				 alert('寄件人详细地址不能为空！');
				 form.sendname.focus();
				 return false;
				 }
			 if(form.acceptname.value==''||form.acceptname.value==null){
				 alert('收件人姓名不能为空！');
				 form.acceptname.focus();
				 return false;
				 }
			 if(form.acceptphone.value==''||form.acceptphone.value==null){
				 alert('收件人联系方式不能为空！');
				 form.sendname.focus();
				 return false;
				 }
			 if(form.acceptpostcode.value==''||form.acceptpostcode.value==null){
				 alert('收件人邮编不能为空！');
				 form.acceptpostcode.focus();
				 return false;
				 }
			 if(form.acceptadd.value==''||form.acceptadd.value==null){
				 alert('收件人地址不能为空！');
				 return false;
				 } 
			 if(form.acceptdetailadd.value==''||form.acceptdetailadd.value==null){
				 alert('收件人详细地址不能为空！');
				 form.sendname.focus();
				 return false;
				 }
			 var options=$("#isinsurance option:selected");
			 var s=options.text();
			 if(s=="1"){
				 if(form.insuranceprice.value==''||form.insuranceprice.value==null){
					 alert('保价金额不能为空！');
					 form.insuranceprice.focus();
					 return false;
					 }
			 }
			 if(form.weight.value==''||form.weight.value==null){
				 alert('货品重量不能为空！');
				 form.weight.focus();
				 return false;
				 }
	      }
	</script>
</body>
</html>