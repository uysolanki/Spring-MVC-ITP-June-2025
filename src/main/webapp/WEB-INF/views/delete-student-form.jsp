<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form:form action="deleteStudent" modelAttribute="student" method="post">
			Enter Rno : <form:input path="rno" />	<br>
			<input type="submit" name="s1" value="Delete Student">
		</form:form >
</body>
</html>