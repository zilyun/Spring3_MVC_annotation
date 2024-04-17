<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나이 출력</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet">
<style>
	.container {width: 30%}
	h3 {text-align: center; color: gray; margin-top: 10%}
</style>
</head>
<body>
	<div class="container">
		<h3>요청주소<span style="color: orange;">${url}</span> 처리하는 list1.jsp입니다.</h3>
		<table class="table">
			<tr>
				<th>나이</th><td>${age}</td>
			</tr>
			
		</table>
	</div>
</body>
</html>