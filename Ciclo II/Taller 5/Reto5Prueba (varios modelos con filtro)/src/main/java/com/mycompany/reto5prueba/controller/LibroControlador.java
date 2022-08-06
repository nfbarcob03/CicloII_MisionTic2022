/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5prueba.controller;

import com.mycompany.reto5prueba.ConexionBD;
import com.mycompany.reto5prueba.model.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author nfbar
 */
public class LibroControlador {
    
    public static ArrayList<Libro> libros = new ArrayList<>();
    public static ConexionBD conexion = new ConexionBD();
    public static Connection acceso = conexion.crearConexion();
    
    public ArrayList<Libro> consultarJuguetes(Libro libroEntrada) {
        Libro lib;
        libros.clear();
        String queryBase = "select * from libro";
        String queryBaseWhere = "select * from libro where ";
        boolean tieneCondicion = false;
        try {
            //2. crear el objeto statement
            Statement sentencia = acceso.createStatement();
            //3. ejecutar la sentencia
            if (!libroEntrada.getTitulo().isEmpty()){
                queryBaseWhere += "UPPER(titulo) like '%" + libroEntrada.getTitulo().toUpperCase() + "%' and ";
                tieneCondicion=true;
            }
            if (!libroEntrada.getEditorial().isEmpty()){
                queryBaseWhere += "UPPER(editorial) like '%" + libroEntrada.getEditorial().toUpperCase() + "%' and ";
                tieneCondicion=true;
            }
            if (!libroEntrada.getArea().isEmpty()){
                queryBaseWhere += "UPPER(area) like '%" + libroEntrada.getArea().toUpperCase() + "%' and ";
                tieneCondicion=true;
            }
            
            ResultSet datos= null;
            if (tieneCondicion){
                 queryBaseWhere = queryBaseWhere.substring(0,queryBaseWhere.length()-4);
                 datos = sentencia.executeQuery(queryBaseWhere);
            }else{
                  datos = sentencia.executeQuery(queryBase);
            }
            
            // 4. recorrer los datos de la tabla virtual
            while (datos.next()) {
                lib = new Libro(Integer.parseInt(datos.getString(1)), datos.getString(2), datos.getString(3),datos.getString(4));
                libros.add(lib);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return libros;
    }
    
    public void createLibro (Libro libro){
        try {
            String sql = "INSERT INTO libro (titulo, editorial, area) VALUES (?,?,?)";
            PreparedStatement statement = acceso.prepareStatement(sql);
            statement.setString(1, libro.getTitulo());
            statement.setString(2, libro.getEditorial());
            statement.setString(3, libro.getArea());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Registro exitoso");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void eliminarLibro(Libro libro){
        try {
        String sql = "DELETE FROM libro WHERE idLibro = ?";
        PreparedStatement statement = acceso.prepareStatement(sql);
        statement.setString(1, libro.getIdTitulo().toString());
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Eliminacion exitoso");
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void actualziarLibro(Libro libro){
        try {
        String sql = "UPDATE libro set titulo = ?, editorial = ?, area = ? WHERE idLibro = ?";
        PreparedStatement statement = acceso.prepareStatement(sql);
        statement.setString(1, libro.getTitulo().toString());
        statement.setString(2, libro.getEditorial().toString());
        statement.setString(3, libro.getArea().toString());
        statement.setString(4, libro.getIdTitulo().toString());
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Actializacion exitosa");
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
