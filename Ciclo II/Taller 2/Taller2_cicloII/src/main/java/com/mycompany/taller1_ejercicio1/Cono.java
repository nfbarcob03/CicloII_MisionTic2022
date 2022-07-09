/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1_ejercicio1;

/**
 *
 * @author nfbar
 */
public class Cono extends Figura3D{
    private double radio;
    private double alto;

    public Cono(double radio, double alto, String color) {
        super(color);
        this.radio = radio;
        this.alto = alto;
        super.setVolumen(calcularVolumen());
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        super.setVolumen(calcularVolumen());
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
        super.setVolumen(calcularVolumen());
    }
    
    public double calcularVolumen(){
        return Math.PI*alto*Math.pow(radio, 2)*1/3;
    }

    @Override
    public String toString() {
        return "Cono{" + "radio=" + getRadio() +  "alto=" + getAlto() + " volumen=" +super.getVolumen() 
                + " color=" + super.getColor() +'}';
    }
    
    
    
}
