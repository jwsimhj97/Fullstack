<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전달할 페이지</h1>
	<form action="ex03.jsp" method="post">	<!-- method의 default는 GET방식이다. post방식은 주소창에 정보를 보여주지x.-->
		ename:<input type="text" name="ename" value=""><br>
		empno:<input type="text" name="empno"><br>
		<input type="checkbox" name="chk" value="i1">item1
		<input type="checkbox" name="chk" value="i2">item2
		<input type="checkbox" name="chk" value="i3">item3<br>
		<input type="submit" value="전달">
	</form>
</body>
</html>