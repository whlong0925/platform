<%@ page language="java" contentType="text/html; charset=utf-8"    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<c:set var="contextpath" value="<%=path%>" />
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>国通合众-host</title>

<link href="${contextpath}/checkbox/jquery.safari-checkbox.radio.css" rel="stylesheet"/>
<link type="text/css" rel="stylesheet" href="${contextpath}/css/comm.css" />
<link type="text/css" rel="stylesheet" href="${contextpath}/css/layout.css" />
<link type="text/css" rel="stylesheet" href="${contextpath}/css/foldMenu.css" />
<link type="text/css" rel="stylesheet" href="${contextpath}/css/right.css" />
<!--[if lt IE 9]>
	<link type="text/css" rel="stylesheet" href="css/beforeIE9.css" />
<![endif]-->
<script type="text/javascript" src="${contextpath}/js/jquery-1.10.1.min.js"></script>
<script src="${contextpath}/js/jquery-ui-1.10.3.custom.js" type="text/javascript"></script>
<script type="text/javascript" src="${contextpath}/js/myJquery.js"></script>

<script type="text/javascript" src="${contextpath}/checkbox/jquery.safari-checkbox.radio.js"></script>
<!-- Custom scrollbars -->
<link href="${contextpath}/mCustomScrollbar/jquery.mCustomScrollbar.css" rel="stylesheet" />
<script src="${contextpath}/mCustomScrollbar/jquery.mCustomScrollbar.concat.min.js"></script>

<style>
.mCSB_container{
	margin-right:5px;}
</style>
</head>
<body>

<div class="headCon">
  <div class="logo"><img src="${contextpath}/images/logo.jpg" width="370" height="60"></div>
  <img src="${contextpath}/images/hsc.jpg" width="368" height="60"> 
  <div class="userCon">
    <img src="${contextpath}/images/icon_user.png" width="27" height="29"> 
    <a class="uName">amdin</a>
    <div class="clr"></div>
    <ul class="uList bShadow">
      <li><a href="#">admin</a></li>
      <li><a href="#">tiandd</a></li>
      <li><a href="#">ppp</a></li>
    </ul>
  </div><!--end userCon-->
  <div class="navLink">
    <div class="navCurr">
      <div class="navIco"><img src="${contextpath}/images/nico_3.png"></div>
      <a class="navDList">主机</a>
      <div class="clr"></div>
    </div>
    <ul class="navList">
      <li><img src="${contextpath}/images/nico_0.png"><span>Home</span></li>
      <li><img src="${contextpath}/images/nico_1.png"><span>仪表盘</span></li>
      <li><img src="${contextpath}/images/nico_2.png"><span>服务</span></li>
      <li><img src="${contextpath}/images/nico_3.png"><span>主机</span></li>
      <li><img src="${contextpath}/images/nico_4.png"><span>报警</span></li>
      <li><img src="${contextpath}/images/nico_5.png"><span>管理</span></li>
    </ul>
  </div><!--end navLink-->
</div><!--end headCon-->

<div class="Container">
  <div class="leftCon">
    <div class="menuCon bShadow">
      <!--<div class="menuTitle">集群&nbsp;&nbsp;1<span>[&nbsp;4&nbsp;]</span></div>-->
      <div class="foldCon"><!--start 折叠菜单-->
        <h1 class="lm-down">主机群</h1>
        <div class="listCon" style="display:block;">
          <a href="#">menu1</a>
          <a href="#">menu1</a>
          <a href="#">menu1</a>
          <a href="#">menu1</a>
        </div>
        <h1 class="lm-up">DataNodes</h1>
        <div class="listCon">
          <a href="#">menu2</a>
          <a href="#">menu2</a>
          <a href="#">menu2</a>
          <a href="#">menu2</a>
        </div>
        <h1 class="lm-up">NodesManagers</h1>
        <div class="listCon">
          <a href="#">menu2</a>
          <a href="#">menu2</a>
          <a href="#">menu2</a>
          <a href="#">menu2</a>
        </div>
      </div><!--end 折叠菜单-->
    </div>
    <div class="funCon">
      <a href="#" class="addBtn">添加主机</a>
    </div>
  </div>
  <div class="rightCon">
    <div class="filterBox"><!--start 筛选-->
      <div class="flilter_1 bShadow">
        <a href="#" class="fBtn"><span>所有</span></a>
        <a href="#" class="fBtn"><img src="${contextpath}/images/f1.png"><span>健康</span></a>
        <a href="#" class="fBtn"><img src="${contextpath}/images/f2.png"><span class="sClick">主节点宕机(5)</span></a>
        <a href="#" class="fBtn"><img src="${contextpath}/images/f3.png"><span>子节点宕机(0)</span></a>
        <a href="#" class="fBtn"><img src="${contextpath}/images/f4.png"><span>失去心跳(0)</span></a>
        <a href="#" class="fBtn"><img src="${contextpath}/images/f5.png"><span>报警</span></a>
        <a href="#" class="fBtn"><img src="${contextpath}/images/f6.png"><span>重新启动</span></a>
        <a href="#" class="fBtn"><img src="${contextpath}/images/f7.png"><span>维护模式</span></a>
      </div>
      <div class="flilter_2">
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <th scope="row" width="80" valign="top">筛选条件</th>
    <td>
    <div class="module"><label>主机名称：</label><input type="text" class="b w140" /></div>
    <div class="module"><label>IP地址：</label><input type="text" class="b w100" /></div>
    <div class="module"><label>核心CPU：</label><input type="text" class="b w100" /></div>
    <div class="module"><label>内存：</label><input type="text" class="b w60" /></div>
    <div class="module"><label>负载均衡：</label><input type="text" class="b w60" /></div>
    <div class="module">
       <label>版本：</label>
       <div class="selectCon">
        	<input name="" type="button" class="select b w100" value="所有"/> <!--宽度有w60, w100, w140三个可用-->
            <div class="sListCon" style="display:none;"><!--style="display:none;"-->
            	<ul>
                	<li><a href="#">所有</a></li>
                    <li><a href="#">V 10.2.4</a></li>
                    <li><a href="#">V 10.2.5</a></li>
                    <li><a href="#">V 10.2.6</a></li>
                    <li><a href="#">V 10.2.7</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="module">
       <label>部件：</label><input name="" type="button" class="filter b" value="&nbsp;"/></div>
    <div class="module">
      <button class="bShadow bg"><img src="${contextpath}/images/button_search.png" width="30" height="22"><span>查&nbsp;询</span></button></div>
    </td>
  </tr>
</table>

      </div>
    </div><!--end 筛选-->
    
    <div class="ResultCon">
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="tabComm">
 <thead>
  <tr>
    <td width="25">
     <label for="city-all" name="ms" class="label_check check-all"><!--如想全选，请添加check-all类；name相同-->
       <input type="checkbox" id="city-all">
     </label></td>
    <td width="20">&nbsp;</td>
    <td width="22">&nbsp;</td>
    <td>主机名称 <div class="InDecrease"><a name="increase" class="indup"></a><a name="decrease" class="inddown"></a></div></td>
    <td width="100">IP地址 <div class="InDecrease"><a name="increase" class="indup"></a><a name="decrease" class="inddown"></a></div></td>
    <td>核心CPU</td>
    <td>内存</td>
    <td>磁盘使用</td>
    <td>负载均衡</td>
    <td>版本</td>
    <td>部件</td>
  </tr>
 </thead>
 <tbody> 
 <c:forEach items="${userlist }" var="item">
  <tr>
    <td>
      <label for="city-1" name="ms" class="label_check">
         <input type="checkbox"  id="city-1" >
      </label></td>
    <td>1</td>
    <td><img src="${contextpath}/images/f2.png" width="22" height="22"></td>
    <td>${item.username }</td>
    <td>10.12.35.5</td>
    <td>${item.usercode }</td>
    <td>${item.deptId }</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  </c:forEach>
 </tbody>
</table>

    </div>
    
    <div class="opterations">
      <button class="bShadow bg op"><img src="${contextpath}/webapp/images/start.png"><span>启动所有组件</span></button>
      <button class="bShadow bg op"><img src="${contextpath}/images/stop.png"><span>停止所有组件</span></button>
      <button class="bShadow bg op"><img src="${contextpath}/images/restart.png"><span>重启所有组件</span></button>
      <table border="0" cellpadding="0" cellspacing="0" style="display:inline-table">
      <tr>
        <td>维护模式</td>
        <td><div class="switchCon"><a  class="switchBtn bg bLeft sClick">开</a><a class="switchBtn bRight bg">关</a></div></td>
      </tr>
      </table>
    </div>
    
   <div class="pageCon">
   <table border="0" cellpadding="0" cellspacing="0" style="display:inline-table">
      <tr>
        <td>每页
        <div class="selectCon">
        	<input name="" type="button" class="select b w60" value="10"/>
            <div class="sListCon" style="display:none;"><!--style="display:none;"-->
            	<ul>
                	<li><a href="#">10</a></li>
                    <li><a href="#">15</a></li>
                    <li><a href="#">20</a></li>
                    <li><a href="#">25</a></li>
                    <li><a href="#">30</a></li>
                </ul>
            </div>
        </div>条，第1/4页
        </td>
        <td><a class="pageBtn bg preDisable"></a><a class="pageBtn bg next" ></a> </td>
      </tr>
    </table>
   </div> <!--end pageCon-->
  </div>
  <div class="clr"></div>
</div><!--end Container-->

<div class="footCon">
  <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td rowspan="2" scope="row" width="50%" align="right"><span class="year">2015</span></td>
    <td>国通合众信息技术有限公司</td>
  </tr>
  <tr>
    <td><span class="cBlue">大数据管理平台</span></td>
  </tr>
</table>

</div>
</body>
</html>
