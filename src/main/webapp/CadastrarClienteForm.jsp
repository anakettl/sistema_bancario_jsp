<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale = 1, shrink-to-fit=no">
        <link rel="stylesheet" type="text/css" href="bibliotecas/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="bibliotecas/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="css/sb-admin.min.css">
        <title>Cadastra Cliente</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <div class="container">
            <div class="card card-register mx-auto" style="margin-top: 75px">
                <div class="card-header">Cadastrar Cliente</div>
                    <div class="card-body">
                        <% String mensagem = request.getParameter("mensagem");
                        String mensagemErro = request.getParameter("mensagemErro");
                        if(mensagem != null) {%>
                            <p class="alert-success"><%=mensagem%></p>
                        <%}
                        if(mensagemErro != null) {%>
                            <p class="alert-danger"><%=mensagemErro%></p>
                        <%}%>
                        <form method="POST" action="CadCliente.jsp">
                            <div class="form-group">
                                <label for="nomeCliente">Nome:</label>
                                <input type="text" class="form-control" id="nome" placeholder="Maria da Silva" name="nome" />
                            </div>
                            <div class="form-group">
                                <label for="dtNascCliente">Dt Nasc:</label>
                                <input type="text" class="form-control" id="dt_nasc" placeholder="11/09/1980" name="dt_nasc"/>
                            </div>
                            <div class="form-group">
                                <label for="cpfCliente">Cpf:</label>
                                <input type="text" class="form-control" id="cpf" placeholder="09876798535" name="cpf"/>
                            </div>
                            <div class="form-group">
                                <label for="emailCliente">Email:</label>
                                <input type="email" class="form-control" id="email" placeholder="maria_silva@gmail.com" name="email"/>
                            </div>
                            <div class="form-group">
                                <label for="telefoneCliente">Telefone:</label>
                                <input type="text" class="form-control" id="telefone" placeholder="(51) 98765-8739" name="telefone"/>
                            </div>
                            <input class="btn btn-primary btn-block" type="submit" value="Cadastrar"/>
                            <input class="btn btn-secondary btn-block" type="reset" value="Limpar"/>
                            <a class="btn btn-light btn-block" href="Menu.jsp">Voltar</a>
                        </form>
                    </div>
            </div>
        </div>
        <jsp:include page="Footer.jsp"/>

        <script src="bibliotecas/jquery/jquery.min.js"></script>
        <script src="bibliotecas/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="bibliotecas/jquery-easing/jquery.easing.min.js"></script>
    </body>
</html>