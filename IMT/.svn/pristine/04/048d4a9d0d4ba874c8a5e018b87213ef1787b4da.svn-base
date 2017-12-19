<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="./jquery/jquery-1.12.4.js"> </script>
</head>

<body>
	<div>
		<form action="addEmployee.do" method="post" name="form1">
			用户名<input type="text" name="sys_user_name"><br> 密 码<input
				type="password" name="sys_user_password"><br> 再次输入密码<input
				type="password" name="con_sys_user_password"><br> 员工姓名<input
				type="text" name="sys_user_Cname"><br> <input
				type="button" name="bsubmit" value="提交">
		</form>
	</div>
	<script type="text/javascript">
	$(function(){
/* 	$('input[name="sys_user_name"]').bind("blur",function(){
		var inputval=$('input[name=""sys_user_name""]').val().trim();
		if(inputval.length==0){
			alert('对不起，用户名不能为空或者为空格!');
		}
	});
	$('input[name="sys_user_password"]').bind("blur",function(){
		var inputval=$('input[name=""sys_user_password""]').val().trim();
		if(inputval.length==0){
			alert('对不起，用户名不能为空或者为空格!');
		}
	});
	$('input[name="con_sys_user_password"]').bind("blur",function(){
		var inputval=$('input[name=""con_sys_user_password""]').val()
		var inputval1=inputval.trim();
		if(inputval1.length==0){
			alert('对不起，用户名不能为空或者为空格!');
		}else if($('input[name=""sys_user_password""]').val()!=inputval){
			alert('对不起，两次输入的密码不一致!');
		}
	}); */
		$('input[name="bsubmit"]').bind("click",function(){
			var name=$('input[name="sys_user_name"]').val();
			var tname=name.trim();
			var pword=$('input[name="sys_user_password"]').val();
			var tpword=pword.trim();
			var ppword=$('input[name="con_sys_user_password"]').val();
			var tppword=ppword.trim();
			var cname=$('input[name="sys_user_Cname"]').val();
			var tcname=cname.trim();
			if(tname.length==0){
				alert('对不起，用户名不能为空或者为空格!');
			}
			else if(tpword.length==0){
				alert('对不起，密码不能为空或者为空格!');
			}
			else if(ppword!=tpword){
				alert('对不起，两次输入的密码不一致!');
				
			}else if(tcname==0){
				alert('对不起，姓名不能为空或者为空格!');
			}
			else{
				$('form[name="form1"]').submit();
			};
		});
	})
	</script>
</body>
</html>