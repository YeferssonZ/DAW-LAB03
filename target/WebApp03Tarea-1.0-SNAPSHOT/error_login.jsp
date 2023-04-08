<%-- 
    Document   : error_login
    Created on : 07/04/2023, 07:07:14 PM
    Author     : Zaph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Error de acceso</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<style>
		body {
			background-color: #f2f2f2;
			font-family: Arial, Helvetica, sans-serif;
		}
		.container {
			max-width: 500px;
			margin: 0 auto;
			padding: 20px;
			background-color: #fff;
			border-radius: 5px;
			box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.2);
			text-align: center;
		}
		h1 {
			color: #dd4b39;
			font-size: 36px;
		}
		p {
			margin-top: 20px;
			font-size: 18px;
		}
		a {
			color: #fff;
			background-color: #dd4b39;
			padding: 10px 20px;
			border-radius: 5px;
			text-decoration: none;
			font-size: 18px;
			transition: background-color 0.3s;
		}
		a:hover {
			background-color: #ff6b5c;
		}
	</style>
</head>
<body>
	<div class="container">
		<h1>Error de acceso</h1>
		<% String errorMsg = request.getParameter("errorMsg"); %>
		<% if (errorMsg != null && !errorMsg.isEmpty()) { %>
			<p><%=errorMsg%></p>
		<% } else { %>
			<p>Error de usuario. Vuelva a intentarlo de nuevo.</p>
		<% } %>
		<p><a href="index.html">Volver a la página de inicio de sesión</a></p>
	</div>
</body>
</html>
