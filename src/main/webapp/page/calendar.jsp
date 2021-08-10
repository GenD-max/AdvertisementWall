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
  <title>日历</title>
  <script>
    addEventListener("load", function () {
      setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
      window.scrollTo(0, 1);
    }
  </script>

  <link rel="stylesheet" type="text/css" href="static/css/pignose.calender.css" />
  <link href="static/css/widgets.css" rel="stylesheet">
  <!--web-fonts-->
  <link href="//fonts.googleapis.com/css?family=Poiret+One" rel="stylesheet">
  <link href="//fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
  <!--//web-fonts-->
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

  <link href="static/css/style.css" rel="stylesheet">
  <link href="static/css/responsive.css" rel="stylesheet">
</head>

<body>
<div id="loader_wrpper">
  <div class="loader_style"></div>
</div>

<div class="wrapper">
  <%@ include file="/common/up-toolbar.jsp"%>
  <!-- header_End -->
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
                    <a class="parent-item" href="page/calendar.jsp">主页</a>
                    <i class="fa fa-angle-right"></i>
                  <li class="active">日历</li>
                  </ol>
              </div>
            </div>
          </div>
        </div>
        <!-- breadcrumb_End -->

        <!-- Section -->
        <section class="chart_section">
          <!--// three-grids -->
          <div class="container-fluid">
            <div class="row">
              <!-- Calender -->
              <div class="outer-w3-agile col-xl mt-3">
                <h2 class="tittle-w3-agileits mb-4"></h2>
                <div class="multi-select-calender"></div>
              </div>
              <!--// Calender -->
            </div>
            <!--// Profile -->
          </div>
        </section>
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
<!-- Required common Js -->
<script src='static/js/jquery-2.2.3.min.js'></script>
<!-- //Required common Js -->


<!-- Sidebar-nav Js -->
<script>
  $(document).ready(function () {
    $('#sidebarCollapse').on('click', function () {
      $('#sidebar').toggleClass('active');
    });
  });
</script>
<!--// Sidebar-nav Js -->


<!-- Bar-chart -->
<script src="static/js/rumcaJS.js"></script>
<script src="static/js/example.js"></script>
<!--// Bar-chart -->
<!-- Calender -->
<script src="static/js/moment.min.js"></script>
<script src="static/js/pignose.calender.js"></script>
<script>
  //<![CDATA[
  $(function () {
    $('.calender').pignoseCalender({
      select: function (date, obj) {
        obj.calender.parent().next().show().text('You selected ' +
                (date[0] === null ? 'null' : date[0].format('YYYY-MM-DD')) +
                '.');
      }
    });

    $('.multi-select-calender').pignoseCalender({
      multiple: true,
      select: function (date, obj) {
        obj.calender.parent().next().show().text('You selected ' +
                (date[0] === null ? 'null' : date[0].format('YYYY-MM-DD')) +
                '~' +
                (date[1] === null ? 'null' : date[1].format('YYYY-MM-DD')) +
                '.');
      }
    });
  });
  //]]>
</script>
<!--// Calender -->

<!-- profile-widget-dropdown js-->
<script src="static/js/script.js"></script>
<!--// profile-widget-dropdown js-->


<!-- dropdown nav -->
<script>
  $(document).ready(function () {
    $(".dropdown").hover(
            function () {
              $('.dropdown-menu', this).stop(true, true).slideDown("fast");
              $(this).toggleClass('open');
            },
            function () {
              $('.dropdown-menu', this).stop(true, true).slideUp("fast");
              $(this).toggleClass('open');
            }
    );
  });
</script>
<!-- //dropdown nav -->
<!-- Weather-skycons-icons -->
<script src="static/js/skycons.js"></script>
<script>
  var icons = new Skycons({
            "color": "#FFD700"
          }),
          list = [
            "clear-day"
          ],
          i;

  for (i = list.length; i--;)
    icons.set(list[i], list[i]);

  icons.play();
</script>
<script>
  var icons = new Skycons({
            "color": "#f5f5f5"
          }),
          list = [
            "clear-night", "partly-cloudy-day",
            "partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
            "fog"
          ],
          i;

  for (i = list.length; i--;)
    icons.set(list[i], list[i]);

  icons.play();
</script>
<!--// Weather-skycons-icons -->

<!-- Js for bootstrap working-->
<script src="static/js/bootstrap.min.js"></script>
<!-- //Js for bootstrap working -->

</body>

</html>
