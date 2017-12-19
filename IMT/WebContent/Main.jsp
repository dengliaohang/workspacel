<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>后台管理系统</title>
    <link rel="stylesheet" type="text/css" href="Styles/admin-all.css" />
    <link rel="stylesheet" type="text/css" href="Styles/base.css" />
    <link rel="stylesheet" type="text/css" href="Styles/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="Styles/ui-lightness/jquery-ui-1.8.22.custom.css" />
    <script type="text/javascript" src="Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    <script type="text/javascript" src="Scripts/index.js"></script>
</head>
<body>
    <div class="warp">
        <!--头部开始-->
        <div class="top_c" >
        <!-- 头部导航栏，已经设为失效，不显示 -->
            <div class="top-menu" style="display: none">
                <ul class="top-menu-nav">
                    <li><a href="#">首页</a></li>
                    <li><a href="#">查询录入<i class="tip-up"></i></a>
                        <ul class="kidc">
                            <li><a target="Conframe" href="Template/find-form.html">表单样式</a></li>
                            <li><a target="Conframe" href="Template/find-alert.html">弹出窗口</a></li>
                            <li><a target="Conframe" href="Template/find-order.html">查询排序</a></li>
                            <li><a target="Conframe" href="Template/find-1.html">查询结果一</a></li>
                            <li><a target="Conframe" href="Template/find-2.html">查询结果二</a></li>
                        </ul>
                    </li>
                    <li><a href="#">管理员操作<i class="tip-up"></i></a>
                        <ul class="kidc">
                            <li><b class="tip"></b><a target="Conframe" href="Template/Maintain-add.html">增加</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/Maintain-edit.html">修改</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/Maintain-del.html">删除</a></li>
                        </ul>
                    </li>
                    <li><a href="#">资源管理<i class="tip-up"></i></a>
                        <ul class="kidc">
                            <li><b class="tip"></b><a target="Conframe" href="Template/form-Master-slave.html">主从表单</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/form-collapse.html">折叠表单</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/form-tabs.html">标签式表单</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/form-tree.html">树+表单</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/form-guide.html">向导</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/form-tabs-list.html">标签页+列表</a></li>
                        </ul>
                    </li>
                    <li><a href="#">提示<i class="tip-up"></i></a>
                        <ul class="kidc">
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">权限提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">出错提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">警告提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">询问提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">对话框一</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">对话框二</a></li>
                    </ul>
                    </li>
                    <li><a href="#">辅助信息<i class="tip-up"></i></a>
                        <ul class="kidc">
                        <li><b class="tip"></b><a target="Conframe" href="Template/order.html">采购订单</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/formstyle.html">数据说明</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/formstyle.html">操作记录</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/formstyle.html">提示</a></li>
                    </ul>
                    </li>
                </ul>
            </div>
            <div class="top-nav">上午好，欢迎您，${sessionScope.currsysuser}！&nbsp;&nbsp; <a id="quitUser">安全退出</a></div>
        </div>
        <!--头部结束-->
        <!--左边菜单开始-->
        <div class="left_c left">
            <h1>系统操作菜单</h1>
            
            <div class="acc">
            	<c:if test="${sessionScope.currJobId==2}">
				 <div>
                    <a class="one">查询录入</a>
                    <ul class="kid">
                       <!--  <li><b class="tip"></b><a target="Conframe" href="Template/find-form.html">表单样式</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/find-alert.html">弹出窗口</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/find-order.html">查询排序</a></li> -->
                        <li><b class="tip"></b><a target="Conframe" href="Template/find-1.jsp">查询结果</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/find.do">信息录入</a></li>
                    </ul>
                </div>
                <c:if test="${sessionScope.currstate==1&&sessionScope.currJobId==2}">
                	 <div>
                   		 <a class="one">管理员操作</a>
                    	<ul class="kid">
                  		 <li><b class="tip"></b><a target="Conframe" href="queryEmployee.jsp">查询员工</a></li>
                         <li><b class="tip"></b><a target="Conframe" href="addEmployeejump.do">增加员工</a></li>
                         <li><b class="tip"></b><a target="Conframe" href="Template/manageDep.do?pindex=1&&pcount=1">部门管理</a></li>
                         <li><b class="tip"></b><a target="Conframe" href="Template/manageJob.do?pindex=1&&pcount=1">职位管理</a></li>
                         <li><b class="tip"></b><a target="Conframe" href="Template/manageCoun.do?pindex=1&&pcount=1">国家管理</a></li>
                         <li><b class="tip"></b><a target="Conframe" href="Template/manageNet.do?pindex=1&&pcount=1">网站管理</a></li>
                        </ul>
               		 </div>
                     <div>
                         <a class="one">资源管理</a>
                        <ul class="kid">
                         <li><b class="tip"></b><a target="Conframe" href="Template/querynewResource.do?pindex=1&&pcount=1">新资源</a></li>
                         <li><b class="tip"></b><a target="Conframe" href="Template/queryOutPatient.do?pindex=1&&pcount=1">过期资源</a></li>
                         <li><b class="tip"></b><a target="Conframe" href="Template/queryInvalidResource.do?pindex=1&&pcount=1">无效资源</a></li>
                         <li><b class="tip"></b><a target="Conframe" href="Template/deleteResource.do?pindex=1&&pcount=1">资源回收站</a></li>
                         <!-- <li><b class="tip"></b><a target="Conframe" href="Template/form-guide.html">向导</a></li>
                         <li><b class="tip"></b><a target="Conframe" href="Template/form-tabs-list.html">标签页+列表</a></li> -->
                        </ul>
             		  </div>
                </c:if>
				</c:if>
                <!-- <div style="display: none">
                   		<form action="queryAllEmployee.do" target="Conframe" method="get" name="form2">
							<input type="hidden" value="1" name="pindex">
							<input type="hidden" value="1" name="pcount">
							<input type="submit" value="go">
						</form>
					</div> -->
				<c:if test="${sessionScope.currstate==0&&sessionScope.currJobId==1}">
				 <div>
                    <a class="one">查询录入</a>
                    <ul class="kid">
                       <!--  <li><b class="tip"></b><a target="Conframe" href="Template/find-form.html">表单样式</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/find-alert.html">弹出窗口</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/find-order.html">查询排序</a></li> -->
                        <li><b class="tip"></b><a target="Conframe" href="Template/find-1.jsp">查询结果</a></li>
                        <!-- <li><b class="tip"></b><a target="Conframe" href="Template/find.do">信息录入</a></li> -->
                    </ul>
                </div>
                <div>
                    <a class="one">资源管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="Template/querynewResource.do?pindex=1&&pcount=1">新资源</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/queryOutPatient.do?pindex=1&&pcount=1">过期资源</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/queryInvalidResource.do?pindex=1&&pcount=1">无效资源</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/deleteResource.do?pindex=1&&pcount=1">资源回收站</a></li>
                    </ul>
                </div>
				</c:if>
				<c:if test="${sessionScope.currstate==1&&sessionScope.currJobId==1}">
				 <div>
                    <a class="one">查询录入</a>
                    <ul class="kid">
                       <!--  <li><b class="tip"></b><a target="Conframe" href="Template/find-form.html">表单样式</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/find-alert.html">弹出窗口</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/find-order.html">查询排序</a></li> -->
                        <li><b class="tip"></b><a target="Conframe" href="Template/find-1.jsp">查询结果</a></li>
                    </ul>
                </div>
                <div>
               			
                    <a class="one">管理员操作</a>
                    <ul class="kid">
                  		<li><b class="tip"></b><a target="Conframe" href="queryEmployee.jsp">查询员工</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="addEmployeejump.do">增加员工</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="netWeight.do">权重查看</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/manageDep.do?pindex=1&&pcount=1">部门管理</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/manageJob.do?pindex=1&&pcount=1">职位管理</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/manageCoun.do?pindex=1&&pcount=1">国家管理</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/manageNet.do?pindex=1&&pcount=1">网站管理</a></li>
                    </ul>
                </div>
              
                <div>
                    <a class="one">资源管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="Template/querynewResource.do?pindex=1&&pcount=1">新资源</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/queryOutPatient.do?pindex=1&&pcount=1">过期资源</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/queryInvalidResource.do?pindex=1&&pcount=1">无效资源</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/deleteResource.do?pindex=1&&pcount=1">资源回收站</a></li>
                    </ul>
                </div>
                </c:if>
                <c:if test="${sessionScope.currstate==2}">
                <div>
                    <a class="one">查询</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="queryAllPatientC.do?pindex=1&&pcount=1">查询结果</a></li>
                    </ul>
                </div>
                <div>
                    <a class="one">管理员操作</a>
                    <ul class="kid">
                  		<li><b class="tip"></b><a target="Conframe" href="queryEmployee.jsp">查询员工</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="netWeight.do">权重查看</a></li>
                    </ul>
                </div>
                <div>
                    <a class="one">资源管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="Template/querynewResource.do?pindex=1&&pcount=1">新资源</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/queryOutPatient.do?pindex=1&&pcount=1">过期资源</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/queryInvalidResource.do?pindex=1&&pcount=1">无效资源</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/deleteResource.do?pindex=1&&pcount=1">资源回收站</a></li>
                    </ul>
                </div>
                </c:if>
            <!--     <div>
                    <a class="one">提示</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">权限提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">出错提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">警告提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">询问提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">对话框一</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">对话框二</a></li>
                    </ul>
                </div>
                <div>
                    <a class="one">辅助信息</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="Template/order.html">采购订单</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/formstyle.html">数据说明</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/formstyle.html">操作记录</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/formstyle.html">提示</a></li>
                    </ul>
                </div> -->
                <div id="datepicker"></div>
            </div>

        </div>
        <!--左边菜单结束-->
        <!--右边框架开始-->
        <div class="right_c">
            <div class="nav-tip" onclick="javascript:void(0)">&nbsp;</div>
        </div>
        <div class="Conframe">
            <iframe name="Conframe" id="Conframe"></iframe>
        </div>
        <!--右边框架结束-->

        <!--底部开始-->
        <div class="bottom_c">Copyright &copy;2017 石家庄肾病医院</div>
        <!--底部结束-->
    </div>
    <script type="text/javascript">
    	$('#quitUser').bind("click",function(){
    		var currUserid=${sessionScope.currSysUserId};
    		var id={userId:currUserid};
    		   $.ajax({
    		     	  type: "post",
    		           url:"cancelUser.do",
    		           data:id,// 你的formid
    		           dataType:'text',
    		           success:function(req){
							window.location.href="Login.jsp";    		         	  
    		           }
    		     });
    	})
    </script>
</body>
</html>
