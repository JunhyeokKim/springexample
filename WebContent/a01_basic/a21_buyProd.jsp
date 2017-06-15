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

	})
</script>
</head>
<body>
	<h1>구매 금액 누적 확인</h1>
	<form method="post">
		<table>
			<tr>
				<td>물건 명:</td>
				<td><input type="text" value="${ prod.name}" name="name" /></td>
			</tr>
			<tr>
				<td>물건 가격:</td>
				<td><input type="text" value="${prod.price }" name="price" /></td>
			</tr>
			<tr>
				<td>물건 갯수:</td>
				<td><input type="text" value="${prod.cnt }" name="cnt" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="결과 확인" /></td>
			</tr>
			<tr>
			<td>
			<select name="deptno">
				<c:forEach var="code" items="${deptList }">
				<option value="${code.key }">${code.value }</option>
			</c:forEach>
		</select><br>
		</td>
		</tr>
		</table>
		<h2>이전 총 합: ${prod.tot }</h2>
	</form>
	

</body>
</html>