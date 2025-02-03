/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioabstractjava;

/**
 *
 * @author Pedro Henrique
 */
public class Telefonista extends Funcionario {
    private int codEstacao;
    
    public Telefonista(int codEstacao, String nome, double salario){
        super(nome, salario);
        this.codEstacao = codEstacao;
    }
    
    public int getcodEstacao(){
        return codEstacao;
    }
    
    public void setcodEstacao(int codEstacao){
        this.codEstacao = codEstacao;
    }
}
