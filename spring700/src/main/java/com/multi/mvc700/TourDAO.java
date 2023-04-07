package com.multi.mvc700;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TourDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(TourVO bag) {
		System.out.println("------" + my);
		int result = my.insert("Tour.create", bag);
		return result;
	}
	
	public int update(TourVO bag) {
		System.out.println("------" + my);
		int result = my.insert("Tour.up", bag);
		return result;
	}
	
	public int delete(int id) {
		System.out.println("------" + my);
		int result = my.insert("Tour.del", id);
		return result;
	}

	public TourVO one(int id) {
		TourVO bag =  my.selectOne("Tour.one", id);
		return bag;
	}

	public List<TourVO> list() {
		List<TourVO> list =  my.selectList("Tour.all");
		return list;
	}
}