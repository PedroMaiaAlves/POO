/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bop.games;

import model.Ciclista;
import model.Data;
import model.Duracao;
import model.Etapa;
import model.Hora;

/**
 *
 * @author Pedro Henrique
 */
public class BopGames {

    public static void main(String[] args) {

        /*  Hora h1 = new Hora(20,35,0);
        System.out.println("A hora h1 é: " + h1.HoraFormatada());
        
        h1.Ajustar(1,0,120);
        System.out.println("A hora h1 ajustada é: " + h1.HoraFormatada());
        
        h1.Validar();
        System.out.println("A hora h1 está valida?: " + h1.Validar());
        
        Hora h2 = new Hora(25,71,99);
        System.out.println("A hora h2 Desvalidada é: " + h2.HoraFormatada());
        
        h2.Validar();
        System.out.println("Teste de validacao de h2: " + h2.Validar());
        
        h1.Incrementar(120);
        System.out.println("Segundos incrementados: " + h1.HoraFormatada());
        
        h1.EstahNaFrenteDe(h2);
        System.out.println("h1 esta na frente de h2?: " + h1.EstahNaFrenteDe(h2));
        
        h2.EstahNaFrenteDe(h1);
        System.out.println("h2 esta na frente de h1?: "+ h2.EstahNaFrenteDe(h1));
         */
        
         
        // Criando as duas etapas para comparação
        Etapa[] etapasCiclista1 = new Etapa[2]; // 2 Etapas apenas de exemplo
        etapasCiclista1[0] = new Etapa(1, new Data(2024, 10, 1), new Duracao(new Hora(9, 0, 0), 150), new Hora(9, 0, 0));
        etapasCiclista1[1] = new Etapa(2, new Data(2024, 10, 2), new Duracao(new Hora(10, 0, 0), 300), new Hora(10, 0, 0));

        Etapa[] etapasCiclista2 = new Etapa[2]; // 2 Etapas apenas de exemplo
        etapasCiclista2[0] = new Etapa(1, new Data(2024, 10, 1), new Duracao(new Hora(9, 0, 0), 120), new Hora(9, 0, 0));
        etapasCiclista2[1] = new Etapa(2, new Data(2024, 10, 2), new Duracao(new Hora(10, 0, 0), 400), new Hora(10, 0, 0));

        //Criando os ciclistas 
        Ciclista ciclista1 = new Ciclista(etapasCiclista1, 2, "Jose", 1, "Minas Gerais");
        Ciclista ciclista2 = new Ciclista(etapasCiclista2, 2, "Maria", 2, "Santa Catarina");

        // Comparando tempo entre os ciclistas
        System.out.println(ciclista1.difTempoEntreCiclista(ciclista2));

        // Descobrindo quem venceu a primeira etapa
        Ciclista vencedorEtapa1 = ciclista1.vencedorDaEtapa(ciclista2, 0);
        if (vencedorEtapa1 != null) {
            System.out.println("Vencedor da 1ª etapa: " + vencedorEtapa1.getNome());
        } else {
            System.out.println("Empate na 1ª etapa.");
        }

        // Descobrindo quem venceu a segunda etapa
        Ciclista vencedorEtapa2 = ciclista1.vencedorDaEtapa(ciclista2, 1);
        if (vencedorEtapa2 != null) {
            System.out.println("Vencedor da 2ª etapa: " + vencedorEtapa2.getNome());
        } else {
            System.out.println("Empate na 2ª etapa.");
        }

        // Ajustando a hora de início de uma etapa e imprimindo o horário formatado
        Hora horaInicial = new Hora(9, 30, 0);
        System.out.println("Hora inicial: " + horaInicial.HoraFormatada());
        horaInicial.Ajustar(1, 45, 20);  // Ajustar a hora
        System.out.println("Hora ajustada: " + horaInicial.HoraFormatada());

        // Incrementando a hora e mostrando o resultado
        horaInicial.Incrementar(500); // Incrementar 500 segundos
        System.out.println("Hora após incrementar 500 segundos: " + horaInicial.HoraFormatada());
    }
}
