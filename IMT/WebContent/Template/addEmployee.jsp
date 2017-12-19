<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./Styles/admin-all.css" />
    <link rel="stylesheet" type="text/css" href="./Styles/base.css"/>
    <script type="text/javascript" src="./Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="./Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    <link rel="stylesheet" type="text/css" href="./Styles/ui-lightness/jquery-ui-1.8.22.custom.css" />
    <link rel="stylesheet" type="text/css" href="./Styles/formui.css"/>
    <script type="text/javascript" src="./Scripts/tb.js"></script>
    <script type="text/javascript">
        $(function () {
            $(".datepicker").datepicker();
            $('#list').hide();
            $('#find').click(function () {
            	var uname1=$('input[name="uname"]').val();
                var Cname1=$('input[name="Cname"]');
                var pword1=$('input[name="password"]');
               /*  $('input[name="sys_user_name"]').val(uname);
                $('input[name="sys_user_Cname"]').val(Cname);
                $('input[name="sys_user_password"]').val(pword); */
                /* $('form[name="form1"]').submit(); */
                if($('input[name="uname"]').val()==""){
        			alert("请输入用户名");
        		}else
        		if($('input[name="Cname"]').val()==""){
        			alert("请输入姓名");
        		}else
        		if($('input[name="password"]').val()==""){
        			alert("请输入密码");
        		}else
        		if($('input[name="upass"]').val()==""){
        			alert("请再次输入密码");
        		}else
        		if($('input[name="password"]').val()!=$('input[name="upass"]').val()){
        			alert("两次密码不一致请重新输入");
        		}else{
               	 addEmp();
        		}
        	});
            function addEmp() {
        		var user={
        				uname:$('input[name="uname"]').val(),
        				pword:$('input[name="password"]').val(),
        				Cname:$('input[name="Cname"]') .val(),
        				job:$("#job").find("option:selected").val(),
        				department:$("#department").find("option:selected").val()
        		};
        		$.ajax({
                    type: "POST",
                    url:"Template/addEmployee.do",
                    data:user,// 你的formid
                    dataType:'text',
                    success:function(request){
                    	if(request==("success")){
                    		 alert('添加成功！') ;
                    		/*  window.location.href="Index.html"; */
                    	}else{
                    	  /* $('.site-demo-button .layui-btn').click(); */
                    		 alert('添加失败！') ;
                    	}
                    }
                }); 
        		};
        		
        })
    </script>
</head>
<body>
	 <div class="alert alert-info">当前位置<b class="tip"></b>管理员操作<b class="tip"></b>增加</div>
    <table class="tbform">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写员工信息 </td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td class="tdl">用户名</td>
                <td class="detail">
                    <input type="text" class="ipt" name="uname"/>
                </td>
                <td class="tdl">姓名 </td>
                <td class="detail">
                    <input type="text" class="ipt" name="Cname" />
                </td>
                <td class="tdl">职位 </td>
                <td class="detail">
                     <select class="ipt" size="1" id="job">
                        <c:forEach var="item" items="${job}">
                        	<option value="${item.id}">${item.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="tdl">密码</td>
                <td>
                    <div class="input-append">
                        <input type="password" class="ipt" name="password"/>
                    </div>
                </td>
                <td class="tdl">再次输入密码 </td>
                <td class="detail">
                    <input type="password" class="ipt" name="upass" />
                </td>
                <td class="tdl">部门：</td>
                <td class="detail">
                    <select class="ipt" size="1" id="department">
                        <c:forEach var="item" items="${department}">
                        	<option value="${item.id}">${item.name}</option>
                        </c:forEach>
                    </select>
                   </td>
                </tr>
            <tr>
                <td colspan="6" align="right">
                	<form action="addEmployee.do" method="post" name="form1">
                		<input type="hidden" name="sys_user_name"/>
                		<input type="hidden" name="sys_user_password"/>
                		<input type="hidden" name="sys_user_Cname"/>
                		<input class="btn" id="find" type="button" value="增加" />
                	</form>
                   <!--  <input class="btn" type="button" value="清空" />-->
                </td> 
            </tr> 
        </tbody>
    </table>
</body>
</html>