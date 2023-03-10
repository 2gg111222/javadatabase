package project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import project01.관리자VO;

public class 관리자DAO {
	
	public int login(관리자VO bag){
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

			String sql = "select * from HR.관리자 where id = ? and pw = ?  ";
			PreparedStatement ps = con.prepareStatement(sql);//PreparedStatement
			
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			
			//con부품 으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");
			
			ResultSet rs = ps.executeQuery();
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (rs.next() ) {
				System.out.println("결과");
				result = 1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;	
	}
	
	
public 관리자VO one(String id){
		
		
		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블
		//기본형 정수/실수/문자/논리만 값으로 초기화
		//나머지 데이터형(참조형) 주소!가 들어가 있음.

		관리자VO bag = null;

		
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

			String sql = "select * from HR.관리자 where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);//PreparedStatement
			ps.setString(1, id);
			//con부품 으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");
			
			
			rs = ps.executeQuery(); //select문 전송시
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				//true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음, 검색 성공");
				String id2 = rs.getString(1);
				String pw = rs.getString(2);
				
				System.out.println(id2 + " " + pw );
				//검색결과를 검색화면 UI부분을 주어야함
				bag = new 관리자VO();
				bag.setId(id2);
				bag.setPw(pw);
				
				
			}else {
				System.out.println("검색결과 없음, 검색 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//return id, pw, name, tel은 XXXXX!
		//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야함
		return bag;	
	}
	
	public int delete(관리자VO bag){
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

			String sql = "delete from HR.관리자 where id = ? and pw = ?  ";
			PreparedStatement ps = con.prepareStatement(sql);//PreparedStatement
			
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			
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
	
	public int update(관리자VO bag){
		
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

			String sql = " update hr.관리자  set pw = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getPw());
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
	public int insert(관리자VO bag) {
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
			String sql = "insert into HR.관리자 values (?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품 으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			//ps부품안에 값넣기
			//언어 R빼고, 인덱스 0부터 시작!!
			//유일하게 DB는 인덱스가 1부터 시작!!
			
			//2. 가방에서 값들을 하나씩 꺼내쓰세요.
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
		
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

