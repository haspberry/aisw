<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>상세조회화면</title>
	</head>
	<body>
		<div style="width:1300px; margin:0 auto">
			<h1 style="text-align:center">게시물 상세보기</h1>   
			<table BORDERCOLOR="#000000" border="1" cellspacing="0" style="width:100%">
				<tr>
					<th width="100" height="30" nowrap >등록자</th>
					<td width="150" align="center">${vo.creater}</td>
					<th width="100" nowrap >등록일</th>
					<td width="200" align="center">${vo.createDate}</td>
					<th width="100" height="30" nowrap >최종 수정자</th>
					<td width="150" align="center">${vo.updater}</td>
					<th width="100" nowrap >최종 수정일</th>
					<td width="200" align="center">${vo.updateDate}</td>
					<th width="100" nowrap >조회수</th>
					<td width="" align="center">${vo.readCount}</td>
				</tr>
				<tr> 
					<th height="30" nowrap >제목</th>
					<td colspan="9">${vo.title}</td>
				</tr>
				<tr> 
					<th height="320">내용</th>
					<td colspan="9">${vo.contents}</td>
				</tr>
			</table>
			
			<br/><br/>
			
			<div>
				<span style="float:left">
					<button onclick="window.location.href='/list'">목록</button>
				</span>
				<span style="float:right">
					<button onclick="window.location.href='/update?boardId=${vo.boardId}'">수정</button>&nbsp;&nbsp;
					<button onclick="goDeleteExcute()">삭제</button>
				</span>
			</div>
		</div>
	</body>
	
	<script>
	function goDeleteExcute(){
		if(confirm("삭제하시겠습니까?")){
			document.location.href = "/delete_excute?boardId=${vo.boardId}";
		} else {
			alert("취소되었습니다.");
		}
	}
	</script>
</html>