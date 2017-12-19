<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
    <title></title>
   <link rel="stylesheet" type="text/css" href="./Styles/formui.css" />
    <link rel="stylesheet" type="text/css" href="./Styles/base.css"/>
    <link rel="stylesheet" type="text/css" href="./Styles/admin-all.css" />
    <script type="text/javascript" src="./Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="./Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    <link rel="stylesheet" type="text/css" href="./Styles/ui-lightness/jquery-ui-1.8.22.custom.css" /> 
    <script type="text/javascript" src="./Scripts/tb.js"></script>
    <script type="text/javascript" src="./Scripts/ChurAlert.min.js?skin=blue"></script>
    <script type="text/javascript" src="./Scripts/chur-alert.1.0.js"></script>
</head>
<body>
    <div class="alert alert-info">当前位置<b class="tip"></b>查询界面<b class="tip"></b>新资源</div>
    <table class="tb" id="list">
      <tbody>
        <tr>
          <th>序号 </th>
          <th>网站</th>
          <th>今天资源量</th>
          <th>昨天资源量</th>
          <th>相差 </th>
        </tr>
        <c:forEach var="item" items="${res}"  varStatus="status">
        <tr>
          <td><a>${status.index + 1}</a></td>
          <td>${item.net}</td>
          <td> ${item.todatCount}</td>
          <td>${item.lastCount} </td>
          <c:if test="${item.lastCount-item.todatCount>0}">
          	<td>${item.lastCount-item.todatCount}</td>
          </c:if>
          <c:if test="${item.lastCount-item.todatCount<0}">
          	<td>${item.todatCount-item.lastCount}</td>
          </c:if>
          <c:if test="${item.lastCount-item.todatCount==0}">
          	<td>${item.todatCount-item.lastCount}</td>
          </c:if>
        </tr>
        </c:forEach>
      </tbody>
  </table>
</body>
</html>
