package com.intelisoft.tournamentbel.web.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Test", loadOnStartup = 0)
public class Test extends HttpServlet {
    private static final long serialVersionUID = -7575766587576L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

    request.setAttribute("check", request.getParameter("firstName"));
    request.setAttribute("lastName", request.getParameter("lastName"));
    request.setAttribute("firstName", request.getParameter("firstName"));
    this.getServletContext().getRequestDispatcher("/m.jsp").forward(request, response);

    }
}