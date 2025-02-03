/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quicksortinterface;

/**
 *
 * @author Pedro Henrique
 */
public class QuickSortInterface {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro", 1);
        Aluno a2 = new Aluno("Arthur", 2);
        Aluno a3 = new Aluno("Arthur", 1);
        System.out.println(a1.getNome());
        System.out.println("É Menor = " + a1.menorQue(a2));
        System.out.println("É Maior = " + a2.menorQue(a1));
        System.out.println("É Igual = "+ a1.igual(a3));
        System.out.println("Não É Igual = "+ a1.igual(a2));
    }
}
