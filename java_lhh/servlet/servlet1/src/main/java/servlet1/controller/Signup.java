package servlet1.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet1.model.dto.LoginDTO;
import servlet1.service.MemberService;

@WebServlet("/signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService memberService = new MemberServicIMP();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String email = request.getParameter("email");
		System.out.println("아이디 : "+id);
		System.out.println("비밀번 : "+pw);
		System.out.println("이메일 : "+email);
		
		LoginDTO member = new LoginDTO(id,pw,email);
		
		if(memberService.signup(member)) {
			
		}else {
			
		}
		
		doGet(request, response);
	}

}
