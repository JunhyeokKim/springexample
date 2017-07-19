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
		<style type="text/css">
		</style>
		<script src="${path}/com/jquery-1.10.2.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#joinOk").bind("click",function(){
					jQuery.ajax(
							{async : true
							,type : "post"
							,url : "${path}/ajaxExp.ajax"
							,dataType : "json"
							,data: $("#loginFrm").serialize()
							,success : function(jsonData) {
							var _login_result = jsonData.result;
							if(_login_result == 1){
							alert("로그인 성공!\n환영합니다.");
							$("#loginFrm").attr("action", "/login/loginSuccess.do").submit();
							} else {
							alert("로그인 실패하였습니다. 아이디와 비밀번호를 재확인해 주세요.");
							}		
							}
							,error:	function(request,status,error){
							alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
							}
							});
				});
			})
		</script>
	</head>
	<body>
	<div id="container">
	</div>
	<button id="joinOk" >가입</button>

	</body>
</html>