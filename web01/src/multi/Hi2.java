package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/haha2")
public class Hi2 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("haha 요청되었습니다.");
		String data = request.getParameter("data");
		System.out.println("받은 데이터는 " + data + "입니다.");
		PrintWriter out = response.getWriter(); // response : 서버가 브라우저에 응답 할 때 사용
		//PrintWriter는 브라우저에 응답할 때 문자를 줄 수 있는 부품
		out.print("i am a java programmer");
		out.close();
	}

}
