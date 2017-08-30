<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

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

<%! int amount = 0; %>
    <% amount++; %>
    <%= amount %><br>

    <c:set var="myName" value="Alex"/>
   <c:out value = "${myName}" />

    <c:set var="salary" scope="session" value="${23400*2}"/>
    <c:if test="${salary > 45000}">
    <p>Salary = <c:out value="${salary}"/><p>
    </c:if>

        <c:set var="alter" scope="session" value="${30}"/>
        <c:choose>
        <c:when test="${alter <= 28}">
        Переменная alter <= 0
        </c:when>
        <c:when test="${alter > 28}">
        Переменная alter > 28
        </c:when>
        <c:otherwise>
        Не выбрано ни одно условие.
        </c:otherwise>
        </c:choose>
</h1>
</body>
</html>