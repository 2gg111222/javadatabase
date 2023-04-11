package 프로그래머스;

import java.util.Scanner;

public class 두수의곱 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Solution1 sol = new Solution1();
		int answer = sol.solution1(num1, num2);
		System.out.println(answer);
		sc.close();
	}
}
	class Solution1 {
	    public int solution1(int num1, int num2) {
	        int answer = num1 - num2;
	        return answer;
	    	}
	}

	class Solution {
	    public int solution(int num1, int num2) {
	        int answer = 0;
	        if (num1 == num2 ) {
				answer = 1;
			}else {
				answer = -1;
			}
				
	        return answer;
	        for (int n = 0; n < n.length; n++) {
				answer =n*(n-1);
			}
	    }
	}