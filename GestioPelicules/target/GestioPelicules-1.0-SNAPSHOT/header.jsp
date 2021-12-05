<%--
  Created by IntelliJ IDEA.
  User: fontc
  Date: 29/11/2021
  Time: 0:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="principal.jsp">Productes</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Tenda</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Carrito</a>
                </li>
            </ul>
            <form class="d-flex">
                <a href="ServletLogout"><button class="btn btn-outline-success" type="button">Log Out</button></a>
            </form>
        </div>
    </div>
</nav>