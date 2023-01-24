package com.platzi.mensajes_app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection getConnection() {
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?serverTimezone=UTC", "root", "");
        } catch (SQLException e) {
            System.out.println("Connection Error " + e);
        }
        return conection;
    }
}
