<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<!-- Titulo Página --> 
    <link rel="stylesheet" href="css/styles.css">
    
    <title>Tienda Grupo G</title>
</head>

<body>

<div>
       <h1>Bienvenidos a tienda Grupo G</h1>
        <form:form action="login" method="post" modelAttribute="credenciales">
            <form:label path="user">Usuario</form:label>
            <form:input path="user"/><br/>
             
            <form:label path="pass">Contraseña</form:label>
            <form:password path="pass"/><br/>
                             
            <form:button>Enviar</form:button>
        </form:form>
    </div>
    
</body>
</html>