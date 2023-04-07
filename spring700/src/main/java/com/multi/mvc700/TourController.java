package com.multi.mvc700;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TourController {
	
	@Autowired
	TourDAO dao;//100
	
	@RequestMapping("insert")
	public void insert(TourVO bag) {
		
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(TourVO bag) {
		
		System.out.println("update요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(int id) {
		
		System.out.println("update요청됨.");
		System.out.println(id);
		System.out.println(dao);
		dao.delete(id);
	}
	
	@RequestMapping("one")
	public void one(int id, Model model) {
		
		System.out.println("update요청됨.");
		System.out.println(id);
		TourVO bag = dao.one(id);
		System.out.println(dao);
		model.addAttribute("bag", bag);
		
	}

	@RequestMapping("list")
	public void list(Model model) {
		
		System.out.println("update요청됨.");
		List<TourVO> list = dao.list();
		System.out.println(dao);
		model.addAttribute("list", list);
		
	}
}
