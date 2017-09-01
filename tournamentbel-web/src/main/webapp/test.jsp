
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
<form method = "GET", action = "Test">
    <table>
        <tr>
            <td>Имя:</td>
            <td><input type = "text" name = "firstName"></td>
        </tr>

        <tr>
            <td>Фамилия :</td>
            <td><input type = "text" name = "lastName"></td>
        </tr>
        <tr>
            <td>Выводить фамилию?</td>
            <td>
                <input type = "checkbox" name = "check" value = "Ok" /><br>
            </td>
        </tr>
        <tr>
            <td align="right" colspan="10"><input type = "submit" value = "Отправить"></td>
        </tr>
    </table>
</form>
</body>
</html>
