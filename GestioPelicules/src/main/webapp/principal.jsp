<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.gestiopelicules.Model.Producte"%><!-- Importar classes -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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

    <% ArrayList <Producte> productesA = (ArrayList<Producte>) request.getAttribute("prova"); %>

    <%@ include file="header.jsp"%>

    <!-- Modal INSERIR -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Insereix Nou Producte</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">

                    <form action="ServletInserir" method="get" name="formulariInsert">


                        <label for="nom">Nom:     &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp </label>
                        <input type="text" name="nom" id="nom"><br>
                        <label for="descripcio">Descripcio: </label>
                        <input type="text" name="descripcio" id="descripcio"><br>
                        <label for="preu">Preu:    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
                        <input type="text" name="preu" id="preu">


                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Tancar</button>
                            <button type="submit" value="Insereix" class="btn btn-primary">Insereix</button>
                        </div>

                    </form>

                </div>

            </div>
        </div>
    </div>


    <hr>
    <table id="taula" class="table table-striped">

        <tr>
            <th scope="col">ID</th>
            <th scope="col">Nom</th>
            <th scope="col">Descripcio</th>
            <th scope="col">Preu</th>
            <th><a href="ServletAllPro"><input type="button" id="btn-refrescar" class="btn btn-primary" value="Refrescar"></a></th>
            <th><button type="button" value="Inserir" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#exampleModal">Inserir</button></th>
        </tr>
            <c:forEach var="producte" items="${prova}">
                <tr>

                    <td><c:out value="${producte.id}"></c:out></td>
                    <td><c:out value="${producte.nom}"></c:out></td>
                    <td><c:out value="${producte.descripcio}"></c:out></td>
                    <td><c:out value="${producte.preu}"></c:out></td>
                    <td><button type="button" value="Update" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#exampleModal2">Update</button></td>
                    <td><a href="ServletEliminar?id=${producte.id}"><input type="button" id="btn-eliminar" class="btn btn-danger" value="Eliminar"></a></td>

                </tr>

                <!-- Modal MODIFICAR -->
                <div class="modal fade" id="exampleModal2" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel2">Modifica el producte</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">

                                <form action="ServletUpdate" method="get" name="formulariUpdate">

                                    <label for="id">ID:     &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp </label>
                                    <input type="text" value="${producte.id}" name="id" id="id" readonly="readonly"><br>
                                    <label for="nom">Nom:     &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp </label>
                                    <input type="text" value="${producte.nom}" name="nom"><br>
                                    <label for="descripcio">Descripcio: </label>
                                    <input type="text" value="${producte.descripcio}" name="descripcio"><br>
                                    <label for="preu">Preu:    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
                                    <input type="text" value="${producte.preu}" name="preu">


                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                        <button type="submit" value="Insereix" class="btn btn-primary">Modificar</button>
                                    </div>

                                </form>

                            </div>

                        </div>
                    </div>
                </div>

            </c:forEach>


    </table>

    <!-- <hr>
    <button class="btn btn-outline-success" type="submit">Cerca</button>
    <select name="filtrador" id="filtre" class="btn" >
        <option value="perid">Per ID</option>
        <option value="pernom">Per nom</option>
        <option value="perpreu">Per preu</option>
    </select>
    <br><br>
    <input class="form-control me-2" type="search" placeholder="Cerca" aria-label="Search"> -->

    <%@ include file="footer.jsp"%>

</div>

</body>
</html>