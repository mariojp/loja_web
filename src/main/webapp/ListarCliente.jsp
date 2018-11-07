<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Listagem de Clientes</title>
	</head>
	<body>
		<table>
			<tr>
				<td>Clientes</td>
			</tr>
			<c:forEach var="cliente" items="${clientes}"> 
				<tr>
					<td>${cliente.name}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>