package 자바db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import 화면db연결.MemberVO;

public class MEMBERDAO3 {
	public int delete(String id){
		//MemberUI2와 연동
		int result = 0;
		
		try {
			//1. 오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공.");

			//2. 오라클 11g에 연결해보자.(java --- oracle)
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");
		
			
			//ipaddress => InetAddress
			//String url = "http://www.naver.com";
			//URL u = new URL(url); 
			//자바는 부품조립식이여서, String에 넣을 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함
			//PreparedStatement가 SQL부품!!

			String sql = "delete from HR.member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);//PreparedStatement
			ps.setString(1, id);
			//con부품 으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (result == 1 ) {
				System.out.println("탈퇴 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;	
	}
	
	public int update(MemberVO bag){
		
		int result = 0;
		
		try {
			//1. 오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공.");

			//2. 오라클 11g에 연결해보자.(java --- oracle)
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");
		
			
			//ipaddress => InetAddress
			//String url = "http://www.naver.com";
			//URL u = new URL(url); 
			//자바는 부품조립식이여서, String에 넣을 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함
			//PreparedStatement가 SQL부품!!

			String sql = "update hr.MEMBER set tel = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());
			//con부품 으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();//insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if(result == 1) {
				System.out.println("수정 성공.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//public void add2() {
	public int insert(MemberVO bag) {
		int result =0;
		
		try {
			//1. 오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			//2. 오라클 11g에 연결해보자.(java --- oracle)
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");
		
			
			//ipaddress => InetAddress
			//String url = "http://www.naver.com";
			//URL u = new URL(url); 
			//자바는 부품조립식이여서, String에 넣을 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함
			//PreparedStatement가 SQL부품!!
			
			
			//public void insert(String id,String pw,String name,String tel)
			String sql = "insert into HR.MEMBER values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품 으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			//ps부품안에 값넣기
			//언어 R빼고, 인덱스 0부터 시작!!
			//유일하게 DB는 인덱스가 1부터 시작!!
			
			//2. 가방에서 값들을 하나씩 꺼내쓰세요.
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			//==> insert into hr.MEMBER values ('a','a','a','a');
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
			System.out.println(result);
		} catch (Exception e) {
			//insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			//catch가 실행
			//실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			//result = 0;
			e.printStackTrace();
			//e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}


}

//커넥터설정
//db연결 성공
//sql문 만ㄷ
//