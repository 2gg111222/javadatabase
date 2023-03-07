package 자바db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BBSDAO {
	public void delete(int NO) {
		  try {
		   // 1.오라클 11g와 연결한 부품 설정
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
		  
		   // 2.오라클 11g에 연결해보자.(java --- oracle)
		   String url = "jdbc:oracle:thin:@localhost:1521:xe";
		   String user = "system";
		   String password = "oracle";
		   Connection con = DriverManager.getConnection(url, user, password); // Connection
		   // String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
		   System.out.println("2. 오라클 연결 성공.");

		   // ipaddress ==> InetAddress
		   // String url = "http://wwww.naver.com";
		   // URL u = new URL(url);
		   // 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
		   // 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
		   // SQL부품으로 만들어주어야 함.
		   // PreparedStatement가 SQL부품!!

		   String sql = "delete from HR.BBS where NO = ? ";
		   PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
		   ps.setInt(1, NO);
		   // con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
		   System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

		   ps.executeUpdate();
		   System.out.println("4. SQL문 오라클로 보내기 성공.");

		   // System.out.println(result);
		  } catch (Exception e) {
		   e.printStackTrace();
		  }

		 }
	public void update(int NO, String CONTENT) {
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// DBeaver에서 oracle에 오른쪽마우스 -> edit connection 누르고 정보확인
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			// String data = JOptionPane.showInputDialog("이름");//input을 string 넣어준것처럼 !!
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. 오라클 연결 성공.");

			// 3.
			// ipaddress 의 부품 ==> InetAddress
			// String url = "http://www.naver.com"; 이렇게 해도 url을 부품으로 인식 못합
			// URL u = new URL(url); 이것도 해주어야 부품으로 인식 가능
			// 자바는 부품조립식 이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식 하려면 그 부품으로 만들어 주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement 가 SQL부품!!

			String sql = "update HR.BBS set CONTENT = ? where NO = ? "; // id가 ?인(조건) tel을 ?로 바꾸어라.
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, CONTENT);
			ps.setInt(2, NO);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			//int 일때는 ps.setInt(2, NO);

			// 4.
			ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//public void add2() {
	public void insert(int NO,String TITLE,String CONTENT,String WRITER) {
		
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
			
			
			//public void insert(String id,String pw,String name,String tel)
			String sql = "insert into HR.BBS values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품 으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			//ps부품안에 값넣기
			//언어 R빼고, 인덱스 0부터 시작!!
			//유일하게 DB는 인덱스가 1부터 시작!!
			
			ps.setInt(1, NO);
			ps.setString(2, TITLE);
			ps.setString(3, CONTENT);
			ps.setString(4, WRITER);
			//==> insert into hr.MEMBER values ('a','a','a','a');
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
		
	

}

//커넥터설정
//db연결 성공
//sql문 만ㄷ
//