/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passagemaviao;

/**
 *
 * @author Pedro Henrique
 */
public class Passageiro implements IViajante{
    private String nome;
    private String CPF;
    private IViajante tipoViajante;

    public Passageiro(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public IViajante getTipoViajante() {
        return tipoViajante;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setTipoViajante(IViajante tipoViajante) {
        this.tipoViajante = tipoViajante;
    }
    
    @Override
    public double precoPassagem(Passagem outro){
        return this.tipoViajante.precoPassagem(outro);
    }
}
