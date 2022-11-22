/**
 * Clase BD_Conector
 *
 * @author Lucía Piñán Barberan
 *         Daniel Molano Caraballo
 *         Fernando Martín Gay
 *         Álvaro Pérez Hernández
 *
 * @version 1.8 24/05/2022
 */
package bbdd;

import java.sql.*;

public class BD_Conector {

    private String base;
    private String usuario;
    private String pass;
    private String url;
    protected Connection c;

    /**
     * Método constructor de la clase BD_Conector
     *
     * @param bbdd Nombre de la BBDD
     */
    public BD_Conector(String bbdd) {
        base = bbdd;
        usuario = "root";
        pass = "";
        url = "jdbc:mysql://localhost/" + base;

        //FER
        //usuario="fer";
        //pass="123";
        //url="jdbc:mysql://localhost:8889/"+base;
    }

    /**
     * Método que abre la BBDD
     *
     */
    public void abrir() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            c = DriverManager.getConnection(url, usuario, pass);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Método que cierra la BBDD
     *
     */
    public void cerrar() {
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }

}
