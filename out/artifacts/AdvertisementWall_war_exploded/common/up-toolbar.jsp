<%--
  Created by IntelliJ IDEA.
  User: Зөндөө
  Date: 2021/6/6
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="main-header">
    <div class="container_header">
        <div class="logo d-flex align-items-center">
            <a href="page/AdvertiseWall.jsp"> <strong class="logo_icon"> <img src="static/images/广告牌2.png" alt=""> </strong>
                <span class="logo-default" style="width: 10em;height: 3.75em;margin-top: 2.4em">
							<img src="static/images/广告牌.png" alt="" > </span> </a>
            <div class="icon_menu full_menu">
                <a class="menu-toggler sidebar-toggler"></a>
            </div>
        </div>
        <div class="right_detail">
            <div class="row d-flex align-items-center min-h pos-md-r">
                <div class="col-3 search_col ">
                    <div class="top_function">

                        <div class="search">
                            <a id="toggle_res_search" data-toggle="collapse" data-target="#search_form" class="res-only-view collapsed"
                               href="javascript:void(0);" aria-expanded="false"> <i class=" icon-magnifier"></i> </a>
                            <form id="search_form" role="search" class="search-form collapse" action="#">
                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="Search...">
                                    <button type="button" class="btn" data-target="#search_form" data-toggle="collapse" aria-label="Close">
                                        <i class="ion-android-search"></i>
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class=" col-9 d-flex justify-content-end">
                    <div class="right_bar_top d-flex align-items-center">

                        <!-- DropDown_Inbox -->
                        <div class="dropdown dropdown-inbox">
                            <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                            </a>
                            <ul class="dropdown-menu scroll_auto height_fixed">
                                <li class="bigger">
                                    <h3><span class="bold">Messages</span></h3>
                                    <span class="notification-label">New 2</span>
                                </li>
                                <li>
                                    <ul class="dropdown-menu-list">
                                        <li>
                                            <a href="#"> <span class="photo"> <img src="static/images/about-1.jpg" class="img-circle" alt=""> </span>
                                                <span class="subject"> <span class="from"> Sarah Smith </span> <span class="time">Just Now </span> </span>
                                                <span class="message"> Jatin I found you on LinkedIn... </span> </a>
                                        </li>
                                        <li>
                                            <a href="#"> <span class="photo"> <img src="static/images/about-1.jpg" class="img-circle" alt=""> </span>
                                                <span class="subject"> <span class="from"> Sarah Smith </span> <span class="time">Just Now </span> </span>
                                                <span class="message"> Jatin I found you on LinkedIn... </span> </a>
                                        </li>
                                        <li>
                                            <a href="#"> <span class="photo"> <img src="static/images/about-1.jpg" class="img-circle" alt=""> </span>
                                                <span class="subject"> <span class="from"> Sarah Smith </span> <span class="time">Just Now </span> </span>
                                                <span class="message"> Jatin I found you on LinkedIn... </span> </a>
                                        </li>
                                        <li>
                                            <a href="#"> <span class="photo"> <img src="static/images/about-1.jpg" class="img-circle" alt=""> </span>
                                                <span class="subject"> <span class="from"> Sarah Smith </span> <span class="time">Just Now </span> </span>
                                                <span class="message"> Jatin I found you on LinkedIn... </span> </a>
                                        </li>
                                        <li>
                                            <a href="#"> <span class="photo"> <img src="static/images/about-1.jpg" class="img-circle" alt=""> </span>
                                                <span class="subject"> <span class="from"> Sarah Smith </span> <span class="time">Just Now </span> </span>
                                                <span class="message"> Jatin I found you on LinkedIn... </span> </a>
                                        </li>
                                        <li>
                                            <a href="#"> <span class="photo"> <img src="static/images/about-1.jpg" class="img-circle" alt=""> </span>
                                                <span class="subject"> <span class="from"> Sarah Smith </span> <span class="time">Just Now </span> </span>
                                                <span class="message"> Jatin I found you on LinkedIn... </span> </a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <!--DropDown_Inbox_End -->
                        <!-- Dropdown_User -->
                        <div class="dropdown dropdown-user">
                            <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"
                               aria-expanded="true"> <img class="img-circle pro_pic" src="static/images/about-1.jpg" alt=""></a>
                            <ul class="dropdown-menu dropdown-menu-default">
                                <li>
                                    <a href="#"> <i class="icon-user"></i> Profile </a>
                                </li>
                                <li>
                                    <a href="#"> <i class="icon-settings"></i> Settings </a>
                                </li>
                                <li>
                                    <a href="#"> <i class="icon-directions"></i> Help </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="lock_screen.jsp"> <i class="icon-lock"></i> Lock </a>
                                </li>
                                <li>
                                    <a href="#"> <i class="icon-logout"></i> Log Out </a>
                                </li>
                            </ul>
                        </div>
                        <!-- Dropdown_User_End -->
                    </div>
                </div>
            </div>
        </div>
    </div>

</header>
