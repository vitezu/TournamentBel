package com.intelisoft.tournamentbel.web.servlets;


import com.intelisoft.tournamentbel.entity.Matches;
import com.intelisoft.tournamentbel.service.impl.MatchesServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/MyServlet")
    public class MatchesServlet extends HttpServlet {
    private static final long serialVersionUID = -7575766587576L;
MatchesServiceImpl matchesService = new MatchesServiceImpl();
//
//       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html; charset = UTF-8");
//        String firstName = request.getParameter("firstName");
//        String lastName = request.getParameter("lastName");
//        System.out.println(firstName);
//        System.out.println(lastName);
//
//
//        response.getWriter().print("<h3> Heloo!! " + firstName + lastName + "</h3>");

    List<Matches> matches =  matchesService.getWithGoals();
    response.getWriter().print(matches);

}
    }

