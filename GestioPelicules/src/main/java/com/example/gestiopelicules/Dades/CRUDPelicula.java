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
import com.example.gestiopelicules.Model.Pelicula;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class CRUDPelicula implements iCRUDPelicula{

    private final Conexio con;
    private final Statement state;
    Scanner sc = new Scanner(System.in);

    public CRUDPelicula() throws Exception {
        con = new Conexio();
        state = con.createState();
    }



    public void desconectar() throws Exception{
        con.desconectar();
    }

    public ArrayList<Pelicula> readAll() throws Exception {

        ArrayList <Pelicula> pelis = new ArrayList<>();

        String query = "SELECT * FROM catalegpelicules";
        ResultSet result = state.executeQuery(query);

        while(result.next()){

            Pelicula peli = new Pelicula(
                    result.getInt("id"),
                    result.getString("titol"),
                    result.getString("any"),
                    result.getString("director"),
                    result.getString("genere")
            );
            pelis.add(peli);
        }
        return pelis;
    }

    public Boolean create(String titolP, String anyP, String directorP, String genereP) throws Exception {


        String query = "INSERT INTO catalegpelicules (titol, any, director, genere) values ('"+titolP+"', "+anyP+", '"+directorP+"', '"+genereP+"');";

        state.executeUpdate(query);

        return true;
    }

    public Boolean update(int id, String titolP, String anyP, String directorP, String genereP) throws Exception {

        String query = "UPDATE catalegpelicules set titol='" + titolP + "', any='" + anyP + "', director='" + directorP + "', genere='" + genereP + "' WHERE id=" + id;

        state.executeUpdate(query);

        return true;
    }

    public Boolean delete(int id) throws Exception {

        String query = "DELETE FROM catalegpelicules WHERE id='" + id + "'";
        state.executeUpdate(query);

        return true;
    }

    public Pelicula read(int id) throws Exception {



        String query = "SELECT * FROM catalegpelicules where id="+id+";";
        ResultSet result = state.executeQuery(query);

        while(result.next()){

            Pelicula peli = new Pelicula(
                    result.getInt("id"),
                    result.getString("titol"),
                    result.getString("any"),
                    result.getString("director"),
                    result.getString("genere")
            );
            return peli;
        }
        return null;
    }



}//Fi de clase
