package springweb.d01_board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.d01_board.service.A02_QueBankService;
import springweb.d01_board.vo.Quebank;
import springweb.d01_board.vo.Quebank_Sch;

@Controller
@RequestMapping("/quebankList.do")
public class A02_QueBankCtrl {
	@Autowired(required=false)
	private A02_QueBankService service;
	
	@RequestMapping(params="method=list")
	public String start(@ModelAttribute("queSch") Quebank_Sch sch, Model d){
		d.addAttribute("list",service.listQuebank(sch));
		return "d01_board/a11_quebankList";
	}
	@RequestMapping(params="method=insert")
	public String insert(){
		return "d01_board/a12_insertQuebank";
	}
	@RequestMapping(params="method=insProc")
	public String insProc(Quebank ins){
		service.insertQuebank(ins);
		return "redirect:/quebankList.do?method=list";
	}
	
}
