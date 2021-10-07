<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exitoso</title>
<style type="text/css">
    span {
        display: inline-block;
        width: 200px;
        text-align: left;
    }
</style>
</head>
<body>
    <div align="center">
        <h2>Registro exitoso</h2>
        <span>ID Cliente:</span><span>${user.idCliente}</span><br/>
        <span>Nombre:</span><span>${user.nombreCliente}</span><br/>
        <span>Apellido:</span><span>${user.apellidoCliente}</span><br/>
        
    </div>
</body>
</html>