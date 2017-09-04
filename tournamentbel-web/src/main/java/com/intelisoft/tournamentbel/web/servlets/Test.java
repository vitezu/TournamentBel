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
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String check = request.getParameter("check");

        request.setAttribute("check", check );
        request.setAttribute("lastName", lastName );
        request.setAttribute("firstName", firstName );
        this.getServletContext().getRequestDispatcher("/m.jsp").forward(request, response);
    }
}