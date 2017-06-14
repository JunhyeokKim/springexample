package springweb.d01_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.d01_board.vo.Quebank;

@Controller
@RequestMapping("/quebankList.do")
public class A02_QueBankCtrl {

	@RequestMapping(params="method=list")
	public String start(@ModelAttribute("queSch") Quebank sch, Model d){
		if(sch.getQue()!=null){
			System.out.println(sch.getQue());
			sch.setQue(sch.getQue()+"À×À×");
		}
		return "d01_board/a11_quebankList";
	}
	
}
