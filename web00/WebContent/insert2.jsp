<%@page import="multi.BBSDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 	 1. 전달된 값 받아주세요.(request이용) -->
		<% //자바로 인식시킴
		
		 String title = request.getParameter("title");
		 String content = request.getParameter("content");
		 String writer = request.getParameter("writer");		 
		
		 // 1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자.!
		 BbsVO bag = new BbsVO();
		 
		 bag.setTitle(title);
		 bag.setContent(content);
		 bag.setWriter(writer);
		 
		 //2. dao에게 가방을 전달하면서 insert 해달라고 하자.
		 BBSDAO dao = new BBSDAO();
		 dao.insert(bag);
		 %>
				 
		<!--  2. dao에게 값 전달.(dao이용) 생략 -->
		<!--  3. 전달된 값을 출력하는 결과를 브라우저에 html로 보내주세요.  -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>

작성한 title : <%= title %> <br>
작성한 content : <%= content %> <br>
작성한 writer : <%= writer %> <br>

</body>
</html>