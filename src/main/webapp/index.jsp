<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale = 1, shrink-to-fit=no">
        <link rel="stylesheet" type="text/css" href="bibliotecas/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="bibliotecas/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="css/sb-admin.min.css">
        <title>Login</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <div class="container">
            <div class="card card-register mx-auto" style="margin-top: 75px">
                <div class="card-header">Login</div>
                    <div class="card-body">
                        <% String mensagemErro = request.getParameter("mensagemErro");
                        if(mensagemErro != null) {%>
                            <p class="alert-danger"><%= mensagemErro %></p>
                        <%}%>
                        <form method="POST" action="Login.jsp">
                            <div class="form-group">
                                <label for="emailUsuario">Email:</label>
                                <input type="email" class="form-control" id="email" placeholder="mariasilva@gmail.com" name="email"/>
                            </div>
                            <div class="form-group">
                                <label for="senhaUsuario">Senha:</label>
                                <input type="password" class="form-control" id="senha" placeholder="*****" name="senha"/>
                            </div>
                            <input type="submit" class="btn btn-primary btn-block" value="Login"/>
                            <input type="reset" class="btn btn-secondary btn-block" value="Limpar"/>
                            <a class="btn btn-light btn-block" href="Menu.jsp">Voltar</a>
                        </form>
                    </div>
            </div>
        </div>

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