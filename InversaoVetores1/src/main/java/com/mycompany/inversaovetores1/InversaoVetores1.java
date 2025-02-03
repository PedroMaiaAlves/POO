package com.mycompany.inversaovetores1;
import java.util.Scanner;

public class InversaoVetores1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de caracteres:");
        String input = scanner.nextLine(); 

        char[] caracteres = input.toCharArray();
        int cont = 1;

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == ' ') {
                cont++;
            }
        }

        char[][] resultado = new char[cont][];
        int inicioArray = 0;
        int index = 0;
        
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == ' ') {
                resultado[index] = new char[i - inicioArray];
                for (int j = inicioArray; j < i; j++) {
                    resultado[index][j - inicioArray] = caracteres[j];
                }
                index++;
                inicioArray = i + 1;
            }
        }

        resultado[index] = new char[caracteres.length - inicioArray];
        for (int j = inicioArray; j < caracteres.length; j++) {
            resultado[index][j - inicioArray] = caracteres[j];
        }

        for (int i = resultado.length - 1; i >= 0; i--) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j]);
            }
            if (i > 0) { 
                System.out.print(" ");
            }
        }
    }
}