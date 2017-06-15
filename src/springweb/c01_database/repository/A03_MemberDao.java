package springweb.c01_database.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.z01_dto.Member;

@Repository
public interface A03_MemberDao {
	public ArrayList<Member> memberList();
}
