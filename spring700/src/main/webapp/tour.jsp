<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>데이터를 입력하세요 </h3>
<hr color="red">
<form action="insert" method="get">
	no : <input name="no" ><br>
	area : <input name="area" value="대한민국"><br>
	place : <input name="place" value="관광명소"><br>>
	review : <input name="review" value="후기"><br>>
	grade : <input name="grade" value="별점"><br>>
	<button type="submit" >서버로 전송</button>
</form>
<hr color="red">
<h3>수정 화면입니다. </h3>
<hr color="red">
<form action="update" method="get">
	no : <input name="no" ><br>
	area : <input name="area" value="대한민국"><br>
	place : <input name="place" value="관광명소"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>삭제 화면입니다. </h3>
<hr color="red">
<form action="delete" method="get">
	id : <input name="no" ><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<a href="list">북마크 전체 목록 가지고 오기 </a><br>

<form action="one" method="get">
	아이디 : <input name="no" value="1" ><br>
	<button type="submit" >서버로 전송</button>
</form>
</body>
</html>