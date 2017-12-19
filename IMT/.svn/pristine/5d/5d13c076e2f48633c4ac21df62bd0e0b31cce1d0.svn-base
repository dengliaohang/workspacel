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
	
	<table>
		<tr>
			<td>姓   名</td>
			<td>${updateuser.sys_user_Cname}</td>
			<td><input type="text" name="Cname"></td>
		</tr>
		<tr>
			<td>用户名</td>
			<td>${updateuser.sys_user_name}</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>密   码</td>
			<td>${updateuser.sys_user_password}</td>
			<td><input type="text" name="password"></td>
		</tr>
		<tr>
			<td>
				<form action="updateEmp.do" method="post" name="form1">
					<input type="hidden" name="sys_user_Yname" value="${updateuser.sys_user_Cname}">
					<input type="hidden" name="sys_user_Cname">
					<input type="hidden" name="sys_user_name">
					<input type="hidden" name="sys_user_password">
			   		<input type="button" value="提交" name="button1">
				</form>
			</td>
		</tr>
	</table>
	<script type="text/javascript">
	$('input[name="button1"]').bind("click",function(){
		var name=$('input[name="name"]').val();
		var tname=name.trim();
		var pword=$('input[name="password"]').val();
		var tpword=pword.trim();
		var cname=$('input[name="Cname"]').val();
		var tcname=cname.trim();
		$('input[name="sys_user_name"]').val(name);
		$('input[name="sys_user_Cname"]').val(cname);
		$('input[name="sys_user_password"]').val(pword);
		$('form[name="form1"]').submit();
		/* if(tcname==0){
			alert('对不起，姓名不能为空或者为空格!');
		}else if(tname.length==0){
			alert('对不起，用户名不能为空或者为空格!');
		}
		else if(tpword.length==0){
			alert('对不起，密码不能为空或者为空格!');
		}else{
			$('form[name="form1"]').submit();
		}; */
	});
	</script>
</body>
</html>