package com.example.gestiopelicules.Web;

import com.example.gestiopelicules.Dades.CRUDProducte;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletEliminar", value = "/ServletEliminar")
public class ServletEliminar extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

        CRUDProducte crud = new CRUDProducte();

        int id = Integer.parseInt(request.getParameter("id"));

        crud.delete(id);

        crud.desconectar();

        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("/ServletAllPro");
        dispatcher.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
