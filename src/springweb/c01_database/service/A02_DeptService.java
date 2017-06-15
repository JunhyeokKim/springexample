package springweb.c01_database.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.c01_database.repository.A02_DeptDao;
import springweb.z01_dto.Dept;

@Service
public class A02_DeptService {
	@Autowired(required = false)
	private A02_DeptDao dao;

	public ArrayList<Dept> deptList(Dept sch) {
		return dao.deptList(sch);
	}

	public Dept deptOne(int deptno) {
		return dao.deptOne(deptno);
	}

	public void deptUpdate(Dept upt) {
		dao.deptUpdate(upt);
	}
}
