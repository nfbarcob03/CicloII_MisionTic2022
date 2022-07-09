/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1_ejercicio1;

/**
 *
 * @author nfbar
 */
public class FiguraGeometrica {
    
    private String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }
    
}
