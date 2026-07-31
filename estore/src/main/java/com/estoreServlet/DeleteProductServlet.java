package com.estoreServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.DeleteProduct;
@WebServlet("/Delete")
public class DeleteProductServlet  extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException
	{
		HttpSession session =req.getSession(false);
		if(session==null)
		{
			System.out.println("Sessin Expired");
			req.getRequestDispatcher("AdminLogin.html").forward(req, res);
			
		}
		else
		{
			int rowCount= new DeleteProduct().deleteRecord(req.getParameter("pcode"));
			if(rowCount>0)
			{
				req.setAttribute("data", "productDeleted");
				req.getRequestDispatcher("DeleteProduct.jsp").forward(req, res);
				
				}
		}
	}
}
