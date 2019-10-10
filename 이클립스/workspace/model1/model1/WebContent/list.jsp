<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="model1.vo.Board" %>  
<%@ page import="model1.dao.BoardDAO" %>  
<%@ page import="java.util.ArrayList" %>  

<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>게시판 - 게시물 목록 조회 화면</title><!-- 윈도우 상단에 뜨는 내용입니다. -->
   </head>
   <body>
       <h1>게시물 리스트</h1>   
       <table>             
           <tr>            
               <th width="100">번호</th>
               <th width="">제목</th>
               <th width="150">작성자</th>
               <th width="300">등록일</th>
               <th width="100">조회수</th>
           </tr>
           
           
         <%
            //게시판의 DataAccessObject(DAO) 객체 생성
            BoardDAO dao = new BoardDAO();
            //게시판 Object(객체) 선언
            Board vo = null;
            //게시판의 DataAccessObject(DAO)에 정의된 'getBoardList()' 메서드를 통해 => 게시물 정보 조회후, 받아오기
            ArrayList<Board> list = dao.getBoardList();
            
            for (int i=0; i < list.size(); i++) {  //초기값을 설정해주고 이 list의 행수 만큼 반복해서 중괄호 안에 있는 내용들이 반복들이 되서 소스가 나온다, 첫번째 array에 있는 것을 찾고 뽑아낸다 행수만큼
               vo = list.get(i);
         %>
               <tr>
                     <td align="center"><%= vo.getBoardId() %></td>
                     <td align="center"><a href="./view.jsp?boardId=<%= vo.getBoardId() %>"><%= vo.getTitle() %></a></td>
                     <td align="center"><%= vo.getCreater() %></td>
                     <td align="center"><%= vo.getCreateDate() %></td>
                     <td align="center"><%= vo.getReadCount() %></td>
               </tr>
         <%
            }
         %>
         
         
       </table>
       
       <br/><br/>
       
       <button onclick="window.location.href='/insert.jsp'">글쓰기</button>
       <a href = "/insert.jsp">글쓰기</a>
   </body>
</html>