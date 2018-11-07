<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserir Clientes</title>
<link href="style.css" rel="stylesheet" />
</head>
<body>
	<h1>Inserir cliente</h1>
	<form action="AdicionarClienteServlet" method="post">
		Cpf:<br><input type="text" name="cpf"><br>
		Nome:<br><input type="text" name="nome"><br>
		Logradouro:<br><input type="text" name="logradouro"><br>
		Numero:<br><input type="text" name="numero"><br>
		Bairro:<br><input type="text" name="bairro"><br>
		Cidade:<br><input type="text" name="cidade"><br>
		Estado:<br><input type="text" name="estado"><br>
		<input type="submit" value="inserir">
	</form>

</body>
</html>