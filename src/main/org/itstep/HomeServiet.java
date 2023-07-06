package org.itstep;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeServiet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Inside init()");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("Inside service()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Inside DoGet()");

        PrintWriter writer = resp.getWriter();
        writer.println("Hello from servlet, time is... :)");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Inside destroy()");
    }
}
