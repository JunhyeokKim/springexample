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
				
			})
		</script>
	</head>
	<body>
	<h1>사용자:${person.name }</h1>
	<h2>구구단 외워</h2>
	<form method="post">
		<input type="text" size="2" name="num01" value="${exam.num01 }"/>*
		<input type="text" size="2" name="num02" value="${exam.num02 }"/><br>
		정답 입력:<input type="text" size="2" name="inputdata" value=""/><br>
		<input type="submit" value="입력"/>
	</form>
	<h2>이전 문제 결과</h2>
	<h2>정답 여부: ${exam.result }</h2>

	</body>
</html>