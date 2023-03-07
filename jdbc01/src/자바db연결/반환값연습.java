package 자바db연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

import oracle.net.aso.e;

public class 반환값연습 {

	//부품은 기능을 처리하기 위해서 만든 부품.
	//휴대폰의 기능!!! ==> 함수(메서드)
	//자동완성 == > 컨트롤+ 스페이스바
	
	public void add2() {
		System.out.println("더하기 기능을 수행합니다.");
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	//자바는 입력값이 다르다면, 메서드 이름을 동일하게 사용 할 수 있다.
	
	public double add(double x, int y) {
		return x+y;
	
	}
	
	public String add(String x, String y) {
		return  x+y; // +연산자인 경우 하나라도 String이면 무조건 결과는 String!!
	}
	
	public String add(int x, String y) {
		return  x+y; // +연산자인 경우 하나라도 String이면 무조건 결과는 String!!		
	}
	
	public int[] add() {
		int[] x = {1,2,3};
		return x; // x앞에 있는 타입 int[]을 써준다.!
	}
	
	public Date getDate() {
		Date date = new Date(); //import java.util.Date;
		return date; //년월일시분초요일 다 넘김, 그래서 date를 통채로 사용하닌 함수명으로 써줌
	}
	
	public Random getRandom() {
		Random r = new Random();
		return r;
	}
	
	public int getRandom2() {
		Random r = new Random();
		return r.nextInt(); // -21억~ r을 이용해서 Int를 넘김
	}
	
	public  int getHour() {
		Date date = new Date(); //import java.util.Date;
		return date.getHours(); //시간 1시 2시같은, 즉, 정수 얘도 date를 이용해서 시간만 넘김
	}
	
	public ArrayList getList() {
		ArrayList list= new ArrayList();
		list.add("감자");
		list.add("고구마");
		return list;
	}
	
	public HashSet getSet() {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("펜");
		return bag;
	}
//	public Connection getConnection(String url, String user, String password) {
//	//연결처리..
//	Connection con = 연결처리하는 커넥션..;
//	return con;
//  }
	
	
}
