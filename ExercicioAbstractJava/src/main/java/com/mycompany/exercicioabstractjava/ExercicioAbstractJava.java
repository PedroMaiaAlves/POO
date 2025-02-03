/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioabstractjava;

/**
 *
 * @author Pedro Henrique
 */
public class ExercicioAbstractJava {

    public static void main(String[] args) {
        
        Funcionario g1 = new Gerente("Sloow", 1, "Pedro", 1000);
        Telefonista t1 = new Telefonista(2,"Bianca",1000);
        
        System.out.println("Bonificacao telefonista: " + t1.calculaBonificacao());
        System.out.println("Bonificacao gerente: " + g1.calculaBonificacao());
        System.out.println(g1.toString());
    }
}
