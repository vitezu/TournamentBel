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

@WebServlet("/matches")
    public class MatchesServlet extends HttpServlet {
MatchesServiceImpl matchesService = new MatchesServiceImpl();
//
//       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html");
    List<Matches> matches =  matchesService.getWithGoals();
    response.getWriter().print(matches);

}
    }

