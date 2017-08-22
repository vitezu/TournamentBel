<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>
        Hello World Sample
    </title>
</head>

<body>
<h1>
    <%
        String name = request.getParameter("name");
        if (name == null || name.length() == 0) {
    %>
    Hello, world !
    <%            } else {
    %>
    Hello, world ! I'm <%= name%>
    <%
        }
    %>
</h1>
</body>
</html>