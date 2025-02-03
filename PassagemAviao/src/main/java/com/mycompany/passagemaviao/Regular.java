/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passagemaviao;

/**
 *
 * @author Pedro Henrique
 */
public class Regular implements IViajante{
    private int numeroFidelidade;

    public Regular(int numeroFidelidade) {
        this.numeroFidelidade = numeroFidelidade;
    }

    public int getNumeroFidelidade() {
        return numeroFidelidade;
    }

    public void setNumeroFidelidade(int numeroFidelidade) {
        this.numeroFidelidade = numeroFidelidade;
    }
    
    @Override
    public double precoPassagem(Passagem outro){
        return outro.getPrecoBase() * 1.5;
    }
}
