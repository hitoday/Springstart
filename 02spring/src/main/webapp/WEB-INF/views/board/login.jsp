<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

get방식
<form action="/ex/board/login" method="get">
	<input type="text" name="id"><br>
	<input type="text" name="pw"><br>
	<input type="submit" value="입력"><br>
</form><br>

post방식
<form action="/ex/board/login" method="post">
	<input type="text" name="id"><br>
	<input type="text" name="pw"><br>
	<input type="submit" value="입력"><br>
</form>

로그인 성공<br>
입력한 아이디는 : [${iden}] 입니다.<br>
입력한 비밀번호는 : [${pass}] 입니다.

</body>
</html>