<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../temp/header.jspf" %>
<%@page import="java.sql.*, com.hi.bean.BbsBean" %>

<%
int num=Integer.parseInt(request.getParameter("num"));
BbsBean bean=new BbsBean();
String sql="select num,id,cnt,sub,content,grp,ord,dep from bbs05 where num="+num;
String driver="oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";
int grp=0;
int ord=0;
int dep=0;

Connection conn=null;
Statement stmt=null;
ResultSet rs=null;

try{
	Class.forName(driver);
	conn=DriverManager.getConnection(url,user,password);
	stmt=conn.createStatement();
	stmt.executeUpdate("update bbs05 set cnt=cnt+1 where num="+num);
	stmt.close();
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	if(rs.next()){
		bean.num=rs.getInt(1);
		bean.id=rs.getString(2);
		bean.cnt=rs.getInt(3);
		bean.sub=rs.getString(4);
		bean.content=rs.getString(5);
		grp=rs.getInt(6);
		ord=rs.getInt(7);
		dep=rs.getInt(8);
	}
}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
%>
	<h1>상세페이지</h1>
	<table border="1" cellspacing="0" width="600">
		<tr>
			<td width="80">No.</td>
			<td width="80"><%=bean.num%></td>
			<td width="80">작성자</td>
			<td><%=bean.id%></td>
			<td width="80">조회수</td>
			<td width="80"><%=bean.cnt%></td>
		</tr>	
		<tr>
			<td>제목</td>
			<td colspan="5"><%=bean.sub%></td>
		</tr>	
		<tr>
			<td colspan="6" height="300"><%=bean.content%></td>
		</tr>
		<tr>
			<td colspan="6" align="center">
				<a href="#"><img src="/day36/imgs/edit.png"></a>
				<a href="#"><img src="/day36/imgs/del.png"></a>
				<a href="re.jsp?grp=<%=grp%>&ord=<%=ord%>&dep=<%=dep%>"><img src="/day36/imgs/comment.png"></a>
			</td>
		</tr>
	</table>
	
<%@ include file="../temp/footer.jspf" %>
</body>
</html>