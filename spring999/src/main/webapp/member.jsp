<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<!-- one?id=1 -->
	<form action="one" method="get">
		id : <input name="id" value="apple"><br>
		<button type="submit">서버로 전송</button>
	</form>
	
	
	<hr color="red">

	<h3>회원가입 화면입니다.</h3>
	<hr color="red">
	<form action="insert" method="get">
		id : <input name="id" value="apple"><br> 
		pw : <input	name="pw" value="1234"><br> 
		name : <input name="name"value="park"><br> 
		tel : <input name="tel" value="011"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">

	<h3>회원수정 화면입니다.</h3>
	<hr color="red">
	<form action="insert" method="get">
		id : <input name="id" value="apple"><br> 
		tel : <inputname="tel" value="011"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">

	<h3>회원탈퇴 화면입니다.</h3>
	<hr color="red">
	<form action="insert" method="get">
		id : <input name="id" value="apple"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">

	<h3>회원검색 화면입니다.</h3>
	<hr color="red">
	<form action="insert" method="get">
		id : <input name="id" value="apple"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">


</body>
</html>