package springweb.a01_basic;

import org.springframework.stereotype.Controller;
// springweb.a01_basic.A06_ModelAndViewCtrl
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springweb.z01_dto.Product;
@Controller
public class A06_ModelAndViewCtrl {
	@RequestMapping("/mav.do")
	public ModelAndView mavExp(){
		ModelAndView mav=new ModelAndView();
		// model에 대한 처리..
		mav.addObject("how", "fine!!");
		mav.addObject("prod", new Product("사과",5000));
		mav.setViewName("a01_basic/a23_mav");
		return mav;
	}
	

}
