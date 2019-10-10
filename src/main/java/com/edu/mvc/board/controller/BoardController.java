package com.edu.mvc.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.mvc.board.dao.BoardDAO;
import com.edu.mvc.board.service.BoardService;
import com.edu.mvc.board.vo.Board;

//list화면으로 가는 목록 정의하기
@Controller
public class BoardController {
	
	@Autowired //boardservice 객체를 사용할수 있게 연결해줌
	private BoardService boardService;
	
	//게시물 목록 조회 화면
	@RequestMapping(value = "/list") 	
	public String list(Model model) throws Exception {
		List<Board> boardList = boardService.getBoardList();
		model.addAttribute("list", boardList);
		return "list";
	}
	
	//게시물 목록 등록 화면
	@RequestMapping(value = "/insert") 
	public String insert() {
		return "insert";
	}
	
	//게시물 목록 등록 화면
	@RequestMapping(value = "/insert_excute") 
	public String insert_excute(String title, String creater, String contents) { // (Board board)
		Board vo = new Board();
		vo.setTitle(title);
		vo.setCreater(creater);
		vo.setContents(contents);
		boardService.insert_excute(vo);
		return "redirect:/list"; // 이 화면에 있는 list로 바로가게 해주는것
	}
	
	//게시물 목록 수정 화면
	   @RequestMapping(value= "/update")
	   public String update(int boardId, Model model) throws Exception {
	      Board boardInfo= boardService.getBoardInfo(boardId);
	      model.addAttribute("vo",boardInfo);
	      return "update";
	   }   
	
	//게시물 목록 수정화면
	@RequestMapping(value = "/update_excute")
	public String update_excute(Board board) throws Exception {
		Board vo = new Board();
		vo.setBoardId(board.getBoardId());
		vo.setTitle(board.getTitle());
		vo.setContents(board.getContents());
		vo.setUpdater(board.getUpdater());
		boardService.update_excute(vo);
		return "redirect:/view?boardId="+(board.getBoardId());
		
	}
	
	//게시물 목록 상세조회화면
	@RequestMapping(value = "/view") 
	public String view(int boardId, Model model) throws Exception {
	    boardService.readCount(boardId);
		Board boardInfo = boardService.getBoardInfo(boardId);
		model.addAttribute("vo", boardInfo);
		return "view";
	}
	
	//게시물 목록 삭제
	@RequestMapping(value = "/delete_excute") 
	public String delete_excute(Board boardId) throws Exception {
		boardService.delete_excute(boardId);
		return "redirect:/list";
	}
	
}
	
	//http://localhost:8080/list가 URL로 호출이 되었을때 views 폴더 하위에 있는"list.jsp"를 보여줌
//	@RequestMapping(value = "/list") //URL을 list로 정의했기때분에 확장자명을 안붙여주어도 괜찮음
//	public String list() {
//		List<Board> list = boardService.getBoardList();
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i + ". title : " + list.get(i).getTitle());
//		}
//		return "list";
//	}

