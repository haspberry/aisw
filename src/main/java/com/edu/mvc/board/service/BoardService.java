package com.edu.mvc.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.mvc.board.dao.BoardDAO;
import com.edu.mvc.board.vo.Board;

@Service // 긴 로직을 넣을때(비즈니스 로직) 실제로 필요한 로직(컨트롤러는 로직이 없고 역할만 부여해준다 로직은 서비스에 넣어둔다) > service로 넣어줌
public class BoardService {
	
	@Autowired
	private BoardDAO boardDAO; //메모리상에서 boardDAO를 찾아서 자동으로 연결시켜줌
	
	public List<Board> getBoardList() throws Exception{
		List<Board> list = boardDAO.getBoardList();
		return list;
	}
	//게시물 DB 등록 서비스 로직
	public void insert_excute(Board vo) {
		boardDAO.insert_excute(vo);
	}
	
	//게시물 DB상세정보 조회 서비스 로직
	public Board getBoardInfo(int boardId) throws Exception {
		Board vo = boardDAO.getBoardInfo(boardId);
		return vo;
	}
	//게시물 수정 서비스 로직
	public void update_excute(Board vo) throws Exception {
		boardDAO.update_excute(vo);
	}
	
	//게시물 삭제 서비스 조회
	public void delete_excute(Board boardId) throws Exception {
		boardDAO.delete_excute(boardId);
	}
	//게시물 조회수 증가 조회
	public void readCount(int boardId) throws Exception {
		boardDAO.readCount(boardId);
	}
}
