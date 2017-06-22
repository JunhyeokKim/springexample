package springweb.d01_board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.d01_board.repository.A01_BoardDao;
import springweb.d01_board.vo.Board;
import springweb.d01_board.vo.Board_Sch;

@Service
public class A01_BoardService {
	@Autowired(required = false)
	private A01_BoardDao dao;

	public void insertBoard(Board ins) {
		dao.insertBoard(ins);
	}

	public ArrayList<Board> listBoard(Board_Sch sch) {
		return dao.listBoard(sch);
	}

	public Board getBoard(int no) {
		return dao.getBoard(no);
	}

public Board getReBoard(int no){
		Board reboard = dao.getBoard(no);
		// 답글에 refno값으로 기존글의 no값을 할당하여,
		// 답글을 등록시, refno에 값이 있도록 처리..
		reboard.setRefno(no);
		reboard.setSubject("RE:"+reboard.getSubject());
		reboard.setContent(reboard.getContent()+"\n\n===========이전내용==========\n");
		return reboard;
	} 	
	public Board detailBoard(int no){
		dao.uptBoardCnt(no);
		return getBoard(no);
	}
}
