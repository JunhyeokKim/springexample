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
		// 총 데이터 건수(db에서 로딩)
		sch.setCount(dao.totCnt(sch));
		// 한페이지에서 나타날 데이터 건수
		// 초기 0 ==> 5
		if(sch.getPageSize()==0){
			sch.setPageSize(5);
		}
		if(sch.getCurPage()==0){
			sch.setCurPage(1);
		}
		// 총 페이지 수
		sch.setPageCount((int)Math.ceil(sch.getCount()/(double)sch.getPageSize()));
		sch.setStart((sch.getCurPage()-1)*sch.getPageSize()+1);
		sch.setEnd(sch.getCurPage()*sch.getPageSize());
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
