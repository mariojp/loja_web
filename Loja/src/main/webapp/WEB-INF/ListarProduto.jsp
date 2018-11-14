<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Listagem de produtos</title>
	</head>
	<body>
		<table>
			<tr>
				<td>Produtos</td>
			</tr>
			<c:forEach var="produto" items="${produtos}"> 
				<tr>
					<td>${produto.name}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>