package springweb.c01_database.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.z01_dto.Emp;
import springweb.z01_dto.EmpMulti;

@Repository
public interface A01_EmpRep {
//	xml에 있는 id값과 다음 같은 규칙으로 mapping
//	id="패키지명.인터페이스명.메서드명
//	id="springweb.c01_database.repository.A01_EmpRep.emplist"
//	전달하는 data있는 VO : Emp sch
	// parameterType="emp"
//	데이터 결과 처리 ArrayList<VO>
	public ArrayList<Emp> emplist(Emp sch);
	
	// id : empOne
	// resultType ="emp"
	// parameterType="int"
	// return : Emp 입력: empno(int)
	public Emp empOne(int empno);
	// return :void 입력 : emp
	// id: empUpdate
	// parameterType: Emp
	public void empUpdate(Emp upt);
	
	public ArrayList<Emp> empList02(Emp sch);
	public ArrayList<Emp> empMultiList(EmpMulti sch);
	
}
