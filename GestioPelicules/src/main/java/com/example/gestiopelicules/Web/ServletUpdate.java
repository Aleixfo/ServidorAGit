package com.example.gestiopelicules.Web;

import com.example.gestiopelicules.Dades.CRUDProducte;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletUpdate", value = "/ServletUpdate")
public class ServletUpdate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        CRUDProducte crud = new CRUDProducte();
        int id = Integer.parseInt(request.getParameter("id"));
        String nom = request.getParameter("nom");
        String descripcio = request.getParameter("descripcio");
        float preu = Float.parseFloat(request.getParameter("preu"));

        try {
            crud.update(id, nom, descripcio, preu);
        } catch (Exception e) {
            e.printStackTrace();
        }
        crud.desconectar();
        RequestDispatcher dispatcher;

        dispatcher = request.getRequestDispatcher("/ServletAllPro");
        dispatcher.forward(request, response);


    }
}
