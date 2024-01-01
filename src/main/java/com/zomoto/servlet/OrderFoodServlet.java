package com.zomoto.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Validations.MobileValidation;

public class OrderFoodServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("OrderFoodServlet :: dopost method excuted started!!");
		String Name = req.getParameter("name");
		String MobileNumber = req.getParameter("mbl");

		// MobileNumber Validation
		MobileValidation val = new MobileValidation();
		boolean isMblValid = val.isValidMobile(MobileNumber);
		
		System.out.println("Mobile Validation result is " + isMblValid);
		
		String Password = req.getParameter("pwd");
		String City = req.getParameter("city");
		System.out.println(Name + "---" + MobileNumber + "---" + Password + "---" + City);
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
}
