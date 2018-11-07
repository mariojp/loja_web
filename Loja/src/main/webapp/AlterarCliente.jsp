<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>ALTERAR CLIENTE</h1>
		<form action="AlterarClienteServlet" method="post">
			id:<br> <input type="text" name="id"><br>
			cpf:<br> <input type="text" name="cpf"><br>
			nome:<br> <input type="text" name="nome"><br>
			logradouro:<br> <input type="text" name="logradouro"><br>
			numero:<br> <input type="text" name="numero"><br>
			bairro:<br> <input type="text" name="bairro"><br>
			cidade:<br> <input type="text" name="cidade"><br>
			estado:<br> <input type="text" name="estado"><br>
			<input type="submit" value="Submit"><br>
		</form>
	</body>
</html>