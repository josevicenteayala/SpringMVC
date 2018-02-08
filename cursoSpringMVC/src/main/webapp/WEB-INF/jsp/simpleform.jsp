<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple Form</title>
</head>
<body>
	<form:form action="simpleform" method="post" modelAttribute="usuario">
		<fieldset>
			<legend>User Form</legend>
			<form:label path="name">Name:</form:label>
			<form:input path="name"></form:input><br/>
			
			<form:label path="password">Password:</form:label>
			<form:input path="password"></form:input><br/>
		</fieldset>
		<input type="submit" value="Enviar">
	</form:form>
<h1>Simple Form</h1>
</body>
</html>