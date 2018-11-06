<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>FORMULARIO ADICIONAR CLIENTE</h1>
	<form action="/AdicionarClienteServlet" method="post">
		Nome:<br> <input type="text" name="nome"><br>
		CPF:<br> <input type="text" name="cpf"><br>
		Logradouro:<br> <input type="text" name="logradouro"><br>
		Número:<br> <input type="text" name="numero"><br>
		Bairro:<br> <input type="text" name="bairro"><br>
		Cidade:<br> <input type="text" name="cidade"><br>
		Estado:<br> <input type="text" name="estado"><br>
		<input type="submit" value="Submit"><br>
	</form>
</body>
</html>