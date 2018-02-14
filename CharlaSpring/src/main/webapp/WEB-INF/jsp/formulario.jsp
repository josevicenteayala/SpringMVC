<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario inicial</title>
</head>
<body>
<form:form action="formulario" method="post" modelAttribute="usuario">
	<fieldset>
		<legend>Formulario inicial</legend>
		<form:label path="nombre">Nombre:</form:label>
		<form:input path="nombre"/><br>
		<form:label path="apellido">Apellido:</form:label>
		<form:input path="apellido"/>
	</fieldset>
	<input type="submit" value="Presioname">
</form:form>
</body>
</html>