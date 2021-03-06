package com.yuan.javaweb.teacher.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yuan.javaweb.teacher.model.Envlaute;

/**
 * Servlet implementation class QueryEnv
 */
public class QueryEnv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		String teacher = request.getParameter("teacher");
		Envlaute query = new Envlaute();
		response.getWriter().append(query.queryEnv(teacher));
	}

}
