package 자바db연결;

import java.util.Scanner;

public class 회원탈퇴 {

	public static void main(String[] args) {
		
		//입력해보자.
		Scanner sc = new Scanner(System.in);
		// 모든 변수값이 들어갈수있게 Scanner로 설정
		
		System.out.println("id를 입력하세요.");
		//공지문 출력
		String id = sc.next();
		
		MEMBERDAO2 dao = new MEMBERDAO2();
		//class명 MEMBERDAO2 회원가입2에 불러옴 이름은 dao로 해서
		dao.delete(id);
		//crud중 c에 해당하는 insert값만 쓸거다라 선언, 들어갈 값은 위에서 넣은 값으로 해서 한다.

	}

}
