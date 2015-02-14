<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Bem vindo ao ConCot</title>
		
	</head>
	<body>
		<h1>ConCot</h1>
		<g:form action="autenticar" controller="autenticacao">
			Login:<br/>
			<input type="text" name="login"/><br/>
			Senha:<br/>
			<input type="password" name="senha"/><br/>
			<input type="submit" value="Entrar"/>
		</g:form>
	</body>
</html>
