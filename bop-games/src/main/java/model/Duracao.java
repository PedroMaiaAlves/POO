/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pedro Henrique
 */
public class Duracao {
    private Hora horaInicial;
    private int duracaoTotal;
    
public Duracao(Hora horaInicial, int duracaoTotal) {
        this.horaInicial = horaInicial;
        this.duracaoTotal = duracaoTotal;
    }

    public void setHoraInicial(Hora horaInicial) {
        this.horaInicial = horaInicial;
    }

    public void setDuracaoTotal(int duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }

    public Hora getHoraInicial() {
        return horaInicial;
    }

    public int getDuracaoTotal() {
        return duracaoTotal;
    }
    
    public boolean MaiorQue(Duracao outraDuracao){
        return(this.duracaoTotal > outraDuracao.getDuracaoTotal());
    }
    
    public int DuracaoEmSegundos(){
        return this.duracaoTotal;
    }
    
    public String Relatorio(){
        return String.format("Hora inicial: %s, Duracao Total: %d segundos", horaInicial.HoraFormatada(), duracaoTotal);
    }
}

