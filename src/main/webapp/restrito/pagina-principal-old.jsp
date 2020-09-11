<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${sessionScope.usuario.nome}
	
	seja bem vindo!
<%-- 	<c:if test="${!empty param.nome}"> --%>
<%-- 		${param.nome} --%>
<%-- 	</c:if> --%>
	<p><a href="${pageContext.request.contextPath}\sair">Sair</a></p>
</body>
</html>