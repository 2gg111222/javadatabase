<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- 브라우저가 보낸 데이터를 받아야 함. ==> 자바로 짜야함. -->
	<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함 -->
	<% 
	//스트립 트릿  - 조금 코드를 써서 만드는 작은 프로그램
	//자바코드 넣는 부분!!
	//HttpServletRequest request = new HttpServletRequest();-너무 길다 그래서
	//tomcat은 미리 request를 만들어서 내장시켜놓았다! 
	String id =request.getParameter("id"); //"apple"
	
	//데이터베이스에서 삭제하기!
	//1번째 방법 가방을 만들어서 하기,
	//다만 MemberDAO3에서 delete문을 만들때 가방VO를 사용한게 아니라 String id를 사용했음
	//즉 bag사용해서 데이터에 값넣기 불가 아래 방법 설명
	//가방을 만들어서 값들을 넣고 (set)!
	//jsp 자동 import 단축키, 해당 클래스 클릭 후 컨트롤 + 쉬프트 + m
	//MemberVO bag = new MemberVO();
	//bag.setId(id);
	//dao에게 가방을 전달한다.
	//jsp 자동 import 단축키, 해당 클래스 클릭 후 컨트롤 + 쉬프트 + m
	//MemberDAO3 dao = new MemberDAO3();
	//dao.delete(bag);
	
	MemberDAO3 dao = new MemberDAO3();
	dao.delete(id);
	
	%>
	<!-- 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가 있음 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>삭제 페이지</title>
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
삭제 요청되었음
<hr color = "red">
삭제할 id : <%= id %>

</body>
</html>