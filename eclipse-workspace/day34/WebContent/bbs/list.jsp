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
				<table border="1" width="80%" align="center" cellspacing="0">
					<tr>
						<th width="80">No.</th>
						<th>제목</th>
						<th width="100">작성자</th>
						<th width="80">조회수</th>
					</tr>
				<%@ page import="java.sql.*" %>
				<%
					String url="jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
					String sql="select num,sub,id,cnt from bbs03 order by num desc";
					Connection conn=null;
					Statement stmt=null;
					ResultSet rs=null;
					try{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						
						conn=DriverManager.getConnection(url);
						stmt=conn.createStatement();
						rs=stmt.executeQuery(sql);
						while(rs.next()){
				%>
					<tr>
						<td><%=rs.getInt(1) %></td>
						<td>
							<a href="detail.jsp?num=<%=rs.getInt(1) %>">
							<%
								String sub=rs.getString(2);
								if(sub==null)sub="제목없음";
								if(sub.length()>5){
									sub=sub.substring(0,5)+"...";
								}
								out.print(sub);
							%>
						</td>
						<td><%=rs.getString(3) %></td>
						<td><%=rs.getInt(4) %></td>
					</tr>				
				<%	
						}
					}finally{
						if(rs!=null)rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					}				
				%>
				</table>
				<p align="center"><a href="add.jsp">[입	력]</a></p>
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