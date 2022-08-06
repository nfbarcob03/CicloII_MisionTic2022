/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5prueba.controller;

import com.mycompany.reto5prueba.ConexionBD;
import static com.mycompany.reto5prueba.controller.LibroControlador.acceso;
import static com.mycompany.reto5prueba.controller.LibroControlador.libros;
import com.mycompany.reto5prueba.model.Estudiante;
import com.mycompany.reto5prueba.model.Libro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author nfbar
 */
public class EstudianteControlador {
    
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static ConexionBD conexion = new ConexionBD();
    public static Connection acceso = conexion.crearConexion();
    
    public ArrayList<Estudiante> cosultarEstudiantes() {
        Estudiante estudiante;
        estudiantes.clear();
        String queryBase = "select * from estudiante";
        try {
            //2. crear el objeto statement
            Statement sentencia = acceso.createStatement();
            
            ResultSet datos= null;
            datos = sentencia.executeQuery(queryBase);
            
            while (datos.next()) {
                estudiante = new Estudiante(Integer.parseInt(datos.getString(1)), datos.getString(2), datos.getString(3),datos.getString(4), datos.getString(5),Integer.parseInt(datos.getString(1)));
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return estudiantes;
    }
    
}
