<%@page import="multi.ProductVO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
   <jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>
   <jsp:setProperty property="*" name="bag"/>
    
    <!-- �������� ���� �����͸� �޾ƾ� ��. ==> �ڹٷ� ¥����. -->
	<!-- �������� ���� �����͸� ���� �� ����ϴ� ��ǰ �ʿ��� -->
	

	<% 
	
	ProductDAO dao = new ProductDAO();
	dao.insert(bag); 
	
/* 	// 1. ���޵Ǵ� ���� ��������.
	String id =request.getParameter("id"); 
	String name =request.getParameter("name"); 
	String content =request.getParameter("content");
	String price =request.getParameter("price"); 
	String company =request.getParameter("company"); 
	String img =request.getParameter("img");
	
	//jsp���� �ڵ�Import - �ش�Ŭ���� Ŭ���� ���� ��Ʈ�� + ����Ʈ + m
	
	// 2. dao���� �����͸� �ֱ����� ������ ���� ���� ��������!
	
	ProductVO bag = new ProductVO();
	bag.setId(id);
	bag.setName(name);
	bag.setContent(content);
	bag.setPrice(Integer.parseInt(price));
	bag.setCompany(company);
	bag.setImg(img);
	
	// 3. dao���� ������ �ָ鼭 insert�ش޶�� ��û���ּ���
	ProductDAO dao = new ProductDAO();
	dao.insert(bag); */
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

	<img src="img/<%= bag.getImg() %>"   width=200  height=200>
	<td><input name="img" type="file"></td>
</body>
</html>