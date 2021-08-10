<%--
  Created by IntelliJ IDEA.
  User: Зөндөө
  Date: 2021/6/6
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--左方工具栏开始--%>
<div class="side_bar dark_blue side_bg_img scroll_auto">
    <ul id="dc_accordion" class="sidebar-menu tree">

        <li class="menu_title">系统功能模块</li>
        <li class="menu_sub">
            <a href="#"> <i class="fa fa-bar-chart text-aqua"></i> <span>主页</span><span class="icon-arrow-down styleicon"></span></a>
            <ul class="down_menu">
                <li>
                    <a href="page/AdvertiseWall.jsp">天气</a>
                </li>
                <li>
                    <a href="page/calendar.jsp">日历</a>
                </li>
            </ul>
        </li>
        <li class="menu_sub">
            <a href="#"> <i class="fa"><img src="static/images/浏览.png" style="width: 19px;height:19px"></i> <span>浏览区</span><span class="icon-arrow-down styleicon"></span></a>
            <ul class="down_menu">
                <li>
                    <a href="manager/advertisementServlet?action=listAD">浏览全部</a>
                </li>
                <li>
                    <a href="page/queryADById.jsp">按用户浏览</a>
                </li>
                <li>
                    <a href="page/queryADBySN.jsp">按广告编号浏览<span class="badge badge-pill badge-success float-right">New</span></a>
                </li>
            </ul>
        </li>
        <li class="menu_sub">
            <a href="#"> <i class="fa"><img src="static/images/操作.png" style="width: 19px;height:19px"></i> <span>操作区</span> <span class="icon-arrow-down styleicon"></span> </a>
            <ul class="down_menu">
                <li>
                    <a href="page/insertAD.jsp">添加广告</a>
                </li>
                <li>
                    <a href="page/deleteAD.jsp">删除广告</a>
                </li>
                <li>
                    <a href="page/updateAD.jsp">更新广告<span class="badge badge-pill badge-info float-right">New</span> </a>
                </li>
            </ul>
        </li>
        <li class="menu_sub">
            <a href="#"> <i class="fa fa-bar-chart text-aqua"></i> <span>数据区</span><span class="badge badge-pill badge-danger float-right">New</span> </a>
            <ul class="down_menu">
                <li>
                    <a href="manager/advertisementServlet?action=queryADAndRegisterNum">广告墙数据</a>
                </li>
            </ul>
        </li>
        <li class="menu_sub">
            <a href="index.jsp"> <i class="fa "><img src="static/images/关于.png" style="width: 19px;height:19px"></i> <span>退出</span></a>
        </li>
    </ul>

</div>
<%--左方工具栏结束--%>

