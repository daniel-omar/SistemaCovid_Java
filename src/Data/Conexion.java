/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author omar_
 */
public class Conexion {

    private Connection cn = null;
    private String url = "jdbc:mysql://localhost/seguimiento";
    private String userName = "root";
    private String clave = "";

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, userName, "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }
}
