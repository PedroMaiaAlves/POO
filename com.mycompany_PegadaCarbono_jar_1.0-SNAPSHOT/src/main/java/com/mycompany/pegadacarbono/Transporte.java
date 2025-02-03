/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegadacarbono;

/**
 *
 * @author Pedro Henrique
 */
public abstract class Transporte implements IPegadaCarbono{
    private double consumo;
    
    public Transporte(double consumo){
        this.consumo = consumo;
    }
    
    public double getConsumo(){
        return consumo;
    }
    
    public void setConsumo(double consumo){
        this.consumo = consumo;
    }
    
    @Override
    public double pegadaCarbono() {
        return 0;
    }
}
