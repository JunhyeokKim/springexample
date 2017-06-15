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
		$("select[name=queType]").val("${queSch.queType}").attr("selected","selected");

		$("#schBtn").click(function(){
			$("form").submit();
			})
		$("#regBtn").click(function(){
			$(location).attr("href","http://localhost:5080/springweb/quebankList.do?method=insert");
		})
	})
</script>
</head>
<body>
	<center>
		<h1>문제은행 게시판</h1>
		<form method="post" action="http://localhost:5080/springweb/quebankList.do?method=list">
			<table>
				<tr>
					<td colspan="2">문제</td>
					<td><input type="text" name="que" value="${queSch.que }" /></td>
				</tr>
				<tr>
					<td colspan="2">문제 유형</td>
					<td><select name="queType">
						<option value="주관식">주관식</option>
						<option value="서술형">서술형</option>
						<option value="객관식">객관식</option>
					</select></td>
				</tr>
				<tr>
					<td colspan="4" style="text-align: center"><input
						type="button" id="schBtn" value="검색" style="width: 8%" /><input
						type="button" id="regBtn" value="등록" style="width: 8%" /></td>
				</tr>
			</table>
		</form>
		<table>
		<tr>
			<th>문제</th><th>정답</th><th>문제 유형</th>
		</tr>
		<c:forEach var="quebank" items="${list }">
			<tr>
			<td>${quebank.que }</td>
			<td>${quebank.corAnsw }</td>
			<td>${quebank.queType }</td>
			</tr>
		</c:forEach>
			
		</table>
</body>
</html>