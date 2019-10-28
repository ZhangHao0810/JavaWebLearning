package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class DemoServlet01
 */
public class DemoServlet01 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("收到了一个请求..." +name+"="+age);
		
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write("收到了请求...");
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("现在来了一个post请求，将要去走get的代码了。");
		doGet(request, response);
	}

}
