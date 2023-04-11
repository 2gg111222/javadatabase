package 문자열;

import java.util.Arrays;


public class 스트링을배열로2 {
	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		//공백 없에기 1
		/* String[] all2 = all.split(", "); */
		//공백 없에기 2
		String[] all2 = all.split(","); 
		for (int i = 0; i < all2.length; i++) {
			// 바로 돌리려면 
			//all2[i] = all2[i].trim();
			// 좀 더 낭비 안하려면			
			if(all2[i].contains(" ")) {
				all2[i] = all2[i].trim();
			}
				
		}
		System.out.println(all2[0]);
		System.out.println(all2[1]);
		System.out.println(all2[2]);
		System.out.println(all2[3]);
	
		//다른 방식으로 다나오게함
		System.out.println(Arrays.toString(all2));
		
		System.out.println("과목수 : " + all2.length);

		for (int i = 0; i < all2.length; i++) {
			if(all2[i].equals("컴퓨터")) {
				//컴퓨터 위치 찾기
				System.out.println(i);
			}
		}
		//쉽게 위치 구하는 방법
		//List<String> Arrays.asList(all2);;
		//System.out.println(list.indexOf("컴퓨터"));
		
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].length() < 3 ) {
				count++;
			}
		}
	System.out.println(count);
	}
}
