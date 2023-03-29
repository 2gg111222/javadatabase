package com.multi.mvc04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BookController {

	@Autowired
	BookDAO dao;
	
	@RequestMapping("insert3")
	public void insert(BookDTO bag) throws Exception {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		
		dao.insert(bag);
	}
	
	@RequestMapping("delete3")
	public void delete(int id)throws Exception {
		System.out.println("delete요청됨.");
		System.out.println(id);
		dao.delete(id);
	}
	
	@RequestMapping("update3")
	public void update(BookDTO bag) throws Exception {
		System.out.println("update요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.update(bag);
	}
	
	@RequestMapping("one3")
	public void one3(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		BookDTO bag = dao.one(id);
		model.addAttribute("bag",bag);
		//views까지 전달 할 속성으로 추가해주세요.
		
	}
}
