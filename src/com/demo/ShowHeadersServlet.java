package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowHeadersServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>All Headers</title>");
		out.println("</head>");
		out.println("<body bgcolor=\"#fdf5e6\">");
		out.println("<h1 align=\"center\">All Request Headers</h1>");
		out.println("<table border=1 align=\"center\">\n"
				+ "<tr bgcolor=\"#ffad00\">\n"
				+ "<th>Header Name<th>Header Value");
		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			out.println("<tr><td>" + headerName);
			out.println("<td>" + request.getHeader(headerName));
		}
		out.println("</table>\n</body></html>");

	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
