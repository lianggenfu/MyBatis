<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>

		<link rel="stylesheet" type="text/css" href="assets/css/cssreset-min.css">
		<link rel="stylesheet" type="text/css" href="assets/css/common.css">
		<link href="http://cdn.bootcss.com/twitter-bootstrap/2.0.4/css/bootstrap.min.css" rel="stylesheet">
		<link href="http://cdn.bootcss.com/twitter-bootstrap/2.0.4/css/bootstrap-responsive.min.css" rel="stylesheet">
		<script type="text/javascript" src="assets/js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.citys.js"></script>
        <jsp:include page="/part/table.js.css.jsp"></jsp:include>

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
				max-width: 800px;
			}
			.send_person{
				color:slategrey;
				font-size: 24px;
				margin-left: 10px;;
			}
			.form_btn{
				width:140px;
				height: 40px;
				background:grey;
				color:white;
				float:left;
				font-size:20px;
				margin-left:200px;
			}
			.form_btn:hover{
				background:#219167;
				color:white;
			}
			
					</style>

	</head>

	<body>
		<form class="form-horizontal">
			<span class="send_person">寄件人信息</span>
			<div class="form_box">
				<fieldset>
					<div class="control-group">
						<label class="control-label" for="input01">寄件人姓名</label>
						<div class="controls">
							<input type="text" placeholder="请输入" class="input-xlarge">
							<p class="help-block"></p>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="input01">寄件人联系方式</label>
						<div class="controls">
							<input type="text" placeholder="请输入" class="input-xlarge">
							<p class="help-block"></p>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="input01">邮编</label>
						<div class="controls">
							<input type="text" placeholder="请输入" class="input-xlarge">
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
							</div>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">详细地址</label>
						<div class="controls">
							<div class="textarea">
								<textarea style="width:600px;height: 80px; " type=" " class=" "> </textarea>
							</div>
						</div>
				</fieldset>
				</div>
				<span class="send_person"> 收件人信息</span>
				<div class="form_box">
					<fieldset>
						<div class="control-group">
							<label class="control-label" for="input01">收件人姓名</label>
							<div class="controls">
								<input type="text" placeholder="请输入" class="input-xlarge">
								<p class="help-block"></p>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input01">收件人联系方式</label>
							<div class="controls">
								<input type="text" placeholder="请输入" class="input-xlarge">
								<p class="help-block"></p>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input01">邮编</label>
							<div class="controls">
								<input type="text" placeholder="请输入" class="input-xlarge">
								<p class="help-block"></p>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input01">地址</label>
							<div class="controls" id="demo2" class="citys">
								<div id="demo3" class="citys">
									<p>
										<select name="province"></select>
										<select name="city"></select>
										<select name="area"></select>
									</p>
								</div>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">详细地址</label>
							<div class="controls">
								<div class="textarea">
									<textarea style="width:600px;height: 80px; " type=" " class=" "> </textarea>
								</div>
							</div>
					</fieldset>
					</div>
					<span class="send_person"> 其他信息</span>
					<div class="form_box">
						<fieldset>
						<div class="control-group">
							<label class="control-label" for="input01">物品种类</label>
							<div class="controls">
								<input type="text" placeholder="请输入" class="input-xlarge">
								<p class="help-block"></p>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input01">物品重量</label>
							<div class="controls">
								<input type="text" placeholder="请输入" class="input-xlarge">
								<p class="help-block"></p>
							</div>
						</div>
						</fieldset>
					</div>
					<button type="submit" id="mage_form_submit" class="form_btn">提交</button>
		</form>
	</body>
	<script type="text/javascript ">
		
	</script>

</html>