package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("gb2312");
		response.setContentType("text/html;charset=gb2312");

		String name = request.getParameter("name");
		name = new String(name.getBytes("iso8859-1"), "gb2312");
		String age = request.getParameter("age");
		age = new String(age.getBytes("iso8859-1"), "gb2312");

		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>–’√˚£∫" + name + "</h3><p>");
		pw.println("<h3>ƒÍ¡‰£∫" + age + "</h3><p>");
		pw.println("</body>");
		pw.println("</html>");

	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
