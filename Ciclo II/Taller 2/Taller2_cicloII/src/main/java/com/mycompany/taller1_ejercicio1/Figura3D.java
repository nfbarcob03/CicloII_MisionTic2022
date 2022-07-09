/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1_ejercicio1;

/**
 *
 * @author nfbar
 */
public class Figura3D extends FiguraGeometrica{
    
    private double volumen;

    public Figura3D(String color) {
        super(color);
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Figura3D{" + "volumen=" + getVolumen() + " color=" + super.getColor() +'}';
    }
    
}
