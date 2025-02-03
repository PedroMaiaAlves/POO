/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegadacarbono;

/**
 *
 * @author Pedro Henrique
 */
public class Essencial implements IPegadaCarbono, IEdificio{
    private int qntGerador;
    private int consumoMensal;
    private static final double taxaDesperdicio;
    
    static{
        taxaDesperdicio = 0.35;
    }

    public Essencial(int qntGerador, int consumoMensal) {
        this.qntGerador = qntGerador;
        this.consumoMensal = consumoMensal;
    }
        
    public int getConsumoMensal() {
        return consumoMensal;
    }

    public void setConsumoMensal(int consumoMensal) {
        this.consumoMensal = consumoMensal;
    }

    public int getQntGerador() {
        return qntGerador;
    }

    public void setQntGerador(int qntGerador) {
        this.qntGerador = qntGerador;
    }

    @Override
    public double getTaxaDesperdicio() {
        return taxaDesperdicio;
    }
    
    @Override
    public double pegadaCarbono() {
        return consumoMensal * taxaDesperdicio;
    }
}
