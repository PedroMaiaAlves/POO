/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorapolimorfica;

/**
 *
 * @author Pedro Henrique
 */
public class Subtracao extends CalculoMatematico {
    
    @Override
    public double resultado(){
        return getValor1() - getValor2();
    }
}
