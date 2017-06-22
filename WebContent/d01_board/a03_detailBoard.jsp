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
		<link rel="stylesheet" href="${path }/a00_com/a00_com.css" />
		<script src="${path}/com/jquery-1.10.2.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#refBtn").click(function() {
					var no=$("input[name=no]").val();
					$(location).attr("href","${path}/boardList.do?method=insert&no="+no);
				})
				$("#listBtn").click(function(){
					$(location).attr("href",
							"${path}/boardList.do?method=list");
					
				});				
			})
		</script>
	</head>
	<body>
	<h2>게시판 상세</h2>
	<form method="post" action="${path }/boardList.do?method=insProc">
		<table>
		<tr><td width="30%">글 번호</td><td>${board.no}<input type="hidden" name="no" value="${board.no}"/></td></tr>
		<tr><td width="30%">조회수</td><td>${board.readcount}</td></tr>
			<tr><td>제목</td><td><input type="text" name="subject" value="${board.subject }"/></td></tr>
			<tr><td>패스워드</td><td><input type="password" name="pass" value="${board.pass }"/></td></tr>
			<tr><td>작성자</td><td><input type="text" name="writer" value="${board.writer}"/></td></tr>
			<tr><td>이메일</td><td><input type="text" name="email" value="${board.email }"/></td></tr>
			<tr><td>내용</td><td><textarea name="content" cols="50" rows="20">${board.content }</textarea></td></tr>
			<tr><td colspan="2"><input type="button" id="refBtn" value="답글 달기"/>
			<input type="button" id="uptBtn" value="수정"/>
			<input type="button" id="delBtn" value="삭제"/>
			<input type="button" id="listBtn" value="메인으로"/></td></tr>
		</table>
	</form>
	</body>
</html>