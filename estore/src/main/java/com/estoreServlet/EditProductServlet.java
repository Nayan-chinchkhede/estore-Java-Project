package com.estoreServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.ProductBean;
@WebServlet("/edit")
public class EditProductServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
    	
    	HttpSession session =req.getSession(false);
    	if(session ==null)
    	{
    		System.out.println("Session Expired!!!!!");
    		req.getRequestDispatcher("AdminLogin.html").forward(req,res);
    	}
    	else
    	{
    		String pcode=req.getParameter("pcode");
    		ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("productlist");
    		ProductBean pb=null;
    		Iterator<ProductBean> i=al.iterator();
    		while(i.hasNext())
    		{
    			pb=i.next();
    			if(pcode.equals(pb.getpCode()))
              {
	         break; 
            }
    			}
    		req.setAttribute("pbean", pb);
    		req.getRequestDispatcher("EditProduct.jsp").forward(req, res);
    	}
    	
    }
}
