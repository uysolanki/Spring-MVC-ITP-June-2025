<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form:form action="${pageContext.request.contextPath}/updateStudent" modelAttribute="student" method="post">
			Enter Rno : <form:input path="rno" />	<br>
			Enter Student Name : <form:input path="sname" /> <br>
			Enter Percentage : <form:input path="per" /> <br>
			<input type="submit" name="s1" value="Update Student">
		</form:form >
</body>
</html>