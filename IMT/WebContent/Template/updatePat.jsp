<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 	<link rel="stylesheet" type="text/css" href="./Styles/formui.css" />
    <link rel="stylesheet" type="text/css" href="./Styles/base.css"/>
    <link rel="stylesheet" type="text/css" href="./Styles/admin-all.css" />
    <script type="text/javascript" src="./Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="./Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    <link rel="stylesheet" type="text/css" href="./Styles/ui-lightness/jquery-ui-1.8.22.custom.css" /> 
    <script type="text/javascript" src="./Scripts/ChurAlert.min.js?skin=blue"></script>
    <script type="text/javascript" src="./Scripts/chur-alert.1.0.js"></script>
    <script type="text/javascript" src="./Scripts/tb.js"></script>
    <script type="text/javascript" src="./HtmlBox/htmlbox.colors.js"></script>  
    <script type="text/javascript" src="./HtmlBox/htmlbox.styles.js"></script>  
    <script type="text/javascript" src="./HtmlBox/htmlbox.syntax.js"></script>  
    <script type="text/javascript" src="./HtmlBox/htmlbox.undoredomanager.js"></script>  
    <script type="text/javascript" src="./HtmlBox/htmlbox.min.js"></script> 
    <script type="text/javascript" charset="utf-8" src="./ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="./ueditor/ueditor.all.min.js"> </script>
	<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
	<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
	<script type="text/javascript" charset="utf-8" src="./ueditor/lang/zh-cn/zh-cn.js"></script>
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
                	<span id="pat_name">${patient.patient_name}</span>
                </td>
                <td>患者年龄</td>
                <td class="td_detail">
               		<span id="age">${patient.patient_age}</span>
                <td>患者性别</td>
                <td class="td_detail">
                <c:if test="${patient.patient_sex=='man'}">
                    <input type="radio" name="pat_sex" checked="checked" id="formid" class="ipt" value="man"/>男
                </c:if>
                <c:if test="${patient.patient_sex=='woman'}">
                    <input type="radio"  name="pat_sex" checked="checked" id="formid" class="ipt" value="woman"/>女
                </c:if>
                </td>
             </tr>
             <tr>
                <td>患者咨询人姓名</td>
                <td class="detail"> 
               		<span id="consultation_name">${patient.patient_consultation_name}</span>
                </td>
                <td>患者咨询人国家</td>
                <td class="td_detail">
                	<select size="1"  id="con_country">
                       <option  value="${countryId}">${country}</option> 
                    </select>       
                </td>
                <td>患者咨询人电话</td>
                <td class="td_detail">
                	<span id="consultation_phone">${patient.patient_consultation_phone}</span>
             </tr>
             <tr>
                <td>患者症状</td>
                <td class="detail"> 
                	<span id="patient_sysptom">${patient.patient_sysptom}</span>
                </td>
                <td>患者病种</td>
                <td class="td_detail">
                	 <select size="1"  id="pat_entity">
                      	 <option  value="${diseaseId}">${disease}</option> 
                    </select>       
                </td>
                <td>患者意向程度</td>
                <td class="td_detail">
               <!--  <p class="starWrapper" onmouseover="rate(this,event)"> 
                <input type="hidden" name="pat_intion_lev"></input>
         		 	<img src="http://www.jb51.net/upload/20080508122008586.gif"  />
          			<img src="http://www.jb51.net/upload/20080508122008586.gif" />
         			<img src="http://www.jb51.net/upload/20080508122008586.gif"  />
          			<img src="http://www.jb51.net/upload/20080508122008586.gif"  />
         			<img src="http://www.jb51.net/upload/20080508122008586.gif" /> 
 				</p> -->
 				<c:if test="${patient.patient_intention_level==1}">
 				
 				  <input type="radio"  name="pat_intion_lev" value="1" checked="checked" id="formid" class="ipt"/>低
 				<input type="radio"  name="pat_intion_lev" value="2"  id="formid" class="ipt"/>中
 				 <input type="radio"  name="pat_intion_lev" value="3"  id="formid" class="ipt"/>高
 				</c:if>
 				<c:if test="${patient.patient_intention_level==2}">
 				<input type="radio"  name="pat_intion_lev" value="1"  id="formid" class="ipt"/>低
 				  <input type="radio"  name="pat_intion_lev" value="2" checked="checked" id="formid" class="ipt"/>中
 				 <input type="radio"  name="pat_intion_lev" value="3"  id="formid" class="ipt"/>高
 				</c:if>
 				<c:if test="${patient.patient_intention_level==3}">
 				<input type="radio"  name="pat_intion_lev" value="1"  id="formid" class="ipt"/>低
 				<input type="radio"  name="pat_intion_lev" value="2"  id="formid" class="ipt"/>中
 				  <input type="radio"  name="pat_intion_lev" value="3" checked="checked" id="formid" class="ipt"/>高
 				</c:if>
                </td>
             </tr>
             <tr>
                <td>是否报备</td>
                <td class="detail"> 
                <c:if test="${patient.patient_report_state=='yes'}">
                     <input type="radio"  name="report" checked="checked" value="yes" id="formid" class="ipt"/>是
                  	 <input type="radio"  name="report"  value="no" id="formid" class="ipt"/>否
                </c:if>
                <c:if test="${patient.patient_report_state=='no'}">
                     <input type="radio"  name="report"  value="yes" id="formid" class="ipt"/>是
                  	 <input type="radio"  name="report" checked="checked" value="no" id="formid" class="ipt"/>否
                </c:if>
                
                </td>
                <td>是否收到护照</td>
                <td class="td_detail">
                	 <c:if test="${patient.patient_passport_state=='yes'}">
                    	<input type="radio" name="passport" checked="checked" value="yes" id="formid" class="ipt"/>是
                     	<input type="radio" name="passport" checked="checked" value="no" id="formid" class="ipt"/>否
                     </c:if>
                     <c:if test="${patient.patient_passport_state=='no'}">
                     	 <input type="radio" name="passport" checked="checked" value="yes" id="formid" class="ipt"/>是
                   		 <input type="radio" name="passport" checked="checked" value="no" id="formid" class="ipt"/>否
                     </c:if>
                </td>
                <td>备注</td>
                <td class="td_detail">
                </td>
              </tr>
              <tr>
                <td>患者住址</td>
                <td class="detail"> 
                	<span id="pat_address">${patient.patient_address}</span>
                </td>
                <td>咨询人与患者关系</td>
                <td class="td_detail">
                	<span id="patient_consultation_relation">${patient.patient_consultation_relation}</span>
                <td>咨询人现住址</td>
                <td class="td_detail">
                	<span id="consultation_addre">${patient.consultation_address}</span>
              </tr>
              <tr>
                <td>咨询人邮箱</td>
                <td class="detail"> 
                	<span id="consultation_email">${patient.consultation_email}</span>
                </td>
                <td>是否紧急</td>
                <td class="td_detail">
                   	<c:if test="${patient.critical_state=='yes'}">
                    	<input type="radio" name="critical" checked="checked"  value="yes" id="formid" class="ipt"/>是
                    </c:if>
                    <c:if test="${patient.critical_state=='no'}">
                  		<input type="radio"  name="critical" checked="checked" value="no" id="formid" class="ipt"/>否
                    </c:if>
                    </td>
                <td>资源是否有效</td>
                <td class="td_detail">
                <c:if test="${patient.resource_state=='yes'}">
                    <input type="radio" name="resource" checked="checked" value="yes" id="formid" class="ipt"/>是
                    <input type="radio"  name="resource" value="no" id="formid" class="ipt"/>否
                 </c:if>   
                 <c:if test="${patient.resource_state=='no'}">
                    <input type="radio" name="resource" value="yes" id="formid" class="ipt"/>是
                    <input type="radio"  name="resource" checked="checked" value="no" id="formid" class="ipt"/>否
                 </c:if> 
                 </td>
             </tr>
             <tr>
                <td>是否住院</td>
                <td class="detail"> 
                 <c:if test="${patient.hospital_state=='yes'}">
                    <input type="radio" name="hospital" checked="checked" value="yes" id="formid" class="ipt"/>是
                    <input type="radio"  name="hospital" value="no" id="formid" class="ipt"/>否
                    <input type="radio"  name="hospital" value="outhos" id="formid" class="ipt"/>出院
                 </c:if>
                  <c:if test="${patient.hospital_state=='no'}">
                    <input type="radio" name="hospital" value="yes" id="formid" class="ipt"/>是
                    <input type="radio"  name="hospital" checked="checked" value="no" id="formid" class="ipt"/>否
                    <input type="radio"  name="hospital" value="outhos" id="formid" class="ipt"/>出院
                 </c:if>
                  <c:if test="${patient.hospital_state=='outhos'}">
                    <input type="radio" name="hospital" value="yes" id="formid" class="ipt"/>是
                    <input type="radio"  name="hospital" value="no" id="formid" class="ipt"/>否
                    <input type="radio"  name="hospital" checked="checked"  value="outhos" id="formid" class="ipt"/>出院
                 </c:if>
                </td>
                <td>提交时间</td>
                <td class="td_detail">
                     <div class="input-append">
                     	<span id="rep_date">${rep_date }</span>
                       <%--  <input class="ipt datepicker" size="18" name="rep_time" type="text" id="startime" value="${rep_date }" /><span class="add-on"><i class="icon-calendar"></i></span> --%>
                    </div>
                </td>
                 <td>信息来源</td>
                <td class="td_detail">
                	 <select size="1"  id="net">
                      	 <option    value="${netId}" >${net}</option> 
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
                     <%--  <c:forEach var="item" items="${allUser}">
                      
                      </c:forEach> --%>
                       <option    value="${BlogUser.sys_user_id}">${BlogUser.sys_user_Cname}</option> 
                    </select>
                 </td>
                 <td>
                 	报备时间
                 </td>
                 <td>
                     <%-- <c:if test="${currJobId==1}">
                      <input class="ipt datepicker" size="18" id="rep_datel" type="text" id="startime" value="${rep_datel}" />
                      <span class="add-on"><i class="icon-calendar"></i></span>
                     </c:if> --%>
                    <%--  <c:if test="${currJobId==2}">
                      <span class="add-on" id="rep_datel">${rep_datel}</span>
                     </c:if> --%>
                      <span class="add-on" id="rep_datel">${rep_datel}</span>
                 </td>
            </tr>
            <tr>
            	<td>
                 	最后修改时间
                </td>
                <td><span>${update_date}</span></td>
                <c:if test="${sessionScope.currJobId==1}">
                 <td><input type="button" value="提交" id="bbb"></input></td>
                </c:if>
            </tr>
            <tr>
            <td>备注</td>
            <td colspan="6" align="center">
                <div style="width:1200px">
                	<textarea rows="5" cols="190" id="remark">${patient.remark}</textarea>
                </div>
            </td>
            </tr>
            <%--  <tr>
             	<td>聊天记录</td>
            	<td colspan="6">
            		${uetxt}
            	</td>
             </tr> --%>
           
            <tr>
                <td colspan="6" align="center">
 				 <!-- 加载编辑器的容器 -->
 				 <div style="width:1200px">
    				<script id="container" name="content" type="text/plain">
        				${uetxt}
    				</script>
    			</div>
                </td>
            </tr>
        </tbody>
    </table>
    <script type="text/javascript">
    var ue = UE.getEditor('container');
    var jobid="${currJobId}";
    $("#bbb").click(function () {
    	var id=${patient.patient_id};
	 	 var patient={
	 			pat_id:id,
				pat_name:$('#pat_name').text(),
				pat_age:$('#age').text(),
				pat_sex:$('input[name="pat_sex"]:checked').val(),
				con_name:$('#consultation_name').text(),
				con_country:$('#con_country').find("option:selected").val(),
				pat_sysptom:$('#patient_sysptom').text(),
				pat_entity:$('#pat_entity').find("option:selected").val(),
				net:$('#net').find("option:selected").val(),
				report:$("input[name='report']:checked").val(),
				passport:$("input[name='passport']:checked").val(),
				remark:$('#remark').val(),
				pat_address:$('#pat_address').text(),
				pat_con_rel:$('#patient_consultation_relation').text(),
				con_address:$('#consultation_addre').text(),
				con_email:$('#consultation_email').text(),
				critical:$("input[name='critical']:checked").val(),
				resource:$("input[name='resource']:checked").val(),
				hospital:$("input[name='hospital']:checked").val(),
				rep_datel:$('#rep_datel').val(),
				pat_intion_lev:$('input[name="pat_intion_lev"]:checked').val(),
				con_phone:$('#consultation_phone').text(),
				uetext:ue.getPlainTxt(),
				luru:$('#luru').find("option:selected").val(),
				zhiban:$('#zhiban').find("option:selected").val()
		};    	
	 	 alert($('#age').val());
    	 $.ajax({
            type: "POST",
            url:"updatePatient.do",
            data:patient,// 你的formid
            dataType:'text',
            success:function(request){
            	if(request==("success")){
            		 alert("修改成功");
            		 window.location=location;  
            	}else{
            		 alert("修改失败");
            	}
            }
        });  
    });
    </script>
    
<script type="text/javascript"> 
function rate(obj,oEvent){ 
var imgSrc = 'http://www.jb51.net/upload/20080508122008586.gif'; 
var imgSrc_2 = 'http://www.jb51.net/upload/20080508122010810.gif'; 
if(obj.rateFlag) return; 
var e = oEvent || window.event; 
var target = e.target || e.srcElement;  
var imgArray = obj.getElementsByTagName("img"); 
for(var i=0;i<imgArray.length;i++){ 
   imgArray[i]._num = i; 
   imgArray[i].onclick=function(){ 
    if(obj.rateFlag) return; 
    obj.rateFlag=true; 
    alert(this._num+1); 
    $('input[name="pat_intion_lev"]').val(this._num+1);
   }; 
} 
if(target.tagName=="IMG"){ 
   for(var j=0;j<imgArray.length;j++){ 
    if(j<=target._num){ 
     imgArray[j].src=imgSrc_2; 
    } else { 
     imgArray[j].src=imgSrc; 
    } 
   } 
} else { 
   for(var k=0;k<imgArray.length;k++){ 
    imgArray[k].src=imgSrc; 
   } 
} 
} 
</script>
    </body>
</html>
