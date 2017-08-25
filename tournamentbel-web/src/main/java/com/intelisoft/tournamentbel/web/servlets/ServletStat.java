package com.intelisoft.tournamentbel.web.servlets;

import com.intelisoft.tournamentbel.entity.Matches;
import com.intelisoft.tournamentbel.service.impl.MatchesServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletStat")
public class ServletStat extends HttpServlet{
    private static final long serialVersionUID = -6575766587576L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MatchesServiceImpl matchesService = new MatchesServiceImpl();
        List<Matches> matches =  matchesService.getWithGoals();

        response.getWriter().print(matches);

    }
}

