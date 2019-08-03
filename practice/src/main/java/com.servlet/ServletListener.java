package com.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletListener.contextInitialized");
        sce.getServletContext().setAttribute("subject", "Servlet");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletListener.contextDestroyed");
    }
}
