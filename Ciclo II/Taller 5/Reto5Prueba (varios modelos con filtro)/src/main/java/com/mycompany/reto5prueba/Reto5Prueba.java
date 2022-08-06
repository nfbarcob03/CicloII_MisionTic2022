/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto5prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nfbar
 */
public class Reto5Prueba {

    public static void main(String[] args) {
        
        String dbURL ="jdbc:mysql://localhost:3306/libreria";

        String username = "root";
        String password = "root";
        // conectar
        try {
        Connection conn = DriverManager . getConnection (
        dbURL , username , password );

        if ( conn != null ) {
        System . out . println (" Conectado ");
        }
        Statement stmt = conn.createStatement();		      
          String sql = "CREATE TABLE REGISTRATION " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Hello World!");
        
        
        } catch ( SQLException ex ) {
        ex . printStackTrace ();
        }
       
        
    }
}
