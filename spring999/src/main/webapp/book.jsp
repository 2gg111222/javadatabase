<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<a href="list3">전체 리스트 화면입니다.</a><br>
	
<hr color="red">
	<!-- one?id=1 -->
	<h3>북마크검색 화면입니다. </h3>
<form  action="one3" method="get">
	id : <input name="id"  value="1"><br>
	<button type="submit">서버로 전송</button>
</form>

<hr color="red">

<h3>북마크 화면입니다. </h3>
<hr color="red">
<form action="insert3" method="get" >
	name : <input name="name"  value="네이버"><br>
	url : <input name="url"   value="www.naver.com"><br>
	img : <input name="img" value="naver.png"><br>
	<button type="submit">서버로 전송</button>
</form>

<h3>북마크수정 화면입니다. </h3>
<hr color="red">
<form  action="update3" method="get">
	id : <input name="id"  value="apple"><br>
	url : <input name="url" value="www.naver.com"><br>
	<button type="submit">서버로 전송</button>
</form>

<h3>북마크 삭제 화면입니다. </h3>
<hr color="red">
<form  action="delete3" method="get">
	id : <input name="id"  value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>


</body>
</html>