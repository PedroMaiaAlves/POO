/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passagemaviao;

/**
 *
 * @author Pedro Henrique
 */
public class Passagem {
    private String origem;
    private String destino;
    private double precoBase;

    public Passagem(String origem, String destino, double precoBase) {
        this.origem = origem;
        this.destino = destino;
        this.precoBase = precoBase;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    
}
