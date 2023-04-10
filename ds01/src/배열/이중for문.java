package 배열;


public class 이중for문 {
	public static void main(String[] args) {
		int[] s = {90,80,70,60,50};
		int min = s[0];
		
		for(int x : s) {
			if(x < min) min = x;
		}
		System.out.println("최솟값은" + min);
	}
}
