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
public class PegadaCarbonoComEdificoInterface {

    public static void main(String[] args) {
        List<IPegadaCarbono> emissores = new ArrayList<>();
        CarbonAnalyzer analisa = new CarbonAnalyzer(emissores);
        
        Residencial typeR = new Residencial(10000);
        
        Edificio e2 = new Edificio(10000, typeR);
        
        System.out.println("A poluição gerada foi de: " + e2.pegadaCarbono());
        //Resultado esperado é de 2000
        
        Essencial typeE = new Essencial(1, 10000);
        
        Edificio e1 = new Edificio(10000, typeE);
        
        System.out.println("A poluição gerada foi de: " + e1.pegadaCarbono());
        //Resultado esperado é de 3500
        
        Essencial es1 = new Essencial(1, 20000);
        //Resultado esperado é de 7000
        
        System.out.println("A poluição gerada foi de: " + es1.pegadaCarbono());
        
        Residencial re1 = new Residencial(20000);
        //Resultado esperado é de 4000
        
        System.out.println("A poluição gerada foi de: " + re1.pegadaCarbono());
        
        Automovel a1 = new Automovel(1000,10);
        System.out.println("A poluição gerada foi de: " + a1.pegadaCarbono()); 
        //Resultado esperado é 100;
        
        Onibus o1 = new Onibus(2,10);
        System.out.println("A poluição gerada foi de: " + o1.pegadaCarbono());
        //Resultado esperado é 125
        
        analisa.addObjeto(e2);
        analisa.addObjeto(e1);
        analisa.addObjeto(a1);
        analisa.addObjeto(o1);
        analisa.addObjeto(es1);
        analisa.addObjeto(re1);
        
        System.out.println("A poluição total foi de: " + analisa.getEmissorTotal());
        //Resultado esperado é de 5600 + 125 = 16725 
        
    }
}
