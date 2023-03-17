package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PlayerDAO {

	public PlayerVO one(String backnumber) {
		//검색결과가 null이 뜨는 경우에는
		//입력값인 id를 출력해보세요.!!
		System.out.println(backnumber);
		//출력값(리턴값)을 출력해보세요.
		ResultSet rs = null;

		PlayerVO bag = null;
		try {
			// 1. mySQL과 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2. mySQL에 연결해보자.(java --- mySQL)
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

			String sql = "select * from Player where backnumber = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, backnumber);
			
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				bag = new PlayerVO();

				bag.setBacknumber(rs.getString("backnumber"));
				bag.setName(rs.getString("name"));
				bag.setHeight(rs.getString("height"));
				bag.setWeight(rs.getString("weight"));
				bag.setTeam(rs.getString("team"));
				bag.setImg(rs.getString("img"));

			} else {
				System.out.println("검색결과 없음, 검색 실패");
			}

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(bag + "없음");
		//출력값(리턴값)을 출력해보세요.
		return bag;

	}

	public void delete(String backnumber) {
		try {
			// 1. mySQL과 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2. mySQL에 연결해보자.(java --- mySQL)
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

			String sql = "delete from Player where backnumber = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, backnumber);
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void update(PlayerVO bag) {
		try {
			// 1. mySQL과 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2. mySQL에 연결해보자.(java --- mySQL)
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

			String sql = "update Player set team = ? where id = ? "; // id가 ?인(조건) tel을 ?로 바꾸어라.
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getTeam());
			ps.setString(2, bag.getBacknumber());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			// int 일때는 ps.setInt(2, NO);

			// 4.
			ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void add2() {
	public void insert(PlayerVO bag) {

		try {
			// 1. mySQL과 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2. mySQL에 연결해보자.(java --- mySQL)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";

			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mySQL 연결 성공.");

			// ipaddress => InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서, String에 넣을 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함
			// PreparedStatement가 SQL부품!!

			// public void insert(String id,String pw,String name,String tel)
			String sql = "insert into Player values (?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품 으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			// ps부품안에 값넣기
			// 언어 R빼고, 인덱스 0부터 시작!!
			// 유일하게 DB는 인덱스가 1부터 시작!!

			ps.setString(1, bag.getBacknumber());
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getHeight());
			ps.setString(4, bag.getWeight());
			ps.setString(5, bag.getTeam());
			ps.setString(6, bag.getImg());

			// ==> insert into hr.MEMBER values ('a','a','a','a');

			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");

			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<PlayerVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<PlayerVO> list = new ArrayList<>();

		PlayerVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			// 1. 오라클 11g와 연결한 부품 설정
			// 1. mySQL과 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2. mySQL에 연결해보자.(java --- mySQL)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";

			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "select backnumber, name, team from player";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// 삭제!!!! ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// 1. 각 칼럼의 있는 값들을 추출해보자

				System.out.println("검색결과 있음, 검색 성공");
				// 검색결과를 검색화면 UI부분을 주어야함
				bag = new PlayerVO();

				bag.setBacknumber(rs.getString("backnumber"));
				bag.setName(rs.getString("name"));
				bag.setTeam(rs.getString("team"));

				// 3. 컨테이너에 가방을 넣자(row의 갯수)
				list.add(bag);

			}
			ps.close();
			rs.close();
			con.close();
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		System.out.println(list +"없음");
		return list;

	}

}

//커넥터설정
//db연결 성공
//sql문 만듬
