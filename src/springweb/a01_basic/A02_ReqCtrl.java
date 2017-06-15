package springweb.a01_basic;

import org.apache.commons.logging.impl.Log4JLogger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



//springweb.a01_basic.A02_ReqCtrl
//1. annotation 선언
//2. 조립기(dispatcher-servlet.xml)에 등록


/**
 * @author		acorn
 * @since		2017. 6. 2.
 * @filename	A02_ReqCtrl.java
 * @see
 * <pre>
 * package : springweb.a01_basic
 * </pre>
 */
@Controller
public class A02_ReqCtrl {
	// http://localhost:5080/springweb/reqexp01.do
	// ?greet1=hi!!&greet2=good!!
	@RequestMapping("/reqexp01.do")
	public String requestCall(
			@RequestParam(value = "greet1", defaultValue = "초기인사!!")
				String greet01,
				@RequestParam(value = "greet2", defaultValue = "초기인사2~")
			String greet02,
			@RequestParam(value = "callNum", defaultValue = "-1" )
			int callNum01
			) {
		System.out.println("요청값 1 : "+greet01);
		System.out.println("요청값 2 : "+greet02);
		System.out.println("요청값 3 : "+callNum01);
		return "a01_basic/a10_calling"; // 화면단 호출..
	}
	// http://localhost:5080/springweb/buyForm.do
	@RequestMapping("/buyForm.do")
	public String requestBuy (
			@RequestParam(value = "prodName", defaultValue = "사과")
			String prodName,
			@RequestParam(value = "prodCnt", defaultValue = "1")
			int prodCnt,
			@RequestParam(value = "prodPrice", defaultValue = "1000")
			int prodPrice,
			Model d
			) {
		d.addAttribute("showinfo", "구매 요청 물건이 없습니다!");
		// 요청한 물건명과 갯수가 존재하는 경우
		if(!prodName.equals("") && prodCnt > 0) {
			String msg = String.format("요청하신 물건은 %s 이고,"
					+ " 단가는 %d 원이며,"
					+ " %d 개로 총 비용은 %d 원 입니다.", 
					prodName,prodPrice,prodCnt,prodCnt*prodPrice);
			d.addAttribute("showinfo",msg);
		}
		return "a01_basic/a12_buyList";
	}
	// 요청 방식 처리
	
	@RequestMapping(value="/calling.do",method=RequestMethod.GET)
	public String methodExp() {
		return "/a01_basic/a13_getForm";
	}
	
	
	@RequestMapping(value="/calling.do",method=RequestMethod.POST)
	public String methodExp2() {
		return "/a01_basic/a14_postForm";
	}
	
}
