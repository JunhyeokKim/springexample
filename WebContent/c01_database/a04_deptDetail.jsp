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
				$("#goList").click(function(){
					$(location).attr("href","${path}/dept_my.do");
				})
				
			})
		</script>
	</head>
	<body><center>
	<h2>DEPT 상세 화면</h2>
	<form method="post" action="${path}/dept_upt.do">
	<table border>
	<tr><td>부서번호</td><td><input type="hidden" name="deptno" value="${dept.deptno }"/>${dept.deptno }</td></tr>
	<tr><td>부서명</td><td><input type="text" name="dname" value="${dept.dname}"/></td></tr>
	<tr><td>지역</td><td><input type="text" name="loc" value="${dept.loc }"/></td></tr>
	<tr><td colspan="2" align="center"><input type="submit" value="수정"/></td></tr>
	<tr><td colspan="2" align="center"><input type="button" id="goList" value="목록"/></td></tr>
	</table>
	</form>
	</body>
</html>