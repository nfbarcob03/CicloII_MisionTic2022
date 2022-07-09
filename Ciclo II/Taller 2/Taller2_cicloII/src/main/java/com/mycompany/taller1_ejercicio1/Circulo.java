/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1_ejercicio1;

/**
 *
 * @author nfbar
 */
public class Circulo extends Figura2D{
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
        super.setArea(calcularArea());
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        super.setArea(calcularArea());
    }
    
    public double calcularArea(){
       return Math.PI*Math.pow(getRadio(), 2);
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio +  " area= " + super.getArea() +
                " color=" + super.getColor() +'}';
    }
    
    
    
    
    
}
