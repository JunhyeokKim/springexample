package springweb.a01_basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class A08_ForRedCtrlExp {
	// http://localhost:5080/springweb/callSelling.do
	@RequestMapping("/callingSel.do")
	public String redBuy(@RequestParam(value="sel", defaultValue="0") int choiceNum){
		String page="a01_basic/a24_initPage";
		System.out.println(choiceNum);
		if(choiceNum==1){
			page="redirect:/buyProd.do";
		}else if(choiceNum==2){
			page="forward:/buyProd.do";
		}
		return page;
	}

}
