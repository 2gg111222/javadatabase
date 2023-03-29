<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--model의 속성으로 전달받은 bag은 EL로 출력한다. --%>
${bag.no} <br><!-- 출력용(expression language-EL)  -->
${bag.title} <br>
${bag.content} <br>
${bag.writer} <br>
</body>
</html>