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
		$("tr").click(function() {
			var empno = $(this).children().html();
			$(location).attr("href", "${path}/emp_my.do?empno=" + empno);
		})
	})
</script>
</head>
<body>
	<center>
		<h1>emplist</h1>
		<form method="post">
			이름:<input type="text" name="ename" /><br>직업:<input type="text"
				name="job" /><br>
			<input type="submit" value="검색" /><br>

		</form>
		<table width="40%" border>
			<tr>
				<th width="20%">사번</th>
				<th>이름</th>
				<th>입사일</th>
				<th>급여</th>
			</tr>
			<c:forEach var="emp" items="${emplist}">
				<tr>
					<td class="empno">${emp.empno}</td>
					<td>${emp.ename}</td>
					<td><fmt:formatDate value="${emp.hiredate }" /></td>
					<td align="right"><fmt:formatNumber value="${emp.sal}" /></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>