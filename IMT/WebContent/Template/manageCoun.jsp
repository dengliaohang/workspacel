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
    <script type="text/javascript" src="../Scripts/tb.js"></script>
    <script type="text/javascript" src="../Scripts/ChurAlert.min.js?skin=blue"></script>
    <script type="text/javascript" src="../Scripts/chur-alert.1.0.js"></script>
    <script type="text/javascript">
        $(function () {
            $(".datepicker").datepicker();
            $('#find').bind("click",function () {
            	addDep();
            });
            
            function addDep() {
        		var user={
        				department:$("#queryText").val()
        		};
        		$.ajax({
                    type: "POST",
                    url:"addCoun.do",
                    data:user,// 你的formid
                    dataType:'text',
                    success:function(request){
                    	if(request==("success")){
                    		 alert('添加成功！') ;
                    		  window.location.href=location; 
                    	}else{
                    		 alert('添加失败！') ;
                    	}
                    }
                }); 
        		};
        })
    </script>
</head>
<body>
	 <div class="alert alert-info">当前位置<b class="tip"></b>管理员操作<b class="tip"></b>国家管理</div>
     <table class="tbform" >
            <tr>
                <td colspan="6" align="center">
                	<input  id="queryText" type="text"  />
                    <input class="btn" id="find" type="button" value="添加" />
                </td>
            </tr>
    </table>
    <table class="tb" id="list">
      <tbody>
        <tr>
       	 <!--  <th><input type="checkbox" name="checkall"> </th> -->
          <th>序号 </th>
          <th>职位</th>
          <th>操作</th>
        </tr>
        <c:forEach var="item" items="${allDep}"  varStatus="status">
         <tr>
         <td><a>${status.index + 1}</a></td>
         <td>${item.name}</td>
         <td><input type="button"  value="修改" name="${item.id}" onclick="edita(this)"></td>
        </tr>
        </c:forEach>
      </tbody>
      <!-- <tr class="pager">
        <th colspan="100">
        	<input type="button" value="删除" name="btn_delete" />
        </th>
       </tr> -->
      <tr class="pager">
        <th colspan="100"><div>
		<a href='manageCoun.do?pindex=1&&pcount=1' id="a1">首页</a>
		<a href='manageCoun.do?&&pindex=${requestScope.page.pindex-1}&&pcount=1' id="a2">上一页</a>
		<a href='manageCoun.do?pindex=${requestScope.page.pindex+1}&&pcount=1' id="a3">下一页</a> 
		<a href='manageCoun.do?pindex=${requestScope.page.ptotalpages}&&pcount=1' id="a4">末页</a>
		每页: ${requestScope.page.psize}/<span style='color:red'>${requestScope.page.pcount} </span>条  页数:<span style='color:blue'> ${requestScope.page.pindex} </span>/${requestScope.page.ptotalpages} 页;
		跳转到<input type="text" name="goPageNo"  size="3" /><input type="button" value="GO" name="goPage" />
	</div>
  	</th>
      </tr>
    </table>
    
     <script language="JavaScript">
		
		//弹窗修改
		function edita(a){
			var user=$(a).attr("name");
	    	$.dialog({
	    	title: 'test',
	    	content:'url:updateCoun.do?id='+user,
	    	lock: true,
	    	okVal: '关了',
	    	ok: true,
	    	width: 800,
	    	height: 500,
	    	cancelVal: '叉掉'
		}); 
  }
 	$(function(){
 		
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
 				window.location.href="manageCoun.do?pindex="+goPageNo+"&&pcount=1";
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
