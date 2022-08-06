/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5.controller;

import com.mycompany.taller5.util.ConexionBD;
import com.mycompany.taller5.model.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nfbar
 */
public class LibroControlador  {
    
    private ArrayList<Libro> libros = new ArrayList<>();
    private static ConexionBD conexionBD = new ConexionBD();
    private Connection acceso = conexionBD.crearConexion();
    
    public ArrayList<Libro> consultarLibros (){
        libros.clear();
        
        Libro lib;
        
        String queryBase = "select idlibro,titulo,editorial,area from libro";
        
        
        try {
            Statement sentencia = acceso.createStatement();
            ResultSet datos = null;
            datos = sentencia.executeQuery(queryBase);
            
            while(datos.next()){
                lib = new Libro(datos.getInt(1), datos.getString(2), datos.getString(3), datos.getString(4));
                libros.add(lib);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return libros;
    }
    
    public void actualizarLibro(Libro libro) throws SQLException{
        String sql = "UPDATE libro set titulo = ?, editorial = ?, area = ? WHERE idLibro = ?";
        PreparedStatement statement = acceso.prepareStatement(sql);
        statement.setString(1, libro.getTitulo());
        statement.setString(2, libro.getEditorial());
        statement.setString(3, libro.getArea());
        statement.setString(4, libro.getIdLibro().toString());
        
        int rowsAfected = statement.executeUpdate();
        if (rowsAfected > 0) {
            System.out.println("Actializacion exitosa");
        }
        
    }
    
    public void eliminarLibro(Libro libro) throws SQLException{
        String sql = "DELETE FROM libro WHERE idLibro = ?";
        PreparedStatement statement = acceso.prepareStatement(sql);
        statement.setString(1, libro.getIdLibro().toString());
        
        int rowsAfected = statement.executeUpdate();
        if (rowsAfected > 0) {
            System.out.println("eliminacion exitosa");
        }
        
    }
    
    public void agregarLibro (Libro libro) throws SQLException{
        String sql = "INSERT INTO libro (titulo, editorial, area) VALUES (?,?,?)";
        PreparedStatement statement = acceso.prepareStatement(sql);
        statement.setString(1, libro.getTitulo());
        statement.setString(2, libro.getEditorial());
        statement.setString(3, libro.getArea());
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
                System.out.println("Registro exitoso");
         }
        
    }
    
}
