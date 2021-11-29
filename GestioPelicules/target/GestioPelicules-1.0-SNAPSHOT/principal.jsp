<!-- Directives -->
<%@page contentType="MIME"%> <!-- Especificar tipus de mime -->
<%@page session="true"%> <!-- Si el JSP pot accedir a la sessió -->
<%@page buffer="32"%> <!-- LA grandaria del buffer de sortida -->
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="com.example.gestiopelicules.Model.Producte" %><!-- Importar classes -->
<%@page errorPage="index.jsp"%><!-- Indica la pagina d'error en cas d'Escepcio -->
<%@page isErrorPage="false"%>
<%@page isThreadSafe="true"%><!-- Maneig de multifils -->
<%@page isELIgnored="false"%><!-- Deshabilitar Expression language -->
<%/*@page extends="paquet.classe"*/%><!-- Hereda de altres classes -->

<!-- Inclusio de fitxers -->
<%/*@ include file="index.jsp" // jsp:include page="index.jsp" */%>

<!-- Incloure llibreries -->
<%/*@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"*/%> <!-- Permet donar format a cadenes -->
<%/*@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"*/%> <!-- Permet llegir i manipular dades, aixi com afegir condicions -->
<!-- SQL -> Permet fer consultes aixi com crear conexions -->
<!-- XML -> Permet manipular documents XML -->


<html>
<head>

    <!-- CSS i JavaScript de boostrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <title>Botiga</title>
</head>
<body>

<!--
 Amb les seguents marques s'indica quina part del codi conte instruccions
 que s'han de substituir pel seu resultat.
 <½ ... ½>
 <½= [EXPRESIO] %>
-->

<h1>Gestio de productes</h1>

<form name="gestioForm" method="get" action="ServletProducte">

    <label>ID</label>
    <input type="number" name="id" />
    <br>
    <label>Nom</label>
    <input type="text" name="nom" />
    <br>
    <label>Descripcio</label>
    <input type="text" name="descripcio" />
    <br>
    <label>Preu</label>
    <input type="text" name="preu" />
    <br>
    <hr>
    <input type="submit" value="Llistar">
    <input type="submit" value="Cercar">
    <input type="submit" value="Actualitzar">
    <input type="submit" value="Borrar">
    <hr>

    <%
        //Recuperam les variables
        ArrayList<Producte> productes = (ArrayList<Producte>) request.getAttribute("productes");

    %>
    <!-- I accedim a les variables i les incrustam a la taula -->
    <%for (Producte product: productes) {%>
    <tr>

        <td scope="row"><%=product.getId()%></td>
        <td><%=product.getNom()%></td>
        <td><%=product.getDescripcio()%></td>
        <td><%=product.getPreu()%></td>


    </tr>
    <%}%>



    <br><br><br>
    <hr>
    <a href="index.jsp">Log Out</a>

</form>

</body>
</html>




