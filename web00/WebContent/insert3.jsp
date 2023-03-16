<%@page import="multi.ProductVO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
   <jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>
   <jsp:setProperty property="*" name="bag"/>
    
    <!-- 브라우저가 보낸 데이터를 받아야 함. ==> 자바로 짜야함. -->
	<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함 -->
	

	<% 
	
	ProductDAO dao = new ProductDAO();
	dao.insert(bag); 
	
/* 	// 1. 전달되는 값을 받으세요.
	String id =request.getParameter("id"); 
	String name =request.getParameter("name"); 
	String content =request.getParameter("content");
	String price =request.getParameter("price"); 
	String company =request.getParameter("company"); 
	String img =request.getParameter("img");
	
	//jsp에서 자동Import - 해당클래스 클릭한 다음 컨트롤 + 쉬프트 + m
	
	// 2. dao에게 데이터를 주기위해 가방을 만들어서 값을 전달하자!
	
	ProductVO bag = new ProductVO();
	bag.setId(id);
	bag.setName(name);
	bag.setContent(content);
	bag.setPrice(Integer.parseInt(price));
	bag.setCompany(company);
	bag.setImg(img);
	
	// 3. dao에게 가방을 주면서 insert해달라고 요청해주세요
	ProductDAO dao = new ProductDAO();
	dao.insert(bag); */
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
회원가입 요청되었음
<hr color = "red">

	<img src="img/<%= bag.getImg() %>"   width=200  height=200>
	<td><input name="img" type="file"></td>
</body>
</html>