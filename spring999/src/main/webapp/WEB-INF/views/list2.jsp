<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

	<style>

	body
	{
		background: yellow;
	}
		.top
	{
		background: black;
		color: white;
	}
	.down{
		background: lime;
	}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	게시판데이터 처리 요청이 완료되었습니다.<br>

	<!-- bag.getId()  -->
	<%--model의 속성으로 전달받은 bag은 EL로 출력한다. --%>
	<!--EL: 속성으로 지정한 값 꺼내서 출력해주세요!라는 의미-->	
	
	
	<table>
	<tr>
	<td class = "top">no</td>
	<td class = "top">title</td>
	<td class = "top">content</td>
	<td class = "top">writer</td>
	</tr>
	<c:forEach items = "${list}" var="bag" begin="0" end="10" step="2">
	<tr>
	<td class = "down">${bag.no}</td><!-- 출력용(expression language-EL)  -->
	<td class = "down">${bag.title}</td> 
	<td class = "down">${bag.content}</td> 
	<td class = "down">${bag.writer}</td>
	</tr>
	</c:forEach>
	</table>
</body>

</html>