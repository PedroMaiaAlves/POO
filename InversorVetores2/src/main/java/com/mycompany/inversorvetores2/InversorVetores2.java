/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inversorvetores2;
import java.util.Scanner;
/**
 *
 * @author Pedro Henrique
 */
public class InversorVetores2 {

    public static void main(String[] args) {
        char[] palavraOriginal;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite uma sequencia de caracteres:");
            palavraOriginal = scanner.nextLine().toCharArray();
        }

        int cont = 1;

        for(int j = 0; j < palavraOriginal.length; j++ ){
            if(palavraOriginal[j] == ' '){
                cont++;
            }
        }
        
        char[][] palavraTotal = new char[cont][];
        int palavraIndex = 0, inicio = 0;
        
        for (int i = 0; i <= palavraOriginal.length; i++){
            if(i == palavraOriginal.length || palavraOriginal[i] == ' '){
                int tamanhoPalavra = i - inicio;
                char[] palavraNova = new char[tamanhoPalavra];
                for (int j = 0; j < tamanhoPalavra; j++) {
                    palavraNova[j] = palavraOriginal[inicio + j];
                }
                palavraTotal[palavraIndex++] = palavraNova;
                inicio = i + 1;
            }
        }
        
        for (int i = palavraTotal.length - 1; i >= 0; i--) {
            char[] palavraNova = palavraTotal[i];
            for (int j = 0; j < palavraNova.length; j++){
                System.out.print(palavraNova[j]);
            }
            if (i > 0) System.out.print(" ");
        }
    }
}