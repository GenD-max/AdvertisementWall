<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
	<meta charset="utf-8">
	<%@ include file="/common/dynamic-address.jsp"%>
	<!-- 设置favicon.ico图标 -->
	<link rel="icon" type="image/x-icon" href="static/images/ico.png" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>删除广告</title>

	<!-- google font -->
	<link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet" type="text/css" />
	<link href="static/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="static/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="static/css/ionicons.css" rel="stylesheet" type="text/css">
	<link href="static/css/simple-line-icons.css" rel="stylesheet" type="text/css">
	<link href="static/css/jquery.mCustomScrollbar.css" rel="stylesheet">
	<link href="static/css/weather-icons.min.css" rel="stylesheet">
	<!--Morris Chart -->
	<link rel="stylesheet" href="static/js/index/morris-chart/morris.css">
	<link href="static/css/style-ad.css" rel="stylesheet">
	<link href="static/css/style.css" rel="stylesheet">
	<link href="static/css/responsive.css" rel="stylesheet">
</head>

<body>
<div id="loader_wrpper">
	<div class="loader_style"></div>
</div>

<div class="wrapper">
	<%@ include file="/common/up-toolbar.jsp"%>
	<!-- Content_right -->
	<div class="container_full">

		<%@ include file="/common/left-toolbar.jsp"%>
		<div class="content_wrapper">
			<div class="container-fluid">
				<!-- breadcrumb -->
				<div class="page-heading">
					<div class="row d-flex align-items-center">
						<div class="col-12">
							<div class="page-breadcrumb">
								<h1>主页</h1>
							</div>
						</div>
						<div class="col-12  d-md-flex">
							<div class="breadcrumb_nav">
								<ol class="breadcrumb">
									<li>
										<i class="fa fa-home"></i>
										<a class="parent-item" href="page/deleteAD.jsp">操作区</a>
										<i class="fa fa-angle-right"></i>
									<li class="active">删除广告</li>
								</ol>
							</div>
						</div>
					</div>
				</div>
				<!-- breadcrumb_End -->

				<!-- Section -->
				<div class="container-fluid">
					<form action="manager/advertisementServlet" method="post">
						<input type="hidden" name="action" value="deleteADBySN">
						<div class="col-12 form-group pull-right top_search" style="">
							<div style="height: 375px;">
							<div class="input-group" style="width: 90%">
								<input type="text" name="serialNumber" value="" class="form-control" placeholder="输入您要删除的广告序列号...">
								<span style="height: 14px" class="input-group-btn">
									<button  class="btn btn-default" type="submit" >删除</button>
								</span>
							</div>
							</div>
						</div>
					</form>
				</div>
				<!-- Section_End -->

			</div>
		</div>
	</div>
	<!-- Content_right_End -->
	<%@ include file="/common/down-toolbar.jsp"%>
</div>
<script type="text/javascript" src="static/js/jquery.min.js"></script>
<script type="text/javascript" src="static/js/popper.min.js"></script>
<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="static/js/jquery.mCustomScrollbar.concat.min.js"></script>

<!--Morris Chart-->
<script src="static/js/index/morris-chart/morris.js"></script>
<script src="static/js/index/morris-chart/raphael-min.js"></script>
<!--morris chart initialization-->
<script src="static/js/index/morris-chart/morris-init.js"></script>
<!--chartjs Total Profit,New Orders,Yearly Revineue,New Users-->
<script src="static/js/Chart.min.js"></script>
<script src="static/js/chartjs-init.js"></script>

<script type="text/javascript" src="static/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="static/js/custom.js" type="text/javascript"></script>

</body>

</html>
