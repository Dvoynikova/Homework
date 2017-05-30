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
		
		String num5 = req.getParameter("num5");
		String num6 = req.getParameter("num6");
		String num7 = req.getParameter("num7");
		String num8 = req.getParameter("num8");
		String num9 = req.getParameter("num9");
		
		Strings g2=new Strings();
		String result2 = g2.getDescription2();
		
		
		String num10 = req.getParameter("num10");
		String num11 = req.getParameter("num11");
		String num12 = req.getParameter("num12");
		String num13 = req.getParameter("num13");
		
		Strings g3=new Strings();
		String result3 = g3.getDescription3();
		
		String num14 = req.getParameter("num14");
		String num15 = req.getParameter("num15");
		String num16 = req.getParameter("num16");
		String num17 = req.getParameter("num17");
		String num18 = req.getParameter("num18");
		
		Strings g4=new Strings();
		String result4 = g4.getDescription4();
		
		String num19 = req.getParameter("num19");
		String num20 = req.getParameter("num20");
		String num21 = req.getParameter("num21");
		String num22 = req.getParameter("num22");
		String num23 = req.getParameter("num23");
		
		Strings g5=new Strings();
		String result5 = g5.getDescription5();
		
		
		
	}
}
