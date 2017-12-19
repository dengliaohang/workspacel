<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
    <title></title>
   <link rel="stylesheet" type="text/css" href="../Styles/formui.css" />
    <link rel="stylesheet" type="text/css" href="../Styles/base.css"/>
    <link rel="stylesheet" type="text/css" href="../Styles/admin-all.css" />
    <script type="text/javascript" src="../Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="../Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../Styles/ui-lightness/jquery-ui-1.8.22.custom.css" /> 
    <script type="text/javascript" src="../Scripts/tb.js"></script>
    <script type="text/javascript" src="../Scripts/ChurAlert.min.js?skin=blue"></script>
    <script type="text/javascript" src="../Scripts/chur-alert.1.0.js"></script>
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
			
		$('input[name="findall"]').bind("click",function(){
			 var u={
					 patient_isDel:0,
					 pindex:1
					 
			 }
		});
		//全选删除
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
	            	if(window.confirm("确定删除所选记录？")){  
	               	 $.ajax( {  
	                    type : "post",  
	                    url : 'deletePatient.do?ids=' + ids, //要自行删除的action  
	                    dataType : 'TEXT',  
	                    success : function(data) {  
	                        alert("删除成功");  
	                        window.location=location;  
	                    },  
	                    error : function(data) {  
	                        alert("系统错误，删除失败");  
	                    }  
	                });  
	            }  
	        }else{  
	            alert("请选择要删除的记录");  
	            }  
 		});
        })
		</script>
</head>
<body>
    <div class="alert alert-info">当前位置<b class="tip"></b>查询界面<b class="tip"></b>新资源</div>
    <table class="tbform">
            <tr>
                <td colspan="6" align="right">
                	<input  name="patient_isDel"  type="hidden"  />
                	<input class="btn" id="find1" name="findall" type="button" value="查询所有" />
                    <input class="btn" id="find" type="button" value="查询" />
                    <input class="btn" type="button" value="清空" />
                </td>
            </tr>
    </table>
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
        <c:forEach var="item" items="${queryOutPatientList}"  varStatus="status">
        <tr>
          <td><input type="checkbox" name="checka"  value="${item.patient_id}"></td>
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
          <c:if test="${sessionScope.currstate==1||sessionScope.currstate==0}">
          	<td><input type="button"  value="修改" name="${item.patient_id}" onclick="edita(this)"></td>
          </c:if>
          <c:if test="${sessionScope.currstate==2}">
          	<td><input type="button"  value="查看" name="${item.patient_id}" onclick="edita(this)"></td>
          </c:if>
        </tr>
        </c:forEach>
         <tr>
        	
          <c:if test="${sessionScope.currstate==1||sessionScope.currstate==0}">
            <td colspan="12">
        		<input class="btn btn-mini btnedit" name="recovery" type="button" value="删除"/>
        	</td>
          </c:if>
        </tr>
      </tbody>
      <tr class="pager">
        <th colspan="100">
        	<a href='queryOutPatient.do?pindex=1&&pcount=1' id="a1">首页</a>
			<a href='queryOutPatient.do?pindex=${requestScope.page.pindex-1}&&pcount=1' id="a2">上一页</a>
			<a href='queryOutPatient.do?pindex=${requestScope.page.pindex+1}&&pcount=1' id="a3">下一页</a> 
			<a href='queryOutPatient.do?pindex=${requestScope.page.ptotalpages}&&pcount=1' id="a4">末页</a>
			每页: ${requestScope.page.psize}/<span style='color:red'>${requestScope.page.pcount} </span>条  页数:<span style='color:blue'> ${requestScope.page.pindex} </span>/${requestScope.page.ptotalpages} 页;
			跳转到<input type="text" name="goPageNo"  size="3" /><input type="button" value="GO" name="goPage" />
        </th>
      </tr> 
      
  </table>
		
   <script language="JavaScript">
	//弹窗修改
	function edita(a){
		var user=$(a).attr("name");
   	$.dialog({
   	title: 'test',
   	content:'url:updateResource.do?patient_id='+user,
   	lock: true,
   	okVal: '关了',
   	ok: true,
   	width: 1400,
	height: 600,
   	cancelVal: '叉掉'
	}); 
}
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
 			}else{
 				window.location.href="queryOutPatient.do?pindex="+goPageNo+"&&pcount=1";
 			}
 		});
 		
 	    if (pcount<=10){
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
