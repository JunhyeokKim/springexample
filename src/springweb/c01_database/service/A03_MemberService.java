package springweb.c01_database.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.c01_database.repository.A03_MemberDao;
import springweb.z01_dto.Member;

@Service
public class A03_MemberService {
	@Autowired(required = false)
	private A03_MemberDao memDao;

	public ArrayList<Member> memberList() {
		return memDao.memberList();
	}
}
