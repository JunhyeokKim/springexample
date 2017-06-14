package springweb.a01_basic;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import springweb.z01_dto.Member;
import springweb.z01_dto.Product;
import springweb.z01_dto.Schedule;

@Controller
@SessionAttributes("schedule")
public class A08_SessionCtrl {
	
	@ModelAttribute("schedule")
	public Schedule getSchedule(){
		return new Schedule();
	}
	@RequestMapping("/input_schedule.do")
	public String inputSchedule(@ModelAttribute("schedule") Schedule sch){
		return "a01_basic/a29_recordSchedule";
	}
	@RequestMapping("/sess_login01.do")
	public String login(Member m, HttpSession ses) {
		String page = "a01_basic/a25_login";
		if (m.getId() != null && m.getId().equals("himan") && m.getPass() != null && m.getPass().equals("7777")) {
			ses.setAttribute("member", m);
			page = "a01_basic/a26_main";
		}
		return page;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping("/sess_cart01.do")
	public String getCart(Product prod, HttpServletRequest request) {
		String page = "a01_basic/a27_prod";
		if (prod.getName() != null) {
			HttpSession ses = request.getSession();
			ArrayList<Product> cartList = null;
			if (ses.getAttribute("cartList") == null) {
				cartList = new ArrayList<Product>();
			} else {
				cartList = (ArrayList<Product>) ses.getAttribute("cartList");
			}
			cartList.add(prod);
			ses.setAttribute("cartList", cartList);
			page="a01_basic/a28_cartList";
		}
		return page;
	}
	
}
