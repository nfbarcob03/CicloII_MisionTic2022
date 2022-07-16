/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author nfbar
 */
public class Mavenproject4 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //productos productosObjetc = new productos();
        //ArrayList<String> lista_grupos = new ArrayList<String>(
        //    Arrays.asList("verduras","verduras","granos","granos","verduras","frutas","frutas","carnes","carnes"));
        //System.out.println(productosObjetc.grupos(lista_grupos));
        
        //ArrayList<Integer> lista_sobra_maria_pruebla = new ArrayList<Integer>(
        //    Arrays.asList(0,1,5,6,8));
        // ArrayList<Integer> lista_tiene_marta_prueba = new ArrayList<Integer>(
        //    Arrays.asList(0,2,5,6,7));
        
        
        //System.out.println(productosObjetc.sirven_a_marta(lista_sobra_maria_pruebla, lista_tiene_marta_prueba));
        
        //String[] arregloString = {"Felipe", "Laura", "Pabloe", "1"};
        
        //for(String nombre : arregloString){
        //    System.out.println(nombre);
        //}
        
        //arregloString[3] = "Andrea";
        
        //for (int i = 0; i< arregloString.length; i++){
        //    System.out.println(i);
        //    System.out.println(arregloString[i]);
        //}
        
        //ArrayList<String> cars = new ArrayList<String>(); 
//        
//        cars.add("Chevrolet");
//        cars.add("Renault");
//        cars.add("Kia");
//        cars.add("Jeep");
//        
//        for(String carro: cars){
//            System.out.println(carro);
//        }
//        
//        //cars.set(2, "Susuki");
//        
//        //cars.remove(3);
//        
//        Collections.sort(cars);
//        
//        for(int i=0; i<cars.size();i++){
//            System.out.println(i);
//            System.out.println(cars.get(i));
//        }

         Videojuego videojuego = new Videojuego();
         
         ArrayList<Integer> list_ind = new ArrayList<Integer>(
                 Arrays.asList(0,1,3,6));
        // ArrayList<Integer> list_ind = new ArrayList<Integer>();
        //list_ind.add(0); list_ind.add(1); list_ind.add(3); list_ind.add(6);
        
         ArrayList<String> list_grup = new ArrayList<String>(
                 Arrays.asList("peleas","peleas","deportes","deportes","disparos","disparos","carreras","carreras"));
         //ArrayList<String> list_grup = new ArrayList<String>();
         //list_grup.add("peleas");list_grup.add("peleas");list_grup.add("deportes");....
         
         String grup_interes = "peleas";
         
        System.out.println(videojuego.necesito_del_grupo(list_ind, list_grup, grup_interes));
        
        
        ArrayList<Integer> lista_sobra_pedro_input = new ArrayList<Integer>(
                 Arrays.asList(0,1,5,6,8));
        
        ArrayList<Integer> list_tiene_nestor_input = new ArrayList<Integer>(
                 Arrays.asList(0,2,5,6,7));
        System.out.println(videojuego.sirven_a_nestor(lista_sobra_pedro_input, list_tiene_nestor_input));

    }
}
