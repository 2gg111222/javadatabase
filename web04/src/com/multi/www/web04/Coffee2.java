package com.multi.www.web04;

public class Coffee2 {
	int price = 5000;
	String name = "핸드드립";

	public static Coffee2 coffee2; //null로 초기화 되어있음, 전역변수
	
	public static Coffee2 getInstance() {
		if(coffee2 == null) {
			coffee2 = new Coffee2();
		}
		return coffee2;
	}
	

	private Coffee2() {
		// TODO Auto-generated constructor stub
	}
	
	
}
