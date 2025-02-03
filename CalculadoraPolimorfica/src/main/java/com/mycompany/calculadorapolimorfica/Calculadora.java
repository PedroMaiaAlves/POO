/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorapolimorfica;

/**
 *
 * @author Pedro Henrique
 */
public class Calculadora {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    //Usando condicional
    public static double calcular(TipoCalculo tipo, double valor1, double valor2) {
        double resultado = 0;

        switch (tipo) {
            case Adicao:
                resultado = valor1 + valor2;
                break;
            case Subtracao:
                resultado = valor1 - valor2;
                break;
            case Multiplicacao:
                resultado = valor1 * valor2;
                break;
            case Divisao:
                resultado = valor1 / valor2;
                break;
            default:
                throw new RuntimeException("Tipo de cálculo desconhecido");
        }
        return resultado;
    }
    
    public static double calcularPolimorfico(CalculoMatematico calc3){
        return calc3.resultado();
    }
}
