<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Erro</title>
</head>
<body>
<h2> Descrição do erro: <%=exception%></h2>
<br/>
<% exception.printStackTrace(new java.io.PrintWriter(out));%>
</body>
</html>
