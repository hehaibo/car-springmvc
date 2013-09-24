<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
body{ margin:0px; padding:0px;font-family:Arial, Helvetica, sans-serif; background-color:#FFF;}
.login_imgbg3{
	width:100%;
	height:38px;
	background:url(<%=basePath%>/style/images/demo/login/login_bg.png);}

.login_head{
	height:38px;
	background-position:0 -34px;
	background-repeat:repeat-x;
}

.login_head_logo{
	float:left;
	background-position:0 0px;
	width:200px; 
	height:17px;
	margin:9px 0px 0px 12px;}

.login_box{
    width:840px;
    margin:120px auto auto auto;
	height:315px;}

.login_box ul{
	float:left;
	margin:0px;
	padding:0px;
	list-style-type:none; }

.login_box li{
    text-indent:27px;
	color:#5c5b5b;}

.login_box .li14{
    font-size:14px;
	line-height:50px;}

.login_box .li12{
    font-size:12px;
	line-height:50px;}

.login_box .red{
    font-size:12px;
	line-height:50px;
	color:#F00;
	float:left;
	margin:30px auto auto 150px;
	position:absolute;}

.login_box_sign{
    float:left;
	width:380px;
	height:250px;
	background-color:#f2f7fa;
	border:1px solid #d8dde1;}

.login_box_sign h1{
    font-size:28px;
	font-family:'黑体';
	color:#777777;
	text-indent:20px;
	*margin-top:20px;
}

.login_box_sign .sign100{
    width:100%;
	float:left;}

.login_box_sign .input{
    width:263px;
	height:32px;
	border:1px solid #a0a0a0;
	background-position:0 -121px;
	font-size:14px;
	color:#555555;
	text-indent:5px;
	line-height:32px;}


.login_box_sign .submit{
    width:98px;
	height:32px;
	background-position:0 -81px;
	text-align:center;
	font-size:14px;
	font-weight:bold;
	color:#333;
	border:0px;
	cursor:pointer;
	line-height:32px;
	margin-left:56px;}

.login_box_bottom{
    background-position:0 -192px;
	width:382px;
	height:68px;}

.login_footer{
	width:840px;
	line-height:30px;
	margin:20px auto 10px auto;
	font-size:12px;
	color:#666;
	text-align:center;
	border-top:1px solid #cdcdcd;}

</style>
<title>学习系统</title>
</head>
<body>
	<!--head begin-->
	<div class="login_head login_imgbg3">
	  <div class="login_head_logo login_imgbg3" onclick="location='#'"></div>
	</div>
<!--head end-->
	<!--body begin-->
	<div class="login_box">
 		 	<ul><img src="<%=basePath%>/style/images/demo/login/login_s.gif"  border="0" /></ul>
		 	<ul>
			  	<div class="login_box_sign">
				  <form action="<%=basePath%>/demo/doLogin.do" method="post" id="loginForm">
					 <ul class="sign100"><h1>登录</h1></ul>
					 <ul class="sign100">
						<li class="sign100 li14">登录账号：
							<input class="input" type="text" id="loginId" name="loginId"  value="" />
						</li>
						<li class="sign100 li14">登录密码：
							<input class="input" type="password" id="loginPwd" name="loginPwd" value="" />
						</li>
						<li class="sign100 li12">
							<input type="submit" class="submit login_imgbg3" name="event_submit_do_login" value="登录" id="submit_login"/>
						</li>
					 </ul>
					</form>
			   </div>
		   	</ul>
   			<ul class="login_box_bottom login_imgbg3"></ul>
	</div>
	<!-- body end-->
	<!-- footer begin-->
	<div class="login_footer">©2011-2013 He Hai bo版权所有</div>
	<!-- footer end-->
</body>
</html>