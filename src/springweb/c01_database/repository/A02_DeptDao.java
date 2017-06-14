package springweb.c01_database.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.z01_dto.Dept;

@Repository
public interface A02_DeptDao {
	// id: springweb.c01_database.repository
	public ArrayList<Dept> deptList(Dept sch);
	public Dept deptOne(int deptno);
	public void deptUpdate(Dept upt);
}
/*class @@@@ implements A02_DeptDao{
	public ArrayList<Dept> deptList(Dept sch){
		
		<select id="deptList" resultMap="deptRsMap" parameterType="dept">
		select * from dept 
		where dname like '%'|| #{dname} ||'%'
		</select>
		
		return deptList;
	}
	
}*/