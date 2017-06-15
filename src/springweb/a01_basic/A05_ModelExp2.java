package springweb.a01_basic;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import springweb.z01_database.A01_EmpDB;
import springweb.z01_dto.Code;
import springweb.z01_dto.Emp;
import springweb.z01_dto.Product;

@Controller
public class A05_ModelExp2 {
	@ModelAttribute("deptList")
	public ArrayList<Code> deptList(){
		ArrayList<Code> list =new ArrayList<Code>();
		list.add(new Code("10","인사"));
		list.add(new Code("20","재무"));
		list.add(new Code("30","it"));
		list.add(new Code("40","총무"));
		return list;
	}
	
	@RequestMapping("/buyProd.do")
	public String call(@ModelAttribute("prod") Product prod) {
		if (prod.getCnt() > 0 && prod.getPrice() > 0 && prod.getName() != null && !prod.getName().equals(""))
			prod.setTot(prod.getPrice() * prod.getCnt());
		return "a01_basic/a21_buyProd";
	}

//	화면단 호출
//	http://localhost:5080/springweb/emplist.do
	@RequestMapping("/emplist.do")
	public String empList(@ModelAttribute("sch") Emp sch, Model d){
		if(sch.getEname()!=null){
			d.addAttribute("list", new A01_EmpDB().searchPre(sch));
		}
		
		
		return "a01_basic/a22_empList";
	}

}
