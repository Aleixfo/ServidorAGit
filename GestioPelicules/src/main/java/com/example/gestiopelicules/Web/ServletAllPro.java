package com.example.gestiopelicules.Web;

import com.example.gestiopelicules.Dades.CRUDPelicula;
import com.example.gestiopelicules.Dades.CRUDProducte;
import com.example.gestiopelicules.Model.Producte;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletAllPro", value = "/ServletAllPro")
public class ServletAllPro extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        try {

            String missatge = null;
            response.setContentType("text/html");
            ArrayList <Producte> productes;
            CRUDProducte crud = new CRUDProducte();
            productes = crud.readAll();

            for (Producte pro : productes){
                missatge+="<p>"+ pro.toString() + "</p><br>";
            }

            request.setAttribute("prova", productes);
            request.getRequestDispatcher("principal.jsp").forward(request, response);


            crud.desconectar();





        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
