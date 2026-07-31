package com.estoreServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.ProductBean;
import com.DAO.AddProductDAO;
@WebServlet("/addproduct")

public class AddProductServlet extends HttpServlet {
	@Override
	protected void doPost (HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	  try {
		  ProductBean	pb=new ProductBean();
			pb.setpCode(req.getParameter("pcode"));
			pb.setpName(req.getParameter("pname"));
		    pb.setpCompany(req.getParameter("pcompany"));
		    pb.setpPrice(req.getParameter("pprice"));
		    pb.setpQty(req.getParameter("pqty"));
		    
		    int rowcount=new AddProductDAO().addProduct( pb);
		    if(rowcount > 0)
		    {
		        req.setAttribute("msg", "Product Added Successfully...");
		        req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
		    }
		    else
		    {
		        req.setAttribute("msg", "Product Not Added...");
		        req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
		    }
	  }
	  catch(Exception e)
	  {
		  req.setAttribute("msg", "Duplicate Product Id's are NOT Allowed");
		  req.getRequestDispatcher("Error.jsp").forward(req, res);;
	  }
	}
}