package com.multi.mvc04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class MovieController {
	// 자꾸 Controller를 import 안함
	@RequestMapping("movie")
	public String movie(String movie) {
		System.out.println("브라우저로 전달받은 값은 " + movie);
		if(movie.equals("드라마")) {
			return "drama";
		}//return "drama" 하나만 해놓으면 모든 return값 충족 못해서 String movie 오류되서 실행X 
		else if (movie.equals("코믹")) {
			return "comic";	
		}
		else {
			return "action";
		}
	}
}
