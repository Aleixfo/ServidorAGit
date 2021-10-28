package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexio {

    private final Connection con;

    public Conexio(String url, String user, String password) throws Exception{

        this.con = DriverManager.getConnection(url, user, password);

    }

    public Statement createState() throws SQLException {
        return this.con.createStatement();
    }

    public void disconect() throws SQLException {
        con.close();
    }
}
