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
				$("tr").click(function(){
					var deptno=$(this).children().html();
					$(location).attr("href","${path}/dept_detail.do?deptno="+deptno);
				})
				
			})
		</script>
	</head>
	<body><center>
	<form method="post">
	<input type="text" name="dname"/><br>
	<input type="submit" value="검색"/>
	</form>
	<table border width="30%">
	<tr><th>부서번호</th><th>부서명</th><th>지역</th></tr>
	<c:forEach var="dept" items="${deptList }">
	<tr><td>${dept.deptno }</td><td>${dept.dname }</td><td>${dept.loc }</td></tr>
	</c:forEach>
	</table>

	</body>
</html>