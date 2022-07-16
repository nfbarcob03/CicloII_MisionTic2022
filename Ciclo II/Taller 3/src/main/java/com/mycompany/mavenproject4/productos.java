package com.mycompany.mavenproject4;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nfbar
 */

import java.util.ArrayList;

public class productos {
    
    public ArrayList<String> grupos (ArrayList<String> list){
        ArrayList<String> list_unico = new ArrayList<String>();
        
        for(String grupo: list){
            if(!list_unico.contains(grupo)){
                list_unico.add(grupo);
            }
        }
        
        return list_unico;
    }
    
    
    public static ArrayList<Integer> necesito_del_grupo(ArrayList<Integer> indices, ArrayList<String> listaGrupos, String grupoInteres) {
        ArrayList<Integer> nuevaLista = new ArrayList<>();
        
        return nuevaLista;
    }
    
    public ArrayList<String> sirven_a_marta (ArrayList<String> list_sobra_maria, ArrayList<String> list_tiene_marta){
        ArrayList<String> list_necesita_marta = new ArrayList<String>();
        for(String identificador: list_sobra_maria){
            if(!list_tiene_marta.contains(identificador)){
                list_necesita_marta.add(identificador);
            }
        }
        return list_necesita_marta;
        
        
    }
    
    public static Integer cuantas_cambian(ArrayList<String> entradaMaria, ArrayList<String> entradaMarta) {
        ArrayList<String> listaMaria = new ArrayList<>();
        ArrayList<String> listaMarta = new ArrayList<>();


        return listaMarta.size();
    }
    
    
}






