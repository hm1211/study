package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
       
    public LoginServlet() {
        super();
        
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("이닛!");
	}


	public void destroy() {
		System.out.println("파괴!");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String u_id = request.getParameter("user_id");
		String u_pw = request.getParameter("user_pw");
		System.out.println(u_id);
		System.out.println(u_pw);
	}

}
