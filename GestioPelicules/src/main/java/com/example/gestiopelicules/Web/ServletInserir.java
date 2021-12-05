package com.example.gestiopelicules.Web;

import com.example.gestiopelicules.Dades.CRUDProducte;
import com.example.gestiopelicules.Model.Usuari;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ServletInserir", value = "/ServletInserir")
public class ServletInserir extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

        HttpSession sessio= request.getSession();

        if (sessio != null) {

            CRUDProducte crud = new CRUDProducte();

            String nom = request.getParameter("nom");
            String descripcio = request.getParameter("descripcio");
            float preu = Float.parseFloat(request.getParameter("preu"));

            crud.create(nom, descripcio, preu);

            RequestDispatcher dispatcher;
            dispatcher = request.getRequestDispatcher("/ServletAllPro");
            dispatcher.forward(request, response);

            crud.desconectar();

        }else {
            System.out.println("NO HI HA CAP SESSIO ASSOCIADA");
            RequestDispatcher dispatcher;

            dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
