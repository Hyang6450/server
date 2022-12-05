package com.study.servlet.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD
=======
import javax.servlet.http.HttpSession;
>>>>>>> 8366927a7b4e600777df0d3bdfd9332798dc728d


@WebServlet("/session/2")
public class Session2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		request.getRequestDispatcher("/WEB-INF/form1.html").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

=======
		HttpSession session = request.getSession();
		
		System.out.println(session.getAttribute("user_name"));
		System.out.println(session.getAttribute("user_phone"));
		System.out.println(session.getAttribute("user_email"));
		System.out.println(session.getAttribute("user_address"));
		System.out.println(session.getAttribute("user_password"));
		request.getRequestDispatcher("/WEB-INF/form1.html").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	}
>>>>>>> 8366927a7b4e600777df0d3bdfd9332798dc728d
}
