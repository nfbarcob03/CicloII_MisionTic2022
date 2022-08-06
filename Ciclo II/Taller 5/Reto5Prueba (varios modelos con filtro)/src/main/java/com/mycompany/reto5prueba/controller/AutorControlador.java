/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5prueba.controller;

import com.mycompany.reto5prueba.ConexionBD;
import static com.mycompany.reto5prueba.controller.LibroControlador.acceso;
import com.mycompany.reto5prueba.model.Autor;
import com.mycompany.reto5prueba.model.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nfbar
 */
public class AutorControlador {
    
    public static ArrayList<Autor> autores = new ArrayList<>();
    public static ConexionBD conexion = new ConexionBD();
    public static Connection acceso = conexion.crearConexion();
    
    public ArrayList<Autor> consultarAutores(Autor autorEntrada) {
        Autor aut;
        autores.clear();
        String queryBase = "select * from autor";
        String queryBaseWhere = "select * from autor where ";
        boolean tieneCondicion = false;
        try {
            //2. crear el objeto statement
            Statement sentencia = acceso.createStatement();
            //3. ejecutar la sentencia
            if (!autorEntrada.getNombre().isEmpty()){
                queryBaseWhere += "UPPER(nombre) like '%" + autorEntrada.getNombre().toUpperCase() + "%' and ";
                tieneCondicion=true;
            }
            if (!autorEntrada.getNacionalidad().isEmpty()){
                queryBaseWhere += "UPPER(editorial) like '%" + autorEntrada.getNacionalidad().toUpperCase() + "%' and ";
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
                aut = new Autor(Integer.parseInt(datos.getString(1)), datos.getString(2), datos.getString(3));
                autores.add(aut);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return autores;
    }
    
    public void createAutor (Autor autor){
        try {
            String sql = "INSERT INTO autor (nombre, nacionalidad) VALUES (?,?)";
            PreparedStatement statement = acceso.prepareStatement(sql);
            statement.setString(1, autor.getNombre());
            statement.setString(2, autor.getNacionalidad());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Registro exitoso");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void eliminarAutor(Autor autor){
        try {
        String sql = "DELETE FROM autor WHERE idAutor = ?";
        PreparedStatement statement = acceso.prepareStatement(sql);
        statement.setInt(1, autor.getIdAutor());
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Eliminacion exitoso");
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "no se puede eliminar el autor, verifique si ya elimino todas las referencias del mismo en otras tablas");
        }
    }
    public void actualizarAutor(Autor autor){
        try {
        String sql = "UPDATE autor set nombre = ?, nacionalidad = ? WHERE idAutor = ?";
        PreparedStatement statement = acceso.prepareStatement(sql);
        statement.setInt(3, autor.getIdAutor());
        statement.setString(1, autor.getNombre().toString());
        statement.setString(2, autor.getNacionalidad().toString());
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Actializacion exitosa");
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
