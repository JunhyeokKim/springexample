package springweb.c01_database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springweb.c01_database.service.A02_DeptService;
import springweb.z01_dto.Dept;

@Controller
public class A02_DeptCtrl {
	@Autowired(required = false)
	private A02_DeptService service;

	// http://localhost:5080/springweb/dept_my.do
	@RequestMapping("/dept_my.do")
	public String deptList(Dept sch, Model d) {
		if (sch.getDname() == null) {
			sch.setDname("");
		}
		d.addAttribute("deptList", service.deptList(sch));
		return "c01_database/a03_deptList";
	}
	@RequestMapping("/dept_detail.do")
	public String deptDetail(@RequestParam(value="deptno", defaultValue="0") int deptno, Model d){
		d.addAttribute("dept",service.deptOne(deptno));
		return "c01_database/a04_deptDetail";
	}
	
	@RequestMapping("/dept_upt.do")
	public String deptUpdate(Dept upt){
		System.out.println(upt.getDname());
		service.deptUpdate(upt);
		return "redirect:/dept_my.do";
	}
}
