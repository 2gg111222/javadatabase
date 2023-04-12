package 배열문제;

import java.util.*;

public class 배열자르기 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int start = 2;
		int end = 4;

		Solution5 sol = new Solution5();
		int[] answer = sol.solution(array, start, end);
		System.out.println(Arrays.toString(answer));
	}
}
class Solution5 {
	public int[] solution(int[] array, int start, int end) { 
		int total = end - start + 1;//추출개수 3 - 1 + 1
		int[] answer = new int[total]; //{0, 0, 0}
		//1.반복문 돌려서 
		//  답이 들어가는 배열에 하나씩 넣어주어야 함.
		//  0 ~ 2
		//2.array의 start부터 end까지 하나씩 꺼내서!
		//  start ~ end
		for(int i = 0; i < total; i++) {// 0 ~ 2
			answer[i] = array[start]; //1
			start++; //2
		}
		return answer;
	}
}