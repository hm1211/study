package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}


	public void destroy() {
		System.out.println("destroy");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String u_id = request.getParameter("user_id");
		String u_pw = request.getParameter("user_pw");
		System.out.println(u_id+" "+u_pw);
		
		String[] sub = request.getParameterValues("subject");
		for(String str :sub) {
			System.out.println(str);
		}
		
		
	}

}
