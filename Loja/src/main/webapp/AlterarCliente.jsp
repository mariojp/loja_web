<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar Cliente</title>
</head>
<body>
<h1>Alterar cliente</h1>
	<form action="AdicionarClienteServlet" method="post">
		Id:<br><input type="text" name="Id"><br>
		Cpf:<br><input type="text" name="cpf"><br>
		Nome:<br><input type="text" name="nome"><br>
		Logradouro:<br><input type="text" name="logradouro"><br>
		Numero:<br><input type="text" name="numero"><br>
		Bairro:<br><input type="text" name="bairro"><br>
		Cidade:<br><input type="text" name="cidade"><br>
		Estado:<br><input type="text" name="estado"><br>
		<input type="submit" value="alterarS">
	</form>


</body>
</html>