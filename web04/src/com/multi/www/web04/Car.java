package com.multi.www.web04;

public class Car {

		String color;
		int price;
		int speed;
		
		public Car(String color, int price, int speed) {
		
			this.color = color;//주소(4바이트)
			this.price = price;//4개
			this.speed = speed;//4개

		}

		/*
		 * @Override public String toString() { return "Car [color=" + color +
		 * ", price=" + price + ", speed=" + speed + "]";
		 * 
		 * }
		 */
		
}
