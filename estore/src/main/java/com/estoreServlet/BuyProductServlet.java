package com.estoreServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.ProductBean;
import com.DAO.BuyProductDAO;

@WebServlet("/Buy")
public class BuyProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
            HttpServletResponse res)
            throws ServletException, IOException {

        String pcode = req.getParameter("pcode");
    //    System.out.println("PCODE = "+pcode);
        
        ProductBean pb = new BuyProductDAO().getProduct(pcode);
     //   System.out.println("PRODUCT = "+pb);
        HttpSession session = req.getSession();

        session.setAttribute("product", pb);

        req.getRequestDispatcher("BuyProduct.jsp").forward(req, res);
    }
}