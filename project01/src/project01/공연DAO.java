package project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class 공연DAO {
		public 공연VO one(String 제목) {
			ResultSet rs = null;
			공연VO bag = null;
			try {	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");

			String sql = "select * from HR.공연 where 제목 = ?";
			PreparedStatement ps = con.prepareStatement(sql);//PreparedStatement
			
			ps.setString(1, 제목);
			//con부품 으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");
			
			
			rs = ps.executeQuery(); //select문 전송시
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				//true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음, 검색 성공");
				String 제목2 = rs.getString(1);
				
				
				System.out.println(제목2 );
				//검색결과를 검색화면 UI부분을 주어야함
				bag = new 공연VO();
				bag.set제목(제목2);
				
				
				
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
		public 공연VO 출력() {
			ResultSet rs = null;
			공연VO bag = null;
			try {	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");

			String sql = "select 제목 from HR.공연 order by 제목 desc ";
			PreparedStatement ps = con.prepareStatement(sql);//PreparedStatement
			
			
			//con부품 으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");
			
			
			rs = ps.executeQuery(); //select문 전송시
			System.out.println("4.SQL문 오라클로 보내기 성공");
			
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				//true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음, 검색 성공");
				bag = new 공연VO();
				String 제목5 = rs.getString(1);
				bag.set제목(제목5);
				
				System.out.println(제목5 );
				//검색결과를 검색화면 UI부분을 주어야함	
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//return id, pw, name, tel은 XXXXX!
		//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야함
		return bag;	
	}
			
			
}

