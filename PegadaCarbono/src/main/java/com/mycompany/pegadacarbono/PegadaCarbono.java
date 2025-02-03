/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pegadacarbono;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public class PegadaCarbono {

    public static void main(String[] args) {
        List<IPegadaCarbono> emissores = new ArrayList<>();
        CarbonAnalyzer analisa = new CarbonAnalyzer(emissores);
        
        
        Residencial r1 = new Residencial(10000);
        
        System.out.println("A poluição gerada foi de: " + r1.pegadaCarbono());
        //Resultado esperado é de 2000
        
        Essencial e1 = new Essencial(1, 10000);
        
        System.out.println("A poluição gerada foi de: " + e1.pegadaCarbono());
        //Resultado esperado é de 3500
        
        Automovel a1 = new Automovel(1000,10);
        System.out.println(a1.pegadaCarbono()); 
        //Resultado esperado é 100;
        
        Onibus o1 = new Onibus(2,10);
        System.out.println(o1.pegadaCarbono());
        //Resultado esperado é 125
        
        analisa.addObjeto(r1);
        analisa.addObjeto(e1);
        analisa.addObjeto(a1);
        analisa.addObjeto(o1);
        
        System.out.println("A poluição total foi de: " + analisa.getEmissorTotal());
        //Resultado esperado é de 5600 + 125 = 5725 
        
        
        // Código com a implementação de interface para mudar o tipo de edifício;
        
        
    }
}
