/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegadacarbono;

import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public class CarbonAnalyzer{
    private final List<IPegadaCarbono> emissor;

    public CarbonAnalyzer(List<IPegadaCarbono> emissor) {
        this.emissor = emissor;
    }
   
    public void addObjeto(IPegadaCarbono objeto){
        emissor.add(objeto);
    }
    
    public double getEmissorTotal(){
        double soma = 0;
        for(IPegadaCarbono objeto: emissor){
            soma += objeto.pegadaCarbono();
        }
        return soma;
    }
}
