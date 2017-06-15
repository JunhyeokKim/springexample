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
				
			})
		</script>
	</head>
	<body>
	<form method="post" action="${path }/buyForm.do">
	<!-- 위 주소로 Controller를 호출하여 form 안에 포함된 element를 query string 방식으로 전달하겠다  -->
	물건명: <input type="text" name="prodName"/><br>
	갯수: <input type="text" name="prodCnt"/><br>
	가격: <input type="text" name="prodPrice"/><br>
	<input type="submit" value="결과 확인"/>
	</form>
	

	</body>
</html>