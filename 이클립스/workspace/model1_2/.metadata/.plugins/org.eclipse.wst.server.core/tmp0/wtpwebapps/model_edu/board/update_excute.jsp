<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="model1.vo.Board" %>  
<%@ page import="model1.dao.BoardDAO" %>
<%	
	BoardDAO dao = new BoardDAO();
	Board vo = new Board();
		
	String title = request.getParameter("title");
	String contents = request.getParameter("contents");
	String creater = request.getParameter("creater");
	String updater = request.getParameter("updater");
	String id = request.getParameter("boardId");
	int boardId = Integer.parseInt(id);
	
	vo.setBoardId(boardId);
	vo.setTitle(title);
	vo.setContents(contents);
	
	if (vo.getUpdater() == null){
		vo.setUpdater(vo.getCreater());		
	}
	
	vo.setUpdater(updater);
	
	dao.updateBoard(vo);
	
%>
<!-- if(dao[0][].equals() == ){ -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록수행</title>
</head>
<body>
	<script>
		alert("수정완료")  // 경고창 뜨고 확인버튼 누르면 페이지이동
		window.location.href = "./view.jsp?boardId=<%= vo.getBoardId() %>";
	</script>
</body>
</html>