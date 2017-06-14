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
<link rel="stylesheet" href="${path }/a00_com/a00_com.css" />
<style type="text/css">
</style>
<script src="${path}/com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	$(document).ready(function() {

	})
</script>
</head>
<body>
	<center>
		<h1>문제은행 게시판</h1>
		<form method="post">
			<table>
				<tr>
					<td>문제</td>
					<td><input type="text" name="que" value="${queSch.que }" /></td>
					<td>정답</td>
					<td><input type="text" name="corAnsw"
						value="${queSch.corAnsw }" /></td>
				</tr>
				<tr>
					<td>문제 유형</td>
					<td><input type="text" name="queType"
						value="${queSch.queType }" /></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td colspan="4" style="text-align: center"><input
						type="submit" value="검색" style="width: 8%" /></td>
				</tr>
			</table>
		</form>
</body>
</html>