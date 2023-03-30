<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<title>Insert title here</title>
</head>
<body>
	<button onclick="location.href='book.jsp'">첫 페이지로</button>
	<table>
	<tr> 
	<td class = "top">id</td>
	<td class = "top">name</td>
	<td class = "top">url</td>
	<td class = "top">img</td>
	</tr>
	<c:forEach items = "${list}" var ="bag"  >
	<tr>
	<td class = "down"><a href="one3?no=${bag.id}">${bag.id}</td>
	<td class = "down"><a href="one3?no=${bag.id}"> ${bag.name}</a></td>
	<td class = "down"><a href="${bag.url}">${bag.url}</a></td>
	<td class = "down"><img src = "resources/img/${bag.img}"></td>
	</tr>
	</c:forEach>
	</table>
	
	
</body>
</html>