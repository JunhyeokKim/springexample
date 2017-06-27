<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>justification</title>
		<link rel="stylesheet" href="${path }/a00_com/a00_com.css" />
		<style type="text/css">
		</style>
		<script src="${path}/com/jquery-1.10.2.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#ename").keyup(function(){
					var sendData= "ename="+$(this).val();
					$.ajax({
						type:"post",
						url:"ajax.do?method=jsonList",
								dataType:"json",
								data:sendData,
								success:function(data) {
									var list=data.emplist;  //controller에 모델 이름..
									alert(list.length);
									var show="";
									for(var idx=0; idx<list.length; idx++) {
										show+="<h3>"+list[idx].ename+"-"+list[idx].job+"</h3>";	
									}
									$("#show").html(show);
								}
							
					});
				})
			})
		</script>
	</head>
	<body>
	<h1>emp ajaxList</h1>
	이름:<input id="ename" name="ename"/><br>
	<div id="show">
	</div>

	</body>
</html>