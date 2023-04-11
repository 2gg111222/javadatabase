package 문자열;

import java.util.Arrays;
import java.util.List;

public class 스트링비교2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		String[] all2 = all.split(",");
		System.out.println(all2.length);
		System.out.println(all2[1]);
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].contains(" ")) {
				all2[i] = all2[i].trim();
			}
		}
		System.out.println(all2[1]);

		System.out.println("과목수: " + all2.length);
		System.out.println(Arrays.toString(all2));
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].equals("컴퓨터")) {
				System.out.println(i);
			}
		}
		
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].length() < 3) {
				count++;
			}
		}
		System.out.println(count);
		
		List<String> list = Arrays.asList(all2);
		System.out.println(list.indexOf("컴퓨터"));
	}
}