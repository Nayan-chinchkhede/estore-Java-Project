package com.estoreServlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("========== APPLICATION STARTED ==========");

        System.out.println("Server Info : "+ sce.getServletContext().getServerInfo());

    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("========== APPLICATION STOPPED ==========");

    }

}