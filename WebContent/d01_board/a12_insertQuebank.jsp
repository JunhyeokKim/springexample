<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
	<head>
	<link rel="stylesheet" href="${path }/a00_com/a00_com.css" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>justification</title>
		<style type="text/css">
		</style>
		<script src="${path}/com/jquery-1.10.2.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				
			})
		</script>
	</head>
	<body><center>
	<h3>등록 화면</h3>
	<form method="post" action="${path }/quebankList.do?method=insProc">
		<table>
			<tr><td>문제</td><td><input type="text" name="que"/></td></tr>
			<tr><td>정답</td><td><input type="text" name="corAnsw"/></td></tr>
			<tr><td>문제 유형</td><td><input type="text" name="queType"/></td></tr>
			<tr><td colspan="2"><input type="submit" value="등록"/></td></tr>
		</table>
	
	</form>
	</body>
</html>