package com.intelisoft.tournamentbel.web.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/Test", loadOnStartup = 0)
public class Test extends HttpServlet {
    private static final long serialVersionUID = -7575766587576L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String check = request.getParameter("check");
        request.setAttribute("name", "check");
        this.getServletContext().getRequestDispatcher("/m.jsp").forward(request, response);
//        getServletContext().getRequestDispatcher("/m.jsp").forward(request, response);
//
//        String firstName = request.getParameter("firstName");
//        String lastName = request.getParameter("lastName");
//        String check = request.getParameter("check");
//
//        response.setContentType("text/html; charset = UTF-8");
//        PrintWriter out = response.getWriter();
//        if (check != null) {
//            out.println("Имя " + firstName + "<br>");
//            out.println("Фамилия " + lastName + "<br>");
//        } else {
//            out.println("Имя " + firstName + "<br>");
//        }
    }
}