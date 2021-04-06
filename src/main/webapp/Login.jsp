<%@ page import="java.util.*, classes.*" %>

<%--
  Created by IntelliJ IDEA.
  User: anakettl
  Date: 23/03/2021
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page errorPage="Error.jsp" %>
<%
    LinkedList<Usuario> usuarios = new LinkedList();

    Usuario usuario = new Usuario();

    String email = request.getParameter("email");
    String senha = request.getParameter("senha");

    Boolean autenticado = usuario.autenticar(usuarios, email, senha);

    if (autenticado) {
        session.setAttribute("usuarioEmail", email);
        LinkedList<Cliente> clientes = new Colecao().carregaClientes();
        session.setAttribute("listaClientes", clientes);
        response.sendRedirect("Menu.jsp");
    } else { %>

    <jsp:forward page = "index.jsp" >
        <jsp:param name="mensagemErro" value="Email ou senha inválidos" />
    </jsp:forward>
    <% } %>
