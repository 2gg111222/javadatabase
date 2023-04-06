package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import 화면DB연결.MemberVO;



@Component
public class MemberDAO { // CRUD
	
	@Autowired
	SqlSessionTemplate my;
	
	/*
	 * //특정한 방법을 실행하는 클래스 (방법클래스) public int login(MemberVO bag) {
	 * 
	 * return result; }
	 * 
	 * public ArrayList<MemberVO> list() {
	 * 
	 * return list;
	 * 
	 * }
	 * 
	 * public MemberVO one(String id) {
	 * 
	 * return bag;
	 * 
	 * }
	 * 
	 *   }
	 */ 
	  public int delete(String id) {
		 int result = my.delete("member.del", id);
		 
		 return result;
	  }
	
	
	// public void add2() {
	public int insert(MemberVO bag) {
		int result = my.insert("member.create", bag); 
								//namespace.id
		return result;
	}

	public int update(MemberVO bag) {
		int result = my.update("member.up", bag);
		return result;
	}
}
