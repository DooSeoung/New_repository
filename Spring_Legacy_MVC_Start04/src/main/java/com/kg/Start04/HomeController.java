package com.kg.Start04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/moyamoya2.do", method = RequestMethod.POST)
	public String kaja3(Model model, @RequestParam("irum") String irum, @RequestParam("tel") String tel) {
											// name="tel"자료명 //받아서 저장할 변수명
											// input 태그 irum에서 받아
											// 자바 irum 변수에 넣어라
		
		//그러니까 getParameter()대신에 @RequestParam으로 한다는
		//즉, String tel = request.getParameter("tel");
		
		/*
		 * 여기에 마치 이름이 user, 전번이 pw인것처럼 business logic 만들기
		 */
		
		model.addAttribute("mirum",irum);
		model.addAttribute("mtel",tel);
		return "kaja";//kaja.jsp
		
		//There is nothing short for perfect
	}
	
}
