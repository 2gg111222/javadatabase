<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		Cookie c1 = new Cookie("favoritecategory" , "sport");
		Cookie c2 = new Cookie("favoritesport" , "soccer");

		response.addCookie(c1);
		response.addCookie(c2);
%>
<hr> 브라우저 쿠키 심음.
<a href = "page02.jsp">쿠키리스트 가져오기</a>
</body>
</html>