<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<script type="text/javascript">
	body
	{
		background: yellow;
	}
</script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원데이터 처리 요청이 완료되었습니다.

	<!-- bag.getId()  -->
	<%--model의 속성으로 전달받은 bag은 EL로 출력한다. --%>
	<!--EL: 속성으로 지정한 값 꺼내서 출력해주세요!라는 의미-->	
	
	<c:forEach items = "${list}" var="bag">
	${bag.id}<br><!-- 출력용(expression language-EL)  -->
	${bag.pw}<br> 
	${bag.name}<br> 
	${bag.tel}<br>
	</c:forEach>

</body>

</html>