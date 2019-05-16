
<%--
  Created by IntelliJ IDEA.
  User: marie
  Date: 14.05.2019
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Лікарі</title>
    <style type="text/css">
        TABLE {
            border-collapse: collapse; /* Убираем двойные линии между ячейками */
        }

        TD, TH {
            padding: 3px; /* Поля вокруг содержимого таблицы */
            border: 1px solid black; /* Параметры рамки */
        }
    </style>
</head>
<body>
<h1><p align="center">Список лікарів</p></h1>
<table style="border: 1px solid grey">
    <thead>
    <tr>
        <th>ID лікаря</th>
        <th>Прізвище</th>
        <th>Ім'я</th>
        <th>По-батькові</th>
    </tr>
    </thead>
    <c:forEach var="doctors" items="${requestScope.doctors}">
        <tbody>
        <tr>
            <th><c:out value="${doctors.doctorId}"/></th>
            <th><c:out value="${doctors.doctorSurname}"/></th>
            <th><c:out value="${doctors.doctorFirstName}"/></th>
            <th><c:out value="${doctors.doctorSecondName}"/></th>
        </tr>
        </tbody>
    </c:forEach>
</table>
<hr/>
</body>
</html>
