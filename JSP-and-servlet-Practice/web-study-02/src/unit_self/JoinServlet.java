package unit_self;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/JoinServlet")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		String name = request.getParameter("name");
		String num = request.getParameter("num");
		String pnum = request.getParameter("pnum");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String pwdchk = request.getParameter("pwdchk");
		String email = request.getParameter("email");
		String addrnum = request.getParameter("addrnum");
		String addr = request.getParameter("addr");
		String hpnum = request.getParameter("hpnum");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("이름 : ");
		out.println(name);
		out.println("<br>주민번호 : ");
		out.println(num +"-"+pnum);
		out.println("<br>아이디 : ");
		out.println(id);
		out.println("<br>비밀번호 : ");
		out.println(pwd);
		out.println("<br>이메일 : ");
		out.println(email);
		out.println("<br>우편번호 : ");
		out.println(addrnum);
		out.println("<br>주소 : ");
		out.println(addr);
		out.println("<br>휴대폰 : ");
		out.println(hpnum);
		
		out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</html></body>");
		out.close();
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
