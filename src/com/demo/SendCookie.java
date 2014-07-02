package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Cookie userCookie = new Cookie("user", "uid1234");
		userCookie.setMaxAge(60 * 60 * 24 * 7);
		response.addCookie(userCookie);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><title>add cookies</title>");
		out.println("<body><h2>"
				+ "A cookie has been sent to brower</h2></body>");
		out.println("</html>");

	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
