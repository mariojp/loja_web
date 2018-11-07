<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Listagem de clientes</title>
	</head>
	<body>
		<table>
			<tr>
				<td>Clientes</td>
			</tr>
			<c:forEach var="cliente" items="${clientes}"> 
				<tr>
					<td>${cliente.id}</td>
					<td>${cliente.cpf}</td>
					<td>${cliente.nome}</td>
					<td>${cliente.logradouro}</td>
					<td>${cliente.numero}</td>
					<td>${cliente.bairro}</td>
					<td>${cliente.cidade}</td>
					<td>${cliente.estado}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>