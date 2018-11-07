<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem de Clientes</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
	<table>
		<tr>
			<td>Cliente</td>
			<td>Cpf</td>
			<td>Estado</td>
		</tr>
		<c:forEach var="cliente" items="${clientes}">
			<tr>
				<th>${cliente.nome}</th>
				<th>${cliente.cpf}</th>
				<th>${cliente.estado}</th>
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>