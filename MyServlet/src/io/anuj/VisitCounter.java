package io.anuj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VisitCounter extends HttpServlet{
	
	int k =0;
	
	public void init() {
		k = 1;
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
				
		PrintWriter out = res.getWriter();
//		res.setContentType("application/json");
//		res.setCharacterEncoding("UTF-8");
		out.println("No. of visits " + k);
		k++;
	}
	
}
