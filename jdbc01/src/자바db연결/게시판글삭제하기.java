package 자바db연결;

import java.util.Scanner;


public class 게시판글삭제하기 {

	 public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in); // 스캐너 메소드를 이용하여 키보드 입력값을 받음.
	  System.out.println("삭제할 no를 입력하세요."); // 입력할 값 안내 콘솔에 프린트.
	  int NO = sc.nextInt(); //콘솔을 통해 변수 id 입력 및 저장.

	  BBSDAO dao = new BBSDAO(); // MemberDAO2 클래스 선언.
	  //상기 클래스의 insert 메소드 호출하여 콘솔을 통해 입력받은.
	  dao.delete(NO);

	 }

	}
