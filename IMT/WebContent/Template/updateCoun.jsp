<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
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
<table class="tb" id="list">
      <tbody>
        <tr>
          <th>部门</th>
          <th>修改</th>
          <th></th>
        </tr>
         <tr>
         <td>${name}</td>
         <td><input type="text" size="20" id="updateTxt"></td>
         <td><input type="button"  value="修改"  onclick="edita()"></td>
        </tr>
      </tbody>
    </table>
    <script type="text/javascript">
    function edita(){
    	
    	var upda=$('#updateTxt').val();
    	var id="${id}";
    	var da={
    			updateTxt:upda,
    			id:id
    	}
    	 $.ajax({
             type: "POST",
             url:"updateCounl.do",
             data:da,// 你的formid
             dataType:'text',
             success:function(request){
             	if(request==("success")){
             		 alert("修改成功");
             		 window.location.href=location;
             	}else{
             	  // $('.site-demo-button .layui-btn').click(); 
             		// $('.tip').html('用户名或密码不正确！') 
             		 alert("修改失败");
             	}
             }
         });  
    }
    </script>
</body>
</html>