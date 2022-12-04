package com.study.servlet.account;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/auth/login")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Map<String, String> dataMap = new HashMap();
		
		Set<String> keyset = request.getParameterMap().keySet();
		keyset.forEach (key -> {
			dataMap.put(key, request.getParameter(key));
		});
		
		System.out.println(dataMap);
	}
}
