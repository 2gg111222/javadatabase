package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제 {
	public static void main(String[] args) {
		
		/* 정리문제1
		 * Scanner sc = new Scanner(System.in); int[] s = new int[5]; for (int i = 0; i
		 * < s.length; i++) { s[i] = sc.nextInt();
		 * 
		 * } int min = s[0]; sc.close();
		 * 
		 * for (int i : s) { if (i < min) { min = i; } } System.out.println(min);
		 */
		
		/* 정리문제2
		 * Random r = new Random(100); int[] s = new int[20]; for (int i = 0; i <
		 * s.length; i++) { s[i] = r.nextInt(900); } Arrays.sort(s); //원본을 바꿔버림(파괴형 함수)
		 * int max = s[0];
		 * 
		 * 
		 * for (int x : s) { if (x > max) { max = x; } //for }
		 * System.out.println("최댓값은 " + max); System.out.println("최대값은 " + s[19]);
		 */
		
		//정리문제3
		String s1 = "참좋다", s2 = "진짜좋다";
		System.out.println(s1.equals(s2));
		
		int n1 = s1.length();
		int n2 = s2.length();
		if(n1>n2) {
			System.out.println("s1이 더 크다.");
		}else {
			System.out.println("s2가 더 크다.");
		}
		//정리문제4
		System.out.println("4.-----------");
		String s3 = "나는 진짜 java programmer가 되었어";
		String result = s3.substring(6,21);
		System.out.println(result);
		System.out.println(result.toUpperCase());
	
		//정리문제5
		System.out.println("5.-----------");
		String s4 = "205621";
		char result2 = s4.charAt(0);
		if(result2== '1') {
			System.out.println("남자임");
		}else {
			System.out.println("여자임");
		}
	}
}
