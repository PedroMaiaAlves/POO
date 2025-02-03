/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegadacarbono;

/**
 *
 * @author Pedro Henrique
 */
public abstract class Edificio implements IPegadaCarbono {

    private double consumoMensal;

    public Edificio(double consumoMensal) {
        this.consumoMensal = consumoMensal;
    }

    public double getConsumoMensal() {
        return consumoMensal;
    }

    public void setConsumoMensal(double consumoMensal) {
        this.consumoMensal = consumoMensal;
    }

    @Override
    public double pegadaCarbono() {
        return 0;
    }
}
