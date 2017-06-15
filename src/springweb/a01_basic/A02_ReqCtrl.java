package springweb.a01_basic;

import org.apache.commons.logging.impl.Log4JLogger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



//springweb.a01_basic.A02_ReqCtrl
//1. annotation ����
//2. ������(dispatcher-servlet.xml)�� ���


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
			@RequestParam(value = "greet1", defaultValue = "�ʱ��λ�!!")
				String greet01,
				@RequestParam(value = "greet2", defaultValue = "�ʱ��λ�2~")
			String greet02,
			@RequestParam(value = "callNum", defaultValue = "-1" )
			int callNum01
			) {
		System.out.println("��û�� 1 : "+greet01);
		System.out.println("��û�� 2 : "+greet02);
		System.out.println("��û�� 3 : "+callNum01);
		return "a01_basic/a10_calling"; // ȭ��� ȣ��..
	}
	// http://localhost:5080/springweb/buyForm.do
	@RequestMapping("/buyForm.do")
	public String requestBuy (
			@RequestParam(value = "prodName", defaultValue = "���")
			String prodName,
			@RequestParam(value = "prodCnt", defaultValue = "1")
			int prodCnt,
			@RequestParam(value = "prodPrice", defaultValue = "1000")
			int prodPrice,
			Model d
			) {
		d.addAttribute("showinfo", "���� ��û ������ �����ϴ�!");
		// ��û�� ���Ǹ�� ������ �����ϴ� ���
		if(!prodName.equals("") && prodCnt > 0) {
			String msg = String.format("��û�Ͻ� ������ %s �̰�,"
					+ " �ܰ��� %d ���̸�,"
					+ " %d ���� �� ����� %d �� �Դϴ�.", 
					prodName,prodPrice,prodCnt,prodCnt*prodPrice);
			d.addAttribute("showinfo",msg);
		}
		return "a01_basic/a12_buyList";
	}
	// ��û ��� ó��
	
	@RequestMapping(value="/calling.do",method=RequestMethod.GET)
	public String methodExp() {
		return "/a01_basic/a13_getForm";
	}
	
	
	@RequestMapping(value="/calling.do",method=RequestMethod.POST)
	public String methodExp2() {
		return "/a01_basic/a14_postForm";
	}
	
}
