package springweb.d01_board.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.d01_board.vo.Board;
import springweb.d01_board.vo.Board_Sch;
@Repository
public interface A01_BoardDao {
	public void insertBoard(Board ins);
	public ArrayList<Board> listBoard(Board_Sch sch);
}
