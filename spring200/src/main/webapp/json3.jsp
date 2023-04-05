<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
 <%
 JSONObject json = new JSONObject();
 	json.put("today", "비");
 	json.put("temp", 13.8);
 	json.put("hu", 100);
 

 %>
 
 <%= json.toJSONString() %>