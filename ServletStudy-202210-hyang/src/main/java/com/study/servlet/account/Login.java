package com.study.servlet.account;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD

=======
/**
 * Servlet implementation class Login
 */
>>>>>>> 8366927a7b4e600777df0d3bdfd9332798dc728d
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
<<<<<<< HEAD
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/account/login.html").forward(request, response);
	}

=======
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/account/login.html").forward(request, response);
		
	}
>>>>>>> 8366927a7b4e600777df0d3bdfd9332798dc728d
}
