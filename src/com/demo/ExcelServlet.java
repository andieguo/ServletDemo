package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExcelServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("application/vnd.ms-excel;charset=gb2312");
		PrintWriter out = response.getWriter();

		out.println("<h3>Student information</h3>");
		out.println("ѧ��\t����\t�Ա�\t����\t����ϵ");
		out.println("95001\t����\t��\t20\t��Ϣ");
		out.println("95002\t����\tŮ\t19\t��ѧ");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
