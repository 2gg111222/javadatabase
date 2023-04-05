package com.multi.mvc200;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.mysql.cj.Session;

@Controller //스프링에서 제어하는 역할로 등록! 
public class MemberController {
	
	@Autowired
	MemberDAO33 dao; // 전역변수(글로벌 변수)
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버메서드(기능처리 담당)
	//하나의 요청당 하나의 메서드
	//하나의 버튼호출당 하나의 함수 연결!
	//요청된 주소가 어떻게 될 때
	//바로 아래에 있는 메서드가 호출이 될지를
	//써주어야 한다. 
	
	@RequestMapping("login")
	public String login(MemberVO bag, HttpSession session) throws Exception {
			System.out.println(bag);
			//dao를 이용해서 db처리할 예정
			//view아래로 넘어가게 되어있음
			//view아래 login.jsp를 호출하게 됨
			int result = dao.login(bag);// 1, 0
			if(result == 1) {
				session.setAttribute("id", bag.getId());
				return "ok"; //views아래 파일이름.jsp
			}else {
				//views아래가 아니고, webapp아래
				//member.jsp로 가고 싶은 경우!
				return "redirect:member.jsp";
	}
}
	@RequestMapping("insert")
	public void insert(MemberVO bag) throws Exception {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) throws Exception {
		System.out.println("update요청됨.");
		
		System.out.println(dao);
		System.out.println(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id, MemberDAO33 dao) {
		System.out.println("delete요청됨.");
		System.out.println(id);
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		MemberVO bag = dao.one(id);
		//bag에 검색결과 다 들어있음..
		//view아래 one.jsp로 쓸 수 있도록 설정해주어야함
		model.addAttribute("bag", bag);
		//view 실행
	}
	
	@RequestMapping("one5")
	public void one5(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		MemberVO bag = dao.one(id);
		//bag에 검색결과 다 들어있음..
		//view아래 one.jsp로 쓸 수 있도록 설정해주어야함
		model.addAttribute("bag", bag);
		//view 실행
	}
	
	@RequestMapping("one23")
	@ResponseBody
	//views로 넘어가지 않고, 
	//Return값이 bag데이터를 json으로 만들어서 클라이언트로 전송 
	//클라이언트 브라우저에서는 success: function(x) 
	//결과과 함수의 입력변수인 x로 쏙 들어간다.!
	public MemberVO one22(String id) {
		System.out.println("one요청됨");
		System.out.println(id);
		MemberVO bag = dao.one(id);
		//검색결과가 있는지 프린트!
		System.out.println(bag);
		return bag;
		
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		System.out.println("list요청됨.");
		//Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체
		ArrayList<MemberVO> list= dao.list();
		model.addAttribute("list",list);
	}
	
	@RequestMapping("list56")
	@ResponseBody
	public ArrayList<MemberVO> list55() {
			ArrayList<MemberVO> list = dao.list(); //viwes까지만 가고 사라지니 list로 계속 써도 상관없음
			System.out.println(list.size());
			return list;
	}
	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
	
	
	
	
	
}