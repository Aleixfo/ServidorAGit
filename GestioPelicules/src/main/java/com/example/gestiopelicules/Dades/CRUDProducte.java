/* PROCESO A ACCESO A BBDD (JDBC)
 * -------------------------------
 * 1. Establecer conexion con la BBDD
 * 2. Crear un objeto Statement
 * 3. Ejecutar sentencia SQL
 * 4. Leer el resultSet
 * --------------------------------
 * 1. ESTABLECER CONEXION CON LA BASE DE DATOS (MySQL)
 * Consiste en crearnos un objeto de tipo conexion, a la hora de crear este objeto de tipo conexion necesitaremos
 * utilizar un String que va almacenar la cadena de conexion, que dependiendo de la BBDD que te quieras conectar sera de una
 * forma o otra pero todas tienen la misma estructura.
 *
 * jdbc:mysql://localhost:3306/Videoteca
 * (DRIVER):(PROTOCOLO DRIVER):(DETALLES DE LA CONEXION DEL DRIVER)
 * Tambe necessitarem l'usuari i la contraseña
 * --------------------------------
 * 2. CREAR OBJETO STATEMENT
 * Con nuestro objeto conexion podemos utilizar el metodo createStatement, i al aplicar este metodo sobre el objeto conexion
 * nos va a devolver un objeto de tipo statment.
 * --------------------------------
 * 3. EJECUTAR SENTENCIA SQL MEDIANTE RESULTSET
 * Con el objeto statement creado en el paso 3 podemos utilizar un metodo, executeQuery que nos permite ejecutar una sentencia SQL.
 * Este metdo nos va a devolver un resulSet, es un objeto donde se almacena la informacion que nos devuelve la sentencia SQL.
 * --------------------------------
 * 4. LEER EL RESULSET (TABLA)
 * Leer el resulSet, el objeto que nos devuelve el metodo executeQuery. Entre sus metodos getString() o next().
 * Normalment es llegeix la taula (resulSet) amb un bucle (while, for, etc...)
 * --------------------------------
 * Cargue el controlador de acceso a datos
 * Class.forName("com.mysql.cj.jdbc.Driver");
 *  */
package com.example.gestiopelicules.Dades;
import com.example.gestiopelicules.Model.Producte;

import java.sql.*;
import java.util.ArrayList;

public class CRUDProducte implements iCRUDProducte {

    private final Conexio con;
    private PreparedStatement state;

    public CRUDProducte() {
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

    public Boolean delete(int id) throws Exception {

        String query = "DELETE FROM productos WHERE id=" + id+";";
        state = conectar().prepareStatement(query);
        state.executeUpdate();
        tancarStatement();

        System.out.println("QUERY EXECUTADA OKKK");

        return true;
    }

    public ArrayList<Producte> readAll() throws Exception {

        ArrayList <Producte> products = new ArrayList<>();

        String query = "SELECT * FROM productos";
        state = conectar().prepareStatement(query);
        ResultSet result = state.executeQuery();

        while(result.next()){

            Producte product = new Producte(
                    result.getInt("id"),
                    result.getString("nom"),
                    result.getString("descripcio"),
                    result.getFloat("preu")
            );
            products.add(product);
        }
        tancarStatement();
        return products;
    }

    public Boolean create(String nom, String descripcio, float preu) throws Exception {


        String query = "INSERT INTO productos (nom, descripcio, preu) values ('"+nom+"', '"+descripcio+"', "+preu+");";
        state = conectar().prepareStatement(query);
        state.executeUpdate();
        tancarStatement();

        return true;
    }

    public Boolean update(int id, String nom, String descripcio, float preu) throws Exception {

        String query = "UPDATE productos set nom='" + nom + "', descripcio='" + descripcio + "', preu=" + preu + " WHERE id=" + id;
        state = conectar().prepareStatement(query);
        state.executeUpdate();
        tancarStatement();

        return true;
    }

    public Producte read(int id) throws Exception {

        String query = "SELECT * FROM productos where id="+id+";";
        state = conectar().prepareStatement(query);
        ResultSet result = state.executeQuery();

        while(result.next()){

            Producte product = new Producte(
                    result.getInt("id"),
                    result.getString("nom"),
                    result.getString("descripcio"),
                    result.getFloat("preu")
            );
            tancarStatement();
            return product;
        }
        tancarStatement();
        return null;
    }



}//Fi de clase
