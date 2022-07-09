/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1_ejercicio1;

/**
 *
 * @author nfbar
 */
public class Esfera extends Figura3D{
    private double radio;

    public Esfera(double radio, String color) {
        super(color);
        this.radio = radio;
        super.setVolumen(calcularVolumen());
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        super.setVolumen(calcularVolumen());
    }
    
    public double calcularVolumen(){
        return Math.PI*Math.pow(radio, 3)*4/3;
    }

    @Override
    public String toString() {
        return "Esfera{" + "radio=" + radio + " volumen=" +super.getVolumen() 
                + " color=" + super.getColor() +'}';
    }
    
    
    
}
