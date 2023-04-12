package 프로그래머스기본;

public class 피자나눠먹기3 {

	public static void main(String[] args) {
		int n = 15;
		Solution5 sol = new Solution5();
		int answer = sol.solution(n);
		System.out.println(answer);
	}
}

class Solution5 {
	   public int solution(int n) {
	        int answer = 0; //주문할 피자수
	 
	        for(int i = 1; i <= n; i++){
	            if(i * 6 % n == 0) {
	                answer = i;
	                break;
	            }
	        }
			return answer;
	        
			/*
			 * int i = n / 2; int j = n / 3; int k = n / 6; 
			 * if(n % 6 == 0){ answer = k; }
			 * else if (n % 2 == 0) { answer = i; }else if (n % 3 == 0) { answer = j; }else{
			 * answer = n; } return answer;
			 */
	    }
}