<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>success!!!</h4><br>
	<form action="update.do" method="post">
			username:<input type="text" name="username"><p>
			password:<input type="password" name="password">
			<input type="submit" value="修改">
	</form>
	<form action="selectUser" method="get">
		<input type="submit" value="查询">
	</form>
</body>
</html>