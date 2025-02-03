/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegadacarbono;

/**
 *
 * @author Pedro Henrique
 */
public class Residencial extends Edificio implements IPegadaCarbono{

    public Residencial(double consumoMensal) {
        super(consumoMensal);
    }
    
    @Override
    public double pegadaCarbono() {
        return super.getConsumoMensal() * 0.2;
    }
}
