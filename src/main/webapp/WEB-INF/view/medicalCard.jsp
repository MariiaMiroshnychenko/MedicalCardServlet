<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Медичні картки</title>
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

<h1><p align="center">Медичні картки</p></h1>

<table style="border: 1px solid grey">
    <thead>
    <th>Медична карта</th>

    <th colspan="3">Пацієнт</th>
    <th colspan="3">Лікар</th>
    <th colspan="3">Дані візитів</th>

    <tr>
        <th>№</th>

        <th>Прізвище</th>
        <th>Ім'я</th>
        <th>По-батькові</th>

        <th>Прізвище</th>
        <th>Ім'я</th>
        <th>По-батькові</th>

        <th>Візит</th>
    </tr>

    </thead>

    <c:forEach var="medcards" items="${requestScope.medcards}">
        <tbody>
        <tr>
            <td><c:out value="${medcards.patient.medCardId}"/></td>

            <td><c:out value="${medcards.patient.surname}"/></td>
            <td><c:out value="${medcards.patient.firstName}"/></td>
            <td><c:out value="${medcards.patient.secondName}"/></td>

            <td><c:out value="${medcards.doctor.doctorSurname}"/></td>
            <td><c:out value="${medcards.doctor.doctorFirstName}"/></td>
            <td><c:out value="${medcards.doctor.doctorSecondName}"/></td>

            <%--<td><c:forEach var="visits" items="${requestScope.medcards}">--%>
                <%--<c:out value="${medcards.visits}"/>--%>
        <%--<c:forEach var="visit" items="${requestScope.medcards.visits}">--%>
            <%--<c:out value="${medcards.visits.visit.diagnosis}"/>--%>
        <%--</c:forEach>--%>
            <%--</c:forEach>--%>
            <%--</td>--%>

                <%--<c:forEach var="visits" items="${requestScope.medcards}">--%>
                <%--</c:forEach>--%>
        </tr>
        </tbody>
    </c:forEach>
</table>
<hr/>
</body>
</html>
