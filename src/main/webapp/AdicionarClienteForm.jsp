<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>FORMULARIO CLIENTE PRODUTO</h1>
	<form action="/AdicionarClienteServlet" method="post">
		Nome:<br> <input type="text" name="name"><br>
		CPF:<br> <input type="text" name="cpf"><br>
		Logradouro:<br> <input type="text" name="logradouro"><br>
		Numero:<br> <input type="text" name="numero"><br>
		Bairro:<br> <input type="text" name="bairro"><br>
		Estado:<br> <input type="text" name="estado"><br>
		<input type="submit" value="Submit"><br>
	</form>

</body>
</html>