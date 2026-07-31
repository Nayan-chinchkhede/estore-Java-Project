package com.estoreServlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.AdminBean;
import com.DAO.AdminLoginDAO;
@WebServlet("/alog")
public class AdminLoginServlet extends  HttpServlet {
	@Override
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String uname=req.getParameter("uname");
		String upass=req.getParameter("upass");

		System.out.println("USERNAME = "+uname);
		System.out.println("PASSWORD = "+upass);

		AdminBean abean=new AdminLoginDAO().checkAdminLogin(uname, upass);
		if(abean==null)
		{
			req.getRequestDispatcher("AdminLogin.html").forward(req, res);
		}
		else
		{
	HttpSession session=req.getSession();
		session.setAttribute("AdminBean", abean);
		req.getRequestDispatcher("AdminHome.jsp").forward(req, res);
		
	}
	
		}
	}