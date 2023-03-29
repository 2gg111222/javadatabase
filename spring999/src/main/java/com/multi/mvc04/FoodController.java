package com.multi.mvc04;

import org.springframework.web.bind.annotation.RequestMapping;

public class FoodController {
	
	@RequestMapping("food")
	public String food(FoodVO bag) {
		System.out.println("브라우저로 전달받은 값은 " + bag);
		String like = bag.getLike();
		String dislike = bag.getDislike();
		if(like.equals("라면")) {
			return "like";
		}//return "drama" 하나만 해놓으면 모든 return값 충족 못해서 String movie 오류되서 실행X 
		if (dislike.equals("커피")) {
			return "dislike";	
		}
		if (like.equals("아무거나")) {
			return "redirect:member.jsp";	
		}
		else {
			return "food";
		}
	}
}
