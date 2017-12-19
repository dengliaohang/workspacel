<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../Styles/formui.css" />
    <link rel="stylesheet" type="text/css" href="../Styles/base.css"/>
    <link rel="stylesheet" type="text/css" href="../Styles/admin-all.css" />
    <script type="text/javascript" src="../Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="../Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../Styles/ui-lightness/jquery-ui-1.8.22.custom.css" /> 
    <script type="text/javascript" src="../Scripts/ChurAlert.min.js?skin=blue"></script>
    <script type="text/javascript" src="../Scripts/chur-alert.1.0.js"></script>
    <script type="text/javascript" src="../Scripts/tb.js"></script>
    <script type="text/javascript" charset="utf-8" src="../ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="../ueditor/ueditor.all.min.js"> </script>
	<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
	<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
	<script type="text/javascript" charset="utf-8" src="../ueditor/lang/zh-cn/zh-cn.js"></script>
    <script type="text/javascript">
       $(function () {
             $(".datepicker").datepicker();
             $('.modal').hide();
            $('#find').click(function () { 
                $.dialog({
                    title: '查询结果',
                    content: 'url:Template/griddatalist.html', 
					width:650,
					height:450
            			})
			})
			$('#findid').click(function () { 
                 $.dialog({
                    title: '单据编号',
                    content:'url:Template/Iddatalist.html',
					width:350,
					height:250
            			})
			})
			$('input[name="con_phone"]').bind("blur",function(){
				 var phone=$('input[name="con_phone"]').val();
				 var str=phone.replace(/[^\d]/ig,"");
				 $('input[name="con_phone"]').val(str);
				 var ph={
						 phone:str
				 }
				 $.ajax({
			            type: "POST",
			            url:"testPhone.do",
			            data:ph,// 你的formid
			            dataType:'text',
			            success:function(request){
			            	if(request==("error")){
			            		
			            	}else{
			            		var s=new Array();
			            		s=request.split("=");
			            		var pid=s[1];
			            		//弹窗修改
			            		edita();
			            		function edita(){
			            	    	$.dialog({
			            	    	title: 'test',
			            	    	content:'url:updateResource.do?patient_id='+pid,
			            	    	lock: true,
			            	    	okVal: '关了',
			            	    	ok: true,
			            	    	width: 800,
			            	    	height: 500,
			            	    	cancelVal: '叉掉'
			            		}); 
			            	}
			            	}
			            }
			        });  
				 
			})
			$('input[name="con_email"]').bind("blur",function(){
				 var email=$('input[name="con_email"]').val();
				 var st=new Array();
				 st=email.split("@");
				 var stt=new Array();
				 var strt="";
				 var strw="";
				 if(st.length>1){
				 	stt=st[1].split(".");
				 	strt=stt[0].replace(/[^a-z\d]/ig,"");
				 	if(stt.length>1){
						strw=stt[1].replace(/[^a-z\d]/ig,"");
				 	}
				 }
				 var stro=st[0].replace(/[^a-z\d]/ig,"");
				 if(stro!=""||strt!=""||strw!=""){
					 $('input[name="con_email"]').val(stro+'@'+strt+'.'+strw);
				 }else{
					 $('input[name="con_email"]').val("");
				 }
				
				 var email={
						 email: $('input[name="con_email"]').val()
				 }
				 $.ajax({
			            type: "POST",
			            url:"testEmail.do",
			            data:email,// 你的formid
			            dataType:'text',
			            success:function(request){
			            	if(request==("error")){
			            		
			            	}else{
			            		var s=new Array();
			            		s=request.split("=");
			            		var pid=s[1];
			            		//弹窗修改
			            		edita();
			            		function edita(){
			            	    	$.dialog({
			            	    	title: 'test',
			            	    	content:'url:updateResource.do?patient_id='+pid,
			            	    	lock: true,
			            	    	okVal: '关了',
			            	    	ok: true,
			            	    	width: 800,
			            	    	height: 500,
			            	    	cancelVal: '叉掉'
			            		}); 
			            	}
			            	}
			            }
			        });  
			})
			
         }) 
    </script>
</head>
<body>
 <div class="alert alert-info">当前位置<b class="tip"></b>录入患者信息<b class="tip"></b></div>
    <table class="tbform" >
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写患者信息 </td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td >患者姓名</td>
                <td class="detail"> 
                    <input id="formid" name="pat_name" class="ipt" size="16" type="text" />  
                </td>
                <td>患者年龄</td>
                <td class="td_detail">
                    <input id="formid" name="pat_age" class="ipt"/></td>
                <td>患者性别</td>
                <td class="td_detail">
                    <input type="radio" name="pat_sex" checked="checked"  id="formid" class="ipt" value="man"/>男
                    <input type="radio"  name="pat_sex" id="formid" class="ipt" value="woman"/>女
                </td>
             </tr>
             <tr>
                <td>患者咨询人姓名</td>
                <td class="detail"> 
                    <input id="formid" class="ipt" name="con_name" size="16" type="text" />  
                </td>
                <td>患者咨询人国家</td>
                <td class="td_detail">
                	<select size="1"  id="con_country">
                	  <c:forEach var="item" items="${allCountry}">
                       <option    value="${item.id}">${item.name}</option> 
                       </c:forEach>
                    </select>    
                </td>
                <td>患者咨询人电话</td>
                <td class="td_detail">
                    <input id="formid" name="con_phone" class="ipt"/></td>
             </tr>
             <tr>
                <td>患者症状</td>
                <td class="detail"> 
                    <input id="formid" name="pat_sysptom" class="ipt" size="16" type="text" />  
                </td>
                <td>患者病种</td>
                <td class="td_detail">
                   <select size="1"  id="pat_entity">
                      <c:forEach var="item" items="${allDisease}">
                      	 <option    value="${item.id}">${item.name}</option> 
                      </c:forEach>
                    </select>    
                   </td>
                <td>患者意向程度</td>
                <td class="td_detail">
 				  <input type="radio"  name="pat_intion_lev" checked="checked" value="1" id="formid" class="ipt"/>低
 				  <input type="radio"  name="pat_intion_lev" value="2" id="formid" class="ipt"/>中
 				  <input type="radio"  name="pat_intion_lev" value="3" id="formid" class="ipt"/>高
                </td>
             </tr>
             <tr>
                <td>是否报备</td>
               	 <td class="detail"> 
                   	 <input type="radio"  name="report" value="no" checked="checked" id="formid" class="ipt"/>否
               	 </td>
                <td>是否收到护照</td>
                <td class="td_detail">
                    <input type="radio" name="passport" checked="checked" value="yes" id="formid" class="ipt"/>是
                    <input type="radio" name="passport" value="no" id="formid" class="ipt"/>否
                </td>
                <td>备注</td>
                <td class="td_detail">
                	<textarea rows="2" cols="20" name="remark"></textarea>
              </tr>
              <tr>
                <td>患者住址</td>
                <td class="detail"> 
                    <input id="formid" name="pat_address" class="ipt" size="16" type="text" />  
                </td>
                <td>咨询人与患者关系</td>
                <td class="td_detail">
                    <input id="formid" name="pat_con_rel" class="ipt"/></td>
                <td>咨询人现住址</td>
                <td class="td_detail">
                    <input id="formid" class="ipt" name="con_address"/></td>
              </tr>
              <tr>
                <td>咨询人邮箱</td>
                <td class="detail"> 
                    <input id="formid" name="con_email" class="ipt" size="16" type="text" />  
                </td>
                <td>是否紧急</td>
                <td class="td_detail">
                   <input type="radio" name="critical" checked="checked"  value="yes" id="formid" class="ipt"/>是
                    <input type="radio"  name="critical" value="no" id="formid" class="ipt"/>否
                    </td>
                <td>资源是否有效</td>
                <td class="td_detail">
                    <input type="radio" name="resource" checked="checked" value="yes" id="formid" class="ipt"/>是
                    <input type="radio"  name="resource" value="no" id="formid" class="ipt"/>否</td>
             </tr>
             <tr>
                <td>是否住院</td>
                <td class="detail"> 
                    <input type="radio" name="hospital" checked="checked" value="yes" id="formid" class="ipt"/>是
                    <input type="radio"  name="hospital" value="no" id="formid" class="ipt"/>否
                    <input type="radio"  name="hospital" value="outhos" id="formid" class="ipt"/>出院
                </td>
                <td>提交时间</td>
                <td class="td_detail">
                     <div class="input-append">
                        <input class="ipt datepicker" size="16" name="rep_time" type="text" id="startime" /><span class="add-on"><i class="icon-calendar"></i></span>
                    </div>
                </td>
                <td>信息来源</td>
                <td class="td_detail">
                	 <select size="1"  id="net">
                      <c:forEach var="item" items="${allNet}">
                      	 <option    value="${item.id}">${item.name}</option> 
                      </c:forEach>
                    </select>    
                </td>
             </tr>
               
            <tr>
                <td>录入人员 </td>
                <td>
                    <select size="1"  id="luru">
                        <option  value="${Cuser.sys_user_id}">${Cuser.sys_user_Cname}</option> 
                    </select>
                 </td>
                 <td>值班人员 </td>
                 <td>
                    <select size="1"  id="zhiban">
                    <%--   <c:forEach var="item" items="${allUser}">
                       <c:if test="${item.job_id==1&&item.department_id==Cuser.department_id}">
                         <option   value="${item.sys_user_id}">${item.sys_user_Cname}</option> 
                       </c:if>
                      </c:forEach> --%>
                   <c:forEach var="itema" items="${allDepl}">
        		    <option value="">${itema.name}</option> 
        			 <c:forEach var="itemb" items="${allUser}">
        				<c:if test="${itema.id==itemb.department_id&&itemb.job_id==1}">
						<option value="${itemb.sys_user_id}">${itemb.sys_user_Cname}</option> 
					    </c:if>
                     </c:forEach>
        	       </c:forEach>
                    </select>
                 </td>
                 <td><input type="button" value="提交" id="bbb"></input></td>
            </tr>
            <tr>
                <td colspan="6" align="right">
                <input type="button" name="chakan" value="chakan" onclick="aaa()"/>
 				 <!-- 加载编辑器的容器 -->
    			<script id="container" name="content" type="text/plain">
        		这里写你的初始化内容
    			</script>
 				<script type="text/javascript">
 			  		
				</script>
                </td>
            </tr>
        </tbody>
      <!--   <input type="button" value="aa" id="aaa"></input> -->
    </table>
    <!--  <script language="Javascript" type="text/javascript">  
					var hb_icon_set_green = $("#htmlbox_icon_set_green").css("height","400").css("width","583").htmlbox({  
    				toolbars:[  
        			 ["cut","copy","paste","separator_dots","bold","italic","underline","strike","sub","sup","separator_dots","undo","redo","separator_dots",  
         			"left","center","right","justify","separator_dots","ol","ul","indent","outdent","separator_dots","link","unlink","image"],  
       				  ["code","removeformat","striptags","separator_dots","quote","paragraph","hr","separator_dots",  
           			  {icon:"new.gif",tooltip:"New",command:function(){hb_icon_set_green.set_text("<p></p>");}},  
           			  {icon:"open.gif",tooltip:"Open",command:function(){alert('Open')}},  
           			  {icon:"save.gif",tooltip:"Save",command:function(){alert('Save')}}  
        		  ]  
  		  ],  
  		  icons:"default",  
   		 skin:"green"  
		});  
		</script>   -->
    <script type="text/javascript">
    
    	//  弹窗网页效果，可以用
    /* $('#aaa').click(function () {
    	$.dialog({
    	title: 'test',
    	content: 'url:http://www.baidu.com',
    	lock: true,
    	okVal: '关了',
    	ok: true,
    	width: 788,
    	height: 504,
    	cancelVal: '叉掉',
    	button: [{
    	id: 'chur',
    	name: '再来个警告',
    	callback: function () {
    	$('body').alert({
    	type: 'success'
    	})
    	}
    	}],
    	cancel: true //为true等价于function(){}
    	});
    });  */
    var ue = UE.getEditor('container');
    $("#bbb").click(function () {
    	if($('input[name="pat_name"]').val()==""){
    		alert("请输入患者姓名");
    		return;
    	}
	 	 var patient={
				pat_name:$('input[name="pat_name"]').val(),
				pat_age:$('input[name="pat_age"]').val(),
				pat_sex:$('input[name="pat_sex"]:checked').val(),
				con_name:$('input[name="con_name"]').val(),
				con_country:$('#con_country').find("option:selected").val(),
				pat_sysptom:$('input[name="pat_sysptom"]').val(),
				pat_entity:$('#pat_entity').find("option:selected").val(),
				report:$("input[name='report']:checked").val(),
				passport:$("input[name='passport']:checked").val(),
				remark:$('textarea[name="remark"]').val(),
				pat_address:$('input[name="pat_address"]').val(),
				pat_con_rel:$('input[name="pat_con_rel"]').val(),
				con_address:$('input[name="con_address"]').val(),
				con_email:$('input[name="con_email"]').val(),
				critical:$("input[name='critical']:checked").val(),
				resource:$("input[name='resource']:checked").val(),
				hospital:$("input[name='hospital']:checked").val(),
				rep_time:$('input[name="rep_time"]').val(),
				luru:$('#luru').find("option:selected").val(),
				zhiban:$('#zhiban').find("option:selected").val(),
				pat_intion_lev:$('input[name="pat_intion_lev"]:checked').val(),
				con_phone:$('input[name="con_phone"]').val(),
				net:$('#net').find("option:selected").val(),
				uetext:ue.getPlainTxt()
		};    	
	 	 if($('#zhiban').find("option:selected").val()==""){
	 		 alert('请选择值班人员');
	 	 }else{
    	 $.ajax({
            type: "POST",
            url:"addPatient.do",
            data:patient,// 你的formid
            dataType:'text',
            success:function(request){
            	if(request==("success")){
            		 alert("添加成功");
            	}else{
            	  // $('.site-demo-button .layui-btn').click(); 
            		// $('.tip').html('用户名或密码不正确！') 
            		 alert("添加失败");
            	}
            }
        	}); 
	 	 }
    });
    </script>
</body>
</html>