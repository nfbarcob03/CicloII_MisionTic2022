/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5prueba.controller;

import com.mycompany.reto5prueba.ConexionBD;
import static com.mycompany.reto5prueba.controller.LibroControlador.acceso;
import static com.mycompany.reto5prueba.controller.LibroControlador.libros;
import com.mycompany.reto5prueba.model.Libro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

/**
 *
 * @author nfbar
 */
public class LibAutControlador {
    
     public static HashMap<Integer,String> libros = new HashMap<>();
    public static ConexionBD conexion = new ConexionBD();
    public static Connection acceso = conexion.crearConexion();
   
   public HashMap<Integer,String> getLibros (){
        Libro lib;
        libros.clear();
        String queryBase = "select idLibro, titulo from libro";
        try {
            Statement sentencia = acceso.createStatement();
            ResultSet datos= null;
            datos = sentencia.executeQuery(queryBase);
            while (datos.next()) {
                libros.put(datos.getInt(1), datos.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return libros;
   }
    
}
