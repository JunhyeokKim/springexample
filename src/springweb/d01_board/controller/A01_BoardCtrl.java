package springweb.d01_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.d01_board.vo.Board_Sch;


@Controller
@RequestMapping("/boardList.do")
public class A01_BoardCtrl {
	// °Ô½ÃÆÇ list
	// http://localhost:5080/springweb/boardList.do?method=list
	@RequestMapping(params = "method=list")
	public String start(@ModelAttribute("empsch") Board_Sch sch, Model d) {
		if(sch.getSubject()!=null){
			System.out.println(sch.getSubject());
			sch.setSubject(sch.getSubject()+"@");
		}
		return "d01_board/a01_boardList";
	}

}
