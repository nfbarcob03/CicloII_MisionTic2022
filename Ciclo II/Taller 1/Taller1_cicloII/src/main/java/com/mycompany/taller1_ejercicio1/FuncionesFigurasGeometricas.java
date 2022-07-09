/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1_ejercicio1;

/**
 *
 * @author nfbar
 */
public class FuncionesFigurasGeometricas {
    
    public double calcularVolumenEsfera (double radio){
        return Math.PI*Math.pow(radio, 3)*4/3;
    }
    
    public double calcularVolumenCono (double radio, double alto){
        return Math.PI*alto*Math.pow(radio, 2)*1/3;
    }
    
    public double calcularAreaRectangulo (double alto, double largo){
        return alto*largo;
    }
    
    public double calcularAreaCirculo (double radio){
        return Math.PI*Math.pow(radio, 2);
    }
    
}
