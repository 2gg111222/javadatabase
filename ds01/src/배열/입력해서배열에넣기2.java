package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] numbers = new double[6];	
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
		for (double x : numbers) {
			System.out.println(x);
		}
	
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]== 55.5) {
				System.out.println("55.5의 위치는 "+i);
			}
		
		}
	}
}