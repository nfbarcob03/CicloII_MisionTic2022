/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5prueba.controller;

/**
 *
 * @author nfbar
 */
public class LibAut {
    
    int idAutor;
    
    int idLibro;
    
    String nombreAutor;
    
    String tituloLibro;

    
     public LibAut(int idAutor, int idLibro, String nombreAutor, String tituloLibro) {
        this.idAutor = idAutor;
        this.idLibro = idLibro;
        this.nombreAutor = nombreAutor;
        this.tituloLibro = tituloLibro;
    }
     
    public LibAut(int idAutor, int idLibro) {
        this.idAutor = idAutor;
        this.idLibro = idLibro;
    }
     
    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    
    
    
    
    
}
