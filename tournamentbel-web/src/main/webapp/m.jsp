
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Servlet View</h1>

<%if (request.getAttribute("name") != null) {
    System.out.println("<p>" + request.getAttribute("name") + "</p>");
}%>
</body>
</html>
