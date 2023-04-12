package 프로그래머스기본;

public class 피자나눠먹기2 {

	public static void main(String[] args) {
		int n = 15;
		
		Solution4 sol = new Solution4();
		int answer = sol.solution(n);
		System.out.println(answer);
	}
}

class Solution4 {
	   public int solution(int n) {
	        int answer = 0; //주문할 피자수
	        
	        if(n<= slice){
	            answer =1;
	        }else if(n % slice == 0){
	          answer =   n / slice;
	        }else {
	          answer =   n/ slice +1;
	        }
	        return answer;
	    }
}