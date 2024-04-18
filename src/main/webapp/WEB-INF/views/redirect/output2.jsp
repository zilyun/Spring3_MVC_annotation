<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과폼입니다.</title>
</head>
<body>
<script>
const result = '${message}';
if(result != ''){
	alert(result);
	<%-- <%session.removeAttribute("message"); %> --%>
}
</script>
</body>
</html>