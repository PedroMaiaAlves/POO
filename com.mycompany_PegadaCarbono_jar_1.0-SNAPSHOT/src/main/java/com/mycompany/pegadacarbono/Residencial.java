/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegadacarbono;

/**
 *
 * @author Pedro Henrique
 */
public class Residencial implements IPegadaCarbono, IEdificio{
    private int consumoMensal;
    private static final double taxaDesperdicio;
    
    static{
        taxaDesperdicio = 0.2;
    }

    public Residencial(int consumoMensal) {
        this.consumoMensal = consumoMensal;
    }
    
    @Override
    public double getTaxaDesperdicio() {
        return taxaDesperdicio;
    }
    
    public int getConsumoMensal() {
        return consumoMensal;
    }

    public void setConsumoMensal(int consumoMensal) {
        this.consumoMensal = consumoMensal;
    }
    
   
    @Override
    public double pegadaCarbono() {
        return getConsumoMensal() * taxaDesperdicio;
    }
}
