<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
label {
	display: inline-block;
	width: 200px;
	margin: 5px;
	text-align: left;
}

input[type=text] {
	width: 200px;
	font-size: 17px;
	border-radius: 5px;
	margin: 5px;
}

button {
	padding: 10px;
	margin: 10px;
}
</style>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>
	<div align="center">
		<h2>Registro</h2>
		<form:form action="register" method="post" modelAttribute="user">
			<form:label path="idCliente">Id Cliente</form:label>
			<form:input path="idCliente" />
			<br />

			<form:label path="nombreCliente">Nombre:</form:label>
			<form:input path="nombreCliente" />
			<br />

			<form:label path="apellidoCliente">Apellido:</form:label>
			<form:input path="apellidoCliente" />
			<br />

			<form:button>Enviar</form:button>
		</form:form>
	</div>
</body>
</html>