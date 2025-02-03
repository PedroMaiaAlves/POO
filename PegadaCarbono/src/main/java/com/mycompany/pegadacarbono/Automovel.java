/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegadacarbono;

/**
 *
 * @author Pedro Henrique
 */
public class Automovel extends Transporte implements IPegadaCarbono{
    private double distanciaMensal;
    
    public Automovel(double distanciaMensal, double consumo){
        super(consumo);
        this.distanciaMensal = distanciaMensal;
    }
    
    public double getDistanciaMensal(){
        return distanciaMensal;
    }
    
    public void setDistanciaMensal(double distanciaMensal){
        this.distanciaMensal = distanciaMensal;
    }
    
    @Override
    public double pegadaCarbono(){
        return distanciaMensal / super.getConsumo();
    }
}
