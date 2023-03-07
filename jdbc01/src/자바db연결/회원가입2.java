package 자바db연결;

import java.util.Scanner;

public class 회원가입2 {

	public static void main(String[] args) {
		
		//입력해보자.
		Scanner sc = new Scanner(System.in);
		// 모든 변수값이 들어갈수있게 Scanner로 설정
		
		System.out.println("id/pw/name/tel순으로 입력하세요.");
		//공지문 출력
		String id = sc.next();
		//String 형식 id값 넣기
		String pw = sc.next();
		//String 형식 pw값 넣기
		String name = sc.next();
		//String 형식 name값 넣기
		String tel = sc.next();
		//String 형식 tel값 넣기
		
		MEMBERDAO2 dao = new MEMBERDAO2();
		//class명 MEMBERDAO2 회원가입2에 불러옴 이름은 dao로 해서
		dao.insert(id,pw,name,tel);
		//crud중 c에 해당하는 insert값만 쓸거다라 선언, 들어갈 값은 위에서 넣은 값으로 해서 한다.

	}

}
