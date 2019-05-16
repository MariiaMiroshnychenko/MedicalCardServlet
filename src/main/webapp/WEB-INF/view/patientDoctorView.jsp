<%--
  Created by IntelliJ IDEA.
  User: marie
  Date: 14.05.2019
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Лікарі пацієнтів</title>
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
<h1><p align="center">Відношення "Пацієнт-Лікар"</p></h1>
<table style="border: 1px solid grey">
    <thead>
    <tr>
        <th>ID пацієнта</th>
        <th>ID лікаря</th>
    </tr>
    </thead>
    <c:forEach var="patientDoctors" items="${requestScope.patientDoctors}">
        <tbody>
        <tr>
            <th><c:out value="${patientDoctors.patientId}"/></th>
            <th><c:out value="${patientDoctors.doctorId}"/></th>
        </tr>
        </tbody>
    </c:forEach>
</table>
<hr/>
</body>
</html>
