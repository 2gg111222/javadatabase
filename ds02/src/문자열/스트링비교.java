package 문자열;

import java.util.Arrays;

public class 스트링비교 {

	public static void main(String[] args) {
	String s = "정길동";
	String s2 = "정길동";
	//String은 s를 프린트할 때, 그 주소가 가르키는 char를 프린트되게
	//재정의 되어있는 객체(toString() 오버라이드)
	System.out.println(s);
	System.out.println(s2);
	//String이 가르키는 char들이 동일한지 equals()
	System.out.println(s.equals(s2));
	//String이 들어있는 주소가 동일한지 비교 ==
	System.out.println(s == s2);
	s = "김길동";
	System.out.println(s.equals(s2));
	System.out.println(s == s2);
	
	//String은 데이터가 변경되는 경우
	//새로운 곳에 String을 저장할 변수를 생성한다. 
	//메모리 관리부분에서 비효율적
	//String을 사용하는 것은 좋으나,
	//String의 값이 자주 변경되는 경우는 비효율적!
	
	StringBuilder s3 = new StringBuilder();
	s3.append("송길동");
	System.out.println(s3);
	
	}
}