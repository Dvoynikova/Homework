package com;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Music1Servlet extends HttpServlet {


	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding ("UTF-8");
		
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		String num3 = req.getParameter("num3");
		String num4 = req.getParameter("num4");
		
		Strings g1=new Strings();
		
		String result1 = g1.getDescription1();
		
	}
}
