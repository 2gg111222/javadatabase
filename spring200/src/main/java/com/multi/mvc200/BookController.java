package com.multi.mvc200;

import java.util.ArrayList;

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
	
	@RequestMapping("list3")
	public void list(Model model) {
		ArrayList<BookDTO> list = dao.list(); //viwes까지만 가고 사라지니 list로 계속 써도 상관없음
		model.addAttribute("list", list);
			
	}
	
}
