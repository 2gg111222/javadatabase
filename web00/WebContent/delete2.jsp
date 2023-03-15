<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 	 1. 전달된 값 받아주세요.(request이용) -->
		<% //자바로 인식시킴
		//스트립 트릿  - 조금 코드를 써서 만드는 작은 프로그램
		//자바코드 넣는 부분!!
		//HttpServletRequest request = new HttpServletRequest();-너무 길다 그래서
		//tomcat은 미리 request를 만들어서 내장시켜놓았다! 
		 String no = request.getParameter("no");
		
				 %>
				 
		<!--  2. dao에게 값 전달.(dao이용) 생략 -->
		<!--  3. 전달된 값을 출력하는 결과를 브라우저에 html로 보내주세요.  -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제</title>
</head>
<body>
<hr>
당신이 삭제를 원하는 작성번호 no : <%= no %> <br>


</body>
</html>