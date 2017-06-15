package springweb.c01_database.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.c01_database.repository.A01_EmpRep;
import springweb.c01_database.repository.A02_DeptDao;
import springweb.c01_database.repository.A03_MemberDao;
import springweb.z01_dto.Dept;
import springweb.z01_dto.Emp;
import springweb.z01_dto.EmpMulti;
import springweb.z01_dto.Member;

@Service
public class A01_EmpService {
	@Autowired(required = false)
	private A01_EmpRep dao;
	

	public ArrayList<Emp> empList(Emp sch) {
		return dao.emplist(sch);
	}
	// id: empOne
	// resultType="emp"
	// parameterType="int"
	public Emp empOne(int empno){
		return dao.empOne(empno);
	}
	
	public void empUpdate(Emp upt){
		dao.empUpdate(upt);
	}
	public ArrayList<Emp> empList02(Emp sch){
		return dao.empList02(sch);
	}
	public ArrayList<Emp> empMultiList(EmpMulti sch){
		return dao.empMultiList(sch);
	}
	
	
}
