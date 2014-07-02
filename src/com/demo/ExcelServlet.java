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
		out.println("学号\t姓名\t性别\t年龄\t所在系");
		out.println("95001\t李勇\t男\t20\t信息");
		out.println("95002\t刘晨\t女\t19\t数学");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
