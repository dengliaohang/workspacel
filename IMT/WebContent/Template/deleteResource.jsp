<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="../Styles/formui.css" /><link rel="stylesheet" type="text/css" href="../Styles/base.css"/>
    <link rel="stylesheet" type="text/css" href="../Styles/admin-all.css" />
    <script type="text/javascript" src="../Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="../Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../Styles/ui-lightness/jquery-ui-1.8.22.custom.css" /> 
    <script type="text/javascript" src="../Scripts/tb.js"></script>
        <script type="text/javascript">
        $(function () {
            $(".datepicker").datepicker();
			//全选
	 		$('input[name="checkall"]').bind("click",function(){
	 			var flag=$('input[name="checkall"]').prop("checked");
	 	 		if(flag){
	 	 			$('input[name="checka"]').prop("checked",true);
	 	 		}else{
	 	 			$('input[name="checka"]').prop("checked",false);
	 	 		}
	 		});
			//全选恢复
	 		$('input[name="recovery"]').bind("click",function(){
	 			alert(11);
	 			 var chckBox = document.getElementsByName("checka");  
			        var num = chckBox.length;  
			        var ids = "";  
			        var isAdmin="";
			        for(var index =0 ; index<num ; index++){  
			            if(chckBox[index].checked){  
			            	isAdmin= chckBox[0].value;
			                ids += chckBox[index].value + ",";                
			            }  
			        }  
			        if(ids!=""){  
		            	if(window.confirm("确定恢复所选记录？")){  
		               	 $.ajax( {  
		                    type : "post",  
		                    url : 'recoveryPatient.do?ids=' + ids, //要自行删除的action  
		                    dataType : 'TEXT',  
		                    success : function(data) {  
		                        alert("恢复成功");  
		                        window.location=location;  
		                    },  
		                    error : function(data) {  
		                        alert("系统错误，恢复失败");  
		                    }  
		                });  
		            }  
		        }else{  
		            alert("请选择要恢复的记录");  
		            }  
	 		});
        })
		</script>
</head>
<body>
    <div class="alert alert-info">当前位置<b class="tip"></b>查询界面<b class="tip"></b>回收站</div>
    <table class="tb" id="list">
      <tbody>
       <tr>
       	  <th><input type="checkbox" name="checkall"> </th>
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
        <c:forEach var="item" items="${patientList}"  varStatus="status">
        	 <tr>
          <td><input type="checkbox" name="checka" value="${item.patient_id}"></td>
          <td><a>${status.index + 1}</a></td>
          <td>${item.patient_name}</td>
          <td> ${item.patient_age}</td>
          <td>${item.patient_sex} </td>
          <td>${item.patient_consultation_name}</td>
          <td>${item.patient_consultation_phone}</td>
          <td>${item.rep_date}</td>
          <td>&nbsp;</td>
          <td> </td>
          <td>&nbsp;</td>
          <td></td>
        </tr>
        </c:forEach>
        <tr>
         <c:if test="${sessionScope.currstate==1}">
        	<td colspan="12">
        		<input class="btn btn-mini btnedit" name="recovery" type="button" value="恢复"/>
        	</td>
         </c:if>
        </tr>
      </tbody>
      <tr class="pager">
        <th colspan="100">
        	<div>
				<a href='deletePatient.do?pindex=1&&pcount=1' id="a1">首页</a>
				<a href='deletePatient.do?pindex=${requestScope.page.pindex-1}&&pcount=1' id="a2">上一页</a>
				<a href='deletePatient.do?pindex=${requestScope.page.pindex+1}&&pcount=1' id="a3">下一页</a> 
				<a href='deletePatient.do?pindex=${requestScope.page.ptotalpages}&&pcount=1' id="a4">末页</a>
				每页: ${requestScope.page.psize}/<span style='color:red'>${requestScope.page.pcount} </span>条  页数:<span style='color:blue'> ${requestScope.page.pindex} </span>/${requestScope.page.ptotalpages} 页;
				跳转到<input type="text" name="goPageNo"  size="3" /><input type="button" value="GO" name="goPage" />
			</div>
        </th>
      </tr>
     </table>
    
   <script language="JavaScript">
 	$(function(){
 		var pindex = "${requestScope.page.pindex}";// 当前页
  	    var ptotalpages = "${requestScope.page.ptotalpages}";// 总页数
  	    var pcount = "${requestScope.page.pcount}";// 总记录数
  	    var psize = "${requestScope.page.psize}";// 每一页的记录数
  	    var a1=$("#a1");
  	    var a2=$("#a2");
  	    var a3=$("#a3");
  	    var a4=$("#a4");
 		$('input[name="goPage"]').bind("click",function(){
 			var goPageNo=$('input[name="goPageNo"]').val();
 			var reg=/^[0-9]*$/;
 			if(reg.test(goPageNo)!=true){
 				alert("请输入数字");
 			}else if(goPageNo>ptotalpages){
 				alert("超出查询页数");
 			}else if(goPageNo==""){
 				alert("请输入数字");
 			}else{
 				window.location.href="deletePatient.do?pindex="+goPageNo+"&&pcount=1";
 			}
 		});
 		
 	    if (pcount<=5){
 		   a1.removeAttr("href");
 		   a2.removeAttr("href");
 		   a3.removeAttr("href");
 		   a4.removeAttr("href");
 		   a1.css("opacity","0.2");
 		   a2.css("opacity","0.2");
 		   a3.css("opacity","0.2");
 		   a4.css("opacity","0.2");
 	    }else if (ptotalpages==pindex){
  		   a3.removeAttr("href");
  		   a4.removeAttr("href");
  		   a3.css("opacity","0.2");
  		   a4.css("opacity","0.2");
 	    } else if (pindex==1){
 	       a1.removeAttr("href");
  		   a2.removeAttr("href");
  		   a1.css("opacity","0.2");
  		   a2.css("opacity","0.2");
 	    }else{
 		   
 	    }
 	})
</script>
</body>
</html>
