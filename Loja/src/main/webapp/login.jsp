<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>

<link rel="stylesheet" href="/css/login.css" />
<link rel="stylesheet" href="/webjars/bootstrap/4.1.3/css/bootstrap.min.css" />

<title>Loja Exemplo</title>
</head>
<body>
      <form method="post" action="/LoginServlet" class="form-signin">
      <div class="form-label-group">
        <label for="inputEmail">Email</label>
        <input name="email" type="email" id="inputEmail" class="form-control" placeholder="Email" required autofocus>
      </div>

      <div class="form-label-group">
        <label for="inputPassword">Password</label>
        <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Senha" required>
      </div>

      <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
    </form>
 
<script src="/webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="/webjars/popper.js/1.14.4/umd/popper.min.js"></script>
<script src="/webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src="/webjars/holderjs/2.5.2/holder.min.js"></script>


</body>
</html>