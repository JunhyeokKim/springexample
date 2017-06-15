package springweb.d01_board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.d01_board.repository.A02_QueBankDao;
import springweb.d01_board.vo.Quebank;
import springweb.d01_board.vo.Quebank_Sch;

@Service
public class A02_QueBankService {
@Autowired(required=false)
A02_QueBankDao dao;

	public ArrayList<Quebank> listQuebank(Quebank_Sch sch){
		return dao.listQuebank(sch);
	}
	public void insertQuebank(Quebank ins){
		dao.insertQuebank(ins);
	}
	
}
