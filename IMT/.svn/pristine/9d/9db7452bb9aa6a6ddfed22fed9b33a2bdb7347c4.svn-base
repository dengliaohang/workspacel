<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<title>Insert title here</title>
<script src="./jquery/jquery-1.12.4.js"> </script>
<script src="./layui/layui.js" charset="utf-8"></script>
</head>
<link rel="stylesheet" href="./layui/css/layui.css" media="all">
<body>
	<script type="text/javascript">
	$(function() {
		 var choose=$('select[name="chooseP"]').val();
		/*var a=$('input[name="fsubmit"]').bind("click",function(){
			$('input[name="privilege"]').val(choose);
			document.forms[0].submit();
		}); */
		//动态提示是否登陆成功
	    $('input[name="fsubmit"]').bind("click",function(){
			$('input[name="privilege"]').val(choose);
				login();
			});
		
		 function tanchu() {
         	//动态弹出框
         	//居中弹出层
         	layui.use('layer', function(){ //独立版的layer无需执行这一句
         		  var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
         	var active = {
         		    setTop: function(){
         		      var that = this; 
         		    }
         		    ,offset: function(othis){
         		      var type = othis.data('type')
         		      ,text = othis.text();
         		      
         		      layer.open({
         		        type: 1
         		        ,offset: type //具体配置参考：http://www.layui.com/doc/modules/layer.html#offset
         		        ,id: 'LAY_demo'+type //防止重复弹出
         		        ,content: '<div style="padding: 20px 100px;">'+ text +'</div>'
         		        ,btn: '关闭'
         		        ,btnAlign: 'c' //按钮居中
         		        ,shade: 0 //不显示遮罩
         		        ,yes: function(){
         		          layer.closeAll();
         		        }
         		      });
         		    }
         		  };
         		  
         		  $('.site-demo-button .layui-btn').on('click', function(){
         		    var othis = $(this), method = othis.data('method');
         		    active[method] ? active[method].call(this, othis) : '';
         		  });
         		})
         } ;
		
	function login() {
		tanchu();
		var user={
				uname:$('input[name="sys_user_username"]').val(),
				pword:$('input[name="sys_user_password"]').val(),
				privilege:$('select[name="chooseP"]').val()
		};
		$.ajax({
            type: "POST",
            url:"login.do",
            data:user,// 你的formid
            dataType:'text',
            success:function(request){
            	if(request==("success")){
            		  window.location.href="manage.jsp";
            	}else{
            	  $('.site-demo-button .layui-btn').click();
            	}
            }
            
           /*  success: function(data) {
                $("#commonLayout_appcreshi").parent().html(data);
            } */
        }); 
		};
		
	})
</script>
	<div style="margin-left: 40%;margin-top:15%">
	<h4>资源管理系统（管理员admin，admin 普通员工 a，123）</h4>
	<form action="login.do" method="post">
		<input type="text" name="sys_user_username"><br> 
		<input type="password" name="sys_user_password"><br>
		<input type="button" value="登陆" name="fsubmit">
		<input type="reset" value="重置"> 
		<input type="hidden" name="privilege"> 
		<select id="chooseP" name="chooseP">
			<option value="generaluser">普通用户</option>
			<option value="sysuser">管理员</option>
		</select>
	</form>
	</div>
	<!-- 动态弹出框 -->
	<div class="site-demo-button" style="margin-bottom: 0;display: none">
		<button data-method="offset" data-type="auto" class="layui-btn layui-btn-normal">账号或密码错误</button>
	</div>
</body>
</html>