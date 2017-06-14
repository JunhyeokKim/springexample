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
				$("#buy1").click(function(){
					$("input[name=sel]").val("500");
					$("form").submit();
				})
				$("#buy2").click(function(){
					$("input[name=sel]").val("1000");
					$("form").submit();
				})
				$("#logoutBtn").click(function(){
					$("input[name=sel]").val("-1");
					$("form").submit();
				})
			})
		</script>
	</head>
	<body>
	<center>
	<h1>구매리스트 및 현재 포인트</h1>
	<h2>${mem.name }님 현재 point는 ${mem.point } 입니다.</h2>
	<form method="post">
	<input type="hidden" name="sel"/><br>
	<input type="button" id="buy1" value="구매(-500)"/><br>
	<input type="button" id="buy2" value="구매(-1000)"/><br>
	<input type="button" id="logoutBtn" value="로그아웃"/><br>
	</form>

	</body>
</html>