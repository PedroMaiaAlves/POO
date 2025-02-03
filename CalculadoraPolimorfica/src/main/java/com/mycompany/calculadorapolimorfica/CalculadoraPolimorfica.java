/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorapolimorfica;

/**
 *
 * @author Pedro Henrique
 */
public class CalculadoraPolimorfica {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        //Soma com sobrecarga de método, tem os mesmos nomes porém atributos diferentes.
        System.out.println(calc.soma(1.2, 1.8));
        //Resultado esperado é 3
        System.out.println(calc.soma(1, 2));
        //Resultado esperado é 3
        
        //Método mais chatinho de fazer calculadora
        Calculadora.calcular(TipoCalculo.Adicao, 1, 2);
        //Adicao de 1 e 2, resultado esperado é 3
        
        //Usando polimorfismo e Sobreescrita
        CalculoMatematico calc2 = new Soma();
        calc2.setValor1(2);
        calc2.setValor2(2);
        calc2.resultado();
        System.out.println(calc2.resultado());
        //Resultado esperado é uma soma com resultado 4
        
        
        CalculoMatematico calc3 = new Multiplicacao();
        calc3.setValor1(2);
        calc3.setValor2(5);
        Calculadora.calcularPolimorfico(calc3);
        //Resultado esperado é uma multiplicacao e o resultado é 10
        System.out.println(Calculadora.calcularPolimorfico(calc3));
    }
}
