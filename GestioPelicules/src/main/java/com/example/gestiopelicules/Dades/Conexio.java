package com.example.gestiopelicules.Dades;

import java.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;

public class Conexio {

    private Connection con;
    private static final String url = "jdbc:mysql://localhost:3306/productes";
    private static final String usuario = "admin";
    private static final String password = "admin";
    private static final String driver = "com.mysql.cj.jdbc.Driver";

    public Conexio () {

            try {

                Class.forName(driver);
                this.con = DriverManager.getConnection(url, usuario, password);

                if (con != null){
                    System.out.println("Conexio OK" + con);
                }

            }catch (SQLException e){
                System.out.println("Error de SQL"+ e);
            }catch (ClassNotFoundException e){
                System.out.println("Falta DRIVER MySQL" + e);
            }
    }

    public Connection conectar(){
        return con;
    }

    public void desconectar(){

        try{
            System.out.println("Tancant conexio amb la bbdd" + con);
            con.close();
        }catch (SQLException e){
            System.out.println("Error de SQL al cerrar la BBDD" + e);
        }
    }

    public PreparedStatement createState() throws SQLException {
        return (PreparedStatement) this.con.createStatement();
    }

    /*
    public static Connection getConnexio() throws SQLException {
        BasicDataSource ds = (BasicDataSource) getDataSource();
        return ds.getConnection();
    }

    public static DataSource getDataSource() {

        //Cream objecte BasicDataSource
        BasicDataSource ds = null;
        ds = new BasicDataSource();

        //Facilitam les dades per la conexio amb la BBDD
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(usuario);
        ds.setPassword(password);

        //Configuram el pool de conexions amb 50 conexions simultanies
        ds.setInitialSize(50);

        return ds;
    }

    */

}
