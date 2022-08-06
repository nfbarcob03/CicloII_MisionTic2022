/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5prueba;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nfbar
 */
public class ConexionBD {
     public static Connection conexion;

    public static Connection crearConexion() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/taller_4", "root", "root");
            System.out.println("conexión ok");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("sin conexion");
        }
        return conexion;
    }
    
    public static void main(String[] args) {
        crearConexion();
    }
}
