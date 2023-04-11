package 프로그래머스;

import java.util.Arrays;

public class 배열의연산 {

	public static void main(String[] args) {
		// 세수를 더했을 때 가장 큰 숫자를 구하시오.
		// 배열이 오름차순으로 정렬이 되어있는 상태
		Solution3 sol = new Solution3();
		Solution4 sol1 = new Solution4();
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int[] numbers1 = {-10,-11,1,2,3,4,5,6,7,8,9,10,105};
		int answer = sol.solution(numbers);
		int answer1 = sol1.solution(numbers1);
		
		System.out.println(answer);
		System.out.println(answer1);
	}
}
	class Solution3{
		public int solution(int[] numbers) {
			Arrays.sort(numbers);//파괴형! 원본 수정
			int post =  
					numbers[numbers.length -2 ] * 
					numbers[numbers.length -1 ];
				//음수와 양수가 섞여 있을 경우도 생각해야함
				int pre = numbers[0]*numbers[1];
				int answer = 0;
				if(post > pre) {
					answer = post;
				}else {
					answer = pre;
				}
				
				return answer;
		}
		
	}

	class Solution4{
		public int solution(int[] numbers) {
			int answer1 =  numbers[numbers.length -2 ]* numbers[numbers.length -1 ];
			
					return answer1;
		}
	}

