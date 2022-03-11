<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{margin: 0px; padding: 0px;}
	.container{width: 800px; margin: 0px auto;}
	#menu{position: fixed; width:100%; height: 50px; background: gray;}
	#menu>a{line-height: 50px; color: white; text-decoration: none; margin-right: 50px;}
	#content{padding-top: 60px;}
	#content table{border-collapse: collapse; width: 80%; margin: 10px auto;}
	#content table,#content table th,#content table td{border: 1px solid gray;}
	
	#backup{display: none;}
	#popup{display:none; background-color:rgba(0,0,0,0.5); width:100%; height:100%; position:absolute; left:0px; top:0px;}
	#popup>div{width:400px; height:400px; background-color:white; margin: 100px auto; border-radius:20px;}
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		$('#popup form').submit(function(){
			var param=$(this).serialize();
			console.log(param);
			$('#popup').click();
			$.ajax({
				url:'insert.jsp',
				data:param,
				type:'post',
				success:function(){
					$('#menu a:eq(1)').click();
				}
			});
			return false;
		});
		
		$('#popup')
			.click(function(){
				$(this).css('display','none').find('input').val('');
				return false;
			})
			.children()
			.first()
			.click(function(e){
				 e.stopPropagation();
			});
		$('#content').on('click','table+a',showPopup);
		$('#menu a')
			.first()
				.click(function(){
					$('#content').html($('#home').html());
				})
				.click()
			.next()
				.click(function(){
					$('#content').html($('#list').html());
					$.ajax('dept.jsp',{
						type:'get',
						//data:'num=1&name=abcd',
						//contentType:'application/x-www-form-urlencoded; charset=UTF-8',
						dataType:'json',
						success:function(data,status,xhr){
							console.log(typeof data,data);
							var tbody=$('<tbody/>');
							for(row of data.dept){
								$('<tr/>')
									.append($('<td/>').text(row.deptno))
									.append($('<td/>').text(row.dname))
									.append($('<td/>').text(row.loc))
								.appendTo(tbody);
							}
							$('#content table').append(tbody);
						},
						error:function(xhr,status,throwMsg){
							console.log(xhr,status,throwMsg);
						}
					});
				});
	});
	
	function showPopup(){
		$('#popup').css('display','block');
		return false;
	}
</script>
</head>
<body>
<%System.out.println("페이지 로딩..."); %>
	<div class="container">
		<div id="menu">
			<a href="#home">[HOME]</a>
			<a href="#dept">[LIST]</a>
		</div>
		<div id="content">
			<h1>환영합니다</h1>
			<p>평화통일정책의 수립에 관한 대통령의 자문에 응하기 위하여 민주평화통일자문회의를 둘 수 있다. 대통령은 제3항과 제4항의 사유를 지체없이 공포하여야 한다.</p>
			<p>대통령이 임시회의 집회를 요구할 때에는 기간과 집회요구의 이유를 명시하여야 한다. 중앙선거관리위원회는 대통령이 임명하는 3인, 국회에서 선출하는 3인과 대법원장이 지명하는 3인의 위원으로 구성한다. 위원장은 위원중에서 호선한다.</p>
			<p>신체장애자 및 질병·노령 기타의 사유로 생활능력이 없는 국민은 법률이 정하는 바에 의하여 국가의 보호를 받는다. 국회는 국가의 예산안을 심의·확정한다.</p>
			<p>국무총리 또는 행정각부의 장은 소관사무에 관하여 법률이나 대통령령의 위임 또는 직권으로 총리령 또는 부령을 발할 수 있다. 국무위원은 국정에 관하여 대통령을 보좌하며, 국무회의의 구성원으로서 국정을 심의한다.</p>
			<p>선거운동은 각급 선거관리위원회의 관리하에 법률이 정하는 범위안에서 하되, 균등한 기회가 보장되어야 한다. 대한민국의 주권은 국민에게 있고, 모든 권력은 국민으로부터 나온다.</p>
			<p>대통령은 국무회의의 의장이 되고, 국무총리는 부의장이 된다. 대한민국의 영토는 한반도와 그 부속도서로 한다. 모든 국민의 재산권은 보장된다. 그 내용과 한계는 법률로 정한다.</p>
		</div>
	</div>
	
	<div id="backup">
		<div id="home">
			<h1>환영합니다</h1>
			<p>평화통일정책의 수립에 관한 대통령의 자문에 응하기 위하여 민주평화통일자문회의를 둘 수 있다. 대통령은 제3항과 제4항의 사유를 지체없이 공포하여야 한다.</p>
			<p>대통령이 임시회의 집회를 요구할 때에는 기간과 집회요구의 이유를 명시하여야 한다. 중앙선거관리위원회는 대통령이 임명하는 3인, 국회에서 선출하는 3인과 대법원장이 지명하는 3인의 위원으로 구성한다. 위원장은 위원중에서 호선한다.</p>
			<p>신체장애자 및 질병·노령 기타의 사유로 생활능력이 없는 국민은 법률이 정하는 바에 의하여 국가의 보호를 받는다. 국회는 국가의 예산안을 심의·확정한다.</p>
			<p>국무총리 또는 행정각부의 장은 소관사무에 관하여 법률이나 대통령령의 위임 또는 직권으로 총리령 또는 부령을 발할 수 있다. 국무위원은 국정에 관하여 대통령을 보좌하며, 국무회의의 구성원으로서 국정을 심의한다.</p>
			<p>선거운동은 각급 선거관리위원회의 관리하에 법률이 정하는 범위안에서 하되, 균등한 기회가 보장되어야 한다. 대한민국의 주권은 국민에게 있고, 모든 권력은 국민으로부터 나온다.</p>
			<p>대통령은 국무회의의 의장이 되고, 국무총리는 부의장이 된다. 대한민국의 영토는 한반도와 그 부속도서로 한다. 모든 국민의 재산권은 보장된다. 그 내용과 한계는 법률로 정한다.</p>
		</div>
		<div id="list">
			<h1>리스트페이지</h1>
			<table>
				<thead>
					<tr>
						<th>deptno</th>
						<th>dname</th>
						<th>loc</th>
					</tr>
				</thead>
			</table>
			<a href="#">입력</a>
		</div>
	</div>
	
	<div id="popup">
		<div>
			<h2>입력페이지</h2>
			<form action="#">
				<div>
					<label for="deptno">deptno</label><input type="text" name="deptno" id="deptno"/>
				</div>
				<div>
					<label for="dname">dname</label><input type="text" name="dname" id="dname"/>
				</div>
				<div>
					<label for="loc">loc</label><input type="text" name="loc" id="loc"/>
				</div>
				<div>
					<button type="submit">입력</button>
					<button type="reset">취소</button>
					<button type="button">닫기</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>