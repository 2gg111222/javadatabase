<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO3"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- �������� ���� �����͸� �޾ƾ� ��. ==> �ڹٷ� ¥����. -->
	<!-- �������� ���� �����͸� ���� �� ����ϴ� ��ǰ �ʿ��� -->
	<% 
	//��Ʈ�� Ʈ��  - ���� �ڵ带 �Ἥ ����� ���� ���α׷�
	//�ڹ��ڵ� �ִ� �κ�!!
	//HttpServletRequest request = new HttpServletRequest();-�ʹ� ��� �׷���
	//tomcat�� �̸� request�� ���� ������ѳ��Ҵ�! 
	String id =request.getParameter("id"); //"apple"
	String pw =request.getParameter("pw"); //"1234"
	String name =request.getParameter("name"); //"apple"
	String tel =request.getParameter("tel"); //"010"
	
	//������ ���� ������ �ְ�(set)!
	//jsp���� �ڵ�Import - �ش�Ŭ���� Ŭ���� ���� ��Ʈ�� + ����Ʈ + m
	MemberVO bag = new MemberVO();
	
	bag.setId(id);
	bag.setPw(pw);
	bag.setName(name);
	bag.setTel(tel);
	
	//dao���� ������ ��������!
	MemberDAO3 dao = new MemberDAO3();
	dao.insert(bag);
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
ȸ������ ��û�Ǿ���
<hr color = "red">
������ id : <%= id %>
������ pw : <%= pw %>
������ name : <%= name %>
������ tel : <%= tel %>
</body>
</html>