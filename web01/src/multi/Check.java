package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/check.do")
public class Check extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("check 서블릿 1개 활성화됨");
	}
	
	
	@Override
	public void destroy() {
		System.out.println("check 서블릿 소멸됨");
	}
	
	// get요청, 클라이언트로 부터 전달되는 데이터는 주소와 함께 도착
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String today = request.getParameter("today");
		String result = "그냥 있자";
		if (today.equals("맑음")) {
			result = "나가자";
		} else if (today.equals("흐림")) {
			result = "코딩";
		} else if (today.equals("비옴")) {
			result = "쇼핑";
		}
		// setContentType은 out만들기 전에 설정!!
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String pass = request.getParameter("pass");
		String result = "들어올 수 없습니다.<img src='no.png'>";
		if (pass.equals("나는왕이다")) {
			result = "들어오세요.<img src='yes.png'>";
		} 
		// setContentType은 out만들기 전에 설정!!
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}

}

/* 내가 만든것
 * @WebServlet("/check.do") public class check extends HttpServlet {
 * 
 * protected void doGet(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException {
 * request.setCharacterEncoding("utf-8");
 * response.setContentType("text/html;charset=utf-8");
 * 
 * PrintWriter out = response.getWriter(); String today =
 * request.getParameter("today");
 * 
 * 
 * if (today.equals("맑음")) { out.print("나가자"); } else if(today.equals("흐림")){
 * out.print("코딩");
 * 
 * } else if (today.equals("비옴")) {
 * 
 * out.print("쇼핑"); } else { out.print("그냥 있자");
 * 
 * }
 * 
 * out.close();
 * 
 * 
 * }
 * 
 * protected void doPost(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException {
 * request.setCharacterEncoding("utf-8");
 * response.setContentType("text/html;charset=utf-8");
 * 
 * PrintWriter out = response.getWriter(); String check =
 * request.getParameter("나는왕이다"); if (check.equals("나는왕이다")) {
 * out.print("들어오세요"+ "<img src='no.png>"); } else { out.print("들어올 수 없습니다"+
 * "<img src='no.png>" );
 * 
 * }
 * 
 * } out.close();
 * 
 * }
 */
