package com.example.gestiopelicules.Dades;

import com.example.gestiopelicules.Model.Usuari;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDUsuaris implements iCRUDUsuaris {

    private final Conexio con;
    private PreparedStatement state;

    public CRUDUsuaris() {
        con = new Conexio();
    }

    public Connection conectar(){
        return con.conectar();
    }

    public void desconectar() {
        con.desconectar();
    }

    public void tancarStatement() throws SQLException {
        state.close();
    }

    public Usuari read(String username) throws Exception {

        String query = "SELECT * FROM usuarios where username ='" + username + "';";
        state = conectar().prepareStatement(query);
        ResultSet result = state.executeQuery();

        Usuari user = new Usuari();

        if (result.next()){

            user.setId(result.getInt("id"));
            user.setUsername(result.getString("username"));
            user.setPassword(result.getString("password"));

            result.close();
            tancarStatement();

            return user;
        }

        user.setUsername("null");
        user.setPassword("null");

        return user;
    }




}
