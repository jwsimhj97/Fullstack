<%@ page language="java"%> 
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="java.lang.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>내용</h1>
	
	<%
		// 스크립트릿
		// 내장객체 - 스크립트릿에서 제공되는 참조변수 (request, out, ...)
		func();
	%>
	
	<%!
		// 선언부 - 자바의 메소드 정의 
		// jsp에서는 접근제한자,객체지향..을(public / static) 사용할 필요가 없음.
		int su=1234;
	
		void func(){
			System.out.println("호출");
		}
	%>
</body>
</html>