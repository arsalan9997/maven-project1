package com.demo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Java Maven Demo</title>");
        out.println("</head>");

        out.println("<body>");
        out.println("<h1>Java 21 Maven Application</h1>");
        out.println("<h2>Hello from Servlet!</h2>");
        out.println("<p>Application successfully deployed on Tomcat.</p>");
        out.println("<p>Build Tool: Maven</p>");
        out.println("<p>Java Version: 21</p>");
        out.println("</body>");

        out.println("</html>");
    }
}
