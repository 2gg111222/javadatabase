<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		//기존의 것 삭제됨.
		$('#result').empty()
		$.ajax({
			url : "update4",
			success : function(x) {
				$('#result').append(x)
			} //success
		}) //ajax
	})//b1
	$('#b2').click(function() {
		$('#result').empty()
		$.ajax({
			url : "delete4",
			data : {
				bbsno : 
			},
			success : function(x) {
				$('#result').append(x)
			} //success
		}) //ajax
	})//b2
	
})
</script>

</head>
<body>
		<button id = "b1">수정</button>
		<button id = "b2">삭제</button>
	
		
	<hr color = "red">
	<div id = "result" style = "background: yellow"></div>

</body>
</html>