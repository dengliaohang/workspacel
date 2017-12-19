<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 	<link rel="stylesheet" type="text/css" href="./Styles/formui.css" />
    <link rel="stylesheet" type="text/css" href="./Styles/base.css"/>
    <link rel="stylesheet" type="text/css" href="./Styles/admin-all.css" />
    <script type="text/javascript" src="./Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="./Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    <link rel="stylesheet" type="text/css" href="./Styles/ui-lightness/jquery-ui-1.8.22.custom.css" /> 
    <script type="text/javascript" src="./Scripts/tb.js"></script>
    <script type="text/javascript" src="./Scripts/ChurAlert.min.js?skin=blue"></script>
    <script type="text/javascript" src="./Scripts/chur-alert.1.0.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updatePatient.do" method="post">
    <table class="tb" id="list">
    
        <tbody>
        <tr>
       	  <th></th>
          <th>序号 </th>
          <th>患者姓名</th>
          <th>患者年龄</th>
          <th>患者性别</th>
          <th>咨询人姓名 </th>
          <th>咨询人电话</th>
          <th>提交日期  </th>
          <th></th>
          <th></th>
          <th></th>
          <th></th>
        </tr>
       <tr>
         <td></td>
          <td></td>
          <td><input type="hidden"  name="pid" value="${patient.patient_id}"/>
          	<input type="text" size="10" name="pname" value="${patient.patient_name}"/></td>
          <td> <input type="text" size="10" name="page" value="${patient.patient_age}"/></td>
          <td><input type="text" size="10" name="psex" value="${patient.patient_sex}"/> </td>
          <td><input type="text" size="10" name="p_cname" value="${patient.patient_consultation_name}"/></td>
          <td><input type="text" size="10" name="p_cphone" value="${patient.patient_consultation_phone}"/></td>
          <td>
          <input class="datepicker" name="rep_date" value="${rep_date}" size="16" name="rep_time" type="text" id="startime" />
          </td>
          <td>&nbsp;</td>
          <td> </td>
          <td>&nbsp;</td>
          <td><input type="button"  value="修改"  onclick="edita()"></td>
        </tr>
      </table>
      </form>
     <script type="text/javascript">
     function edita() {
 		var patient={
 				patient_id:$('input[name="pid"]').val(),
 				patient_name:$('input[name="pname"]').val(),
 				patient_age:$('input[name="page"]').val(),
 				patient_sex:$('input[name="psex"]').val(),
 				patient_consultation_name:$('input[name="p_cname"]').val(),
 				consultation_phone:$('input[name="p_cphone"]').val(),
 				report_date:$('input[name="rep_date"]').val()
 		};
 		$.ajax({
             type: "POST",
             url:"updatePatient.do",
             data:patient,// 你的formid
             dataType:'text',
             success:function(request){
             	if(request==("success")){
             		  alert("修改成功");
             	}else{
             	  /* $('.site-demo-button .layui-btn').click(); */
             		 alert("请重新修改");
             	}
             }
         }); 
 		};
     		$(function(){
     			$(".datepicker").datepicker();
     		})
     </script>
</body>
</html>