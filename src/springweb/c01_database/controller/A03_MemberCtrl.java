package springweb.c01_database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.c01_database.service.A03_MemberService;

@Controller
public class A03_MemberCtrl {
	@Autowired(required=false)
	private A03_MemberService service;
	
	@RequestMapping("/member.do")
	public String memberList(Model d){
		d.addAttribute("memberList",service.memberList());
		return "c01_database/a02_memberList";
		
	}
}
