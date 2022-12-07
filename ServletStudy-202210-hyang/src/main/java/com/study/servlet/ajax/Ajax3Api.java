package com.study.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;


@WebServlet("/api/ajax3")
public class Ajax3Api extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonData = request.getParameter("data");
		
		Map<String, Object> dataMap = gson.fromJson(jsonData, Map.class);
		
//      Object에 있는 것을 String으로 꺼내려면 다운 캐스팅이 필요하다.
//		List<String> phoneNumbers = new ArrayList<>();
//		
//		dataMap.forEach((key, value) -> {
//			if(value.getClass() == String.class) {
//				phoneNumbers.add((String)value);
//			}
//		});
		
		response.setContentType("application/json; charset=utf8");
		response.setCharacterEncoding(StandardCharsets.UTF_8.name());
		PrintWriter out = response.getWriter();
		
		
		// 문자열을 만들어 주는 용도
		StringBuilder stringBuilder = new StringBuilder();
		dataMap.forEach((key, value) -> {
			stringBuilder.append(value);
			stringBuilder.append("-");
		});
		stringBuilder.delete(stringBuilder.length()-1, stringBuilder.length());
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("responseData", stringBuilder.toString());
		
		
		
		out.print(jsonObject.toString());
		
	}

}
