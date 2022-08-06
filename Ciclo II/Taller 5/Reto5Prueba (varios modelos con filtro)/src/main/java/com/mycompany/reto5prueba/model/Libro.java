/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5prueba.model;

/**
 *
 * @author nfbar
 */
public class Libro {
    private Integer idTitulo;
    private String titulo;
    private  String editorial;
    private String area;

    public Libro(Integer idTitulo, String titulo, String editorial, String area) {
        this.idTitulo = idTitulo;
        this.titulo = titulo;
        this.editorial = editorial;
        this.area = area;
    }

    public Libro(String titulo, String editorial, String area) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.area = area;
    }

    public Integer getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(Integer idTitulo) {
        this.idTitulo = idTitulo;
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
