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
	
	//�����ͺ��̽����� �����ϱ�!
	//1��° ��� ������ ���� �ϱ�,
	//�ٸ� MemberDAO3���� delete���� ���鶧 ����VO�� ����Ѱ� �ƴ϶� String id�� �������
	//�� bag����ؼ� �����Ϳ� ���ֱ� �Ұ� �Ʒ� ��� ����
	//������ ���� ������ �ְ� (set)!
	//jsp �ڵ� import ����Ű, �ش� Ŭ���� Ŭ�� �� ��Ʈ�� + ����Ʈ + m
	//MemberVO bag = new MemberVO();
	//bag.setId(id);
	//dao���� ������ �����Ѵ�.
	//jsp �ڵ� import ����Ű, �ش� Ŭ���� Ŭ�� �� ��Ʈ�� + ����Ʈ + m
	//MemberDAO3 dao = new MemberDAO3();
	//dao.delete(bag);
	
	MemberDAO3 dao = new MemberDAO3();
	dao.delete(id);
	
	%>
	<!-- ���������� ����� �˷��ֱ� ���� html�ڵ尡 �̸� �� ���� -->

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ������</title>
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
���� ��û�Ǿ���
<hr color = "red">
������ id : <%= id %>

</body>
</html>