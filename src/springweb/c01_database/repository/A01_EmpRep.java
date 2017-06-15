package springweb.c01_database.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.z01_dto.Emp;
import springweb.z01_dto.EmpMulti;

@Repository
public interface A01_EmpRep {
//	xml�� �ִ� id���� ���� ���� ��Ģ���� mapping
//	id="��Ű����.�������̽���.�޼����
//	id="springweb.c01_database.repository.A01_EmpRep.emplist"
//	�����ϴ� data�ִ� VO : Emp sch
	// parameterType="emp"
//	������ ��� ó�� ArrayList<VO>
	public ArrayList<Emp> emplist(Emp sch);
	
	// id : empOne
	// resultType ="emp"
	// parameterType="int"
	// return : Emp �Է�: empno(int)
	public Emp empOne(int empno);
	// return :void �Է� : emp
	// id: empUpdate
	// parameterType: Emp
	public void empUpdate(Emp upt);
	
	public ArrayList<Emp> empList02(Emp sch);
	public ArrayList<Emp> empMultiList(EmpMulti sch);
	
}
