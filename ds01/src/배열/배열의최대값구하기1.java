package 배열;

import java.util.Random;

public class 배열의최대값구하기1 {
	public static void main(String[] args) {
		Random r = new Random(100);
		int[] s = new int[1000];
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000);
		}
			int max = s[0];
		
			
		for (int x : s) {
			if (x > max) {
				max = x;
			} //for
		}	
		System.out.println("최댓값은 " + max);
	}
}
