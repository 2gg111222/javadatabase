<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
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
	String tel =request.getParameter("tel"); //"apple"
	
	//�����ͺ��̽����� �����ϱ�!
	//1��° ��� ������ ���� �ϱ�,

	//������ ���� ������ �ְ� (set)!
	//jsp �ڵ� import ����Ű, �ش� Ŭ���� Ŭ�� �� ��Ʈ�� + ����Ʈ + m
	
	MemberVO bag = new MemberVO();
	
	bag.setId(id);
	bag.setTel(tel);
	
	//dao���� ������ �����Ѵ�.
	//jsp �ڵ� import ����Ű, �ش� Ŭ���� Ŭ�� �� ��Ʈ�� + ����Ʈ + m
	
	MemberDAO3 dao = new MemberDAO3();
	dao.update(bag);
	%>
	<!-- ���������� ����� �˷��ֱ� ���� html�ڵ尡 �̸� �� ���� -->

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ���������� ������</title>
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
ȸ���������� ��û�Ǿ���
<hr color = "red">
ȸ�� id : <%= id %>
ȸ������ tel : <%= tel %>

</body>
</html>