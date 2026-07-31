package com.estoreServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.ProductBean;
import com.DAO.ViewProductDAO;

@WebServlet("/View1")
public class ViewProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if(session == null) {

            System.out.println("Session Expired");
            req.getRequestDispatcher("AdminLogin.html")
               .forward(req, res);

        }
        else {

            // old product list remove
            session.removeAttribute("productlist");


            ArrayList<ProductBean> al =
                    new ViewProductDAO().reteriveProducts();


            // checking data in console
            System.out.println("Total Product : " + al.size());

            for(ProductBean pb : al)
            {
                System.out.println(
                    pb.getpCode()+" "
                    +pb.getpName()+" "
                    +pb.getpCompany()+" "
                    +pb.getpPrice()+" "
                    +pb.getpQty()
                );
            }


            session.setAttribute("productlist", al);


            req.getRequestDispatcher("ViewProduct.jsp")
               .forward(req, res);

        }

    }

}