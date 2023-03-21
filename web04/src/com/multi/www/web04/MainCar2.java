package com.multi.www.web04;

public class MainCar2 {
		public static void main(String[] args) {
			Car car = new Car( "빨강",10, 200); //12byte
			Car car2 = new Car( "파랑",10, 250); //12
			Car car3 = new Car( "검정색",30, 300); //12
			System.out.println(car);
		}
}
