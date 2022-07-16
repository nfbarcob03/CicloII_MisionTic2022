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
    
    public ArrayList<Integer> necesito_del_grupo (ArrayList<Integer> list_ind, ArrayList<String>list_grup, String grup_interes){
        ArrayList<Integer> list_ind_interes = new ArrayList<Integer>();
        
        for(Integer indice: list_ind){
            if(list_grup.get(indice).equals(grup_interes)){
                list_ind_interes.add(indice);
            }
        }
        return list_ind_interes;
    }
    
    public ArrayList<Integer> sirven_a_nestor (ArrayList<Integer> lista_sobra_pedro, ArrayList<Integer> list_tiene_nestor){
        ArrayList<Integer> list_necesita_nestor_de_pedro = new ArrayList<Integer>();
        for(Integer indice: lista_sobra_pedro){
            if(!list_tiene_nestor.contains(indice)){
                list_necesita_nestor_de_pedro.add(indice);
            }
        }
        return list_necesita_nestor_de_pedro;
        
    }
    
    
    
}
