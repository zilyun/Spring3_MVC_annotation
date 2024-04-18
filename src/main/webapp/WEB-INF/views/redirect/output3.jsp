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

addFlashAttribute로 보낸 데이터 출력하는 방법 : \${message}=${message}<br>
addAttribute로 보낸 데이터 출력하는 방법 : \${param.attr}=${param.attr}<br>
</body>
</html>