<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>justification</title>
<style type="text/css">
</style>
<script src="${path}/com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#init").click(function(){
			$("input[name=sel]").val("1");
			$("form").submit();
		})
		$("#stack").click(function(){
			$("input[name=sel]").val("2");
			$("form").submit();
		})

	})
</script>
</head>
<body>
	<center>
		<h1>구매 처리</h1>
		<form method="post">
		<input type="hidden" name="sel" value="0"/>
		<table border>
		<tr><td>구매물건</td><td>가격</td><td>횟수</td></tr>
		<tr><td><input type="text" name="name"/></td><td><input type="text" name="price"/></td><td><input type="text" name="cnt"/></td></tr>
		<tr><td colspan=3 align="center"><input type="button" id="init" value="구매 금액 초기화면 호출"/></td></tr>
		<tr><td colspan=3 align="center"><input type="button" id="stack" value="구매 금액 누적처리"/></td></tr>
		</table>
		</form>
</body>
</html>