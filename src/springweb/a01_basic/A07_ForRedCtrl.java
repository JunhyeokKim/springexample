package springweb.a01_basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A07_ForRedCtrl {
	// 사이트 호출
	@RequestMapping("/redirect01.do")
	public String redirect01() {
		return "redirect:http://www.naver.com";
	}

	// 내부 Controller 호출
	@RequestMapping("/redirect02.do")
	public String redirect02() {
		return "redirect:/start.do";
	}

	// 내부 자원 호출 jsp page 호출
	@RequestMapping("/redirect03.do")
	public String redirect03() {
		return "redirect:/index";
	}

	// 내부 자원 호출 1
	// http://localhost:5080/springweb/redEmp.do?ename=F
	// redirect는 데이터값으로 요청값으로 넘기지 않는다
	@RequestMapping("/redEmp.do")
	public String redEmp() {
		return "redirect:/emplist.do";
	}
	// 내부 자원호출 2
	// http://localhost:5080/springweb/forEmp.do?ename=F
	// 요청값이 넘겨지는 것을 확인할 수 있다.

	@RequestMapping("/forEmp.do")
	public String forEmp() {
		return "forward:/emplist.do";
	}
	
	
}
