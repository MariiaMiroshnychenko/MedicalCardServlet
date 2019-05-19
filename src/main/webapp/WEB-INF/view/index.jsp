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
    <title>Дані пацієнта</title>
    <style type="text/css">
        TABLE {
            border-collapse: collapse;
        }

        TD, TH {
            padding: 3px;
            border: 1px solid black;
        }
    </style>

</head>
<body>
<h1><p align="center">Список пацієнтів</p></h1>
<table style="border: 1px solid grey">
    <thead>
    <tr>
        <th>ID пацієнта</th>
        <th>Прізвище</th>
        <th>Ім'я</th>
        <th>По-батькові</th>
        <th>ID мед карти</th>
        <th>ID лікаря</th>
    </tr>
    </thead>
    <c:forEach var="patient" items="${requestScope.patients}">
        <tbody>
        <tr>
            <th><c:out value="${patient.patientId}"/></th>
            <th><c:out value="${patient.surname}"/></th>
            <th><c:out value="${patient.firstName}"/></th>
            <th><c:out value="${patient.secondName}"/></th>
            <th><c:out value="${patient.medCardId}"/></th>
            <th><c:out value="${patient.doctorId}"/></th>
        </tr>
        </tbody>
    </c:forEach>
</table>
<hr/>
<h1 align="center">Список лікарів</h1>
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
<h1 align="center">Візити</h1>
<table style="border: 1px solid grey">
    <thead>
    <tr>
        <th>№</th>
        <th>Дата візиту</th>
        <th>ID медичної карти</th>
        <th>Діагноз</th>
    </tr>
    </thead>
    <c:forEach var="visits" items="${requestScope.visits}">
        <tbody>
        <tr>
            <th><c:out value="${visits.visitId}"/></th>
            <th><c:out value="${visits.visitDate}"/></th>
            <th><c:out value="${visits.medicalCardId}"/></th>
            <th><c:out value="${visits.diagnosis}"/></th>
        </tr>
        </tbody>
    </c:forEach>
</table>
<hr/>
<form action="medcards">
    <button type="submit">Сформувати медичні карти</button>
</form>
</body>
</html>
