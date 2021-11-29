
<%@page import="java.util.ArrayList" %>
<%@page import="com.example.gestiopelicules.Model.Producte" %><!-- Importar classes -->

<!-- Inclusio de fitxers -->
<%/*@ include file="index.jsp" // jsp:include page="index.jsp" */%>


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





    <br><br><br>
    <hr>
    <a href="index.jsp">Log Out</a>

</form>

</body>
</html>




