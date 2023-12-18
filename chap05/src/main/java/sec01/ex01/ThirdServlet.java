package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 어노테이션 : 컴파일러를 위한 주석
//@WebServlet("/서블릿 매핑이름")
@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	// 서블릿 클래스 직렬화를 위해 자동 지정한 상수
	private static final long serialVersionUID = 1L;
       
    public ThirdServlet() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("ThirdServlet init");
	}

	public void destroy() {
		System.out.println("ThirdServlet destroy");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ThirdServlet doGet");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ThirdServlet doPost");
		doGet(request, response);
	}

}
