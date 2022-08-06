/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5prueba.model;

/**
 *
 * @author nfbar
 */
public class Estudiante {
    
    private int idLector;
    private String CI;
    private String nombre;
    private String direccion;
    private String programa_curricular;
    private int edad;

    public Estudiante(int idLector, String CI, String nombre, String direccion, String programa_curricular, int edad) {
        this.idLector = idLector;
        this.CI = CI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.programa_curricular = programa_curricular;
        this.edad = edad;
    }

    public int getIdLector() {
        return idLector;
    }

    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPrograma_curricular() {
        return programa_curricular;
    }

    public void setPrograma_curricular(String programa_curricular) {
        this.programa_curricular = programa_curricular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
