/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller1_ejercicio1;

import java.util.Scanner;
import com.mycompany.taller1_ejercicio1.FuncionesFigurasGeometricas;

/**
 *
 * @author nfbar
 */
public class Taller1_ejercicio1 {
    
    private static Scanner sc = new Scanner(System.in);
    private static FuncionesFigurasGeometricas funcionesFigurasGeometricas = new FuncionesFigurasGeometricas();

    public static void main(String[] args) {
        
        
        String menu = "Ingrese lo que desea calcular: \n"
                + "1. Calcular volumen solido esfera + cono \n"
                + "2. Calcular area vagon (dos circulos iguales y un rectangulo) \n"
                + "3. Calcular area carro (dos circulos y dos rectangulos diferentes) \n"
                + "4. Salir";
        
        String opcion = null;
        boolean salir = false;
        
        while (salir== false){
            System.out.println(menu);
            opcion = sc.nextLine();
            
            switch (opcion) {
                case "1":
                    System.out.println("El volumen dle solido es: " + calcularVolumenSolidoEsferaCono());
                    break;
                case "2":
                    System.out.println("El area dle vagon es: " + calcularAreaVagon());
                    break;
                case  "3":
                    System.out.println("El area dle carro es: " + calcularAreaCarro());
                    break;
                case "4":
                    salir = true;
                    System.out.println("Fue un placer hacer los calculos para ti");
                    break;
                default:
                    System.out.println("Solo se aceptan opciones indicadas en el menu, trate de nuevo");
            }
        }
        
    }
    
    public static double calcularVolumenSolidoEsferaCono (){
        System.out.println("Ingrese el radio de la esfera");
        double r1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la altura del cono");
        double h = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el radio del cono");
        double r2 = Double.parseDouble(sc.nextLine());

        double volumenCono = funcionesFigurasGeometricas.calcularVolumenCono(r2, h);
        double volumenEsfera = funcionesFigurasGeometricas.calcularVolumenEsfera(r1);
        double volumenTotal = volumenCono+volumenEsfera;
        return volumenTotal;
    }
    
    public static double calcularAreaVagon(){
        System.out.println("Ingrese el radio de las llantas");
        double r1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la altura del vagon");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el largo del vagon");
        double b = Double.parseDouble(sc.nextLine());
        
        double areaVagon = funcionesFigurasGeometricas.calcularAreaRectangulo(a, b) +funcionesFigurasGeometricas.calcularAreaCirculo(r1);
        return areaVagon;

    }
    
    public static double calcularAreaCarro(){
        System.out.println("Ingrese el radio de la llanta 1");
        double r1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el radio de la llanta 2");
        double r2 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la altura del vagon 1");
        double a1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la altura del vagon 2");
        double a2 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el largo del vagon 1");
        double b1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el largo del vagon 2");
        double b2 = Double.parseDouble(sc.nextLine());
        
        double areaVagon1 = funcionesFigurasGeometricas.calcularAreaRectangulo(a1,b1);
        double areaVagon2 = funcionesFigurasGeometricas.calcularAreaRectangulo(a2,b2);
        double areaLlanta1 = funcionesFigurasGeometricas.calcularAreaCirculo(r1);
        double areaLlanta2 = funcionesFigurasGeometricas.calcularAreaCirculo(r2);
        
        double areaTotal = areaVagon1 + areaVagon2+areaLlanta1+areaLlanta2;
        
        return areaTotal;
        
    }
    
}
