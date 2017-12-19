<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="./layui/layui.js" charset="utf-8"></script>
<script src="./jquery/jquery-1.12.4.js"> </script>
<link rel="stylesheet" href="./layui/css/layui.css" media="all">
</head>
<body>

	<!-- <fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 10px;">
		<legend>查询结果</legend>
	</fieldset> -->
	<div class="layui-form" id="div_form">
		<table class="layui-table">
			<colgroup>
				<col width="50">
				<col width="150">
				<col width="150">
				<col width="200">
				<col>
			</colgroup>
			<thead>
				<tr>
					<th><input type="checkbox" name="" lay-skin="primary"
						lay-filter="allChoose"></th>
					<th>序号</th>
					<th>姓名</th>
					<th>用户名</th>
					<th>密码</th>
					<th align="center" style="width: 10%">操作</th>
				</tr>
			</thead>
			<tbody>
			
				<c:if test="${fn:length(sysuserQuery)>0}">
				<c:forEach items="${sysuserQuery}" var="item" varStatus="status">
					<tr>
						<td><input type="checkbox" value="${item.sys_user_id}" lay-skin="primary" name="che1"></td>
						<td>${status.index + 1}</td> 
						<td>${item.sys_user_Cname}</td>
						<td>${item.sys_user_name}</td>
						<td>${item.sys_user_password}</td>
						
						<td>
						<div >
							<form action="updateEmployee.do" method="post" name="form1">
								<input type="hidden" value="${item.sys_user_id}" name="hidden_id">
								<input type="hidden" value="${item.sys_user_Cname}" name="hidden_Cname">
								<input type="hidden" value="${item.sys_user_name}" name="hidden_name">
								<input type="hidden" value="${item.sys_user_password}" name="hidden_password">
								<input type="submit"  value="修改">
							</form>
						</div>
						</td>
					</tr>
					</c:forEach>
				</c:if>
				
			
				<c:if test="${fn:length(sysuserQuery)==0}">
					<tr>
						<td colspan="5" style="text-align: center">  对不起，没有该员工</td> 
						<td><a href="queryEmployee.jsp" target="iframe1"> 返回 </a></td>
					</tr>
					</c:if>
					<tr>
						<td colspan="6"><input type="button" value="删除" name="btn_delete" /></td> 
					</tr>
			</tbody>
		</table>

		<fieldset class="layui-elem-field layui-field-title"
			style="margin-top: 50px;">
			<legend></legend>
		</fieldset>


		<script>
			$('input[name="btn_delete"]').bind("click",function(){
				 var chckBox = document.getElementsByName("che1");  
			        var num = chckBox.length;  
			        var ids = "";  
			        var isAdmin="";
			        for(var index =0 ; index<num ; index++){  
			            if(chckBox[index].checked){  
			            	isAdmin= chckBox[0].value;
			                ids += chckBox[index].value + ",";                
			            }  
			        }  
			        
			        if(isAdmin=="1"){
			        	alert("管理员不可删除");
			        }else if(ids!=""){  
		            	if(window.confirm("确定删除所选记录？")){  
		               	 $.ajax( {  
		                    type : "post",  
		                    url : 'deleteSysUser.do?ids=' + ids, //要自行删除的action  
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
			
		/* function edit(a){
			$('form[name="form1"]').submit();
		} */
		
			layui.use('form', function(){
 			var $ = layui.jquery, form = layui.form();
  			//全选
  			form.on('checkbox(allChoose)', function(data){
  				var child = $(data.elem).parents('table').find('tbody input[type="checkbox"]');
    			child.each(function(index, item){
     				item.checked = data.elem.checked;
    			});
   				 form.render('checkbox');
  			  });
  	
			});
		</script>
</div>
		<div style="display: none">
		<form action="queryAllEmployee.do" target="iframe2" method="get" name="form2">
		<input type="hidden" value="1" name="pindex">
		<input type="hidden" value="1" name="pcount">
		</form>
	</div>
	<div>
		<a href='queryAllEmployee.do?pindex=1&&pcount=1' id="a1">首页</a>
		<a href='queryAllEmployee.do?pindex=${requestScope.page.pindex-1}&&pcount=1' id="a2">上一页</a>
		<a href='queryAllEmployee.do?pindex=${requestScope.page.pindex+1}&&pcount=1' id="a3">下一页</a> 
		<a href='queryAllEmployee.do?pindex=${requestScope.page.ptotalpages}&&pcount=1' id="a4">末页</a>
		每页: ${requestScope.page.psize}/<span style='color:red'>${requestScope.page.pcount} </span>条  页数:<span style='color:blue'> ${requestScope.page.pindex} </span>/${requestScope.page.ptotalpages} 页;
		跳转到<input type="text" name="goPageNo"  size="3" /><input type="button" value="GO" name="goPage" />
	</div>
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
 			}else{
 				window.location.href="queryAllEmployee.do?pindex="+goPageNo+"&&pcount=1";
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