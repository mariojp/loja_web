<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Listagem de cliente</title>
	</head>
	<body>
		<h3>lista de clientes</h3>
		<ul>
			<c:forEach var="cliente" items="${clientes}"> 
				<li>${cliente.nome}</li>
				<a href="AlterarClienteServlet?id=${cliente.id}" type="submit">Editar</a>
				<a href="DeletarClienteServlet?id=${cliente.id}" type="submit">Excluir</a>
			</c:forEach>
		</ul>
	</body>
</html>