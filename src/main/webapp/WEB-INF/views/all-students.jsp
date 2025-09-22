<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
    <h2>Student List</h2>
    <table class="table table-dark table-hover" border="1" cellpadding="10">
        <tr>
            <th>Roll No</th>
            <th>Name</th>
            <th>Percentage</th>
        </tr>
        <c:forEach var="student" items="${studentList}">
            <tr>
                <td>${student.rno}</td>
                <td>${student.sname}</td>
                <td>${student.per}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
