package springweb.a01_basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A07_ForRedCtrl {
	// ����Ʈ ȣ��
	@RequestMapping("/redirect01.do")
	public String redirect01() {
		return "redirect:http://www.naver.com";
	}

	// ���� Controller ȣ��
	@RequestMapping("/redirect02.do")
	public String redirect02() {
		return "redirect:/start.do";
	}

	// ���� �ڿ� ȣ�� jsp page ȣ��
	@RequestMapping("/redirect03.do")
	public String redirect03() {
		return "redirect:/index";
	}

	// ���� �ڿ� ȣ�� 1
	// http://localhost:5080/springweb/redEmp.do?ename=F
	// redirect�� �����Ͱ����� ��û������ �ѱ��� �ʴ´�
	@RequestMapping("/redEmp.do")
	public String redEmp() {
		return "redirect:/emplist.do";
	}
	// ���� �ڿ�ȣ�� 2
	// http://localhost:5080/springweb/forEmp.do?ename=F
	// ��û���� �Ѱ����� ���� Ȯ���� �� �ִ�.

	@RequestMapping("/forEmp.do")
	public String forEmp() {
		return "forward:/emplist.do";
	}
	
	
}
