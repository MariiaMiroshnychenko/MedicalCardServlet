<%--
  Created by IntelliJ IDEA.
  User: marie
  Date: 14.05.2019
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Візити</title>
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
<h1><p align="center">Візити</p></h1>
<table style="border: 1px solid grey">
    <thead>
    <tr>
        <%--<th>ID пацієнта</th>--%>
        <%--<th>Прізвище</th>--%>
        <%--<th>Ім'я</th>--%>
        <%--<th>По-батькові</th>--%>
        <%--<th>ID мед карти</th>--%>
        <th>№</th>
        <th>Дата візиту</th>
        <th>ID медичної карти</th>
        <th>Діагноз</th>
    </tr>
    </thead>
    <c:forEach var="visits" items="${requestScope.visits}">
        <tbody>
        <tr>
            <%--<th><c:out value="${visits.patient.patientId}"/></th>--%>
            <%--<th><c:out value="${visits.patient.surname}"/></th>--%>
            <%--<th><c:out value="${visits.patient.firstName}"/></th>--%>
            <%--<th><c:out value="${visits.patient.secondName}"/></th>--%>
            <%--<th><c:out value="${visits.patient}"/></th>--%>
            <%--<th><c:out value="${patients.patientId}"/></th>--%>
            <%--<th><c:out value="${patients.surname}"/></th>--%>
            <%--<th><c:out value="${patients.firstName}"/></th>--%>
            <%--<th><c:out value="${patients.secondName}"/></th>--%>
            <%--<th><c:out value="${patients.medCardId}"/></th>--%>
            <th><c:out value="${visits.visitId}"/></th>
            <th><c:out value="${visits.visitDate}"/></th>
            <th><c:out value="${visits.medicalCardId}"/></th>
            <th><c:out value="${visits.diagnosis}"/></th>
        </tr>
        </tbody>
    </c:forEach>
</table>
<hr/>
</body>
</html>

<%--<h1><p align="center">Візити</p></h1>--%>
<%--<table style="border: 1px solid grey">--%>
    <%--<thead>--%>
    <%--<tr>--%>
        <%--<th>№</th>--%>
        <%--<th>Дата візиту</th>--%>
        <%--<th>ID медичної карти</th>--%>
        <%--<th>Діагноз</th>--%>
    <%--</tr>--%>
    <%--</thead>--%>
    <%--<c:forEach var="visits" items="${requestScope.visits}">--%>
        <%--<tbody>--%>
        <%--<tr>--%>
            <%--<th><c:out value="${visits.visitId}"/></th>--%>
            <%--<th><c:out value="${visits.visitDate}"/></th>--%>
            <%--<th><c:out value="${visits.medCardId}"/></th>--%>
            <%--<th><c:out value="${visits.diagnosis}"/></th>--%>
        <%--</tr>--%>
        <%--</tbody>--%>
    <%--</c:forEach>--%>
<%--</table>--%>
<%--<hr/>--%>
<%--</body>--%>
<%--</html>--%>
