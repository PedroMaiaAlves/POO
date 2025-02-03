/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegadacarbono;

/**
 *
 * @author Pedro Henrique
 */
public class Essencial extends Edificio implements IPegadaCarbono{
    private int qntGerador;

    public Essencial(int qntGerador, double consumoMensal) {
        super(consumoMensal);
        this.qntGerador = qntGerador;
    }

    public int getQntGerador() {
        return qntGerador;
    }

    public void setQntGerador(int qntGerador) {
        this.qntGerador = qntGerador;
    }
    
    @Override
    public double pegadaCarbono() {
        return getConsumoMensal() * 0.35;
    }
}
