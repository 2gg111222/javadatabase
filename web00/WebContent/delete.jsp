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

</body>
</html>