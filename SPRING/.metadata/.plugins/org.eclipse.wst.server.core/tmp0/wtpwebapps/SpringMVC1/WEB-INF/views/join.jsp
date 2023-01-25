<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- !!!!!!action에서 /myapp/을 좀 더 정확히 이해하자 -->
	<form action="/myapp/member/join" method="POST">
		ID : <input type = "text" name = "id"><br>
		PW : <input type = "password" name = "pw"><br>
		NICK : <input type = "text" name = "nick"><br>
		<input type = "submit" value = "JOIN">
	</form>
</body>
</html>