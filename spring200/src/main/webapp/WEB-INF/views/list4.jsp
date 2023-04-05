<%@page import="com.multi.mvc200.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		//기존의 것 삭제됨.
		$('#result').empty()
		$.ajax({
			url : "update4",
			success : function(x) {
				$('#result').append(x)
			} //success
		}) //ajax
	})//b1
	$('#b2').click(function() {
		$('#result').empty()
		$.ajax({
			url : "delete4",
			data : {
				bbsno : 
			},
			success : function(x) {
				$('#result').append(x)
			} //success
		}) //ajax
	})//b2
	
})
</script>
<title>Insert title here</title>
<style>
body {
	background: yellow;
}

td {
	width: 100px;
	text-align: center;
}

.top {
	background: black;
	color: white;
}

.down {
	background: lime;
}
</style>
</head>
<body>

		<button id = "b1">수정</button>
		<button id = "b2">삭제</button>
	
		
	<hr color = "red">



	<table>
		<tr>
			<td class="top">no</td>
			<td class="top">title</td>
			<td class="top">content</td>
			<td class="top">writer</td>
		</tr>

		<c:forEach items="${list}" var="bag"> 

<tr>
				<td class="down">${bag.no}</td>
				<td class="down"><a href="one2.multi?no=${bag.no}">${bag.title}</a>
				</td>
				<td class="down">${bag.content}</td>
				<td class="down">${bag.writer}</td>
			</tr>

		</c:forEach>
	</table>
	
	
</body>
</html>