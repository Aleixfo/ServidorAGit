package com.example.gestiopelicules.Web;

import cc.duduhuo.util.digest.Digest;
import com.example.gestiopelicules.Dades.CRUDUsuaris;
import com.example.gestiopelicules.Dades.Conexio;
import com.example.gestiopelicules.Model.Usuari;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {

    private String message;

    private Digest DigestUtils;

    public void init() {
        message = "Gestio Productes";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");


        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        try {

            CRUDUsuaris crud = new CRUDUsuaris();
            Usuari user = crud.read(usuario);

            if (user.getUsername().equals(usuario) && user.getPassword().equals(password)){

                HttpSession sessio= request.getSession();
                sessio.setAttribute("usuari",user);
                if (sessio != null) {
                    System.out.println("S'ha creat la sessio: Usuari -> " + user);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("principal.jsp");
                    dispatcher.forward(request, response); //Fa la redirecció
                }

            } else {
                if (usuario == ""){
                    out.println("No has introduit usuari<br>");
                }
                if (user.getUsername().equals("null")){
                    out.println("No s'ha trobat cap usuari amb el nom de < "+usuario+" > a la BBDD<br>");
                }
                if (!user.getPassword().equals(password)) {
                    out.println("Contrasenya Incorrecte");
                }
                RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                dispatcher.include(request, response); //Afegeix el que surt per pantalla al login.jsp
            }

            //Desconectam al final
            crud.desconectar();

        } catch (Exception e) {
            e.printStackTrace();
        }


        //Cercam el hass del password introduit per l'usuari
        String md5Hex = DigestUtils.md5Hex(password);



    }

    private boolean verificarUsuari(String usuario, String md5Hex) {
        return true;
    }

    public void destroy() {
    }
}