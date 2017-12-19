<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>后台管理系统</title>
    <link rel="stylesheet" type="text/css" href="Styles/base.css" />
    <link rel="stylesheet" type="text/css" href="Styles/admin-all.css" />
    <link rel="stylesheet" type="text/css" href="Styles/bootstrap.min.css" />
    <script type="text/javascript" src="Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="Scripts/jquery.spritely-0.6.js"></script>
    <script type="text/javascript" src="Scripts/chur.min.js"></script>
    <link rel="stylesheet" type="text/css" href="Styles/login.css" />
    
</head>
<body>
    <div id="clouds" class="stage"></div>
    <div class="loginmain">
    </div>

    <div class="row-fluid">
        <h1>后台管理系统</h1>
        <p>
            <label>帐&nbsp;&nbsp;&nbsp;号：<input type="text" id="uid" name="sys_user_username"/></label>
        </p>
        <p>
            <label>密&nbsp;&nbsp;&nbsp;码：<input type="password" id="pwd" name="sys_user_password"/></label>
        </p>
        <p class="pcode">
           <label>   &nbsp;&nbsp;&nbsp;效验码：<input type="text" id="code" maxlength="5" class="code" value="" /> 	
            <img id="img" src="AuthImage.do" />
            <a href='#' onclick="javascript:changeImg()" style="color:black;">看不清？</a> 
           </label>
        </p>
        <p class="tip">&nbsp;</p>
        <hr />
        <input type="button" value=" 登 录 " class="btn btn-primary btn-large login" />
        &nbsp;&nbsp;&nbsp;<input type="button" value=" 取 消 " class="btn btn-large" />
         <input type="hidden"  name="vode" value=""  />
    </div>
     <!-- 触发JS刷新-->
 <script type="text/javascript">
 function changeImg(){
     var img = document.getElementById("img"); 
     img.src = "AuthImage.do?date=" + new Date();
      document.getElementById("img").src = document  
     .getElementById("img").src  
     + "?flag=" + new Date().getTime();  
      /* refreshi(); */
     
 }
 /* function refreshi(){
     $.ajax({
     	  type: "GET",
           url:"AuthImageref.do?date="+new Date(),
           data:"",// 你的formid
           dataType:'text',
           success:function(req){
         	  alert(req);
         	  $('input[name="vode"]').val(req);
           }
     });
     } */
        $(function () {
            $('#clouds').pan({ fps: 20, speed: 0.7, dir: 'right', depth: 10 });
            $('.login').click(function () {
                if ($('#uid').val() == "" || $('#pwd').val() == ""  || $('#code').val() == "" ) {
                	 $('.tip').html('用户名或密码不可为空！') 
                 }else {
                    /* location.href = 'login.do'; */
                    login();
                 }
            })
           
          /*   window.onload=changeImg();
            */
            function login() {
            /* 	var a="${sessionScope.verCode}";
            	alert( $('input[name="vode"]').val());
            	if(a!=$('#code').val()){
            		 $('.tip').html('验证码不正确！') 
            		return;
            	} */
        		var user={
        				uname:$('input[name="sys_user_username"]').val(),
        				pword:$('input[name="sys_user_password"]').val(),
        				 code:$('#code').val()
        		};
        		$.ajax({
                    type: "POST",
                    url:"login.do",
                    data:user,// 你的formid
                    dataType:'text',
                    success:function(request){
                    	if(request==("success")){
                    		  window.location.href="Main.jsp";
                    	}else if(request==("disable")){
                    		 $('.tip').html('该账号已被禁用，请联系管理员！') 
                    	}else if(request=="codeerror"){
                    		 $('.tip').html('验证码不正确！');
                    	}else{
                    	  /* $('.site-demo-button .layui-btn').click(); */
                    		 $('.tip').html('用户名或密码不正确！') 
                    	}
                    }
                    
                   /*  success: function(data) {
                        $("#commonLayout_appcreshi").parent().html(data);
                    } */
                }); 
        		};
        })
    </script>
</body>
</html>
