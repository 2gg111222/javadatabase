package 배열문제;
import java.util.*;
public class 중앙값구하기 {
	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		// 배열에 들어간 하나의 값:element,엘리먼트
		// 홀수개 
		String s2 = Arrays.toString(s);
		System.out.println(s2);
		//1, 3, 5 ==> 3(인덱스 1)
		//14, 67, 21, 89, 24 ==> 정렬후 ==> 가운데!
		//14, 21, 24, 67, 89 ==> 24(인덱스 2)
		//가운데위치를 구하는 방법
		//배열의 길이 3 / 2 = 1
		//            5 / 2 = 2
		for (int i = 0; i < s.length; i++) {
			
		}
		//1. 정렬을 먼저 하자
		Arrays.sort(s); //파괴! 
		System.out.println(Arrays.toString(s));
		
		//2. 중앙위치를 구하자 
		int center = s.length / 2;
		
		//3. 배열의 중앙위치값을 get!
		int answer = s[center];
		
		System.out.println(answer);
}
}
/*
 * import java.util.*; class Solution { public int solution(int[] array) { int
 * answer = 0; Arrays.sort(array); System.out.println(Arrays.toString(array));
 * 
 * 
 * int center = array.length / 2;
 * 
 * 
 * answer = array[center]; return answer; } }
 */
