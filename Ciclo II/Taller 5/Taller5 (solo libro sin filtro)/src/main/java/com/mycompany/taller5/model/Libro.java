/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5.model;

/**
 *
 * @author nfbar
 */
public class Libro {
    
    private Integer idLibro;
    private String titulo;
    private String editorial;
    private String area;

    public Libro(int idLibro, String titulo, String editorial, String area) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.editorial = editorial;
        this.area = area;
    }

    public Libro(String titulo, String editorial, String area) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.area = area;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
    
    
    
    
    
    
    
}
