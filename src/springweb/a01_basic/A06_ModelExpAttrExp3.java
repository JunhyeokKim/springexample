package springweb.a01_basic;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.z01_dto.Calculator;
import springweb.z01_dto.Code;

@Controller
public class A06_ModelExpAttrExp3 {

	@ModelAttribute("operator")
	public ArrayList<Code> calList() {
		ArrayList<Code> list = new ArrayList<>();
		list.add(new Code("0", " + "));
		list.add(new Code("1", " - "));
		list.add(new Code("2", " * "));
		list.add(new Code("3", " / "));
		return list;
	}

	/*
	 * @RequestMapping("/calculator.do") public String
	 * doCal(@ModelAttribute("num") Exam exam, @RequestParam(value = "operator",
	 * defaultValue = "+") String operator, Model d) { if (exam != null ) {
	 * exam.setResult("오답"); System.out.println("op: " +operator);
	 * if(operator!=null && !operator.equals("")){ switch (operator) { case "+":
	 * if (exam.getNum01() + exam.getNum02() == exam.getInputdata())
	 * exam.setResult("정답"); break; case "-": if (exam.getNum01() -
	 * exam.getNum02() == exam.getInputdata()) exam.setResult("정답"); break; case
	 * "*": if (exam.getNum01() * exam.getNum02() == exam.getInputdata())
	 * exam.setResult("정답"); break; case "/": if (exam.getNum01() /
	 * exam.getNum02() == exam.getInputdata()) exam.setResult("정답"); break; }
	 * d.addAttribute("ans",exam.getResult()); } } return
	 * "a01_basic/a23_calculator"; }
	 */
	@RequestMapping("/calculator.do")
	public String doCal(@ModelAttribute("cal") Calculator calc) {
		System.out.println("num01: " + calc.getNum01());
		System.out.println("num02: " + calc.getNum02());
		System.out.println("operator: " + calc.getCalIdx());
		int[] result = { calc.getNum01() + calc.getNum02(), calc.getNum01() - calc.getNum02(),
				calc.getNum01() * calc.getNum02(), calc.getNum02()==0?0:calc.getNum01() / calc.getNum02() };
		calc.setResult(result[calc.getCalIdx()]);
		return "a01_basic/a23_calculator";
	}

}
