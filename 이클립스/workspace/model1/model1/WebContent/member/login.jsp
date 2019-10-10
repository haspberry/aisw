<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta name="Generator" content="EditPlus®">
		<meta name="Author" content="">
		<meta name="Keywords" content="">
		<meta name="Description" content="">
		<title>login</title>
		<link href="./login.css" rel="stylesheet" type="text/css" >
	</head>
	<body>

		<div class="header">
			<a href="../main.jsp">로고</a>
		</div>

		<div class="topnavi_ds">
			<div class="topnavi">  
				<a href="../intro/intro.jsp">회사소개</a> |	
				<a href="../board/list.jsp">게시판</a> | 
				<a href="../member/login.jsp">로그인</a> |
				 <a href="../member/join.jsp">회원가입</a>
			</div>
		</div>

		<div class="divide"/>

		<div class="body">

			<div class="login_img"><img src="image/img_logintitle.gif"></div>
			<div class="login_bg">

				<div class="login_box">
					<table>
						<tr>
							<td>아이디</td>
							<td><input type="text"></td>				
						</tr>
						<tr>
							<td>비밀번호</td>
							<td><input type="text"></td>				
						</tr>
					</table>
				</div>

				<div class="login_btn"><img src="image/btn_login.gif"></div>

			</div>

		</div>

	</body>
</html>
