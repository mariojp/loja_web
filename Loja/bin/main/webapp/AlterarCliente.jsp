<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Cliente</title>
</head>
<body>
	<h1>Alterar Cliente</h1>
	<form action="AlterarClienteServlet" method="post">
		ID:<br> <input type="text" name="id"><br> CPF:<br>
		<input type="text" name="cpf"><br> Nome:<br> <input
			type="text" name="nome"><br> Logradouro:<br> <input
			type="text" name="logradouro"><br> Número:<br> <input
			type="text" name="numero"><br> Bairro:<br> <input
			type="text" name="bairro"><br> Cidade:<br> <input
			type="text" name="cidade"><br> Estado:<br> <input
			type="text" name="estado"><br> <input type="submit"
			value="Submit"><br>
	</form>
</body>
</html>