<%@page import="multi.PlayerVO"%>
<%@page import="multi.PlayerDAO"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
   <jsp:useBean id="bag" class="multi.PlayerVO"></jsp:useBean>
   <jsp:setProperty property="*" name="bag"/>
    
    <!-- �������� ���� �����͸� �޾ƾ� ��. ==> �ڹٷ� ¥����. -->
	<!-- �������� ���� �����͸� ���� �� ����ϴ� ��ǰ �ʿ��� -->
	

	<% 
	PlayerDAO dao = new PlayerDAO();
	dao.insert(bag); 

	/* 	// 1. ���޵Ǵ� ���� ��������.
	String id =request.getParameter("id"); 
	String title =request.getParameter("title"); 
	String content =request.getParameter("content");
	String location =request.getParameter("location"); 
	String director =request.getParameter("director"); 
	
	//jsp���� �ڵ�Import - �ش�Ŭ���� Ŭ���� ���� ��Ʈ�� + ����Ʈ + m
	
	// 2. dao���� �����͸� �ֱ����� ������ ���� ���� ��������!
	
	MovieVO bag = new MovieVO();
	bag.setId(id);
	bag.setName(title);
	bag.setContent(content);
	bag.setLocation(location);
	bag.setDirector(director);
	
	// 3. dao���� ������ �ָ鼭 insert�ش޶�� ��û���ּ���
	MovieDAO dao = new MovieDAO();
	dao.insert(bag); */
	// �̰� ��ü    
	//<jsp:useBean id="bag" class="multi.PlayerVO"></jsp:useBean>
   // <jsp:setProperty property="*" name="bag"/>
	
	%>
	<!-- ���������� ����� �˷��ֱ� ���� html�ڵ尡 �̸� �� ���� -->

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
������� ��û
<hr color = "red"> 
<%=bag %>
</body>
</html>