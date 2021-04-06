<%--
  Created by IntelliJ IDEA.
  User: anakettl
  Date: 24/03/2021
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<footer class="card-footer">
    <div class="container">
        <div class="text-center">
            <% if (session.getAttribute("usuarioEmail") != null) { %>
                <small>Usuario logado: <%=session.getAttribute("usuarioEmail")%></small>
            <% } %>
            <br>
            <small>Programação para Web I</small>
        </div>
    </div>
</footer>

