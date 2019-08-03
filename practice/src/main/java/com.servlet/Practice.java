package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Practice extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        System.out.println(resp.getStatus());

        resp.getWriter().print("<html>");
        resp.getWriter().print("<head>");
        resp.getWriter().print("<body>");
        resp.getWriter().print("<h1>Hello, Servlet!</h1>");
        resp.getWriter().print("</body>");
        resp.getWriter().print("</head>");
        resp.getWriter().print("</html>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
