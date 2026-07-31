package com.estoreServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.Bean.CustomerBean;
import com.DAO.CustomerLoginDAO;


@WebServlet("/clog")
public class CustomerLoginServlet extends HttpServlet
{

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {


        String uname = req.getParameter("uname");
        String upass = req.getParameter("upass");


        CustomerBean bbean =
        new CustomerLoginDAO().checkCustomerLogin(uname, upass);



        if(bbean == null)
        {

            req.setAttribute("msg", "Invalid Username or Password");

            req.getRequestDispatcher("CustomerLogin.html")
            .forward(req, res);

        }
        else
        {

            HttpSession session = req.getSession();


            // Store customer object in session
            session.setAttribute("CustomerBean", bbean);


            // Redirect after login
            res.sendRedirect("CustomerHome.jsp");

        }

    }

}