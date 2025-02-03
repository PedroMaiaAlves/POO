/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passagemaviao;

/**
 *
 * @author Pedro Henrique
 */
public class Agente implements IViajante {
    private int codAgente;

    public Agente(int codAgente) {
        this.codAgente = codAgente;
    }
    
    public int getCodAgente() {
        return codAgente;
    }

    public void setCodAgente(int codAgente) {
        this.codAgente = codAgente;
    }
    
    @Override
    public double precoPassagem(Passagem outro){
        return outro.getPrecoBase() * 0.8;
    }
}
