<%--
  Created by IntelliJ IDEA.
  User: anakettl
  Date: 23/03/2021
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale = 1, shrink-to-fit=no">
        <link rel="stylesheet" type="text/css" href="bibliotecas/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="bibliotecas/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="css/sb-admin.min.css">
        <title>Menu</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">

            <div id="navbarInicio" class="collapse navbar-collapse">
                <ul class="navbar-nav navbar-sidenav" id="linksaccordion">
                    <li class="nav-item" data-toggle="tooltip" data-placement="right">
                        <a class="nav-link" href="index.jsp">
                            <i class="fa fa-fw fa-home"></i>
                            <span class="nav-link-text">Início</span>
                        </a>
                    </li>
                    <li class="nav-item" data-toggle="tooltip" data-placement="right">
                        <a class="nav-link" href="CadastrarClienteForm.jsp">
                            <i class="fa fa-fw fa-plus-circle"></i>
                            <span class="nav-link-text">Cadastrar Cliente</span>
                        </a>
                    </li>
                    <li class="nav-item" data-toggle="tooltip" data-placement="right">
                        <a class="nav-link" href="ListCliente.jsp">
                            <i class="fa fa-fw fa-file"></i>
                            <span class="nav-link-text">Listar Clientes</span>
                        </a>
                    </li>
                </ul>
            </div>
        </nav>

        <jsp:include page="Footer.jsp"/>

        <script src="bibliotecas/jquery/jquery.min.js"></script>
        <script src="bibliotecas/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="bibliotecas/jquery-easing/jquery.easing.min.js"></script>
        <script src="bibliotecas/datatables/jquery.dataTables.js"></script>
        <script src="bibliotecas/datatables/dataTables.bootstrap4.js"></script>
        <script src="js/sb-admin.min.js" type="text/javascript"></script>
        <script src="js/sb-admin-datatables.min.js" type="text/javascript"></script>

    </body>
</html>
