/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1_ejercicio1;

/**
 *
 * @author nfbar
 */
public class Figura2D extends FiguraGeometrica{
    
    private double area;

    public Figura2D(String color) {
        super(color);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Figura2D{" + "area=" + getArea() + " color=" + super.getColor() + '}';
    }
     
    
}
