<%@page import="com.multi.mvc200.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<table>
		<tr>
			<td class="top">no</td>
			<td class="top">title</td>
			<td class="top">content</td>
			<td class="top">writer</td>
		</tr>

		<c:forEach items="${list}" var="bag"> 

	<tr>
				<td class="down"><a href="one3.multi?no=${bag.id}">${bag.id}</td>
				<td class="down">${bag.name}</a>
				</td>
				<td class="down">${bag.url}</td>
				<td class="down">${bag.im}</td>
			</tr>

		</c:forEach>
	</table>
