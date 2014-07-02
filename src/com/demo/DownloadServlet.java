package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("application/jar");
		File f = new File("C:\\servlet-api.jar");
		FileInputStream is = new FileInputStream(f);

		ServletOutputStream os = response.getOutputStream();
		byte[] bytearray = new byte[1024];
		int bytesread = 0;
		while ((bytesread = is.read(bytearray)) != -1) {
			os.write(bytearray, 0, bytesread);
		}
		os.flush();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
