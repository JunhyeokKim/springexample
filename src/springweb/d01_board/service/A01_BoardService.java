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
		// �� ������ �Ǽ�(db���� �ε�)
		sch.setCount(dao.totCnt(sch));
		// ������������ ��Ÿ�� ������ �Ǽ�
		// �ʱ� 0 ==> 5
		if(sch.getPageSize()==0){
			sch.setPageSize(5);
		}
		if(sch.getCurPage()==0){
			sch.setCurPage(1);
		}
		// �� ������ ��
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
		// ��ۿ� refno������ �������� no���� �Ҵ��Ͽ�,
		// ����� ��Ͻ�, refno�� ���� �ֵ��� ó��..
		reboard.setRefno(no);
		reboard.setSubject("RE:"+reboard.getSubject());
		reboard.setContent(reboard.getContent()+"\n\n===========��������==========\n");
		return reboard;
	} 	
	public Board detailBoard(int no){
		dao.uptBoardCnt(no);
		return getBoard(no);
	}
}
