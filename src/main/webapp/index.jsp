<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <%@ include file="/common/dynamic-address.jsp"%>
    <title>Login</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 设置favicon.ico图标 -->
    <link rel="icon" type="image/x-icon" href="static/images/ico.png" />
<!--如果使用服务器部署，后面的路径均要以webapp为起始地址-->

    <!--图标-->
    <link rel="stylesheet" type="text/css" href="static/css/font-awesome.min.css">

    <!--布局框架-->
    <link rel="stylesheet" type="text/css" href="static/css/util.css">

    <!--主要样式-->
    <link rel="stylesheet" type="text/css" href="static/css/main.css">
    <script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>
</head>

<body>

<div class="login">
    <div class="container-login100">
        <div class="wrap-login100">
            <div class="login100-pic js-tilt" data-tilt>
                <img src="static/images/img-01.png" alt="IMG">
            </div>

            <div class="login100-form validate-form">
				<span class="login100-form-title">
                    广告墙 Advertising Wall
				</span>

            <!--web服务层获取账号信息-->
            <form class="login100-form validate-form" action="userServlet" method="post" >
                <input type="hidden" name="action" value="login" />
                <%--需要隐藏区域确定login还是register--%>

                <%--信息提示--%>
                <span style="margin-left: auto">
                    ${ empty requestScope.msg?"":requestScope.msg}
                </span>

                <div class="wrap-input100 validate-input">
                    <input class="input100" type="text" name="id" value="<%=request.getAttribute("id")==null?"":request.getAttribute("id")%>" placeholder="ID">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
						<i class="fa fa-envelope" aria-hidden="true"></i>
					</span>
                </div>
                <div class="wrap-input100 validate-input">
                    <input class="input100" type="password" name="password" value="" placeholder="password">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
						<i class="fa fa-lock" aria-hidden="true"></i>
					</span>
                </div>

                <div class="container-login100-form-btn">
                    <input class="login100-form-btn" type="submit" value="登陆" >

                </div>

                <div class="text-center p-t-12">
                    <a class="txt2" href="javascript:">
                        忘记密码？
                    </a>
                </div>

                <div class="text-center p-t-136">
                    <a class="txt2" href="page/register.jsp" target="_blank">
                        还没有账号？立即注册
                        <i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
                    </a>

                </div>
            </form>

            </div>
        </div>
    </div>
</div>

</body>
</html>