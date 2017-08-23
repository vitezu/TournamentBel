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
import java.util.Arrays;
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
        Integer firstNumber = Integer.valueOf(request.getParameter("firstNumber"));
        Integer secondNumber = Integer.valueOf(request.getParameter("secondNumber"));
        Integer sum = firstNumber + secondNumber;


        response.getWriter().print("<h3> Heloo!!Сумма= " + sum + "</h3>");

//    List<Matches> matches =  matchesService.getWithGoals();
//    response.getWriter().print(matches);

}

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        //String job = request.getParameter("job");
        String[] jobs = request.getParameterValues("job");
        String gender = request.getParameter("gender");
        if (gender==null){
            gender = "";
        }
        String age18 = request.getParameter("age18");
        if (age18 == null) {
            age18 = "НЕТ";
        }
        System.out.println(firstName);
        System.out.println(lastName);

        response.setContentType("text/html; charset = UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h3>Профиль сотрудника</h3>");
        out.println("Имя: " + firstName + "<br>");
        out.println("Фамилия: " + lastName + "<br>");
        //out.println("Профессия: " + job + "<br>");
        out.println("Профессия: " + Arrays.deepToString(jobs) + "<br>");
        out.println("Пол: " + gender + "<br>");
        out.println("Старше 18? " + age18 + "<br>");
        out.close();


    }
    }

