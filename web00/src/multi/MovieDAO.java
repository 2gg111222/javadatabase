package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MovieDAO {
	
	public MovieVO one(String id) {
		ResultSet rs = null; 
		
		MovieVO bag  = null;
		try {
			//1. mySQL과 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			//2. mySQL에 연결해보자.(java --- mySQL)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";

			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mySQL 연결 성공.");
		

		   // ipaddress ==> InetAddress
		   // String url = "http://wwww.naver.com";
		   // URL u = new URL(url);
		   // 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
		   // 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
		   // SQL부품으로 만들어주어야 함.
		   // PreparedStatement가 SQL부품!!

		   String sql = "select * from movie where id = ? ";
		   PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
		   ps.setString(1, id);
		   // con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
		   System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

		   rs = ps.executeQuery();
		   System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				//true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음, 검색 성공");
				String id2 = rs.getString(1);
				String Title = rs.getString(2);
				String Content = rs.getString(3);
				String location = rs.getString(4);
				String director = rs.getString(5);
				System.out.println(id2 + " " + Title + " " + Content +" " + location + " " + director);
				//검색결과를 검색화면 UI부분을 주어야함
				bag = new MovieVO();
				
				bag.setId(id2);
				bag.setTitle(Title);
				bag.setContent(Content);
				bag.setLocation(location);
				bag.setDirector(director);
				
			}else {
				System.out.println("검색결과 없음, 검색 실패");
			}
		   
		  
		   
		   // System.out.println(result);
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		return bag;

		 }
	
	public void delete(String id) {
		  try {
			//1. mySQL과 연결한 부품 설정
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

				//2. mySQL에 연결해보자.(java --- mySQL)
				String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";

				String user = "root";
				String password = "1234";
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2.mySQL 연결 성공.");
	
		   // ipaddress ==> InetAddress
		   // String url = "http://wwww.naver.com";
		   // URL u = new URL(url);
		   // 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
		   // 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
		   // SQL부품으로 만들어주어야 함.
		   // PreparedStatement가 SQL부품!!

		   String sql = "delete from movie where id = ? ";
		   PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
		   ps.setString(1, id);
		   // con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
		   System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

		   ps.executeUpdate();
		   System.out.println("4. SQL문 오라클로 보내기 성공.");
		   
		   
		   
		   // System.out.println(result);
		  } catch (Exception e) {
		   e.printStackTrace();
		  }

		 }
	public void update(MovieVO bag) {
		try {
			//1. mySQL과 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			//2. mySQL에 연결해보자.(java --- mySQL)
			// DBeaver에서 mySQL에 오른쪽마우스 -> edit connection 누르고 정보확인
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";

			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mySQL 연결 성공.");

			// 3.
			// ipaddress 의 부품 ==> InetAddress
			// String url = "http://www.naver.com"; 이렇게 해도 url을 부품으로 인식 못합
			// URL u = new URL(url); 이것도 해주어야 부품으로 인식 가능
			// 자바는 부품조립식 이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식 하려면 그 부품으로 만들어 주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement 가 SQL부품!!

			String sql = "update movie set CONTENT = ? where id = ? "; // id가 ?인(조건) tel을 ?로 바꾸어라.
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getContent());
			ps.setString(2, bag.getId());
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
	public void insert(MovieVO bag) {
		
		try {
			//1. mySQL과 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			//2. mySQL에 연결해보자.(java --- mySQL)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";

			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mySQL 연결 성공.");
		
		
			
			//ipaddress => InetAddress
			//String url = "http://www.naver.com";
			//URL u = new URL(url); 
			//자바는 부품조립식이여서, String에 넣을 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함
			//PreparedStatement가 SQL부품!!
			
			
			//public void insert(String id,String pw,String name,String tel)
			String sql = "insert into movie values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품 으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			//ps부품안에 값넣기
			//언어 R빼고, 인덱스 0부터 시작!!
			//유일하게 DB는 인덱스가 1부터 시작!!

			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getLocation());
			ps.setString(5, bag.getDirector());

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
//sql문 만듬

