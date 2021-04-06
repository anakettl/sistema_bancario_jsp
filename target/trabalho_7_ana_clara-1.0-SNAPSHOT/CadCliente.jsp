<%@ page import="classes.Cliente" %>
<%@ page import="java.util.LinkedList" %><%--
  Created by IntelliJ IDEA.
  User: anakettl
  Date: 24/03/2021
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Cadastrar Cliente</title>
    </head>
    <body>

        <jsp:useBean id="clienteBean" class="classes.Cliente" scope="request"/>
        <jsp:setProperty name="clienteBean" property="*" />

        <% if (clienteBean.insert()>0) { %>
            <jsp:forward page = "CadastrarClienteForm.jsp" >
                <jsp:param name="mensagem" value="Cliente cadastrado com sucesso" />
            </jsp:forward>

        <%  }  else { %>
            <jsp:forward page = "CadastrarClienteForm.jsp" >
                <jsp:param name="mensagemErro" value="Ocorreu um erro ao cadastrar o cliente" />
            </jsp:forward>
        <% } %>

    </body>
</html>
