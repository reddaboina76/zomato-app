package com.zomoto.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("OrderFoodServlet :: dopost method excuted started!!");
		String MobileNumber = req.getParameter("mbl");
		String Password = req.getParameter("pwd");
		System.out.println(MobileNumber+"--"+Password);
		req.getRequestDispatcher("profile.jsp").forward(req, resp);
		
		
		
		
	}
}
