package com.estoreServlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.CustomerBean;
import com.Bean.ProductBean;
import com.DAO.BuyProductDAO;
import com.DAO.UpdateProductServletDAO;

@WebServlet("/ConfirmOrder")
public class UpdateCustomerProductServlet extends HttpServlet {

protected void doPost(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException {


HttpSession session = req.getSession(false);


if(session == null)
{
    req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
}
else
{

    String pcode = req.getParameter("pcode");

    System.out.println("PCode = "+pcode);


    ProductBean pb = new BuyProductDAO().getProduct(pcode);


    if(pb == null)
    {
        res.getWriter().println("Product Not Found");
        return;
    }


    String qty = req.getParameter("reqqty");

    System.out.println("Quantity = "+qty);


    int reqQty = Integer.parseInt(qty);

    int avlQty = Integer.parseInt(pb.getpQty());



    if(reqQty > avlQty)
    {

        req.setAttribute("msg",
        "Required Quantity Not Available");

        req.getRequestDispatcher("BuyProduct.jsp")
        .forward(req,res);

    }
    else
    {

        int newQty = avlQty - reqQty;


        pb.setpQty(String.valueOf(newQty));


        int rowCount =
        new UpdateProductServletDAO()
        .updateProduct(pb);



        if(rowCount > 0)
        {

            CustomerBean cb =
            (CustomerBean)session.getAttribute("CustomerBean");


            float amount =
            Float.parseFloat(pb.getpPrice()) * reqQty;


            req.setAttribute("name", cb.getUfname());

            req.setAttribute("amount", amount);


            req.getRequestDispatcher("OrderSuccess.jsp")
            .forward(req,res);

        }
        else
        {

            req.setAttribute("msg","Order Failed");

            req.getRequestDispatcher("BuyProduct.jsp")
            .forward(req,res);

        }

    }

}

}

}