package com.multi.mvc200;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //컨트롤러 등록, 까먹지 말자
public class ComputerController {
	
	@RequestMapping("computer")
	public void com(ComputerVO vo, Model model) {
		System.out.println(vo);
		vo.setSum(vo.getPrice() + vo.getPrice2());
		model.addAttribute("vo", vo);
	}
}
