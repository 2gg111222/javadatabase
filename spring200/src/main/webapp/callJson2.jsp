<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- content delivery network : CDN -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<!-- 이건 구글에서 jquery 받아오는거 -->
<script type="text/javascript">
	$(function() {
		$('#b1').click(
				function() {
					$.ajax({
						url : "json1",
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							$('#result').append(
									id + " " + pw + " " + name + " " + tel
											+ "<br>")
						}
					})
				})
		$('#b11').click(
				function() {
					$.ajax({
						url : "json1",
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							table = "<table><tr><td>항목명</td><td>값</td></tr>"
									+ "<tr><td>아이디</td><td>" + id
									+ "</td></tr>" + "<tr><td>패스워드</td><td>"
									+ pw + "</td></tr>" + "<tr><td>이름</td><td>"
									+ name + "</td></tr>"
									+ "<tr><td>전화번호</td><td>" + tel
									+ "</td></tr><table>"
							$('#result').append(table)
						}
					})
				})
		$('#b12').click(
				function() {
					$.ajax({
						url : "json1",
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							table = "<ul><li>" + id + "</li>" + "<li>" + pw
									+ "</li>" + "<li>" + name + "</li>"
									+ "<li>" + tel + "</li></ul>"
							$('#result').append(table)
						}
					})
				})

		$('#b2').click(
				function() {
					$.ajax({
						url : "json2.jsp",
						dataType : "json",
						success : function(json) {
							age1 = json[1].age
							name1 = json[1].name
							id1 = json[1].id
							$('#result').append(
									age1 + " " + name1 + " " + id1 + "<br>")
						}
					})
				})
		$('#b3').click(
				function() {
					$.ajax({
						url : "json3",
						dataType : "json",
						success : function(json) {
							no = json.no
							content = json.content
							writer = json.writer
							$('#result').append(
									no + " " + content + " " + writer + "<br>")

						}
					})
				})

		$('#b4').click(function() {
			$.ajax({
				url : "json4",
				dataType : "json",
				success : function(json) {
					no = json[0].no
					content = json[0].content
					$('#result').append(no + " " + content + "<br>")
				} //success
			}) //ajax
		})
	})
</script>

</head>
<body>
	<button id="b1">컨트롤러에서 JSON을 받아오자.!</button>
	<button id="b11">컨트롤러에서 JSON(다른모양)을 받아오자.!</button>
	<button id="b12">컨트롤러에서 JSON(다른모양)을 받아오자.!</button>
	<button id="b2">컨트롤러에서 JSONArray을 받아오자.!</button>
	<button id="b3">컨트롤러에서 JSON3을 받아오자.!</button>
	<button id="b4">컨트롤러에서 JSONArray4을 받아오자.!</button>

	<div id="result"></div>
</body>