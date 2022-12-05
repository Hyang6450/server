package com.study.filter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

<<<<<<< HEAD

@WebFilter("/EncodingFilter")
public class EncodingFilter extends HttpFilter implements Filter {
       
    
	private static final long serialVersionUID = 1L;

	public void destroy() {}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest hsr = (HttpServletRequest) request;
		
=======
/**
 * Servlet Filter implementation class encoding
 */
@WebFilter("/*")
public class EncodingFilter extends HttpFilter implements Filter {
       
 
	private static final long serialVersionUID = 1L;

	public void destroy() {}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 업캐스팅 해줘야 한다. get메소드가 없다. 상속 관계이다.
		HttpServletRequest hsr = (HttpServletRequest) request;
		
		// 문자열 비교(대소문자 관계없이 구분)
>>>>>>> 8366927a7b4e600777df0d3bdfd9332798dc728d
		if(hsr.getMethod().equalsIgnoreCase("POST")) {
			request.setCharacterEncoding(StandardCharsets.UTF_8.name());
		}
		// 전처리
<<<<<<< HEAD
		chain.doFilter(request, response);
=======
		chain.doFilter(request, response); // chain => servlet 체인을 기준으로 이전 이후가 나뉜다. servlet실행 전 실행 후 
>>>>>>> 8366927a7b4e600777df0d3bdfd9332798dc728d
		// 후처리
	}

	public void init(FilterConfig fConfig) throws ServletException {}

}
