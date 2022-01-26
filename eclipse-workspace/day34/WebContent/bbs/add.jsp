<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="0" width="800" align="center" cellspacing="0">
		<tr>	<!-- header -->
			<td colspan="5">
				<img alt="logo" src="../imgs/logo.png">
			</td>
		</tr>
		<tr>	<!-- menu -->
			<td background="../imgs/bg.png"></td>
			<td background="../imgs/bg.png" align="center" width="100"><a href="../index.jsp">[HOME]</a></td>
			<td background="../imgs/bg.png" align="center" width="100"><a href="./list.jsp">[B B S]</a></td>
			<td background="../imgs/bg.png" align="center" width="100"><a href="../login/form.jsp">[LOGIN]</a></td>
			<td background="../imgs/bg.png"></td>
		</tr>
		<tr>	<!-- contents -->
			<td colspan="5" align="center">
				<h1>게시판 목록</h1>
				<form action="insert.jsp" method="post">
					<table>
						<tr>
							<td bgcolor="#dddddd">제목</td>
							<td>
								<input type="text" name="sub">
							</td> 
						</tr>
						<tr>
							<td bgcolor="#dddddd">작성자</td>
							<td>
								<input type="text" name="id">
							</td> 
						</tr>
						<tr>	<!-- 내용 -->
							<td colspan="2">
								<textarea rows="6" cols="25" name="content"></textarea>
							</td>
						</tr>
						<tr>	<!-- 버튼 -->
							<td colspan="2" align="center">
								<input type="submit" value="입	력">
								<input type="reset" value="취	소">
							</td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
		<tr>	<!-- footer -->
			<td colspan="5" align="center">
				<img alt="footer" src="../imgs/footer.png">
			</td>
		</tr>
	</table>
</body>
</html>