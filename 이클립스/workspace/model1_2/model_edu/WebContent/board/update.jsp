<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="model1.vo.Board" %>
<%@ page import="model1.dao.BoardDAO" %>
<%
   //현재 페이지로 요청한 boardId
     String id = request.getParameter("boardId");
	 int boardId = Integer.parseInt(request.getParameter("boardId"));
   //게시판의 DataAccessObject(DAO) 객체 생성
     BoardDAO dao = new BoardDAO();
   //현재 페이지로 요청한 boardId의 게시물 정보 조회
     Board vo = dao.getBoardInfo(boardId);
   	
   	if(vo.getUpdater() == null) {
   		vo.setUpdater(vo.getCreater());
   	}
   
     
 %>

<!doctype html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta name="Generator" content="EditPlus®">
		<meta name="Author" content="">
		<meta name="Keywords" content="">
		<meta name="Description" content="">
		<title>insert</title>
		<link href="insert.css" rel="stylesheet" type="text/css" >
		<title>수정 화면</title>
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

		<div class="divide"></div>

		<div class="body">
			<form action="/board/update_excute.jsp" method="GET">
				<div class="modify_user">
						<table>
							<tr>
								<td>제목</td>
								<td><input type="text" name="title"></td>
							</tr>
							<tr>
								<td>작성자</td>
								<td><input type="text" name="creater"></td>
							</tr>
							<tr>
								<td>내용</td>
								<td><textarea name="contents"></textarea></td>
						</table>
					<button type="submit" name="boardId" value=<%=vo.getBoardId() %> >수정완료</button>
				</div>			
			</form>
		<button onclick="window.location.href='./list.jsp'">목록</button>
			
		</div>
	</body>
</html>
