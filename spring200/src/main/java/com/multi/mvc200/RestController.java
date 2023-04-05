package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

	@RequestMapping("json1")
	@ResponseBody //요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public MemberVO json1() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		return bag; //{"id" : "root", "pw" : "1234", "name" : "hong", "tel" : "011"}
	}
	@RequestMapping("json2")
	@ResponseBody //요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public ArrayList<MemberVO> json2() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		
		MemberVO bag2 = new MemberVO();
		bag.setId("root2");
		bag.setPw("12342");
		bag.setName("hong2");
		bag.setTel("0112");
		
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(bag);
		list.add(bag2);
		
		return list;//id" : "root", "pw" : "1234", "name" : "hong", "tel" : "011"}
	}
	
	@RequestMapping("json3")
	@ResponseBody //요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public BbsVO json3() {
		BbsVO bag = new BbsVO();
		bag.setNo(123);
		bag.setTitle("1234");
		bag.setContent("hong");
		bag.setWriter("hong");
		return bag; //{"id" : "root", "pw" : "1234", "name" : "hong", "tel" : "011"}
	}
	
	@RequestMapping("json4")
	@ResponseBody //요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public ArrayList<BbsVO> json4() {
		BbsVO bag = new BbsVO();
		bag.setNo(123);
		bag.setTitle("1234");
		bag.setContent("비");
		bag.setWriter("hong");

		BbsVO bag2 = new BbsVO();
	
		bag2.setNo(12345);
		bag2.setTitle("2345");
		bag2.setContent("KIM");
		bag2.setWriter("KIM");
		
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		list.add(bag);
		list.add(bag2);
		
		return list; //{"id" : "root", "pw" : "1234", "name" : "hong", "tel" : "011"}
	}
	
	@RequestMapping("jsonResopnse5")
	@ResponseBody //요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public MapVO json5() {
		MapVO bag = new MapVO();
		bag.setLat(37.5117);
		bag.setLon(127.0592);
		System.out.println(bag);
		return bag; 
		
		//{"id" : "root", "pw" : "1234", "name" : "hong", "tel" : "011"}
	}

}
