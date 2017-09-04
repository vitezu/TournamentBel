
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${check ne null}">
<p>Имя: <c:out value="${firstName}"/><p>
<p>Фамилия: <c:out value="${lastName}"/><p>
    </c:if>

    <c:if test="${check eq null}">
<p>Имя: <c:out value="${firstName}"/><p>
    </c:if>

</body>
</html>
