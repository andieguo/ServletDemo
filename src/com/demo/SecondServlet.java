package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("gb2312");
		response.setContentType("text/html;charset=gb2312");
		Student st = (Student) request.getAttribute("student");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>Ñ§ºÅ£º" + st.getSno() + "</h3><p>");
		pw.println("<h3>ÐÕÃû£º" +	st.getName() + "</h3><p>");
		pw.println("<a href='http://localhost:8080/helloapp/input1.html'>·µ»Ø</a>");
		pw.println("</body>");
		pw.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
