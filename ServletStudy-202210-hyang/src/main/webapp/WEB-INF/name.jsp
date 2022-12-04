<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>이름: <%=request.getAttribute("name") %></h1>
	<h1>이름2: ${name}</h1>
</body>
</html>