/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1_ejercicio1;

/**
 *
 * @author nfbar
 */
public class Rectangulo extends Figura2D{
    private double largo;
    private double alto;

    public Rectangulo(double largo, double alto, String color) {
        super(color);
        this.largo = largo;
        this.alto = alto;
        super.setArea(calcularArea());
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
        super.setArea(calcularArea());
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
        super.setArea(calcularArea());
    }
    
    public double calcularArea(){
       return alto*largo;
    }
    

    @Override
    public String toString() {
        return "Rectangulo{" + "largo=" + largo + ", alto=" + alto +  " area= " + super.getArea() +
                " color=" + super.getColor() + '}';
    }
    


    
    
    
    
    
}
