function 로그인() {
	//var 또는 let 사용 생략가능 id2 = 'root';
	id2 ='root';
	id = prompt('아이디 입력')
	if (id==id2) { //==
		alert('로그인 성공')
	} else {
		alert('로그인 실패')
		
	}
	
}
	function 비교() {
		n1 = 100
		n2 = 200
		
		if (n1 == n2) {
			alert("두 숫자가동일하다")
		} else {
			alert("두 숫자가 동일하지 않다")
		}
		
		친구의기분 = prompt('굿, 별로, 나빠 중 입력')
		나의기분 = prompt('굿, 별로, 나빠 중 입력')
		if (친구의기분 == 나의기분) {
			alert("기분이 동일하다")
		} else {
			alert("기분이 동일하지 않다")
		}
		
		
		
}

