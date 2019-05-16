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
    </tr>
    </thead>
    <c:forEach var="patients" items="${requestScope.patients}">
        <tbody>
        <tr>
            <th><c:out value="${patients.patientId}"/></th>
            <th><c:out value="${patients.surname}"/></th>
            <th><c:out value="${patients.firstName}"/></th>
            <th><c:out value="${patients.secondName}"/></th>
            <th><c:out value="${patients.medicalCardId}"/></th>
        </tr>
        </tbody>
    </c:forEach>
</table>
<hr/>
</body>
</html>
