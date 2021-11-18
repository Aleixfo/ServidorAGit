package com.example.gestiopelicules.Dades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexio {

    private final Connection con;

    private static final String url = "jdbc:mysql://localhost:3306/pelicules";
    private static final String usuario = "admin";
    private static final String password = "admin";
    private static final String driver = "com.mysql.cj.jdbc.Driver";

    //Constructor
    public Conexio() throws Exception{

        this.con = DriverManager.getConnection(url, usuario, password);

    }

    //Getters
    public String getUrl(){return url;}
    public String getUsuario(){return usuario;}
    public String getPassword(){return password;}
    public String getDriver(){return driver;}

    public Statement createState() throws SQLException {
        return this.con.createStatement();
    }

    public void disconect() throws SQLException {
        con.close();
    }
}
