<%@ page import="java.util.LinkedList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="classes.Cliente" %>
<%@ page import="java.util.List" %>
<%@ page import="classes.Pessoa" %><%--
  Created by IntelliJ IDEA.
  User: anakettl
  Date: 24/03/2021
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Listar Clientes</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"/>

        <jsp:useBean id="clienteBean" class="classes.Cliente" scope="request"/>
        <%
            List<Cliente> lista=clienteBean.listAll();
            request.setAttribute("lista",lista);
        %>
        <div class="content" style="margin-top: 75px">
            <div class="container-fluid">

                <div class="card mb-3">
                    <div class="card-header">
                        <i class="fa fa-table"></i> Listar Clientes
                    </div>
                    <div class="card-body">

                        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                            <thead>
                                <tr>
                                    <th>Nome</th>
                                    <th>Dt Nasc</th>
                                    <th>Cpf</th>
                                    <th>Email</th>
                                    <th>Telefone</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="cliente" items="${lista}">
                                    <tr>
                                        <td>${cliente.getNome()}</td>
                                        <td>${cliente.getDt_nasc()}</td>
                                        <td>${cliente.getCpf()}</td>
                                        <td>${cliente.getEmail()}</td>
                                        <td>${cliente.getTelefone()}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <a class="btn btn-light btn-block" href="Menu.jsp">Voltar</a>

        <jsp:include page="Footer.jsp"/>

    </body>
</html>
