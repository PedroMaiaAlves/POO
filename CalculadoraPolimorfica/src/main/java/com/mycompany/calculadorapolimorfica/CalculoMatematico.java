package com.mycompany.calculadorapolimorfica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro Henrique
 */
public abstract class CalculoMatematico {
    private double valor1;
    private double valor2;

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    
    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }
    
    public double resultado(){
        return 0;
    };
}
