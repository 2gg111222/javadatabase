<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<!-- 이건 구글에서 jquery 받아오는거 -->
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey="></script>
	
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "one23",
				data : {id : "apple"},
				dataType : "json",
				success : function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel
					$('#result').append(id + " " + pw  + " " + name + " " + tel + " " +"<br>")
				}
			})
		})
		$('#b11').click(
				function() {
					$.ajax({
						url : "list56",
						dataType : "json",
						success : function(json) {
							id = json[1].id
							pw = json[1].pw
							name = json[1].name
							tel = json[1].tel
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
						url : "list56",
						dataType : "json",
						success : function(json) {
							id = json[1].id
							pw = json[1].pw
							name = json[1].name
							tel = json[1].tel
							table = "<ul><li>" + id + "</li>" + "<li>" + pw
									+ "</li>" + "<li>" + name + "</li>"
									+ "<li>" + tel + "</li></ul>"
							$('#result').append(table)
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
	
	$('#b3').click(function() {
			$.ajax({
				url : "jsonResopnse5",
				dataType : "json",
				success : function(json) {
					lat = json.lat
					lon = json.lot
	
			var container = document.getElementById('map');
			var options = {
				center: new kakao.maps.LatLng(lat, lot),
				level: 3
			};

			var map = new kakao.maps.Map(container, options);
				
			var markerPosition  = new kakao.maps.LatLng(lat, lot); 

			// 마커를 생성합니다
			var marker = new kakao.maps.Marker({
			    position: markerPosition
			});

			// 마커가 지도 위에 표시되도록 설정합니다
			marker.setMap(map);	
				} //success
			}) //ajax
		})
	})
</script>

<body>
	<button id="b1">컨트롤러에서 member JSON을 받아오자.!</button>
	<button id="b11">컨트롤러에서 member JSON(list)를 받아오자.!</button>
	<button id="b12">컨트롤러에서 member JSON(table)를 받아오자.!</button>
	<button id = "b3">컨트롤러에서 지도를 받아오자!</button>
	
	<button id="b4">컨트롤러에서 차트를 받아오자.!</button>

	<div id="result"></div>
	<div id="map" style="width:500px;height:400px;"></div>
</body>