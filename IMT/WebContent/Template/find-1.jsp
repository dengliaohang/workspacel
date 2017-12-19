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
           // $('#list').hide();
            $('#find').click(function () {
                $('#list').show();
            });
			$('.btnedit').click(function(){
				$.acc('Maintain-edit.html');
				alert('');
				});
		
		$('input[name="findall"]').bind("click",function(){
			 var u={
					 patient_isDel:0,
					 pindex:1
					 
			 }
			 window.location.href="queryAllPatient.do?patient_isDel=0&&pindex=1";
			 //$('#list').show();
			/*  $.ajax({
		            type: "GET",
		            url:"queryAllPatient.do",
		            data:u,// 你的formid
		            dataType:'text',
		            success:function(request){
		            	if(request==("success")){
		            		$('#list').show();
		            	}else{
		            		 alert("请重新查询");
		            	}
		            }
		        });   */
		});
		$('#queryCoun').bind("click",function(){
			var coun=$('#coun').find("option:selected").val();
			window.location.href='queryAllPatient.do?patient_isDel=3&&pindex=1&&id='+coun;
		});
		$('#queryPhone').bind("click",function(){
			var coun=$('#phone').val();
			window.location.href='queryAllPatient.do?patient_isDel=1&&pindex=1&&name='+coun;
		});
		$('#queryEmail').bind("click",function(){
			var coun=$('#email').val();
			window.location.href='queryAllPatient.do?patient_isDel=2&&pindex=1&&name='+coun;
		});
        })
		</script>
</head>
<body>
    <div class="alert alert-info">当前位置<b class="tip"></b>查询界面<b class="tip"></b>查询</div>
    <c:if test="${sessionScope.currstate==1||sessionScope.currstate==0}">
      <table class="tbform" >
            <tr>
                <td colspan="6" align="center">
                	电话<input type="text" id="phone"  />
                	<input type="button" class="btn"  value="查询" id="queryPhone"/>
                	邮箱<input type="text" id="email" />
                	<input type="button" class="btn"  value="查询" id="queryEmail"/>
                	国家<select id="coun">
                		<c:forEach  var="item" items="${allCoun}">
                			<option value="${item.id}">${item.name}</option>
                		</c:forEach>
                	</select>
                	<input type="button" class="btn"  value="查询" id="queryCoun"/>
                	<input  name="patient_isDel"  type="hidden"  />
                	<input  id="queryText" type="text"  />
                	<input class="btn" id="find1" name="findall" type="button" value="查询所有" />
                    <input class="btn" id="find" type="button" value="查询" />
                </td>
            </tr>
      </table>
    </c:if>
    <table class="tb" id="list">
     <c:if test="${patientList!=null}">
      <tbody>
        <tr>
       	  <th><input type="checkbox" name="checkall"> </th>
          <th>序号 </th>
          <th>国家</th>
          <th>患者姓名</th>
          <th>患者年龄</th>
          <th>患者性别</th>
          <th>症状 </th>
          <th>咨询人电话</th>
          <th>提交日期  </th>
          <th>是否报备</th>
          <th>意向</th>
          <th>录入</th>
          <th></th>
        </tr>
        <c:forEach var="item" items="${patientList}"  varStatus="status">
        <tr>
          <td><input type="checkbox" name="checka" value="${item.patient_id}"></td>
          <td><a>${status.index + 1}</a></td>
          <td>${item.country}</td>
          <td>${item.patient_name}</td>
          <td> ${item.patient_age}</td>
          <td>${item.patient_sex} </td>
          <td>${item.patient_sysptom}</td>
          <td>${item.patient_consultation_phone}</td>
          <td>${item.rep_date}</td>
          <td>${item.patient_report_state}</td>
          <c:if test="${item.patient_intention_level==1}">
         	 <td>低</td>
          </c:if>
           <c:if test="${item.patient_intention_level==2}">
         	 <td>中</td>
          </c:if>
           <c:if test="${item.patient_intention_level==3}">
         	 <td>高</td>
          </c:if>
          <td>${item.reportName}</td>
          <td><input type="button"  value="查看" name="${item.patient_id}" onclick="edita(this)"></td>
        </tr>
        </c:forEach>
      </tbody>
       <c:if test="${currJobId==1}">
      <tr class="pager">
        <th colspan="100">
        	<input type="button" value="删除" name="btn_delete" />
        	<span>资源转给</span>
        	<select size="1"  id="emp">
        	<c:forEach var="itema" items="${allDepl}">
        		   <option value="">${itema.name}</option> 
        		<c:forEach var="itemb" items="${allUser}">
        			<c:if test="${itema.id==itemb.department_id&&itemb.job_id==1}">
						<option value="${itemb.sys_user_id}">${itemb.sys_user_Cname}</option> 
					</c:if>
                </c:forEach>
        	</c:forEach>
        		
        	</select>
        	<input type="button" value="确定" name="resref">
        </th>
       </tr>
       </c:if>
      <tr class="pager">
        <th colspan="100"><div>
		<a href='queryAllPatient.do?patient_isDel=0&&pindex=1&&pcount=1' id="a1">首页</a>
		<a href='queryAllPatient.do?patient_isDel=0&&pindex=${requestScope.page.pindex-1}&&pcount=1' id="a2">上一页</a>
		<a href='queryAllPatient.do?patient_isDel=0&&pindex=${requestScope.page.pindex+1}&&pcount=1' id="a3">下一页</a> 
		<a href='queryAllPatient.do?patient_isDel=0&&pindex=${requestScope.page.ptotalpages}&&pcount=1' id="a4">末页</a>
		每页: ${requestScope.page.psize}/<span style='color:red'>${requestScope.page.pcount} </span>条  页数:<span style='color:blue'> ${requestScope.page.pindex} </span>/${requestScope.page.ptotalpages} 页;
		跳转到<input type="text" name="goPageNo"  size="3" /><input type="button" value="GO" name="goPage" />
	</div>
  	</th>
      </tr>
      </c:if>
       <c:if test="${patByphone!=null}">
      <tbody>
        <tr>
       	  <th><input type="checkbox" name="checkall"> </th>
          <th>序号 </th>
          <th>国家</th>
          <th>患者姓名</th>
          <th>患者年龄</th>
          <th>患者性别</th>
          <th>症状 </th>
          <th>咨询人电话</th>
          <th>提交日期  </th>
          <th>是否报备</th>
          <th>意向</th>
          <th>录入</th>
          <th></th>
        </tr>
        <c:forEach var="item" items="${patByphone}"  varStatus="status">
        <tr>
          <td><input type="checkbox" name="checka" value="${item.patient_id}"></td>
          <td><a>${status.index + 1}</a></td>
          <td>${item.country}</td>
          <td>${item.patient_name}</td>
          <td> ${item.patient_age}</td>
          <td>${item.patient_sex} </td>
          <td>${item.patient_sysptom}</td>
          <td>${item.patient_consultation_phone}</td>
          <td>${item.rep_date}</td>
          <td>${item.patient_report_state}</td>
          <c:if test="${item.patient_intention_level==1}">
         	 <td>低</td>
          </c:if>
           <c:if test="${item.patient_intention_level==2}">
         	 <td>中</td>
          </c:if>
           <c:if test="${item.patient_intention_level==3}">
         	 <td>高</td>
          </c:if>
          <td>${item.reportName}</td>
          <td><input type="button"  value="查看" name="${item.patient_id}" onclick="edita(this)"></td>
        </tr>
        </c:forEach>
      </tbody>
       <c:if test="${currJobId==1}">
      <tr class="pager">
        <th colspan="100">
        	<input type="button" value="删除" name="btn_delete" />
        	<span>资源转给</span>
        	<select size="1"  id="emp">
        	<c:forEach var="itema" items="${allDepl}">
        		   <option value="">${itema.name}</option> 
        		<c:forEach var="itemb" items="${allUser}">
        			<c:if test="${itema.id==itemb.department_id&&itemb.job_id==1}">
						<option value="${itemb.sys_user_id}">${itemb.sys_user_Cname}</option> 
					</c:if>
                </c:forEach>
        	</c:forEach>
        		
        	</select>
        	<input type="button" value="确定" name="resref">
        </th>
       </tr>
       </c:if>
      <tr class="pager">
        <th colspan="100"><div>
		<a href='queryAllPatient.do?patient_isDel=0&&pindex=1&&pcount=1' id="a1">首页</a>
		<a href='queryAllPatient.do?patient_isDel=0&&pindex=${requestScope.page.pindex-1}&&pcount=1' id="a2">上一页</a>
		<a href='queryAllPatient.do?patient_isDel=0&&pindex=${requestScope.page.pindex+1}&&pcount=1' id="a3">下一页</a> 
		<a href='queryAllPatient.do?patient_isDel=0&&pindex=${requestScope.page.ptotalpages}&&pcount=1' id="a4">末页</a>
		每页: ${requestScope.page.psize}/<span style='color:red'>${requestScope.page.pcount} </span>条  页数:<span style='color:blue'> ${requestScope.page.pindex} </span>/${requestScope.page.ptotalpages} 页;
		跳转到<input type="text" name="goPageNo"  size="3" /><input type="button" value="GO" name="goPage" />
	</div>
  	</th>
      </tr>
      </c:if>
       <c:if test="${patByemail!=null}">
      <tbody>
        <tr>
       	  <th><input type="checkbox" name="checkall"> </th>
          <th>序号 </th>
          <th>国家</th>
          <th>患者姓名</th>
          <th>患者年龄</th>
          <th>患者性别</th>
          <th>症状 </th>
          <th>咨询人电话</th>
          <th>提交日期  </th>
          <th>是否报备</th>
          <th>意向</th>
          <th>录入</th>
          <th></th>
        </tr>
        <c:forEach var="item" items="${patByemail}"  varStatus="status">
        <tr>
          <td><input type="checkbox" name="checka" value="${item.patient_id}"></td>
          <td><a>${status.index + 1}</a></td>
          <td>${item.country}</td>
          <td>${item.patient_name}</td>
          <td> ${item.patient_age}</td>
          <td>${item.patient_sex} </td>
          <td>${item.patient_sysptom}</td>
          <td>${item.patient_consultation_phone}</td>
          <td>${item.rep_date}</td>
          <td>${item.patient_report_state}</td>
          <c:if test="${item.patient_intention_level==1}">
         	 <td>低</td>
          </c:if>
           <c:if test="${item.patient_intention_level==2}">
         	 <td>中</td>
          </c:if>
           <c:if test="${item.patient_intention_level==3}">
         	 <td>高</td>
          </c:if>
          <td>${item.reportName}</td>
          <td><input type="button"  value="查看" name="${item.patient_id}" onclick="edita(this)"></td>
        </tr>
        </c:forEach>
      </tbody>
      <c:if test="${currJobId==1}">
      <tr class="pager">
        <th colspan="100">
        	<input type="button" value="删除" name="btn_delete" />
        	<span>资源转给</span>
        	<select size="1"  id="emp">
        	<c:forEach var="itema" items="${allDepl}">
        		   <option value="">${itema.name}</option> 
        		<c:forEach var="itemb" items="${allUser}">
        			<c:if test="${itema.id==itemb.department_id&&itemb.job_id==1}">
						<option value="${itemb.sys_user_id}">${itemb.sys_user_Cname}</option> 
					</c:if>
                </c:forEach>
        	</c:forEach>
        	</select>
        	<input type="button" value="确定" name="resref">
        </th>
       </tr>
       </c:if>
      <tr class="pager">
        <th colspan="100"><div>
		<a href='queryAllPatient.do?patient_isDel=0&&pindex=1&&pcount=1' id="a1">首页</a>
		<a href='queryAllPatient.do?patient_isDel=0&&pindex=${requestScope.page.pindex-1}&&pcount=1' id="a2">上一页</a>
		<a href='queryAllPatient.do?patient_isDel=0&&pindex=${requestScope.page.pindex+1}&&pcount=1' id="a3">下一页</a> 
		<a href='queryAllPatient.do?patient_isDel=0&&pindex=${requestScope.page.ptotalpages}&&pcount=1' id="a4">末页</a>
		每页: ${requestScope.page.psize}/<span style='color:red'>${requestScope.page.pcount} </span>条  页数:<span style='color:blue'> ${requestScope.page.pindex} </span>/${requestScope.page.ptotalpages} 页;
		跳转到<input type="text" name="goPageNo"  size="3" /><input type="button" value="GO" name="goPage" />
	</div>
  	</th>
      </tr>
      </c:if>
      <c:if test="${counPat!=null}">
      	<tbody>
        <tr>
       	  <th><input type="checkbox" name="checkall"> </th>
          <th>序号 </th>
          <th>国家</th>
          <th>患者姓名</th>
          <th>患者年龄</th>
          <th>患者性别</th>
          <th>症状 </th>
          <th>咨询人电话</th>
          <th>提交日期  </th>
          <th>是否报备</th>
          <th>意向</th>
          <th>录入</th>
          <th></th>
        </tr>
        <c:forEach var="item" items="${counPat}"  varStatus="status">
        <tr>
          <td><input type="checkbox" name="checka" value="${item.patient_id}"></td>
          <td><a>${status.index + 1}</a></td>
          <td>${item.country}</td>
          <td>${item.patient_name}</td>
          <td> ${item.patient_age}</td>
          <td>${item.patient_sex} </td>
          <td>${item.patient_sysptom}</td>
          <td>${item.patient_consultation_phone}</td>
          <td>${item.rep_date}</td>
          <td>${item.patient_report_state}</td>
          <c:if test="${item.patient_intention_level==1}">
         	 <td>低</td>
          </c:if>
           <c:if test="${item.patient_intention_level==2}">
         	 <td>中</td>
          </c:if>
           <c:if test="${item.patient_intention_level==3}">
         	 <td>高</td>
          </c:if>
          <td>${item.reportName}</td>
          <td><input type="button"  value="查看" name="${item.patient_id}" onclick="edita(this)"></td>
        </tr>
        </c:forEach>
      </tbody>
       <c:if test="${currJobId==1}">
      <tr class="pager">
        <th colspan="100">
        	<input type="button" value="删除" name="btn_delete" />
        	<span>资源转给</span>
        	<select size="1"  id="emp">
        	<c:forEach var="itema" items="${allDepl}">
        		   <option value="">${itema.name}</option> 
        		<c:forEach var="itemb" items="${allUser}">
        			<c:if test="${itema.id==itemb.department_id&&itemb.job_id==1}">
						<option value="${itemb.sys_user_id}">${itemb.sys_user_Cname}</option> 
					</c:if>
                </c:forEach>
        	</c:forEach>
        		
        	</select>
        	<input type="button" value="确定" name="resref">
        </th>
       </tr>
       </c:if>
      <tr class="pager">
        <th colspan="100"><div>
		<a href='queryAllPatient.do?patient_isDel=3&&pindex=1&&pcount=1' id="a1">首页</a>
		<a href='queryAllPatient.do?patient_isDel=3&&pindex=${requestScope.page.pindex-1}&&pcount=1' id="a2">上一页</a>
		<a href='queryAllPatient.do?patient_isDel=3&&pindex=${requestScope.page.pindex+1}&&pcount=1' id="a3">下一页</a> 
		<a href='queryAllPatient.do?patient_isDel=3&&pindex=${requestScope.page.ptotalpages}&&pcount=1' id="a4">末页</a>
		每页: ${requestScope.page.psize}/<span style='color:red'>${requestScope.page.pcount} </span>条  页数:<span style='color:blue'> ${requestScope.page.pindex} </span>/${requestScope.page.ptotalpages} 页;
	</div>
  	</th>
      </tr>
      </c:if>
    </table>
    
     <script language="JavaScript">
		$('input[name="resref"]').bind("click",function(){
			var emp=$('#emp').find("option:selected").val();
			 var chckBox = document.getElementsByName("checka");  
		        var num = chckBox.length;  
		        var ids = "";  
		        for(var index =0 ; index<num ; index++){  
		            if(chckBox[index].checked){  
		                ids += chckBox[index].value + ",";                
		            }  
		        }  
			var da={
					patId:ids,
					userId:emp
			}
			if(ids==""){
				alert('请选择资源');
			}else if(emp==""){
				alert('请选择要转的人');
			}else{
			  if(window.confirm("确定转该资源？")){  
              	 $.ajax( {  
                   type : "post",  
                   url : 'refPatient.do', //要自行删除的action  
                   data:da,
                   dataType : 'TEXT',  
                   success : function(request) {  
                       alert("成功");  
                       window.location=location;  
                   }
               })
			}
			}
		})
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
 		//查询
 		$('#find').bind("click",function(){
 			
 			var query=$('#queryText').val();
 			if(query.trim()==null){
 				alert("请输入名字");
 			}else{
 				window.location.href='queryPatientByText.do?name='+query+'&&patient_isDel=0&&pindex=1';
 			}
 			
 			/*  $.ajax( {  
                 type : "post",  
                 url : 'queryPatientByText.do?name='+query+'&&patient_isDel=0&&pindex=1',  
                 dataType : 'TEXT'
             });   */
 		});
 		
 		//全选
 		$('input[name="checkall"]').bind("click",function(){
 			var flag=$('input[name="checkall"]').prop("checked");
 	 		if(flag){
 	 			$('input[name="checka"]').prop("checked",true);
 	 		}else{
 	 			$('input[name="checka"]').prop("checked",false);
 	 		}
 			
 		});
 		//删除
 		$('input[name="btn_delete"]').bind("click",function(){
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
	                    url : 'deletePatient.do?ids='+ids, //要自行删除的action  
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
 		//分页
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
 				window.location.href="queryAllPatient.do?patient_isDel=3&&pindex="+goPageNo+"&&pcount=1";
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
