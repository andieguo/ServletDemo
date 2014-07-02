package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		String cookieName = "user";
		String cookieValue = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if (cookie.getName().equals(cookieName))
					cookieValue = cookie.getValue();
			}
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><title>get cookies</title>");
		out.println("<body><h2>A cookie has been got from brower</h2>");
		out.println("CookieName:" + cookieName + "<br>");
		out.println("CookieValue:" + cookieValue + "<br>");
		out.println("</body></html>");
	}

}
