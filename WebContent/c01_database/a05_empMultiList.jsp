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
			var empno = $(this).children().html();
			var deptnos= ["${emp.deptnos[0]}","${emp.deptnos[1]}","${emp.deptnos[2]}","${emp.deptnos[3]}"];
			var jobs= ["${emp.jobs[0]}","${emp.jobs[1]}","${emp.jobs[2]}","${emp.jobs[3]}","${emp.jobs[4]}"];
			$("input[name=deptnos]").each(function(index, item){
				for(var idx=0; idx<deptnos.length; idx++){
					if($(this).val() == deptnos[idx]){
						$(this).attr("checked",true);
					}
				}
			})
			$("input[name=jobs]").each(function(index, item){
				for(var idx=0; idx<deptnos.length; idx++){
					if($(this).val() == jobs[idx]){
						$(this).attr("checked",true);
					}
				}
			})
	})
</script>
</head>
<body>
	<center>
		<h1>emplist</h1>
		<form method="post">
			이름:<input type="text" name="ename" /><br>
				부서:<input type="checkbox"name="deptnos" value="10" />10
				<input type="checkbox"name="deptnos" value="20"/>20
				<input type="checkbox"name="deptnos" value="30"/>30
				<input type="checkbox"name="deptnos" value="40"/>40<br>
				직책:<input type="checkbox" name="jobs" value="CLERK"/>CLERK
				<input type="checkbox" name="jobs" value="SALESMAN"/>SALESMAN
				<input type="checkbox" name="jobs" value="PRESIDENT"/>PRESIDENT
				<input type="checkbox" name="jobs" value="MANAGER"/>MANAGER
				<input type="checkbox" name="jobs" value="ANALYST"/>ANALYST<br>
			<input type="submit" value="검색" /><br>

		</form>
		<table width="40%" border>
			<tr>
				<th width="20%">사번</th>
				<th>이름</th>
				<th>입사일</th>
				<th>직책</th>
				<th>급여</th>
				<th>부서번호</th>
			</tr>
			<c:forEach var="emp" items="${emplist}">
				<tr>
					<td class="empno">${emp.empno}</td>
					<td>${emp.ename}</td>
					<td><fmt:formatDate value="${emp.hiredate }" /></td>
					<td>${emp.job}</td>
					<td align="right"><fmt:formatNumber value="${emp.sal}" /></td>
					<td align="right">${emp.deptno }</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>