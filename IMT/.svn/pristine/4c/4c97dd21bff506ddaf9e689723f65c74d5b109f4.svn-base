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
</head>
<script src="./jquery/jquery-1.12.4.js"> </script>
<script type="text/javascript">
	$(function() {
		$('input[name="querybynameb"]').bind("click",function(){
			/* $('form[name="form1"]').attr("action","queryAllEmployee.do"); */
			var inputval=$('input[name="querybyname"]').val().trim();
			if(inputval.length==0){
				alert('对不起，查询不能为空或者为空格!');
			}else{
				$('form[name="form1"]').submit();
			}
		});
			$('input[name="queryAll"]').bind("click",function(){
				/* $('form[name="form1"]').attr("action","queryAllEmployee.do"); */
				$('form[name="form2"]').submit();
			});
	});
</script>
<body>
	<div style="width: 100%; height: 20%; float: left">
		<form action="queryEmployeeByCname.do" target="iframe2" method="get" name="form1">
			请输入员工姓名：<input type="text" name="querybyname"><input
				type="button" name="querybynameb" value="查询">
				<input type="button" name="queryAll" value="查询所有">
		</form>
		<form action="queryAllEmployee.do" target="iframe2" method="get" name="form2">
		<input type="hidden" value="1" name="pindex">
		<input type="hidden" value="1" name="pcount">
		</form>
	</div>
	<div style="width: 100%; height: 80%; float: left">
		<iframe scrolling="auto"
			style="border: 0px solid gray; width: 100%; height: 300px; float: left"
			name="iframe2"></iframe>
	</div>
</body>
</html>