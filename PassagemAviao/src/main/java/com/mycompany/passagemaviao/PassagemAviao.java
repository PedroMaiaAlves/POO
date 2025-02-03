/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.passagemaviao;

/**
 *
 * @author Pedro Henrique
 */
public class PassagemAviao {

    public static void main(String[] args) {
        Passageiro teste1 = new Passageiro("Pedro", "123");
        Passageiro teste3 = new Passageiro("Bianca", "456");
        Agente a1 = new Agente(1);
        Regular r1 = new Regular(1);
        teste1.setTipoViajante(a1);
        teste3.setTipoViajante(r1);
        Passagem pass = new Passagem("BH", "IBERO", 100);

        System.out.printf("O preço da passagem é R$: "+ teste1.precoPassagem(pass));
        System.out.printf("O preço da passagem é R$: " + teste3.precoPassagem(pass));
    }
}
