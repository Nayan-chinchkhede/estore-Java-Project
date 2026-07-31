package com.estoreServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;

import com.Bean.ProductBean;
import com.DAO.ViewProductDAO;
@WebServlet("/View2")
public class ViewCustomerProductServlet  extends HttpServlet
{
		protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException
		{
			HttpSession session=req.getSession(false);
			if(session==null)
			{
				System.out.println("Session Expired");
				req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
			}
			else
			{
				ArrayList<ProductBean> pb=new ViewProductDAO().reteriveProducts();
				session.setAttribute("productlist", pb);
	    		req.getRequestDispatcher("ViewCustomerProduct.jsp").forward(req, res);
	    		
			}
		}
}
