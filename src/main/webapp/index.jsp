<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Index.jsp</title>
</head>
<body>
	<form id="calculadoraForm" method="POST" action="operar">
		<h1>Index JSP</h1>
		<input id="idNUno" type="text" name="nUno" /> <input id="idNDos"
			type="text" name="nDos" />
		<button id="idSuma" type="Submit" name="bSuma">Sumar</button>
		<button id="idResta" type="Submit" name="bResta">Restar</button>
	</form>
</body>
</html>