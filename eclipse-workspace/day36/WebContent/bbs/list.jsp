<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, java.util.ArrayList, com.hi.bean.BbsBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../temp/header.jspf" %>
<%
String key=request.getParameter("key");
String word=request.getParameter("word");
if(key==null)key="sub";
if(word==null)word="";
ArrayList<BbsBean> list=new ArrayList<BbsBean>();
String sql="select num,sub,id,dep from bbs05 where "+key+" like '%"+word+"%' order by grp desc,ord asc";	//like '%"+word+"%' : word와 비슷한 내용들을 포함시킴.(=을 하면 정확히 word 텍스트와 일치해야만 나옴)
//String sql="select num,sub,id,cnt from bbs05 order by num desc";
String driver="oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";

Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
try{
	Class.forName(driver);
	conn=DriverManager.getConnection(url,user,password);
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	while(rs.next()){
		BbsBean bean=new BbsBean();
		bean.num=rs.getInt(1);
		bean.sub=rs.getString(2);
		bean.id=rs.getString(3);
		bean.cnt=rs.getInt(4);
		list.add(bean);
	}
}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
%>
	<h1>자유롭게 글을 남겨주세요구르트</h1>
	<table border="1" cellspacing="0" width="600">
		<tr>
			<th>No.</th>
			<th>제목</th>
			<th>작성자</th>
			<th>depth</th>
		</tr>
		
		<%
		new oracle.jdbc.driver.OracleDriver();
		for(int i=0; i<list.size(); i++){
			BbsBean bean=list.get(i);
		%>
		<tr>
			<td><a href="detail.jsp?num=<%=bean.num%>"><%=bean.num%></a></td>
			<td><a href="detail.jsp?num=<%=bean.num%>"><%
				for(int j=0; j<bean.cnt; j++){
					out.print("&nbsp;&nbsp;&nbsp;&nbsp;");
				}
				if(bean.cnt!=0)out.print("└");
				out.print(bean.sub);
			%></a></td>
			<td><a href="detail.jsp?num=<%=bean.num%>"><%=bean.id%></a></td>
			<td><a href="detail.jsp?num=<%=bean.num%>"><%=bean.cnt%></a></td>
		</tr>
		<%
		}
		%>		
	</table>
	<br>
	<form action="list.jsp">
		<select name="key">
			<option value="sub">제목</option>
			<option value="id">작성자</option>
		</select>
		<input type="text" name="word">
		<input type="submit" value="검색">
	</form>
	<br>
	<p align="center"><a href="add.jsp"><img src="/day36/imgs/write.png"></a></p>
	<!-- <p align="center"><a href="add.jsp"><img src="https://dummyimage.com/100x50/aaa/fff.png&text=ADD"></a></p> -->
	<br>
	<br>
<%@ include file="../temp/footer.jspf" %>
</body>
</html>