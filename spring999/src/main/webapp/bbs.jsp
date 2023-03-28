<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시판 글쓰기. </h3>
<hr color="red">
<form action="insert2.multi" method="get">
	no : <input name="no" value="1"><br>
	title : <input name="title" value="1234"><br>
	content : <input name="content" value="park"><br>
	writer : <input name="writer" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>

<button type="button">먹통버튼(아무 기능이 없음)</button>

<h3>글수정 화면입니다. </h3>
<hr color="red">
<form action="update2.multi" method="get">
	no : <input name="no" value="apple"><br>
	content : <input name="content" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>

<button type="button">먹통버튼(아무 기능이 없음)</button>

<h3>글삭제 화면입니다. </h3>
<hr color="red">
<form action="delete2.multi" method="get">
	no : <input name="no" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>

<button type="button">먹통버튼(아무 기능이 없음)</button>

<h3>글검색검색 화면입니다. </h3>
<hr color="red">
<form action="one2.multi" method="get">
	no : <input name="no" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>

<button type="button">먹통버튼(아무 기능이 없음)</button>

</body>
</html>