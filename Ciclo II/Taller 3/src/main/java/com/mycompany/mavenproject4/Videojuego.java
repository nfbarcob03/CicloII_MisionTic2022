/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

import java.util.ArrayList;

/**
 *
 * @author nfbar
 */
public class Videojuego {
    
    
    public ArrayList<String> grupos (ArrayList<String> list){
        ArrayList<String> list_unico = new ArrayList<String>();
       
        return list_unico;
    }
    
    public ArrayList<Integer> necesito_del_grupo (ArrayList<Integer> list_ind, ArrayList<String>list_grup, String grup_interes){
        ArrayList<Integer> list_ind_interes = new ArrayList<Integer>();
        
        for(Integer indice: list_ind){
            if(list_grup.get(indice).equals(grup_interes)){
                list_ind_interes.add(indice);
            }
        }
        return list_ind_interes;
    }
    
    public ArrayList<String> sirven_a_nestor (ArrayList<String> lista_sobra_pedro, ArrayList<String> list_tiene_nestor){
        ArrayList<String> list_necesita_nestor_de_pedro = new ArrayList<String>();
        for(String indice: lista_sobra_pedro){
            if(!list_tiene_nestor.contains(indice)){
                list_necesita_nestor_de_pedro.add(indice);
            }
        }
        return list_necesita_nestor_de_pedro;
        
    }
    
    
        public static Integer cuantos_cambian(ArrayList<String> entradaMaria, ArrayList<String> entradaMarta) {
        ArrayList<String> listaMaria = new ArrayList<>();
        ArrayList<String> listaMarta = new ArrayList<>();


        return listaMarta.size();
    }
    
    
    
    
}
