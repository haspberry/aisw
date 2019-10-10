<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta name="Generator" content="EditPlus®">
		<meta name="Author" content="">
		<meta name="Keywords" content="">
		<meta name="Description" content="">
		<title>bbs</title>
		<link href="./list.css" rel="stylesheet" type="text/css" >
	</head>
	<body>

		<div class="header">
			<a href="../main.jsp">로고</a>
		</div>

		<div class="topnavi_ds">
			<div class="topnavi">  
				<a href="../intro/intro.jsp">회사소개</a> |	
				<a href="./list.jsp">게시판</a> | 
				<a href="../member/login.jsp">로그인</a> |
				 <a href="../member/join.jsp">회원가입</a>
			</div>
		</div>

		<div class="divide"/>

		<div class="body">

			<div class="default_tablestyle">
				<table summary="번호,게시판명,게시판유형,게시판속성,생성일,사용여부  목록입니다" cellpadding="0" cellspacing="0">
					<colgroup>
						<col width="10%" >
						<col width="44%" >  
						<col width="10%" >
						<col width="10%" >
						<col width="15%" >
						<col width="8%" >
					</colgroup>
					<thead>
						<tr>
							<th scope="col" class="f_field" nowrap="nowrap">번호</th>
							<th scope="col" nowrap="nowrap">제목</th>
							<th scope="col" nowrap="nowrap">작성자</th>
							<th scope="col" nowrap="nowrap">작성일</th>
							<th scope="col" nowrap="nowrap">조회수</th>
						</tr>
					</thead>
					<tbody>                
						<tr>
							<td nowrap="nowrap">1</td>      
							<td nowrap="nowrap"><a href="view.jsp">반갑습니다.</a></td>
							<td nowrap="nowrap">관리자</td>
							<td nowrap="nowrap">2014-09-20</td>
							<td nowrap="nowrap">10</td>  
						</tr>
					</tbody>
				</table>
				</br>
				<div class="buttons">
					<a href="./insert.jsp">등록</a> 
				</div>
			</div>
		</div>

	</body>
</html>
