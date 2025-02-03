/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioabstractjava;

/**
 *
 * @author Pedro Henrique
 */
public class Secretaria extends Funcionario{
    private int numRamal;
    
    public Secretaria(int numRamal, String nome, double salario){
        super(nome , salario);
        this.numRamal = numRamal;
    }
    
    public int getNumRamal(){
        return numRamal;
    }
    
    public void setNumRamal(int numRamal){
        this.numRamal = numRamal;
    }
    
}
