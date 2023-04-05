<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.multi.mvc200.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script src="https://code.jquery.com/jquery-3.6.4.js" integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			//1.화면을 이동하지 않고
			// 서버에 insert해달라고 요청 ==>url
			//2.성공하면, result아래에 append
			content = $('#reply').val()
			writer =  "apple" //$(id)--원래 이런 형식 근데 지금 없으니까 입력 
			$.ajax({
				url : "insert4",
				data : {
					bbsno : ${bag.no},
					name : name,
					url : url
				},
				success : function() {
					alert('성공!')
					$('#result').append("- " +name + "," + url + "<br>")
					$('#reply').val('')
					//val(): 입력한 값을 가지고 온다.
					//val('~~~') : ~값을 input의 value에 넣는다.
				}
			})
		})
	})
</script>
<style>
body {
	background: yellow;
}
</style>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a>
<a href="list2">게시물 전체 목록페이지</a>
<hr color="red">

댓글달기 <input id="reply"> <button id="b1">댓글달기</button><br>
게시물검색 처리 요청이 완료되었습니다.
<br>
${bag.no}, ${bag.title}, 
${bag.content}, ${bag.writer}
<div id = "result">
<c:forEach items="${list}" var="bag"> 
	- ${bag.content}, ${bag.writer} <br>
	</c:forEach>
</div>
</body>
</html>