package com.estoreServlet;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {


    @Override
    public void requestInitialized(ServletRequestEvent sre) {

        System.out.println("========== REQUEST STARTED ==========");

        System.out.println("Client IP : "+ sre.getServletRequest().getRemoteAddr());

    }


    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

        System.out.println("========== REQUEST COMPLETED ==========");

    }

}