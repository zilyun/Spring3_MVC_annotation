<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과폼입니다</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet">
<script src="js/jquery.js"></script>
<style>
.container {
	width: 30%
}

h3 {
	text-align: center;
	color: gray;
	margin-top: 10%
}
</style>
</head>
<body>
	<div class="container">
		<h3>list1.jsp - 결과화면입니다.</h3>
	<form>
		<input type="checkbox" name="hobby" value="1">운동
		<input type="checkbox" name="hobby" value="2">피아노
		<input type="checkbox" name="hobby" value="3">게임
		<input type="checkbox" name="hobby" value="4">수면
	</form>
	</div>
	
	<script>
		<c:forEach var="h" items="${hobby}">
			$("input[value=${h}]").prop("checked", true)
		</c:forEach>
	</script>
</body>
</html>