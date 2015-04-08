<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${title}</title>
</head>
<body>
<header>
    <h1>Out Of WEB-INF</h1>
</header>
<section>
    <h1>${message}</h1>
</section>
<div>Get <a href="protected">protected</a> resource for admin.</div>
<div>Get <a href="admin">Admin</a> resource for superadmin.</div>
<footer>
    <div>Dmitriy S. Porollo <a href="d.porollo@gmail.com" target="_blank">d.porollo@gmail.com</a></div>
</footer>
</body>
</html>