<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>FORMULARIO ALTERAR PRODUTO</h1>
	<form action="/AlterarProdutoServlet" method="post">
		Id do produto a ser alterado:<br> <input type="text" name="id"><br>
		Nome:<br> <input type="text" name="nome"><br>
		Status:<br> <input type="text" name="status"><br>
		E-mail:<br> <input type="text" name="email"><br>
		Descrição:<br> <input type="text" name="description"><br>
		<input type="submit" value="Submit"><br>
	</form>
</body>
</html>