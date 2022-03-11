<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{}
	table,th,td{border:1px solid gray;}
	table{}
</style>

<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		$.get("stu.jsp?","num=11&name=hi", function(data){
			console.log(typeof data,data);
			var tbody=$('<tbody/>').appendTo('table');
			for(var i=0; i<data.students.length; i++){
				$('<tr><td></td><td></td><td></td><td></td><td></td></tr>')
					.find('td')
					.first().text(data.students[i].num)
					.next().text(data.students[i].name)
					.next().text(data.students[i].kor)
					.next().text(data.students[i].eng)
					.next().text(data.students[i].math)
					.parent().appendTo(tbody);
			}
			
		});
	});
</script>
</head>
<body>
	<h1>리스트 페이지</h1>
	<table>
		<thead>
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
			</tr>
		</thead>
	</table>
</body>
</html>