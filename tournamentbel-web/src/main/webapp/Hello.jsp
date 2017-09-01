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

     <c:set var="alter" scope="page" value="${30}"/>
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

        <c:set var = "name" value = "Zubrytsli Pavel" /><br/>
        Имя до удаления: <c:out  value = "${name}" />
    <c:remove var = "name" />
    <p>Имя после удаления: <c:out value = "${name}"  /></p>

      <c:set var = "income" scope="session" value = "${500}" />
    <p>My income = <c:out value = "${income}" /></p>
    <c:choose>
        <c:when test="${income<480}">Income is bad</c:when>
        <c:when test="${income>490}">Income is middle</c:when>
    </c:choose>

    <c:forEach var = "j" begin = "1" end = "11">
        Item: <c:out value = "${j}" /><p>
    </c:forEach>

    <c:forTokens items = "Papa-Mama-Child" delims = "-" var = "name" >
        <c:out value="${name}" /><p>
    </c:forTokens>

</h1>
</body>
</html>