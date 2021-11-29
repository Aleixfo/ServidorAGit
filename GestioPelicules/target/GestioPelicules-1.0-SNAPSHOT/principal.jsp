
<%@page import="java.util.ArrayList" %>
<%@page import="com.example.gestiopelicules.Model.Producte" %><!-- Importar classes -->

<!-- Inclusio de fitxers -->
<%/*@ include file="login.jsp" // jsp:include page="login.jsp" */%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <title>Botiga</title>
</head>
<body>

<div class="container">


    <%@ include file="header.jsp"%>

    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Insereix Nou Producte</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form>


                        <label for="nom">Nom:     &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp </label>
                        <input type="text" name="nom" id="cheese"><br>
                        <label for="descripcio">Descripcio: </label>
                        <input type="text" name="descripcio" id="cheese"><br>
                        <label for="preu">Preu:    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
                        <input type="text" name="preu" id="cheese">


                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Tancar</button>
                    <button type="button" class="btn btn-primary">Insereix</button>
                </div>
            </div>
        </div>
    </div>


    <hr>
    <table id="taula" class="table table-striped">

        <tr>
            <th>ID</th>
            <th>Nom</th>
            <th>Descripcio</th>
            <th>Preu</th>
            <th><input type="button" id="btn-refrescar" class="btn btn-primary" value="Refrescar">&nbsp<button type="button" class="btn btn-outline-success" data-bs-toggle="modal" data-bs-target="#exampleModal">
                Inserir
            </button></th>
        </tr>
        <tr>
            <td>1</td>
            <td>Coca Cola</td>
            <td>Beguda Gaseosa</td>
            <td>2.3</td>
            <td>
                <input type="button" id="btn-editar" class="btn btn-warning" value="Editar">
                <input type="button" id="btn-eliminar" class="btn btn-danger" value="Eliminar">
            </td>
        </tr>
        <tr>
            <td>2</td>
            <td>Fanta</td>
            <td>Beguda Gaseosa</td>
            <td>1.8</td>
            <td>
                <input type="button" id="btn-editar" class="btn btn-warning" value="Editar">
                <input type="button" id="btn-eliminar" class="btn btn-danger" value="Eliminar">
            </td>
        </tr>



    </table>
    <hr>
    <button class="btn btn-outline-success" type="submit">Cerca</button>
    <select name="filtrador" id="filtre" class="btn" form="carform">
        <option value="perid">Per ID</option>
        <option value="pernom">Per nom</option>
        <option value="perpreu">Per preu</option>
    </select>
    <br><br>
    <input class="form-control me-2" type="search" placeholder="Cerca" aria-label="Search">

    <%@ include file="footer.jsp"%>

</div>




</body>
</html>