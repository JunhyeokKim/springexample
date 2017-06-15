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
		var calIdx="${cal.calIdx}";
		if(calIdx!=""){
			$("select[name=operator]").val(calIdx);
		}

	})
</script>
</head>
<body>
	<form method="post">
		<input type="text" name="num01" value="${cal.num01 }" /> 
		<select name="calIdx">
			<c:forEach var="op" items="${operator }">
				<option value=${op.key }>${op.value }</option>
			</c:forEach>
		</select> 
		<input type="text" name="num02" value="${cal.num02}" /> = 
		<input type="text" value="${cal.result }" /> 
		<input type="submit" value="계산 결과" />
	</form>
</body>
</html>