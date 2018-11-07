<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>FORMULARIO ALTERAR CLIENTE</h1>
	<form action="AlterarClienteServlet" method="post">
		<input type="hidden" name="id" value="${cliente.id}">
		Nome:<br> <input type="text" name="nome" value="${cliente.nome}"><br>
		CPF:<br> <input type="text" name="cpf" value="${cliente.cpf}"><br>
		Logradouro:<br> <input type="text" name="logradouro" value="${cliente.logradouro}"><br>
		Numero:<br> <input type="text" name="numero" value="${cliente.numero}"><br>
		Bairro:<br> <input type="text" name="bairro" value="${cliente.bairro}"><br>
		Cidade:<br> <input type="text" name="cidade" value="${cliente.cidade}"><br>
		Estado:<br> <input type="text" name="estado" value="${cliente.estado}"><br>
		<input type="submit" value="Submit"><br>
	</form>

</body>
</html>