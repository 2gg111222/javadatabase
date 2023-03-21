package com.multi.www.web04;

public class CoffeeMania2 {

	public static void main(String[] args) {
		
		Coffee2 c1 = Coffee2.getInstance();
		Coffee2 c2 = Coffee2.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
