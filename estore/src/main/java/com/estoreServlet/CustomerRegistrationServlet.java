package com.estoreServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.CustomerBean;
import com.DAO.CustomerRegisterDAO;
@WebServlet("/creg")
public class CustomerRegistrationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		CustomerBean cb=new CustomerBean();
		cb.setUname(req.getParameter("UNAME"));
		cb.setUpwd(req.getParameter("PWARD"));
		cb.setUfname(req.getParameter("UFNAME"));
		cb.setUlname(req.getParameter("LNAME"));
		cb.setUaddr(req.getParameter("ADDR"));
		cb.setUmail(req.getParameter("MID"));
		cb.setUmno(req.getParameter("PHNO"));
		
		int rowCount= new CustomerRegisterDAO().addCustomer(cb);
		if(rowCount>0)
		{
			req.setAttribute("msgg","Customer added successfully");
	        req.getRequestDispatcher("CustomerRegister.jsp").forward(req, res);
	        	}
		else {
			req.setAttribute("msgg","Customer Not added");
	        req.getRequestDispatcher("CustomerRegister.jsp").forward(req, res);
	        
		}
	}

}
