/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegadacarbono;

/**
 *
 * @author Pedro Henrique
 */
public class Edificio implements IPegadaCarbono{
    private IEdificio tipo;
    private double consumoMensal;

    public Edificio(double consumoMensal, IEdificio tipo) {
        this.consumoMensal = consumoMensal;
        this.tipo = tipo;
    }

    public double getConsumoMensal() {
        return consumoMensal;
    }

    public void setConsumoMensal(double consumoMensal) {
        this.consumoMensal = consumoMensal;
    }

    public void setTipo(IEdificio tipo){
        this.tipo = tipo;
    }
    
    public IEdificio getTipo(){
        return tipo;
    }
    
    @Override
    public double pegadaCarbono() {
        return consumoMensal * tipo.getTaxaDesperdicio();
    }
}
