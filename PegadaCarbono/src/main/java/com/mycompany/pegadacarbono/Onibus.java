/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegadacarbono;

/**
 *
 * @author Pedro Henrique
 */
public class Onibus extends Transporte implements IPegadaCarbono{
    private static final double DISTANCIA_FIXA;
    private int viagem;
    private static final int DIAS;
    
    static{
        DISTANCIA_FIXA = 100;
        DIAS = 25;
    }
    
    public Onibus(int viagem, int consumo){
        super(consumo);
        this.viagem = viagem;
    }
    
    public void setViagem(int viagem){
        this.viagem = viagem;
    }
    
    public int getViagem(){
        return viagem;
    }
    
    @Override
    public double pegadaCarbono(){
        return (DISTANCIA_FIXA * DIAS) / (super.getConsumo() * viagem);
    }
}
