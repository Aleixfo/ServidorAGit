package com.example.gestiopelicules.Web;

import cc.duduhuo.util.digest.Digest;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {

    private String message;

    //private Digest DigestUtils;

    public void init() {
        message = "Gestio Productes";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        //Cercam el hass del password introduit per l'usuari
        //String md5Hex = DigestUtils.md5Hex(password);

        PrintWriter out = response.getWriter();

        /*if (verificarUsuari(usuario, md5Hex)){
            RequestDispatcher dispatcher = request.getRequestDispatcher("Principal.html");
            dispatcher.forward(request, response); //Fa la redirecció
        } else {
            out.println("<h1>L'usuari i el password no son correctes</h1>");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.include(request, response); //Afegeix el que surt per pantalla al index.jsp
        }*/

        // Hello
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Creedencials</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Usuari: <br>-> "+ request.getParameter("usuari"));
        out.println("<br>");
        out.println("<br>");
        out.println("Contrasenya: <br>-> "+ request.getParameter("contrasenya"));
        out.println("<br><br><a href='index.jsp'>Tornar al Login</a>");
        out.println("</body>");
        out.println("</html>");

    }

    private boolean verificarUsuari(String usuario, String md5Hex) {
        return true;
    }

    public void destroy() {
    }
}