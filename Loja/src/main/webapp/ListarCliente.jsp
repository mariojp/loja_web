<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Clientes</td>
		</tr>
		<c:forEach var="clientes" items="${clientes}">
			<tr>
				<td>${clientes.nome}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>