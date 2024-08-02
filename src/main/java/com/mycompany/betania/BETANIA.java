package com.mycompany.betania;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BETANIA {

    public static void main(String[] args) {
        String usuario = "root"; 
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/betania";  // Formato correcto de la URL
        Connection conexion = null;
        Statement statement = null;
        ResultSet rs = null;
        
        try {
            // Establecer conexión
            conexion = DriverManager.getConnection(url, usuario, clave);
            statement = conexion.createStatement();

            // Consulta para seleccionar datos
            rs = statement.executeQuery("SELECT * FROM cliente");
            while(rs.next()){
                System.out.println(rs.getString("nombre"));
            }
            
            // Inserción de datos
            String insertQuery = "INSERT INTO usuario (id, nombre) VALUES (NULL, 'daniel')";
            statement.executeUpdate(insertQuery);  // Cambiado a executeUpdate para inserciones
            System.out.println("Datos insertados correctamente.");
            
            // Nueva consulta para verificar la inserción
            rs = statement.executeQuery("SELECT * FROM cliente");
            while(rs.next()){
                System.out.println(rs.getString("nombre"));
                
                
                // actualización de usurio
            String updateQuery = "UPDATE usuario SET nombre = 'juan' WHERE id = 1";
            int rowsAffected = statement.executeUpdate(updateQuery);

            if (rowsAffected > 0) {
                System.out.println("Usuario actualizado correctamente.");
            } else {
                System.out.println("No se encontró el usuario con el ID especificado.");
}

            }
        } catch (SQLException ex) {
            Logger.getLogger(BETANIA.class.getName()).log(Level.SEVERE, null, ex);
        
        } finally {
            try {
                if (rs != null) rs.close();
                if (statement != null) statement.close();
                if (conexion != null) conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(BETANIA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

