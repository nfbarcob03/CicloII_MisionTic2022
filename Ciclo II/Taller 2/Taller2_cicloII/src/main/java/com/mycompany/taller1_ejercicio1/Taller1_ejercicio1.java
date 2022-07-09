/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taller1_ejercicio1;

import java.util.Scanner;
import com.mycompany.taller1_ejercicio1.FuncionesFigurasGeometricas;
import java.util.ArrayList;

/**
 *
 * @author nfbar
 */
public class Taller1_ejercicio1 {
    
    private static Scanner sc = new Scanner(System.in);
    //private static FuncionesFigurasGeometricas funcionesFigurasGeometricas = new FuncionesFigurasGeometricas();
    private static ArrayList<FiguraGeometrica> lista_figuras = new ArrayList<FiguraGeometrica>();
    public static void main(String[] args) {
        
        
        String menu = "Ingrese lo que desea calcular: \n"
                + "1. Calcular volumen solido esfera + cono \n"
                + "2. Calcular area vagon (dos circulos iguales y un rectangulo) \n"
                + "3. Calcular area carro (dos circulos y dos rectangulos diferentes) \n"
                + "4. Inventario de figuras\n"
                + "5. Salir";
        
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
                case  "4":
                    System.out.println("Inventario de figuras: \n " + getInventario());
                    break;
                case "5":
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
        System.out.println("Ingrese el color de la figura");
        String color = sc.nextLine();
        
        Cono cono = new Cono(r2, h, color);
        lista_figuras.add(cono);
        Esfera esfera = new Esfera(r1, color);
        lista_figuras.add(esfera);
        double volumenTotal = cono.getVolumen() + esfera.getVolumen();
        return volumenTotal;
    }
    
    public static double calcularAreaVagon(){
        System.out.println("Ingrese el radio de las llantas");
        double r1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la altura del vagon");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el largo del vagon");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el color de la figura");
        String color = sc.nextLine();
        Rectangulo rectangulo = new Rectangulo(a, b, color);
        Circulo circulo = new Circulo(r1, color);
        lista_figuras.add(rectangulo);
        lista_figuras.add(circulo);
       
        double areaVagon = rectangulo.getArea() + 2*circulo.getArea();
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
        System.out.println("Ingrese el color de la figura");
        String color = sc.nextLine();
        
        Rectangulo rectangulo1 = new Rectangulo(b1, a1, color);
        Rectangulo rectangulo2 = new Rectangulo(b2, a2, color);
        Circulo circulo1 = new Circulo(r1, color);
        Circulo circulo2 = new Circulo(r2, color);
        
        lista_figuras.add(rectangulo1);
        lista_figuras.add(rectangulo2);
        lista_figuras.add(circulo1);
        lista_figuras.add(circulo2);
        
        double areaTotal = rectangulo1.getArea() + rectangulo2.getArea() + 
                circulo1.getArea() + circulo2.getArea();
        
        return areaTotal;
        
    }
    
    public static String getInventario(){
        String inventario = "";
        for(FiguraGeometrica figura: lista_figuras){
            // inventario = inventario + figura.toString() + "\n";
            inventario += figura.toString() + "\n";
        }
        return inventario;
    }
    
}
