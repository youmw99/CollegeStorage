package com.ggu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ggu.VO.GuestBookVO;
import com.ggu.dao.GuestBookDao;

/**
 * Servlet implementation class GuestBookController
 */
@WebServlet("/GuestBookController")
public class GuestBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestBookController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		String content = request.getParameter("content");
		
		GuestBookVO vo = new GuestBookVO();
		vo.setName(name);
		vo.setPw(pw);
		vo.setContent(content);
		try {
			GuestBookDao dao = new GuestBookDao();
			int result = dao.insert(vo);
			
			response.getWriter().println(" 결과: " + result);
		}
		catch(Exception a) {
			
		}
		
		doGet(request, response);
	}

}
