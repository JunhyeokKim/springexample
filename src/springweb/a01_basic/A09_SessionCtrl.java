package springweb.a01_basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import springweb.z01_dto.Point;

@Controller
@SessionAttributes("mem")
public class A09_SessionCtrl {
	@ModelAttribute("mem")
	public Point getPoint() {
		Point p = new Point();
		p.setPoint(5000);
		return p;
	}

	@RequestMapping("/movie.do")
	public String login(@ModelAttribute("mem") Point p,
			@RequestParam(value = "sel", defaultValue = "0") int minusPoint) {
		String page = "a01_basic/a31_movie";
		if (p.getName() != null && p.getName().equals("À¸¾û")) {
			page = "forward:/a01_basic/a31_checkPoint";
			//logout
			
			if (p.getPoint() > 500)
				p.setPoint(p.getPoint() - minusPoint);
		}
		return page;
	}
}
