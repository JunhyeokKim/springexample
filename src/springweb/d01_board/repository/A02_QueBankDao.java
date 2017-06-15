package springweb.d01_board.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.d01_board.vo.Quebank;
import springweb.d01_board.vo.Quebank_Sch;

@Repository
public interface A02_QueBankDao {
	public ArrayList<Quebank> listQuebank(Quebank_Sch sch);
	public void insertQuebank(Quebank ins);
}
