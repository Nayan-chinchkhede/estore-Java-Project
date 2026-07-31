package com.estoreServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.Bean.CustomerBean;
import com.Bean.orderBean;
import com.DAO.OrderDAO;


@WebServlet("/ViewOrdersServlet")
public class ViewOrdersServlet extends HttpServlet
{


protected void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
{


    HttpSession session = req.getSession(false);


    if(session == null)
    {
        res.sendRedirect("CustomerLogin.html");
        return;
    }



    CustomerBean cb =
    (CustomerBean)session.getAttribute("CustomerBean");



    if(cb == null)
    {
        res.sendRedirect("CustomerLogin.html");
        return;
    }



    String cid = cb.getUname();



    OrderDAO dao = new OrderDAO();



    ArrayList<orderBean> list =
            dao.viewOrders(cid);



    req.setAttribute("orders", list);



    req.getRequestDispatcher("ViewOrders.jsp")
    .forward(req, res);


}

}