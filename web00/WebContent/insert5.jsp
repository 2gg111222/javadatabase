<%@page import="multi.PlayerVO"%>
<%@page import="multi.PlayerDAO"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
   <jsp:useBean id="bag" class="multi.PlayerVO"></jsp:useBean>
   <jsp:setProperty property="*" name="bag"/>
    
    <!-- 브라우저가 보낸 데이터를 받아야 함. ==> 자바로 짜야함. -->
	<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함 -->
	

	<% 
	PlayerDAO dao = new PlayerDAO();
	dao.insert(bag); 

	/* 	// 1. 전달되는 값을 받으세요.
	String id =request.getParameter("id"); 
	String title =request.getParameter("title"); 
	String content =request.getParameter("content");
	String location =request.getParameter("location"); 
	String director =request.getParameter("director"); 
	
	//jsp에서 자동Import - 해당클래스 클릭한 다음 컨트롤 + 쉬프트 + m
	
	// 2. dao에게 데이터를 주기위해 가방을 만들어서 값을 전달하자!
	
	MovieVO bag = new MovieVO();
	bag.setId(id);
	bag.setName(title);
	bag.setContent(content);
	bag.setLocation(location);
	bag.setDirector(director);
	
	// 3. dao에게 가방을 주면서 insert해달라고 요청해주세요
	MovieDAO dao = new MovieDAO();
	dao.insert(bag); */
	// 이거 대체    
	//<jsp:useBean id="bag" class="multi.PlayerVO"></jsp:useBean>
   // <jsp:setProperty property="*" name="bag"/>
	
	%>
	<!-- 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가 있음 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type = "text/css">
	body {
	background: yellow;  
	
}
	button {
		background:  blue;
}
	
</style>

</head>
<body>
선수등록 요청
<hr color = "red"> 
<%=bag %>
</body>
</html>