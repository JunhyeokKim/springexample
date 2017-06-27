package springweb.exp;

import java.util.HashMap;
import java.util.Map;

import javax.activation.CommandMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import springweb.d01_board.service.A01_BoardService;

@Controller

public class AjaxCtrl {
	@Autowired(required=false)
	A01_BoardService service;
	
	@RequestMapping(value="ajaxExp.ajax", method=RequestMethod.GET)
	public ModelAndView login(CommandMap commandMap) throws Exception {
	Map resultMap = new HashMap();
	resultMap.put("result", 1);
	ModelAndView modelAndView = new ModelAndView("jsonView", resultMap);

	return modelAndView;
	}

}
