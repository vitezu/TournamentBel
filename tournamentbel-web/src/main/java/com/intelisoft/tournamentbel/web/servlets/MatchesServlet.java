package com.intelisoft.tournamentbel.web.servlets;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/matches")
    public class MatchesServlet extends HttpServlet {

//
//       @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html");

    RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
    dispatcher.forward(request, response);
}
////      @Override
//protected void doGet(HttpServletRequest request, HttpServletResponse response)
//        throws ServletException, IOException {
//    response.setContentType("text/html");
//    PrintWriter out = response.getWriter();
//
//    out.println("Hello Word");
//}
    }

