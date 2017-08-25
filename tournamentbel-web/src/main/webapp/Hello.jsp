<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--<%@ page errorPage = "m.jsp"  %>--%>

<html>
<head>
    <title>
        Hello World Sample
    </title>
</head>

<body>
<h1>
    <%
       int a = 10;
       int b = 0;
       int res = a + b;
    %>
   a + b = <font color = "red"> <%= res %> </font>
    <br>
    <%@ include file = "m.jsp" %>
    <br>
<%! int amount = 0; %>
    <% amount++; %>
    <%= amount %>
</h1>
</body>
</html>