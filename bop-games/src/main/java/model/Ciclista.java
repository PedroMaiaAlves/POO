/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pedro Henrique
 */
public class Ciclista extends Participante {

    private static final int ETAPAS;
    private Etapa etapas[];
    private int etapasRegistradas;

    static {
        ETAPAS = 21;
    }

    public Ciclista(Etapa[] etapas, int etapasRegistradas, String nome, int numero, String cidadeOrigem) {
        super(nome, numero, cidadeOrigem);
        this.etapas = etapas;
        this.etapasRegistradas = etapasRegistradas;
    }

    public static int getETAPAS() {
        return ETAPAS;
    }

    public Etapa[] getEtapas() {
        return etapas;
    }

    public int getEtapasRegistradas() {
        return etapasRegistradas;
    }

    public void setEtapas(Etapa[] etapas) {
        this.etapas = etapas;
    }

    public void setEtapasRegistradas(int etapasRegistradas) {
        this.etapasRegistradas = etapasRegistradas;
    }

    public void registrarEtapa(Etapa etapa) {
        if (etapasRegistradas < etapas.length) {
            etapas[etapasRegistradas] = etapa;
            etapasRegistradas++;
        } else {
            System.out.println("Limite Atingido");
        }
    }
    
    private int calcularTempoTotalEtapas(){
        int tempoTotal = 0;
        
        for (Etapa etapa : etapas) {
            tempoTotal += etapa.getDuracao().getDuracaoTotal();
        }
        return tempoTotal;
    }
    
    public int getTempoTotal() {
        return calcularTempoTotalEtapas();
    }
    
    public String difTempoEntreCiclista(Ciclista outro){
        int tempoTotalAtual = this.calcularTempoTotalEtapas();
        int tempoTotalOutro = outro.calcularTempoTotalEtapas();
        
        int diferenca = tempoTotalAtual - tempoTotalOutro;
        String ciclistaNaFrente;
        
        if(diferenca > 0){
            ciclistaNaFrente = this.getNome();
        } else if(diferenca < 0){
            ciclistaNaFrente = outro.getNome();
            diferenca = -diferenca;
        } else {
            return "Os dois ciclistas terminaram ao mesmo tempo";
        }
        
        return String.format("%s está na frente por %d segundos",ciclistaNaFrente, diferenca);
    }
    
    public Ciclista vencedorDaEtapa(Ciclista outro, int etapa){
        int tempoEstaEtapa = etapas[etapa].getDuracao().getDuracaoTotal();
        int tempoOutroEtapa = outro.getEtapas()[etapa].getDuracao().getDuracaoTotal();
        
        if (tempoEstaEtapa < tempoOutroEtapa){
            return this;
        } else if(tempoEstaEtapa > tempoOutroEtapa) {
            return outro;
        } return null;
    }

}