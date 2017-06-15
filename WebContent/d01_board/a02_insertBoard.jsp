<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
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
	$(document).ready(function() {
		$("#schBtn").click(function(){
			$("form").submit();
		})
	})
</script>
</head>
<body>
	<center>
	<h3>게시판 등록</h3>
	<form method="post" action="${path }/boardList.do?method=insProc">
		<table>
			<tr><td>제목</td><td><input type="text" name="subject"/></td></tr>
			<tr><td>패스워드</td><td><input type="password" name="pass"/></td></tr>
			<tr><td>작성자</td><td><input type="text" name="writer"/></td></tr>
			<tr><td>이메일</td><td><input type="text" name="email"/></td></tr>
			<tr><td>내용</td><td><textarea name="content" cols="50" rows="20"></textarea></td></tr>
			<tr><td colspan="2"><input type="submit" value="등록"/></td></tr>
		</table>
	
	</form>
</body>
</html>